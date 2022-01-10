<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
<jsp:include page="../mainHeader.jsp"></jsp:include>

<s:form theme="simple">

<div id="wrapper">

    <div class="body-content">
        <div class="divider">&nbsp;</div>

        
        
<br/>
<br/>        
<br/>

<div class="card">
    <div class="card-header">
        <h4>Workflows</h4>
        <div class="row">

            

        </div>
        <div class="row">
            <div class="col-xs-12">
                <div id="progressBar"><div class="loader loader-xs"></div></div>
            </div>
        </div>
    </div>
    <div class="divider">&nbsp;</div>
    <div class="card-body">
        <div class="row">
            <div class="col-md-12">
                <table id="workflows" class="table table-condensed table-striped" style="width: 100%;">
                    <thead>
                        <tr>
                            <th>Step No</th>
                            <th>Description</th>
                            <th>Work Item</th>
                            <th>Workflow Date Start</th>
                            <th>Workflow Date End</th>
                            <th>Task Date Start</th>
                            <th>Task Date End</th>
                            <th>Status</th>
                            <th>Approved By</th>
                            <th>Workflow Message</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>



    </div>

    <div class="space-30">&nbsp;</div>
    
    
		
		<jsp:include page="../footer.jsp"></jsp:include>
		</div>
</s:form>
 

    <script type="text/javascript">
        var table;
        $(function () {
            var data = [];;

            table = $('#workflows').DataTable({
                proccessing: true,
                serverSide: true,
                ajax: {
                    type: "POST",
                    dataType: "json",
                    url: "../Workflow/Pagination",
                    timeout: 60000,
                    "data": function (p) {
                    	p.transactionTypeId = $('#menuTransactionTypeId').val();
                        //p.statusId = getStatus(); 
                        //NC - 01/09/20 Removed the status method because workflow only allows pending records
                         // p.statusId = 21441;
                    },
                },
                dom: "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>>tp", "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
                buttons: [
                    { extend: 'copy', className: 'btn-xs' },
                    { extend: 'csv', title: 'ExampleFile', className: 'btn-xs' },
                    { extend: 'pdf', title: 'ExampleFile', className: 'btn-xs' },
                    { extend: 'print', className: 'btn-xs' }
                ],
                language: {
                    search: "",
                    searchPlaceholder: "Search..."
                },
                columns: [                    
                    { data: "stepNo", autoWidth: true, "defaultContent": "" },
                    { data: "approvalTemplateDescription", autoWidth: true, "defaultContent": "" },
                    { data: "workflowDescription", autoWidth: true, "defaultContent": "" },
                    { data: "workflowDateStarted", autoWidth: true, "defaultContent": "" },
                    { data: "workflowDateEnded", autoWidth: true, "defaultContent": "" },
                    { data: "taskDateStarted", autoWidth: true, "defaultContent": "" },
                    { data: "taskDateEnded", autoWidth: true, "defaultContent": "" },
                    { data: "status", autoWidth: true, "defaultContent": "" },
                    { data: "fullname", autoWidth: true, "defaultContent": "" },
                    { data: "approvedMessage", autoWidth: true, "defaultContent": "" },
                    { data: "id", autoWidth: true, "render": function (data) { return renderEdit(data); } }
                ],
                select: true
            });

            $.getJSON('../Workflow/TotalVsApproved', null, function (data, textStatus, jqXHR) {
                var progressBar = getProgressBar(data.output.approved, data.output.total, 'Active (Approved)');
                $('#progressBar').html(progressBar);
            }).fail(function() {
                $('#progressBar').html('');
            });

            $('#btnFilter').on('click', function () {
                table.ajax.reload();
            })

            $('#btnReset').on('click', function () {
                resetFilters();
            })
        });

        function getStatus() {
            var id = $('#statusId').val();
            return id == 0 ? 21441 : id;
        }

        function resetFilters() {
            $('#statusId').val('');
            table.ajax.reload();
        }

        function convertDate(data) {
            try {
                var dtStart = new Date(parseInt(data.substr(6)));
                var dtStartWrapper = moment(dtStart);
                return dtStartWrapper.format("YYYY-MM-DD");
            }
            catch (ex) {
            }
        }

        function renderEdit(data) {
            
            var link = "<a href='../Workflow/Approval?id={0}' class='btn btn-primary btn-xs'>Approve</a>";

            link = link.replace("{0}", data);

            return link;
        }


    </script>

</body>
</html>
