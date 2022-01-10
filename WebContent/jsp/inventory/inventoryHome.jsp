<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
<jsp:include page="../mainHeader.jsp"></jsp:include>

<s:form theme="simple" id="formInventory" action="../Inventory/Details">

<s:hidden name="statusId" id="statusId"/>
<s:hidden name="configId" id="configId"/>
<s:hidden name="inventoryId" id="inventoryId"/>
      <!-- Filters -->
        <aside id="menu">
            <div id="navigation">
                <!-- Handler for local filters -->
                
    <div class="panel-body">
        <div class="m-b-md">
            <h4>
                Filters
            </h4>
        </div>
        <div class="form-group">
            <label class="control-label">Status:</label>
            <div class="input-group center-block">
               <s:select list="#application.itemStatus" id="ddlInventoryStatus"
								name="ddlInventoryStatus" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label">Stocking Type:</label>
            <div class="input-group center-block">
                <s:select list="#application.stockType" id="ddlStockingType"
								name="stockTypeId" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label">Level 2 - Family:</label>
            <div class="input-group center-block">
             <s:select list="#application.familySection" id="ddlFamilySection"
								name="familySectionId" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
               
            </div>
        </div>
        <div class="form-group">
            <label class="control-label">Level 1 - Segment:</label>
            <div class="input-group center-block">
              <s:select list="#application.productFamily" id="ddlSegment"
								name="segmentId" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
             
             
            </div>
        </div>
        <div class="divider">&nbsp;</div>
        <input type="button" name="apply" id="btnFilter" value="Apply" class="btn btn-success btn-block btn-xs" />
        <input id="btnReset" type="button" value="Reset" class="btn btn-warning btn-block btn-xs" />
    </div>


            </div>
        </aside>

    <!-- Main view -->
<div id="wrapper">

    <div class="body-content">
        <div class="divider">&nbsp;</div>

        <br/>
<br/>        
<br/>
        

        



<div id="notificationsDiv"></div>

<div class="row">
    <div class="col-xs-12">
        <h4>
							<s:property value="pageTitle" />
	     </h4>
        <div class="row">
            <div class="col-xs-10">
<a class="btn btn-primary btn-xs" href="../Inventory/Details">Add <s:property value="pageTitle" /></a>                <input type="button" id="btnFilterDisplay" value="Show Filters" class="btn btn-primary btn-xs hide-menu" />
                <button class="btn btn-xs btn-primary" style="display: none;" id="extendToWarehouseBtn">Extend To Warehouse</button>
                <a class="btn btn-warning btn-xs" href="/">Close</a>
            </div>
        </div>
        <div class="divider">&nbsp;</div>
        <table class="table table-condensed table-striped" id="tblInventory">
            <thead>
                <tr>
                    <th></th>
                    <th>Commodity ID</th>
                    <th>Commodity No (COE)</th>
                    <th>Stock Item Number</th>
                    <th>Commodity Name</th>
                    <th>Commodity Status</th>
                    <th>Stocking Type</th>
                    <th></th>
                </tr>
            </thead>
            <tbody></tbody>
        </table>
    </div>
</div>


<div class="modal fade" id="extendToWarehouseModal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header" style="text-align: center;">
                <h4 class="modal-title">Extend Items To Warehouse</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-lg-12">
                        <strong>Items to Extend</strong>
                        <div class="dd" id="itemsToExportListDiv">
                            <ol class="dd-list">
                                <li class="dd-item">
                                    <div class="dd-handle">
                                        <button class="btn btn-danger btn-xs pull-right">Remove</button>
                                        <span class="label h-bg-navy-blue"><i class="fa fa-users"></i></span> Cras ornare tristique.
                                    </div>
                                </li>
                            </ol>
                        </div>
                        <strong>Warehouse to Extend to</strong>
                        <select class="form-control" id="warehouseDropDown" style="font-family: 'FontAwesome', 'sans-serif';">
                        </select>
                    </div>
                </div>
            </div>
            <div class="modal-footer" style="text-align: center;">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal" id="extendSelectedItemsButton">Extend Listed Items</button>
            </div>
        </div>
    </div>
