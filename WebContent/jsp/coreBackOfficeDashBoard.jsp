<div class="row">

	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> 
					<a class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Contract Workflow
			</div>
			<div class="panel-body">
				<div id="contractWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Commodity WorkFlow
			</div>
			<div class="panel-body">
				<div id="inventoryWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Supplier Workflow
			</div>
			<div class="panel-body">
				<div id="supplierWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Supplier Compliant/Enquiry Status
			</div>
			<div class="panel-body">
				<div id="supplierComplaintEnquiryStatusGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Standard Agreement Workflow
			</div>
			<div class="panel-body">
				<div id="standardAgreementWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Supplier Complaint Escalation Workflow
			</div>
			<div class="panel-body">
				<div id="supplierComplaintEscalationWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a> <a
						class="closebox"><i class="fa fa-times"></i></a>
				</div>
				Supplier Enquiry Escalation Workflow
			</div>
			<div class="panel-body">
				<div id="supplierEnquiryEscalationWorkflowGraphDiv">
					<div class="loader loader-sm"></div>
				</div>
			</div>
		</div>
	</div>
</div>
<br />
<br />


<script src="../vendor/chartjs/Chart.min.js"></script>


<script type="text/javascript">

    initWorkFlows = function (data, canvasId) {
        var labels = data.map(item => moment(item.dateStarted).format('DD MMM YYYY'));
        var pending = data.map(item => item.pending);
        var accepted = data.map(item => item.accepted);
        var rejected = data.map(item => item.rejected);

        var lineData = {
            labels: labels,
            datasets: [
                {
                    label: "Pending",
                    backgroundColor: 'rgba(245, 215, 66,0.5)',
                    borderColor: "rgba(245, 215, 66 ,0.7)",
                    pointBorderWidth: 1,
                    pointBackgroundColor: "rgba(245, 215, 66,1)",
                    pointRadius: 3,
                    pointBorderColor: '#f5d742',
                    borderWidth: 1,
                    data: pending
                },
                {
                    label: "Active (Accepted)",
                    backgroundColor: 'rgba(98,203,49, 0.5)',
                    pointBorderWidth: 1,
                    pointBackgroundColor: "rgba(98,203,49,1)",
                    pointRadius: 3,
                    pointBorderColor: '#ffffff',
                    borderWidth: 1,
                    data: accepted
                },
                {
                    label: "Deactivated (Rejected)",
                    backgroundColor: 'rgba(245, 66, 66,0.5)',
                    borderColor: "rgba(245, 66, 66,0.7)",
                    pointBorderWidth: 1,
                    pointBackgroundColor: "rgba(220,220,220,1)",
                    pointRadius: 3,
                    pointBorderColor: '#f54242',
                    borderWidth: 1,
                    data: rejected
                }
            ]
        };

        var lineOptions = {
            responsive: true
        };

        var ctx = document.getElementById(canvasId).getContext("2d");
        new Chart(ctx, { type: 'bar', data: lineData, options: lineOptions });
    }

    var initWorkFlowGraphFor = function (transactionType, canvasId) {
        $.ajax({
            dataType: 'json',
            type: 'GET',
            url: "../Home/WorkFlowGraphData",
            data: { "transactionType": transactionType },
            success: function (e) {
                console.log('Graph Data', e);
                $('#' + canvasId + 'Div').html('<canvas id="' + canvasId + '" height="200"></canvas>');
                initWorkFlows(e.data, canvasId);
            },
            error: function (xhr, status, error) {
                console.log(error);
            }
        });
    }

    initComplaintEnquiryStatusGraph = function (data, canvasId) {
        var labels = data.map(item => item.type);
        var complaints = data.map(item => item.complaints);
        var enquiries = data.map(item => item.enquiries);

        var lineData = {
            labels: labels,
            datasets: [
                {
                    label: "Complaints",
                    backgroundColor: 'rgba(98,203,49, 0.5)',
                    pointBorderWidth: 1,
                    pointBackgroundColor: "rgba(98,203,49,1)",
                    pointRadius: 3,
                    pointBorderColor: '#ffffff',
                    borderWidth: 1,
                    data: complaints
                },
                {
                    label: "Enquiries",
                    backgroundColor: 'rgba(245, 66, 66,0.5)',
                    borderColor: "rgba(245, 66, 66,0.7)",
                    pointBorderWidth: 1,
                    pointBackgroundColor: "rgba(220,220,220,1)",
                    pointRadius: 3,
                    pointBorderColor: '#f54242',
                    borderWidth: 1,
                    data: enquiries
                }
            ]
        };

        var lineOptions = {
            responsive: true
        };

        var ctx = document.getElementById(canvasId).getContext("2d");
        new Chart(ctx, { type: 'bar', data: lineData, options: lineOptions });
    }

    $(document).ready(function () {
        initWorkFlowGraphFor('contract', 'contractWorkflowGraph');
        initWorkFlowGraphFor('supplier', 'supplierWorkflowGraph');
        initWorkFlowGraphFor('inventory', 'inventoryWorkflowGraph');
        initWorkFlowGraphFor('standardAgreement', 'standardAgreementWorkflowGraph');
        initWorkFlowGraphFor('supplierComplaintEscalation', 'supplierComplaintEscalationWorkflowGraph');
        initWorkFlowGraphFor('supplierEnquiryEscalation', 'supplierEnquiryEscalationWorkflowGraph');

        $.ajax({
            type: 'POST',
            url: "../Home/LoadEnquiryCompliantCount",
            data: { length: 0, draw: 0, start: 0 },
            success: function (e) {
                console.log('SE Graph Data', e);
                console.log('transpose', (e.data));
                $('#supplierComplaintEnquiryStatusGraphDiv').html('<canvas id="supplierComplaintEnquiryStatusGraph" height="200"></canvas>');
                initComplaintEnquiryStatusGraph(e.data, "supplierComplaintEnquiryStatusGraph")
            }
        });

    });

</script>


