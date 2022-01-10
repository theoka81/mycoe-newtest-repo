<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Contract/saveContractMasterDetails"
		enctype="multipart/form-data" id="formContractMaster" method="post"
		theme="simple">

		<br />
		<br />
		<br />
		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<head>
<link href="../Content/validation.css" rel="stylesheet" />
<link href="../vendor/fooTable/css/footable.core.min.css"
	rel="stylesheet" />
				</head>

				<div class="form-horizontal">
					<s:if
						test="contractMasterViewModel.message neq null  && contractMasterViewModel.message neq ''">
						<div class="alert alert-success">
							<a href="#" class="close" data-dismiss="alert">&times;</a>
							<s:property value="contractMasterViewModel.message" />
						</div>
					</s:if>
					<div class="alert alert-success" id="alertMessage">
						<a href="#" class="close" data-dismiss="alert">&times;</a>
						<div id="message"></div>
					</div>
				</div>
				<s:hidden name="contractMasterBean.contractMasterId"
					id="ContractMaster_Id"
					value="%{contractMasterViewModel.contractMaster.id}" />

				<div class="row">
					<h4>Contract Master</h4>
					<h4>
						Contract No :
						<s:property
							value="contractMasterViewModel.contractMaster.contractNo" />
					</h4>
					<h4>
						Modified Date :
						<s:date
							name="contractMasterViewModel.contractMaster.modifiedDateTime"
							format="yyyy-MM-dd" />
					</h4>
					<h4>
						Modified By :
						<s:property
							value="contractMasterViewModel.contractMaster.systemUser2.firstName" />
						&nbsp;
						<s:property
							value="contractMasterViewModel.contractMaster.systemUser2.lastName" />
					</h4>
					<br />
					<s:if
						test="(#session['SESSION_CON_MGMT_SPL'] != null && #session['SESSION_CON_MGMT_SPL'] eq 'true')">
						<s:if
							test="contractMasterViewModel.isLocked == 'false' || contractMasterViewModel.isLocked == false">
							<s:submit value="Save" name="save" id="btnSave"
								cssClass="btn btn-primary" />
							<s:if test="contractMasterViewModel.contractMaster.id > 0">
								<s:submit value="Submit for Approval" name="submit"
									id="btnSubmit" cssClass="btn btn-primary" />
							</s:if>
						</s:if>
						<s:else>
						</s:else>
					</s:if>
					<s:if test="contractMasterViewModel.contractMaster.id > 0">
						<s:a cssClass="btn btn-primary"
							href="../Contract/DetailsIndex?contractId=%{contractMasterViewModel.contractMaster.id}">Contract
						Details</s:a>
					</s:if>
					<a class="btn btn-primary" href="../Contract/Index">Close</a>

				</div>
				<div class="validation-summary-valid" data-valmsg-summary="true">
					<ul>
						<li style="display: none"></li>
					</ul>
				</div>
				<ul class="nav nav-tabs text-center">
					<li class="active"><a data-toggle="tab" href="#home">Details</a></li>
					<li><a data-toggle="tab" href="#menu1">Participants</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu4">Electronic
							Signature</a></li>
					<li class="hidden"><a data-toggle="tab" href="#menu2">Documents</a></li>
					<li><a data-toggle="tab" href="#menu3">Contract Details
							Summary</a></li>
				</ul>
				<div class="tab-content">
					<div id="home" class="tab-pane fade in active">
						<div class="container-fluid">

							<div class="row">
								<div class="col-md-6">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Contract Information
										</div>
										<div class="panel-body">
											<div class="form-horizontal">



												<div class="form-group">
													<label class="col-md-3 control-label text-right">Contract
														No.</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.contractNo"
															id="txtContractNo"
															value="%{contractMasterViewModel.contractMaster.contractNo}"
															disabled="true" readonly="true" cssClass="form-control"></s:textfield>
													</div>
												</div>

												<div class="form-group">
													<label class="col-md-3 control-label text-right">Tender
														No.</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.tenderNumber"
															id="ContractMaster_TenderNumber"
															value="%{contractMasterViewModel.contractMaster.tenderNumber}"
															disabled="true" readonly="true" cssClass="form-control"></s:textfield>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Parent
														No.</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.parentNo"
															id="ContractMaster_ParentNo"
															onkeypress="OnValidKeyPress(event);"
															value="%{contractMasterViewModel.contractMaster.parentNo}"
															type="number" disabled="false" readonly="false"
															cssClass="form-control"></s:textfield>
													</div>
												</div>



												<div class="form-group">
													<label class="col-md-3 control-label text-right">Contract
														Title</label>
													<div class="col-md-8">
														<div class="relative input-wrap is-required">
															<s:textarea name="contractMasterBean.contractTitle"
																value="%{contractMasterViewModel.contractMaster.contractTitle}"
																id="ContractTitle" cols="2" rows="1"
																cssClass="form-control"></s:textarea>
															<span class="icon validation success hide"> <span
																class="fa fa-check" style="font-size: 10px;"></span>
															</span> <span class="icon validation error hide"> <span
																class="fa fa-remove" style="font-size: 10px;"></span>
															</span>
														</div>
														<div class="is-helpful"
															data-helper="Validates if Contract Title is not empty."
															data-error="Please enter a contract title."></div>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Contract
														Type</label>
													<div class="col-md-8">
														<div class="columns">
															<div class="relative input-wrap is-required">
																<s:select list="#application.contractTypeMap"
																	id="ContractMaster_ContractTypeId"
																	value="%{contractMasterViewModel.contractMaster.userCode5.id}"
																	name="contractMasterBean.contractTypeId"
																	cssClass="form-control" theme="simple" headerKey="-1"
																	headerValue="--Select Contract Type--"></s:select>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="ContractMaster.ContractTypeId"
																	data-valmsg-replace="true"></span> <span
																	class="icon validation success hide"> <span
																	class="fa fa-check" style="font-size: 10px;"></span>
																</span> <span class="icon validation error hide"> <span
																	class="fa fa-remove" style="font-size: 10px;"></span>
																</span>
															</div>
															<div class="is-helpful"
																data-helper="Validates if not empty."
																data-error="Please select a contract type to proceed"></div>
														</div>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Contract
														SubType</label>
													<div class="col-md-8">
														<s:select list="#application.procurementTypeMap"
															id="ContractMaster_OrderTypeId"
															value="%{contractMasterViewModel.contractMaster.userCode6.id}"
															name="contractMasterBean.orderTypeId"
															cssClass="form-control" theme="simple" headerKey="-1"
															headerValue="Select..."></s:select>
														<span class="field-validation-valid text-danger"
															data-valmsg-for="ContractMaster.OrderTypeId"
															data-valmsg-replace="true"></span>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Contract
														Category</label>
													<div class="col-md-8">
														<s:select list="#application.contractCategoryMap"
															id="ContractMaster_ContractCategoryId"
															value="%{contractMasterViewModel.contractMaster.userCode3.id}"
															name="contractMasterBean.contractCategoryId"
															cssClass="form-control" theme="simple" headerKey="-1"
															headerValue="Select..."></s:select>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Contract
														Header Type</label>
													<div class="col-md-8">
														<s:select list="#application.contractHeaderTypeMap"
															id="ContractMaster_ContractHeaderTypeId"
															value="%{contractMasterViewModel.contractMaster.userCode4.id}"
															name="contractMasterBean.contractHeaderTypeId"
															cssClass="form-control" theme="simple" headerKey="-1"
															headerValue="--Select Contract Header Type--"></s:select>
														<span class="field-validation-valid text-danger"
															data-valmsg-for="ContractMaster.ContractHeaderTypeId"
															data-valmsg-replace="true"></span>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Contract
														Status</label>
													<div class="col-md-8">
														<div class="columns">
															<div class="relative input-wrap is-required">
																<s:select list="#application.statusMap"
																	id="ContractMaster_StatusId"
																	value="%{contractMasterViewModel.contractMaster.userCode8.id}"
																	name="contractMasterBean.statusId"
																	cssClass="form-control" theme="simple" headerKey="-1"
																	headerValue="--Select Contract Status--"></s:select>
																<span class="icon validation success hide"> <span
																	class="fa fa-check" style="font-size: 10px;"></span>
																</span> <span class="icon validation error hide"> <span
																	class="fa fa-remove" style="font-size: 10px;"></span>
																</span>
															</div>
															<div class="is-helpful"
																data-helper="Validates if not empty."
																data-error="Please select a status to proceed."></div>
														</div>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Related
														To (Projects)</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.relatedTo"
															id="ContractMaster_RelatedTo"
															value="%{contractMasterViewModel.contractMaster.relatedTo}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>

												<!--<div class="form-group row">
                                    <label class="col-md-3 control-label text-right">Unit</label>
                                    <div class="col-md-8">


                                        
                                    <!--</div>
                                </div>-->

											</div>
										</div>
									</div>
								</div>

								<div class="col-md-6">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Contract Dates
										</div>
										<div class="panel-body">
											<div class="form-horizontal">
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Renewal
														Notification Date</label>
													<div class="col-md-8">
														<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_RenewalNotificationDate"
															type="datetime"
															name="contractMasterBean.renewalNotificationDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.renewalNotificationDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>

													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Renewal
														Advance Notify Days</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.renewalAdvanceNotifyDays"
															id="ContractMaster_RenewalAdvanceNotifyDays"
															value="%{contractMasterViewModel.contractMaster.renewalAdvanceNotifyDays}"
															cssClass="form-control"
															onkeypress="OnValidKeyPress(event);" type="number"
															theme="simple"></s:textfield>
													</div>
												</div>

												<div class="form-group">
													<label class="col-md-3 control-label text-right">Contract
														Start Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="txtContractStartDate"
															type="datetime"
															name="contractMasterBean.contractStartDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.contractStartDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
														
													</div>
												</div>


												<div class="form-group">
													<label class="col-md-3 control-label text-right">Contract
														End Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="txtContractEndDate"
															type="datetime"
															name="contractMasterBean.contractEndDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.contractEndDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Cancel
														Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_CancelDate"
															type="datetime"
															name="contractMasterBean.cancelDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.cancelDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Transaction
														Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_TransactionDate"
															type="datetime"
															name="contractMasterBean.transactionDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.transactionDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
														
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Transmission
														Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_TransmissionDate"
															type="datetime"
															name="contractMasterBean.transmissionDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.transmissionDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Requested
														Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_RequestedDate"
															type="datetime"
															name="contractMasterBean.requestedDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.requestedDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
													</div>
												</div>

												<div class="form-group">
													<label class="col-md-3 control-label text-right">Escalation</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.escalation"
															id="ContractMaster_Escalation"
															value="%{contractMasterViewModel.contractMaster.escalation}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>

												<div class="form-group">
													<label class="col-md-3 control-label text-right">Escalation
														Date</label>
													<div class="col-md-8">
													<s:textfield
															cssClass="form-control datePicker text-box single-line"
															id="ContractMaster_EscalationDate"
															type="datetime"
															name="contractMasterBean.escalationDate"
															theme="simple" readonly="true">
															<s:param name="value">
																<s:date
																	name="%{contractMasterViewModel.contractMaster.escalationDate}"
																	format="yyyy/MM/dd" />
															</s:param>
														</s:textfield>
													</div>
												</div>

												<div class="form-group">
													<label class="col-md-3 control-label text-right">Department
														Instruction Number</label>
													<div class="col-md-8">
														<s:textfield
															name="contractMasterBean.departmentInstructionNumber"
															id="ContractMaster_DepartmentInstructionNumber"
															value="%{contractMasterViewModel.contractMaster.departmentInstructionNumber}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>

							</div>



						</div>

					</div>


					<div id="menu1" class="tab-pane fade">

						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Participants
										</div>
										<div class="panel-body">
											<div class="form-horizontal">
												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Assigned
														Team</label>
													<div class="col-md-8">
														<s:select list="#application.teamIdMap"
															id="ContractMaster_AssignedTeamId"
															name="contractMasterBean.assignedTeamId"
															cssClass="form-control"
															value="%{contractMasterViewModel.contractMaster.userCode2.id}"
															theme="simple" headerKey="-1" headerValue="Select..."></s:select>
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Approval
														Team</label>
													<div class="col-md-8">
														<s:select list="#application.teamIdMap"
															id="ContractMaster_ApprovalTeamId"
															name="contractMasterBean.approvalTeamId"
															cssClass="form-control"
															value="%{contractMasterViewModel.contractMaster.userCode1.id}"
															theme="simple" headerKey="-1" headerValue="Select..."></s:select>
													</div>
												</div>

												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Requestor</label>
													<div class="col-md-8">
														<s:select list="#application.requesterIdMap"
															id="ContractMaster_RequesterId"
															name="contractMasterBean.requesterId" cssClass="form-control"
															value="%{contractMasterViewModel.contractMaster.systemUser3.id}"
															theme="simple" headerKey="-1" headerValue="Select..."></s:select>
													</div>
												</div>
												<div class="form-group row">
													<label class="col-md-3 control-label text-right">Requesting
														Unit</label>
													<div class="col-md-8">
														<s:select list="#application.requestedUnitMap"
															id="ContractMaster_RequestingUnitId"
															name="contractMasterBean.requestingUnitId"
															cssClass="form-control"
															value="%{contractMasterViewModel.contractMaster.userCode7.id}"
															theme="simple" headerKey="-1" headerValue="Select..."></s:select>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div id="menu4" class="tab-pane fade hidden">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
									<div class="hpanel">
										<div class="panel-heading">
											<div class="panel-tools">
												<a class="showhide"><i class="fa fa-chevron-up"></i></a>
											</div>
											Electronic Signature
										</div>
										<div class="panel-body">
											<div class="form-horizontal">
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Electronic
														Signature ID</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.electronicSignatureId"
															id="ContractMaster_ElectronicSignatureId"
															value="%{contractMasterViewModel.contractMaster.electronicSignatureId}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Electronic
														Signature Group Id Type</label>
													<div class="col-md-8">
														<s:textfield
															name="contractMasterBean.electronicSignatureGroupIdType"
															id="ContractMaster_ElectronicSignatureGroupIdType"
															value="%{contractMasterViewModel.contractMaster.electronicSignatureGroupIdType}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-3 control-label text-right">Print
														Template</label>
													<div class="col-md-8">
														<s:textfield name="contractMasterBean.printTemplate"
															id="ContractMaster_PrintTemplate"
															value="%{contractMasterViewModel.contractMaster.printTemplate}"
															cssClass="form-control" theme="simple"></s:textfield>
													</div>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>


					<div id="menu2" class="tab-pane fade">
						<div class="form-horizontal"></div>
					</div>

					<div id="menu3" class="tab-pane fade">
						<div class="form-horizontal">
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

												<table id="example1"
													class="footable table table-stripped toggle-arrow-tiny">
													<thead>
														<tr>

															<th data-toggle="true">Line No</th>
															<th>Supplier No</th>
															<th>Supplier Name</th>
															<th>Item No</th>
															<th>Item Name</th>
															<th>Contract Type</th>

															<th data-hide="all">Quantity Ordered</th>
															<th data-hide="all">Unit Of Measure Primary</th>
															<th data-hide="all">Retention Y/N</th>
															<th data-hide="all">Retention Percentage</th>
															<th data-hide="all">Retention Amount</th>
															<th data-hide="all">Original Promised Delivery Date</th>

															<th data-hide="all">Status</th>
															<th data-hide="all">Status Reason</th>
															<th data-hide="all">Contract Start Date</th>
															<th data-hide="all">Contract End Date</th>
															<th data-hide="all">Requesting unit</th>
															<th data-hide="all">Total Sub Contract Amount</th>

														</tr>
													</thead>
													<tbody>
														<s:iterator value="data">
															<td><s:property value="lineNo" /></td>
															<td><s:property value="supplierNumber" /></td>
															<td><s:property value="supplierName" /></td>
															<td><s:property value="itemNo" /></td>
															<td><s:property value="itemName" /></td>
															<td><s:property value="contractType" /></td>

															<td><s:property value="quantityOrdered" /></td>
															<td><s:property value="unitOfMeasurePrimary" /></td>
															<td><s:property value="retentionYN" /></td>
															<td><s:property value="onHoldAmount" /></td>
															<td><s:property value="receivedAmount" /></td>
															<td><s:property value="originalPromisedDeliveryDate" /></td>

															<td><s:property value="statusId" /></td>
															<td><s:property value="statusReasonId" /></td>
															<td><s:property value="contractStartDate" /></td>
															<td><s:property value="contractEndDate" /></td>
															<td><s:property value="requestingUnitId" /></td>
															<td><s:property value="totalSubContractAmount" /></td>
														</s:iterator>
													</tbody>

												</table>


											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>


				</div>








			</div>

			<div class="space-30">&nbsp;</div>

			<jsp:include page="../footer.jsp"></jsp:include>
	</s:form>



	<!-- Handler for local scripts -->

	<script src="../vendor/fooTable/dist/footable.all.min.js"></script>
	<script src="../Scripts/validation.js"></script>
	<script type="text/javascript">
        var workFlowStatus;
         

        $(document).ready(function () {
            
            function formatDate(date) {
                var year = date.getFullYear();
                var month = (date.getMonth() + 1);
                var day = (date.getDate());
                return year + "/" + checkZero(month) + "/" + checkZero(day);
            }

            function checkZero(i) {
                if (i < 10) {
                    i = "0" + i
                }; 

                return i;
            }

            $('#txtContractStartDate').val(formatDate(new Date()));

            $(function () {
                    $('#example1').footable();
                });

            workFlowStatus = '';

            switch (workFlowStatus) {
                case "Pending":
                case "Rejected":
                    {
                        $("#formContractMaster :input").prop('disabled', true);
                        $("#formContractMaster .btn").prop('disabled', true);
                        $("#formContractMaster .form-check-input").prop('disabled', true);
                    }
                    break;
                default:
                    {
                        $("#formContractMaster :input").prop('readonly', false);
                        $("#formContractMaster .btn").prop('disabled', false);
                        $("#formContractMaster .form-check-input").prop('disabled', false);
                    }
            }

            $('input, textarea').on('focus', function ()
            {
	          markNeutral($(this));
	          var $helpText = $(this).closest($inputWrapper).siblings($helperClass);
		      $message = $helpText.attr('data-helper');
	          helperDown($(this), $helpText, $message);
             });

            $('input:not("input[type=url], input[type=password], input[name=email], input[type=tel]"), textarea').on('blur', function () {
                if ($(this).val() === '' && $(this).closest($inputWrapper).hasClass($requiredClass))
                {
		         markInvalid($(this), $(this).closest($inputWrapper).siblings($helperClass).attr('data-error'));
                }
                else
                {
		        helperUp($(this));
	            }
              });

            $('input:not("input[type=url], input[type=password], input[name=email], input[type=tel]"), textarea').on('keyup', function (event) {
	       if ($(this).val() !== '') {
		    markValid($(this));
	       }
           });


            $('select').on('change', function () {
	var $currentSelect = $(this),
		$selects = $('select ', $currentSelect.closest($inputWrapper)),
		$numSelects = $selects.length;

	if ($numSelects > 1) { // handle multiple selects
		if (!$currentSelect.hasClass('changed')) {
			$currentSelect.addClass('changed');
		}

		var $selectsValues = [];
		var $numChanges = $('.changed ', $currentSelect.closest($inputWrapper)).length;

		if ($numChanges === $numSelects) {
			$selects.each(function () {
				if ($(this).val() === '') {
					$selectsValues.push('empty'); // need a value to push to the array (can't use 'empty' in markup if '' is needed elsewhere)
				} else {
					$selectsValues.push($(this).val());
				}
			});

			var $numEmpty = 0;

			for (i = 0; i < $selectsValues.length; i++) {
				if ($selectsValues[i] === 'empty') {
					$numEmpty++;
				}
			}

			var $iconSuccess = $('.icon.success', $(this).closest($inputWrapper)),
				$iconError = $('.icon.error', $(this).closest($inputWrapper));

			if ($numEmpty > 0) {
				setIconMulti($iconSuccess, $iconError, 'invalid');
				setField($currentSelect, $currentSelect.closest($inputWrapper), 'invalid');
			} else {
				setIconMulti($iconSuccess, $iconError, 'valid');
				setField($currentSelect, $currentSelect.closest($inputWrapper), 'valid');
			}
		}

	} else { // handle single selects
		if ($(this).val() === '') {
			markInvalid($(this), 'Please make a selection');
		} else {
			markValid($(this));
		}
	}
});

            $('input[type=color]').on('click change focus hover', function () {
	markValid($(this));
          });

        });

            function OnValidKeyPress(event) {
            debugger;
            var charCode = event.which;
            if (charCode === 45 && charCode > 31 && (charCode < 48 || charCode > 57)) {
                event.preventDefault();
                return false;
            }
            else {
                return true;
            }


        }

        function DateValidation(startDate, EndDate) {
            debugger;
            var IsTrue = false;
            if (EndDate < startDate) {
                return isTrue;
            }
            else {
                return IsTrue = true;
            }
        }

        function validate(e) {
            debugger;
            var startDate = $('#txtContractStartDate').val();
            var endDate = $('#txtContractEndDate').val();
            var IsValid = DateValidation(startDate, endDate);
            if (IsValid === false) {
                e.preventDefault();
                return false;
            }
            else {
                return true;
            }
        }
    </script>




</body>
</html>