</div>



    </div>

    <div class="space-30">&nbsp;</div>
    
   
	<!-- Main view -->
 <div class="space-30">&nbsp;</div>
    
		
		<jsp:include page="../footer.jsp"></jsp:include>
		</div>
</s:form>


  <script type="text/javascript">
        var table;
        var itemsToExtendToWarehouse = [];
        var warehouses = [];
        var GetStatusValue;
        $(document).ready(function() {

            GetStatusValue = GetStatusId();
            LoadCommodity(GetStatusValue,document.getElementById('configId').value);

            removeItem = function(button, id) {
                $(button).parent('div').parent('li').remove();
                itemsToExtendToWarehouse = itemsToExtendToWarehouse.filter(item => item.Id !== id);
                $('#tblInventory').DataTable().ajax.reload();

                if (itemsToExtendToWarehouse.length < 1) {
                    $('#extendToWarehouseModal').modal('hide');
                    $('#extendToWarehouseBtn').hide();
                }
            }

            $('#tblInventory').on('draw.dt', function() {
                    itemsToExtendToWarehouse.forEach(function(item, index) {
                        var correspondingChk = $('#' + item.Id + 'Checkbox');
                        if (correspondingChk.length) {
                            if (!correspondingChk.is(':checked')) {
                                correspondingChk.prop('checked', true);
                            }
                        }
                    });

                    $('.extendToWarehouse').click(function() {
                        var rowVal = $(this).parent().children('input[type=hidden]').first().val();
                        var rowObj = JSON.parse(rowVal);

                        var alreadySelected = itemsToExtendToWarehouse.filter(item => item.Id === rowObj.Id);
                        if (alreadySelected && alreadySelected.length > 0) {
                            itemsToExtendToWarehouse = itemsToExtendToWarehouse.filter(item => item.Id !== rowObj.Id);
                        } else {
                            itemsToExtendToWarehouse.push(rowObj);
                        }

                        if (itemsToExtendToWarehouse.length > 0) {
                            $('#extendToWarehouseBtn').show();
                        } else {
                            $('#extendToWarehouseBtn').hide();
                        }
                    });
                });

            $('#extendToWarehouseBtn').click(function() {
                $('#extendToWarehouseModal').modal('show');

                var displayList = $('#itemsToExportListDiv > ol.dd-list');

                var itemsHtml = '';
                itemsToExtendToWarehouse.forEach(function(item) {
                    itemsHtml +=
                        '<li class="dd-item">' +
                        '<div class="dd-handle">' +
                        '<button class="btn btn-danger btn-xs pull-right" onclick="removeItem(this, ' +
                        item.id +
                        ')">Remove</button>' +
                        '<i class="fa fa-archive"></i> ' +
                        item.itemDescription +
                        '</div>' +
                        '</li>';
                });
                displayList.html(itemsHtml);
alert('Raju1');
                var warehouseOptions = '';
                warehouses.forEach(function(item) {
                    warehouseOptions +=
                        '<option value="' + item.id + '">&#xf275; ' + item.name + '</option>';
                });

                $('#warehouseDropDown').html(warehouseOptions);
            });

            $.getJSON('../Warehouse/LoadActiveWarehouses',
                null,
                function(data) {
                    warehouses.push(...data.data);
                });

            $('#extendSelectedItemsButton').click(function() {
            	alert('Raju0');
                $.post('../Warehouse/ExtendItemsToWarehouse', {
                        itemIds: itemsToExtendToWarehouse.map(item => item.Id),
                        warehouseId: $('#warehouseDropDown').val()
                    },
                    function (data) {
                        if (data.success) {
                            $('#notificationsDiv').append(
                                '<div class="alert alert-success text-center">' +
                                    'Extended Inventory Successfully' +
                                    '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
                                        '<span aria-hidden="true">&times;</span>' +
                                    '</button>' +
                                '</div>');
                        }

                        itemsToExtendToWarehouse = [];
                        $('#tblInventory').DataTable().ajax.reload();
                        $('#extendToWarehouseBtn').hide();
                    });
            });

            $('#btnFilter').on('click', function () {
                 GetStatusValue = GetStatusId();
                 LoadCommodity(GetStatusValue,document.getElementById('statusId').value);
                   // table.ajax.reload();
             });

            $('#btnReset').on('click', function() {
                    resetFilters();
              });
        });

        function resetFilters() {
           // $('#ddlInventoryStatus').val('');
            $('#ddlStockingType').val('');
            $('#ddlFamilySection').val('');
            $('#ddlSegment').val('');
            LoadCommodity(document.getElementById('statusId').value,document.getElementById('configId').value);
            //table.ajax.reload();
        }

        function GetStatusId() {

            statusValue = document.getElementById('ddlInventoryStatus').value;
            var controllerValue = document.getElementById('statusId').value;

            if (statusValue == null || statusValue == '') {
                return controllerValue;
            }
            if (statusValue != null || !statusValue == '' ) {
                return statusValue;
            }

        }

        function LoadCommodity(statusValueId,configId) {
              table = $('#tblInventory').DataTable({
                "bFilter": true,
                "serverSide": true,
                "bDestroy": true,
                "bSort": true,
                "ajax": {
                    "url": "../Inventory/LoadInventories",
                    "type": "POST",
                    "datatype": "json",
                    "timeout": 60000,
                    "data": function(p) {
                        p.inventoryStatusId =  document.getElementById('ddlInventoryStatus').value = statusValueId;
                        p.stockingTypeId = document.getElementById('ddlStockingType').value;
                        p.familySectionId = document.getElementById('ddlFamilySection').value;
                        p.segmentId = document.getElementById('ddlSegment').value;
                        p.configId = configId;
                    },
                    "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]]
                },
                dom: "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>>tp",
                "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
                buttons: [
                    { extend: 'copy', className: 'btn-xs' },
                    { extend: 'csv', title: 'ExampleFile', className: 'btn-xs' },
                    { extend: 'pdf', title: 'ExampleFile', className: 'btn-xs' },
                    { extend: 'print', className: 'btn-xs' }
                ],
                "columns": [  
                	
                	  {
                          "data": "Id",
                          "title": "Extend",
                          "render": function(data, type, row) {
                              return row.itemStatus.replace(' ', '') === 'Active'
                                  ? "<input type='checkbox' id='" +
                                  row.id +
                                  "Checkbox' class='extendToWarehouse'/><input type='hidden' id='" +
                                  row.id +
                                  "Hidden' value='" +
                                  JSON.stringify(row) +
                                  "'>"
                                  : '';
                          }
                      },
                	{ "data": "id", "autoWidth": true, "searchable": true },
                    { "data": "itemId", "autoWidth": true, "searchable": true },
                    { "data": "itemNo", "autoWidth": true, "searchable": true },
                    { "data": "itemDescription", "autoWidth": true, "searchable": true },
                    { "data": "itemStatus", "autoWidth": true, "searchable": true },
                    { "data": "stockType", "autoWidth": true, "searchable": true },
                    {
                        "data": "id",
                        "title": "Details",
                        "render": function(data, type, row) {
                            /*var detailsUrl = '../Inventory/Details?inventoryId=' + data;
                            
                            return '<a href=\"' + detailsUrl + '\" class=\"btn btn-sm btn-primary btn-xs\" >Edit</a> ';*/
                            
                        	  return '<a href=\"javascript:void(0)\" onclick=\"openInventoryDetails('+data+')\" class=\"btn btn-sm btn-primary btn-xs\">Edit</a> ';
                        }
                    }
                ],
                "language": {
                    "emptyTable": "No records!"
                }
            });
        }
        function openInventoryDetails(InventoryId) {
        	document.getElementById("inventoryId").value=InventoryId;
        	$("#formInventory").submit();
        }
        
    </script>

</body>
</html>
