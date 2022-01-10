<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="mainHeader.jsp"></jsp:include>

	<s:form theme="simple">

		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<div class="row">
					<div class="hidden">
						<div class="col-md-4">
							<div class="hpanel hgreen">
								<div class="panel-heading">
									<div class="panel-tools">
										<a class="showhide"><i class="fa fa-chevron-up"></i></a>
									</div>
									Service Request Orders
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-md-6">
											<img src="../Content/img/undraw_completed_tasks_vs6q.png"
												width="140px" height="100px" class="img-circle" />
										</div>
										<div class="col-md-6">
											<p class="font-bold text-center" style="font-size: 30px">0</p>
											<h6 class="text-center">Total number of SRO</h6>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="hidden">
						<div class="col-md-4">
							<div class="hpanel hgreen">
								<div class="panel-heading">
									<div class="panel-tools">
										<a class="showhide"><i class="fa fa-chevron-up"></i></a>
									</div>
									Instructions To Perform Work
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-md-6">
											<img src="../Content/img/undraw_project_completed_w0oq.png"
												width="140px" height="100px" class="img-circle" />
										</div>
										<div class="col-md-6">
											<p class="font-bold text-center" style="font-size: 30px">0</p>
											<h6 class="text-center">Total number of IPWs</h6>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div>
						<div class="col-md-4">
							<div class="hpanel hgreen">
								<div class="panel-heading">
									<div class="panel-tools">
										<a class="showhide"><i class="fa fa-chevron-up"></i></a>
									</div>
									Contracts Assigned
								</div>
								<div class="panel-body">
									<div class="row">
										<div class="col-md-6">
											<img src="../Content/img/undraw_contract_uy56.png"
												width="140px" height="100px" class="img-circle" />
										</div>
										<div class="col-md-6">
											<p class="font-bold text-center" style="font-size: 30px"><s:property value="%{supplierContractsList.size()}"/></p>
											<h6 class="text-center">Total number of Contracts
												Assigned</h6>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div></div>
				</div>

				<ul class="nav nav-tabs text-center">
					<li class="active"><a data-toggle="tab" href="#home">Contract
							Details</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu1">Purchase
							Orders</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu2">Requisitions</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu3">Request
							For Quotation</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu4">Invitations
							To Bid</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu5">Service Request
							Orders - (SRO)</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu6">Complaints</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu7">Enquiries</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu8">IPWs</a></li>
				</ul>

				<div class="tab-content">

					<div id="home" class="tab-pane fade in active">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Contract Details
										</div>
										<div class="panel-body">
											<br />

											<div class="hpanel">
												<div class="panel-heading">
													<div class="panel-tools">
														<a class="showhide"><i class="fa fa-chevron-up"></i></a>
													</div>
													Contracts
												</div>
												<div class="panel-body">
													<table class="table table-striped table-bordered"
														id="ContractMaster">
														<thead>
															<tr>
																<th>Contract Details ID</th>
																<th>Contract No (COE)</th>
																<th>Item No</th>
																<th>Total Main Contract Amount</th>
																<th></th>
															</tr>
														</thead>
														<tbody>
															<s:iterator value="supplierContractsList">
																<td><s:property value="id" /></td>
																<td><s:property value="contractNo" /></td>
																<td><s:property value="itemNo" /></td>
																<td><s:property value="unitCost" /></td>
															</s:iterator>
														</tbody>
													</table>

												</div>
											</div>



											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#ContractMaster')
																			.DataTable();
																});
											</script>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu1" class="tab-pane fade" hidden>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Purchase Orders
										</div>
										<div class="panel-body">

											<table id="SupplierPurchaseOrders"
												class="table table-striped table-bordered">
												<thead>
													<tr>
														<th>Requisition ID</th>
														<th>Requisition Details ID</th>
														<th>Line No</th>
														<th>Order No</th>
														<th>Order Type</th>
														<th>Requesting Unit</th>
														<th>Commodity Description</th>
														<th>Commodity No</th>
														<th>Extended Price</th>
														<th>Unit Cost</th>
														<th>Unit of Measure</th>
														<th>Transaction Order Date</th>
														<th>Currency Code</th>

													</tr>
												</thead>
												<tbody>
													<s:iterator value="purchaseOrdersList">
														<tr>
															<td><s:property value="requisitionId" /></td>
															<td><s:property value="requisitionDetailsId" /></td>
															<td><s:property value="lineNo" /></td>
															<td><s:property value="orderNo" /></td>
															<td><s:property value="orderType"/></td>
															<td><s:property value="requestingUnit" /></td>
															<td><s:property value="commodityShortDescription" /></td>
															<td><s:property value="commodityNo" /></td>
															<td><s:property value="amountExtendedPrice" /></td>
															<td><s:property value="amountUnitCost" /></td>
															<td><s:property value="unitOfMeasure" /></td>
															<td><s:property value="dateOrderTransaction" /></td>
															<td><s:property value="currencyCode" /></td>

														</tr>
													</s:iterator>
												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#SupplierPurchaseOrders')
																			.DataTable();
																});
											</script>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu2" class="tab-pane fade" hidden>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Requisitions
										</div>
										<div class="panel-body">

											<table id="SupplierRequisitionDetails"
												class="table table-striped table-bordered">
												<thead>
													<tr>
														<th>Requisition ID</th>
														<th>Requisition Details ID</th>
														<th>Line No</th>
														<th>Order No</th>
														<th>Order Type</th>
														<th>Requesting Unit</th>
														<th>Commodity Description</th>
														<th>Commodity No</th>
														<th>Extended Price</th>
														<th>Unit Cost</th>
														<th>Unit of Measure</th>
														<th>Transaction Order Date</th>
														<th>Currency Code</th>

													</tr>
												</thead>
												<tbody>
													<s:iterator value="requisitionsList">
														<tr>
															<td><s:property value="requisitionId" /></td>
															<td><s:property value="requisitionDetailsId" /></td>
															<td><s:property value="lineNo" /></td>
															<td><s:property value="orderNo" /></td>
															<td><s:property value="orderType"/></td>
															<td><s:property value="requestingUnit" /></td>
															<td><s:property value="commodityShortDescription" /></td>
															<td><s:property value="commodityNo" /></td>
															<td><s:property value="amountExtendedPrice" /></td>
															<td><s:property value="amountUnitCost" /></td>
															<td><s:property value="unitOfMeasure" /></td>
															<td><s:property value="dateOrderTransaction" /></td>
															<td><s:property value="currencyCode" /></td>

														</tr>
													</s:iterator>

												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#SupplierRequisitionDetails')
																			.DataTable();
																});
											</script>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu3" class="tab-pane fade" hidden>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Request For Quotations
										</div>
										<div class="panel-body">

											<table id="SupplierQuotationDetails"
												class="table table-striped table-bordered">
												<thead>
													<tr>
														<th>Requisition ID</th>
														<th>Requisition Details ID</th>
														<th>Line No</th>
														<th>Order No</th>
														<th>Order Type</th>
														<th>Requesting Unit</th>
														<th>Commodity Description</th>
														<th>Commodity No</th>
														<th>Extended Price</th>
														<th>Unit Cost</th>
														<th>Unit of Measure</th>
														<th>Transaction Order Date</th>
														<th>Currency Code</th>
														<th></th>

													</tr>
												</thead>
												<tbody>
													<s:iterator value="quotationsList">
														<tr>
															<td><s:property value="requisitionId" /></td>
															<td><s:property value="requisitionDetailsId" /></td>
															<td><s:property value="lineNo" /></td>
															<td><s:property value="orderNo" /></td>
															<td><s:property value="orderType"/></td>
															<td><s:property value="requestingUnit" /></td>
															<td><s:property value="commodityShortDescription" /></td>
															<td><s:property value="commodityNo" /></td>
															<td><s:property value="amountExtendedPrice" /></td>
															<td><s:property value="amountUnitCost" /></td>
															<td><s:property value="unitOfMeasure" /></td>
															<td><s:property value="dateOrderTransaction" /></td>
															<td><s:property value="currencyCode" /></td>
															<td><s:a href="../SupplierQuotations/Details">
																	<input type="button" class="btn btn-primary btn-xs"
																		value="Submit" />
																</s:a></td>
														</tr>
													</s:iterator>
												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#SupplierQuotationDetails')
																			.DataTable();
																});
											</script>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu4" class="tab-pane fade" hidden>
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Tender Bid Invitations
										</div>
										<div class="panel-body">


											<table id="BidInvitation"
												class="table table-bordered table-striped">
												<thead>
													<tr>
														<th>Tender ID</th>
														<th>Tender Description</th>
														<th>Tender Closing Date</th>
														<th>Bid Closing Date</th>
														<th>Estimated Tender Budget</th>
														<th></th>
													</tr>

												</thead>
												<tbody>
													<s:iterator value="invitationBidList">
														<tr>
															<td><s:property value="tenderId" /></td>
															<td><s:property value="tenderDescription" /></td>
															<td><s:property value="formattedTenderClosingDate" /></td>
															<td><s:property value="formattedBidClosingDate" /></td>
															<td><s:property value="estimatedBudget" /></td>
															<td><s:a
																	href="../Bid/TenderBidInvitations?tenderBidInvitationsId=%{tenderBidInvitationsId}">
																	<input type="button" class="btn btn-primary btn-xs"
																		value="Submit" />
																</s:a></td>
														</tr>
													</s:iterator>
												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#BidInvitation')
																			.DataTable();
																});
											</script>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu5" class="tab-pane fade">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Service Request Orders
										</div>
										<div class="panel-body">


											<table id="sroTable"
												class="table table-bordered table-striped">
												<thead>
													<tr>
														<th>Contract ID</th>
														<th>SRO Reference</th>
														<th>SRO Creation Date</th>
														<th>Project Manager</th>
														<th>Comments</th>

														<th>Percentage</th>

														<th></th>
													</tr>

												</thead>
												<tbody>
													<s:iterator value="sroList">
														<tr>
															<td><s:property value="contractId" /></td>
															<td><s:property value="id" /></td>
															<td><s:property value="formattedCreatedDate" /></td>
															<td><s:property value="departmentProjectManager" /></td>
															<td><s:property value="comments" /></td>
															<td><s:property value="percentage" /></td>
															<td><button type="button"
																	class="btn btn-xs btn-primary" data-toggle="modal"
																	data-target='#myModal-<s:property value="id"/>'
																	onclick='InitiateAjax(<s:property value="id"/>)'>Details</button> <s:hidden
																	value="%{id}" id="hiddenFormId" name="hiddenFormId" />
																<div id='myModal-<s:property value="id"/>' class="modal fade" role="dialog"
																	data-backdrop="true">
																	<div class="modal-dialog">

																		<!-- Modal content-->
																		<div id="modalheader" class="modal-content"
																			style="margin-bottom: 20px">
																			<div class="modal-header" style="padding: 35px 50px;">
																				<button type="button" class="close"
																					data-dismiss="modal">&times;</button>
																				<h4 class="text-center">SRO Reference Number
																					<s:property value="id"/></h4>
																			</div>
																			<div class="modal-body" style="padding: 40px 50px;">
																				<div class="form-horizontal">
																					<div class="form-group">
																						<div class="col-md-12">
																							<input type="number"
																								class="form-control input-sm"
																								id='txtPercentage-<s:property value="id"/>' max="99" min="1"
																								name='txtPercentage-<s:property value="id"/>'
																								placeholder="Enter SRO Percentage...."
																								onkeypress="if(this.value.length ==) return false;" />
																						</div>
																					</div>
																				</div>
																			</div>

																			<div style="margin-top: 5px" class="modal-footer">
																				<button type="button" class="btn btn-warning btn-xs"
																					data-dismiss="modal">Close</button>
																				<button type="button" class="btn btn-primary btn-xs"
																					id="saveModal"
																					onclick="InvokeSRO(@item.Id, $('#txtPercentage-'+@item.Id).val())">Submit</button>
																			</div>
																		</div>

																	</div>
																</div></td>
														</tr>
													</s:iterator>
												</tbody>

											</table>




											<script>
												$(document).ready(function() {
													$('#sroTable').DataTable();
												});

												function InvokeSRO(Id,
														percentage) {
													debugger;
													$
															.ajax({
																url : "../ContractMaster/InvokeSRO",
																data : {
																	Id : Id,
																	percentage : percentage
																},
																type : 'post',
																success : function(
																		data) {
																	$(
																			'#myModal-'
																					+ Id)
																			.modal(
																					'hide');
																	window.location
																			.reload();
																},
																error : function(
																		data) {

																}
															});
												}

												function InitiateAjax(Id) {
													debugger;
													$
															.ajax({
																url : "../ContractMaster/InitiateAjax",
																data : {
																	Id : Id
																},
																type : 'post',
																success : function(
																		data) {
																	$(
																			'#txtPercentage-'
																					+ Id)
																			.val(
																					data);
																},
																error : function(
																		data) {

																}
															});
												}
											</script>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu6" class="tab-pane fade">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Complaints
										</div>
										<div class="panel-body">

											<table id="SupplierComplaints"
												class="table table-striped table-bordered">
												<thead>
													<tr>
														<th>Complaint Id</th>
														<th>Compliant Date</th>
														<th>Dispute Type</th>
														<th>Status</th>
														<th>Complaint Description</th>
														<th></th>

													</tr>
												</thead>
												<tbody>
													<s:iterator value="complaintList">
														<tr>
															<td><s:property value="contractId" /></td>
															<td><s:property value="id" /></td>
															<td><s:property value="formattedCreatedDate" /></td>
															<td><s:property value="departmentProjectManager" /></td>
															<td><s:property value="comments" /></td>
															<td><s:property value="percentage" /></td>
															
														</tr>
													</s:iterator>
												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#SupplierComplaints')
																			.DataTable();
																});
											</script>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu7" class="tab-pane fade">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Enquiries
										</div>
										<div class="panel-body">

											<table id="SupplierEnquiries"
												class="table table-striped table-bordered">
												<thead>
													<tr>
														<th>Enquiry Id</th>
														<th>Enquiry Date</th>
														<th>Enquiry Type</th>
														<th>Status</th>
														<th>Enquiry Description</th>
														<th></th>

													</tr>
												</thead>
												<tbody>

												</tbody>

											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#SupplierEnquiries')
																			.DataTable();
																});
											</script>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu8" class="tab-pane fade">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											IPW (Instruction To Perform Work)
										</div>
										<div class="panel-body">

											<table
												class="table table-bordered table-striped table-responsive table-hover"
												id="RelatedSupplierIPW">
												<thead>
													<tr>
														<th>IPW Reference</th>
														<th>IPW Start Date</th>
														<th>IPW End Date</th>
														<th>Supplier</th>
														<th>Supplier Reference</th>
														<th>Date Issued To Supplier</th>
														<th>IPW Status</th>
														<th>IPW Amount</th>
													</tr>
												</thead>
												<tbody>

												</tbody>
											</table>


											<script>
												$(document)
														.ready(
																function() {
																	$(
																			'#RelatedSupplierIPW')
																			.DataTable();
																});
											</script>



										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="space-30">&nbsp;</div>


			<jsp:include page="footer.jsp"></jsp:include>
	</s:form>

</body>
</html>