<%@ taglib prefix="s" uri="/struts-tags"%>
<s:if
	test="tenderWorkflowsToday != null && tenderWorkflowsToday.size() > 0">
	<div class="col-md-12">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a>
				</div>
				Approvals For Today
			</div>
			<div class="panel-body">
				<div class="form-horizontal">

					<table class="table table-striped table-bordered">
						<tr>
							<th>Step No.</th>
							<th>Workflow Description</th>
							<th>Workflow Date Started</th>
							<th>Task Date Started</th>
							<th>Status</th>
							<th>Approved By</th>
							<th></th>
						</tr>

						<s:iterator value="tenderWorkflowsToday">
							<tr>

								<td><s:property value="stepNo" /></td>
								<td><s:property value="workflowDescription" /></td>
								<td><s:property value="workflowDateStarted" /></td>
								<td><s:property value="taskDateStarted" /></td>
								<td><s:property value="status" /></td>
								<td><s:property value="approvedBy" /></td>
								<td><s:a href="../Workflow/Approval?id=%{id}"
										cssClass="btn btn-primary" theme="simple">Verify</s:a></td>
							</tr>
						</s:iterator>
					</table>


				</div>
			</div>
		</div>
	</div>
</s:if>
<s:else>
	<div class="col-md-12">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a>
				</div>
				Workflows For Today
			</div>
			<div class="panel-body">
				<div class="form-horizontal">
					<h3 class="text-center">There are no pending workflows for
						today</h3>
					<br />
					<div class="text-center">
						<img src="../Content/img/undraw_Documents_re_isxv.png"
							width="250px" height="170px" />
					</div>
				</div>

			</div>
		</div>
	</div>
</s:else>
<s:if test="tenders != null && tenders.size() > 0">
	<div class="col-md-12">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a>
				</div>
				Tenders Created Today
			</div>
			<div class="panel-body">
				<div class="form-horizontal">

					<table class="table table-striped table-bordered">
						<tr>
							<th>Tender ID</th>
							<th>Tender Description</th>
							<th>Tender Closing Date</th>
							<th>Bid Closing Date</th>
							<th>Tender Type</th>
							<th>Tender Status</th>
							<th></th>
						</tr>

						<s:iterator value="tenders">
							<tr>

								<td><s:property value="id" /></td>
								<td><s:property value="tenderDescription" /></td>
								<td><s:property value="tenderClosingDate" /></td>
								<td><s:property value="bidClosingDate" /></td>
								<td><s:property value="tenderType" /></td>
								<td><s:property value="tenderStatus" /></td>
								<td><s:a href="../Tenders/Details?id=%{id}"
										cssClass="btn btn-primary" theme="simple">Details</s:a></td>
							</tr>
						</s:iterator>
					</table>


				</div>
			</div>
		</div>
	</div>
</s:if>
<s:else>
	<div class="col-md-12">
		<div class="hpanel">
			<div class="panel-heading">
				<div class="panel-tools">
					<a class="showhide"><i class="fa fa-chevron-up"></i></a>
				</div>
				Tenders Created Today
			</div>
			<div class="panel-body">
				<div class="form-horizontal">
					<h3 class="text-center">There are no tenders created today</h3>
					<br />
					<div class="text-center">
						<img src="../Content/img/undraw_pending_approval_xuu9.png"
							width="250px" height="170px" />
					</div>
				</div>

			</div>
		</div>
	</div>
</s:else>