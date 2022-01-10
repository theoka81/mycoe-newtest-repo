<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>
	<s:form action="../Contract/saveContractDetails"
		enctype="multipart/form-data" id="formContractMaster" method="post"
		theme="simple">

<br/>
<br/>
<br/>
		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>



				<div class="form-horizontal">
					<s:if
						test="contractDetailsViewModel.message neq null  && contractDetailsViewModel.message neq ''">
						<div class="alert alert-success">
							<a href="#" class="close" data-dismiss="alert">&times;</a>
							<s:property value="contractDetailsViewModel.message" />
						</div>
					</s:if>
					<div class="alert alert-success" id="alertMessage">
						<a href="#" class="close" data-dismiss="alert">&times;</a>
						<div id="message"></div>
					</div>
				</div>
				<h4>Contract Details</h4>
				<h4>
					Contract NO :
					<s:property
						value="contractDetailsViewModel.contractDetails.contractMaster.contractNo" />
				</h4>
				<h4>
					Contract Title :
					<s:property
						value="contractDetailsViewModel.contractDetails.contractMaster.contractTitle" />
				</h4>
				<div class="form-horizontal">
					<div class="form-group">
						<div class="col-md-12">
							<s:if
							test="(#session['SESSION_CON_MGMT_SPL'] != null && #session['SESSION_CON_MGMT_SPL'] eq 'true')">
						<s:submit value="Save" name="save" id="btnSaveDetails"
							cssClass="btn btn-primary" />
						</s:if>
							<s:a cssClass="btn btn-primary"
								href="../Contract/DetailsIndex?contractId=%{contractId}">Close</s:a>
						</div>
					</div>

				</div>
				<div id="view">


					<s:hidden id="ContractDetails_ContractMasterId"
						name="contractDetails.contractMasterId" type="hidden"
						value="%{contractDetailsViewModel.contractDetails.contractMaster.id}" />
					<s:hidden id="ContractDetails_Id" name="contractDetails.Id"
						type="hidden"
						value="%{contractDetailsViewModel.contractDetails.id}" />
					<ul class="nav nav-tabs text-center">
						<li class="active"><a data-toggle="tab" href="#home">Details</a></li>
						<li><a data-toggle="tab" href="#menu1">Commodity</a></li>
						<li><a data-toggle="tab" href="#menu2">Retention</a></li>
						<li><a data-toggle="tab" href="#menu3">Procurement</a></li>
						<li><a data-toggle="tab" href="#menu4">Finance</a></li>
						<li><a data-toggle="tab" href="#menu5">Signatories</a></li>
						<li><a data-toggle="tab" href="#menu6">Clauses</a></li>
						<li><a data-toggle="tab" href="#menu7">Documents</a></li>
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">



													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ContractNo">Contract No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_ContractMaster_ContractNo"
																name="contractDetails.contractNo" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.contractMaster.contractNo}"
																readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.ContractNo"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_TenderNumber">Tender No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_TenderNumber"
																name="contractDetails.tenderNumber" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.tenderNumber}"
																readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.TenderNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>



													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_LineNo">Line No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_LineNo"
																name="contractDetails.lineNo" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.lineNo}"
																readonly="true"></s:textfield>
														</div>
													</div>



													<div class="form-group row">
														<label class="col-md-3 control-label text-right">Contract
															Title</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required">
																<s:textarea cssClass="form-control" id="ContractTitle"
																	name="contractDetails.contractTitle" theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.contractMaster.contractTitle}"
																	readonly="true" rows="1" cols="2"></s:textarea>
															</div>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ContractTypeId">Contract
															Type</label>
														<div class="col-md-8">
															<s:select list="#application.contractTypeMap"
																id="ddlContractType"
																name="contractDetails.contractTypeId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="Select..."
																value="%{contractDetailsViewModel.contractDetails.contractTypeId}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.ContractTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_StatusId">Status</label>
														<div class="col-md-8">
															<s:select list="#application.contractDetailsStatusMap"
																id="ContractDetails_StatusId"
																name="contractDetails.statusId" cssClass="form-control"
																theme="simple" headerKey="-1" headerValue="--Select--"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.StatusId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_StatusReasonId">Status
															Reason</label>
														<div class="col-md-8">
															<s:select
																list="#application.contractDetailsStatusReasonMap"
																id="ContractDetails_StatusReasonId"
																name="contractDetails.statusReasonId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.userCode4.id}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.StatusReasonId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ResolutionNumber">Resolution
															No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_ResolutionNumber"
																name="contractDetails.resolutionNumber" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.resolutionNumber}"></s:textfield>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_HodAccountingOfficerId">Heads
															of Department/ Accounting Officer</label>
														<div class="col-md-8">
															<s:select list="#application.hodAccountingOfficerMap"
																id="ContractDetails_HodAccountingOfficerId"
																name="contractDetails.hodAccountingOfficerId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.userCode2.id}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.HodAccountingOfficerId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
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
												Supplier &amp; Dates
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group row">
														<label class="col-md-3 control-label text-right">Supplier</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="supplier-search-type"
																	id="supplier-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" selected>Start with</option>
																	<option value="contains">Contains</option>
																</select>

																<s:select list="#application.activeSuppliersMap"
																	id="ddlSupplier" name="contractDetails.supplierId"
																	cssClass="form-control selectpicker" theme="simple"
																	headerKey="-1" headerValue="Select..."
																	value="%{contractDetailsViewModel.contractDetails.supplierId}"></s:select>

															</div>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.SupplierId"
																data-valmsg-replace="true"></span>
														</div>
													</div>



													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_Physical_Address">Supplier Physical
															Address</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="SupplierPhysicalAddress"
																name="contractDetails.supplierPhysicalAddress"
																theme="simple" readonly="true"></s:textfield>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ServiceProviderRepresentative">Service
															Provider Representative</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_ServiceProviderRepresentative"
																name="contractDetails.serviceProviderRepresentative"
																theme="simple"
																value="%{contractDetailsViewModel.contractDetails.serviceProviderRepresentative}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.ServiceProviderRepresentative"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_RepresentativeCapacity">Representative
															Capacity Of Service Provider</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_RepresentativeCapacity"
																name="contractDetails.representativeCapacity"
																theme="simple"
																value="%{contractDetailsViewModel.contractDetails.representativeCapacity}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.RepresentativeCapacity"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ContractStartDate">Contract
															Start Date</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker"
																id="ContractDetails_ContractStartDate" type="datetime"
																name="contractDetails.contractStartDate" theme="simple">
																<s:param name="value">
																	<s:date
																		name="contractDetailsViewModel.contractDetails.contractStartDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ContractEndDate">Contract
															End Date</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker"
																id="ContractDetails_ContractEndDate" type="datetime"
																name="contractDetails.contractEndDate" theme="simple">
																<s:param name="value">
																	<s:date
																		name="contractDetailsViewModel.contractDetails.contractEndDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_EscalationDate">Escalation
															Date</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker"
																id="ContractDetails_EscalationDate" type="datetime"
																name="contractDetails.escalationDate" theme="simple">
																<s:param name="value">
																	<s:date
																		name="contractDetailsViewModel.contractDetails.escalationDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
														</div>
													</div>

												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Other
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_RequestorId">Requestor</label>
														<div class="col-md-8">
															<s:select list="#application.requesterIdMap"
																id="ContractDetails_RequestorId"
																name="contractDetails.requestorId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="Select..."
																value="%{contractDetailsViewModel.contractDetails.systemUser3.id}"></s:select>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.RequestorId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_RequestingUnitId">Requesting
															Unit</label>
														<div class="col-md-8">
															<s:select list="#application.requestedUnitMap"
																id="ContractDetails_RequestingUnitId"
																name="contractDetails.requestingUnitId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.userCode3.id}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.RequestingUnitId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_TransactionOriginatorId">Transaction
															Originator</label>
														<div class="col-md-8">
															<s:select list="#application.requesterIdMap"
																id="ContractDetails_TransactionOriginatorId"
																name="contractDetails.transactionOriginatorId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.systemUser4.id}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.TransactionOriginatorId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_BidSpecificationDocumentNumber">Bid
															Specification Document Number</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_BidSpecificationDocumentNumber"
																name="contractDetails.bidSpecificationDocumentNumber"
																theme="simple"
																value="%{contractDetailsViewModel.contractDetails.bidSpecificationDocumentNumber}"></s:textfield>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.BidSpecificationDocumentNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_CurrencyId">Currency</label>
														<div class="col-md-8">
															<s:select list="#application.currencyMap"
																id="ContractDetails_CurrencyId"
																name="contractDetails.currencyId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.userCode1.id}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.CurrencyId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-6">&nbsp;</div>
								</div>
							</div>
						</div>

						<div id="menu1" class="tab-pane fade">

							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Commodity
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ParentItemNo">Parent
															Commodity No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_ParentItemNo"
																name="contractDetails.parentItemNo" theme="simple"
																onkeypress="OnValidKeyPress(event);" type="number"
																value="%{contractDetailsViewModel.contractDetails.parentItemNo}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.ParentItemNo"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ItemNo">Commodity</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="inventory-search-type"
																	id="inventory-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" selected>Start with</option>
																	<option value="contains">Contains</option>
																</select>
																<s:select list="commoditiesMap" id="ddlItemNo"
																	name="contractDetails.inventoryId"
																	cssClass="form-control selectpicker" theme="simple"
																	headerKey="-1" headerValue="Select..."
																	value="%{contractDetailsViewModel.contractDetails.inventoryDefinition.id}"></s:select>
															</div>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.InventoryId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
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
												Amount
											</div>
											<div class="panel-body" id="PanelAmount">

												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_UnitCost">Total Main
															Contract Amount (Rands)</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	id="UnitAmount" name="contractDetails.unitCost"
																	theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.unitCost}"
																	type="number" readonly="true"></s:textfield>
																<span class="icon validation success hide"> <span
																	class="fa fa-check" style="font-size: 10px;"></span>
																</span> <span class="icon validation error hide"> <span
																	class="fa fa-remove" style="font-size: 10px;"></span>
																</span>

															</div>
															<div class="is-helpful"
																data-helper="Validated if a positive value is entered"
																data-error="Please enter a positive value to proceed"></div>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ExtendedPrice">Total Sub
															Contract Amount (Rands)</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	id="ExtendedAmount"
																	name="contractDetails.extendedPrice" theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.extendedPrice}"
																	type="number"></s:textfield>
																<span class="icon validation success hide"> <span
																	class="fa fa-check" style="font-size: 10px;"></span>
																</span> <span class="icon validation error hide"> <span
																	class="fa fa-remove" style="font-size: 10px;"></span>
																</span>

															</div>
															<div class="is-helpful"
																data-helper="Validated if a positive value is entered"
																data-error="Please enter a positive value to proceed"></div>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_OpenAmount">Total Amount for
															Cession (Rands)</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	id="OpenAmount" name="contractDetails.openAmount"
																	theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.openAmount}"
																	onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
																<span class="icon validation success hide"> <span
																	class="fa fa-check" style="font-size: 10px;"></span>
																</span> <span class="icon validation error hide"> <span
																	class="fa fa-remove" style="font-size: 10px;"></span>
																</span>

															</div>
															<div class="is-helpful"
																data-helper="Validated if a positive value is entered"
																data-error="Please enter a positive value to proceed"></div>
														</div>
													</div>
												</div>

											</div>
										</div>
									</div>

								</div>

								<div class="row">

									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Unit Of Measure
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_UnitOfMeasurePrimary">Unit
															Of Measure (Primary)</label>
														<div class="col-md-8">
															<s:select list="#application.uomRecievedOrShippingMap"
																id="ContractDetails_UnitOfMeasurePrimary"
																name="contractDetails.unitOfMeasurePrimary"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.unitOfMeasurePrimary}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.UnitOfMeasurePrimary"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_UnitOfMeasureShipped">Unit
															Of Measure (Shipped)</label>
														<div class="col-md-8">
															<s:select list="#application.uomRecievedOrShippingMap"
																id="ContractDetails_UnitOfMeasureShipped"
																name="contractDetails.unitOfMeasureShipped"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.unitOfMeasureShipped}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.UnitOfMeasureShipped"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_UnitOfMeasureReceived">Unit
															Of Measure (Received)</label>
														<div class="col-md-8">
															<s:select list="#application.uomRecievedOrShippingMap"
																id="ContractDetails_UnitOfMeasureReceived"
																name="contractDetails.unitOfMeasureReceived"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.unitOfMeasureReceived}"></s:select>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.UnitOfMeasureReceived"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_Requested">Quantity
															Requested</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_Requested"
																name="contractDetails.requested" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.requested}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.Requested"
																data-valmsg-replace="true"></span>
														</div>
													</div>
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
												Quantity
											</div>
											<div class="panel-body" id="PanelQuantity">

												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_QuantityOrdered">Quantity
															Ordered</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="QuantityOrdered"
																name="contractDetails.quantityOrdered" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.quantityOrdered}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.QuantityOrdered"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_QuantityReceipted">Quantity
															Receipted</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="QuantityReceipted"
																name="contractDetails.quantityReceipted" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.quantityReceipted}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.QuantityReceipted"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_QuantityOpen">Quantity Open</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="QuantityOpen" name="contractDetails.quantityOpen"
																theme="simple"
																value="%{contractDetailsViewModel.contractDetails.quantityOpen}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.QuantityOpen"
																data-valmsg-replace="true"></span>
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

							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Retention
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_RetentionYN">Retention Y/N</label>
														<div class="col-md-8">
															<s:checkbox id="ContractDetails_RetentionYN"
																theme="simple" name="contractDetails.retentionYN"
																value="%{contractDetailsViewModel.contractDetails.retentionYN}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.RetentionYN"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div id="hiddenDev">
														<div class="form-group">
															<label class="control-label col-md-3"
																for="ContractDetails_OnHoldAmount">Percentage of
																Retention</label>
															<div class="col-md-8">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	id="ContractDetails_OnHoldAmount"
																	name="contractDetails.onHoldAmount" theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.onHoldAmount}"
																	type="number"></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="ContractDetails.OnHoldAmount"
																	data-valmsg-replace="true"></span>
															</div>
														</div>

														<div class="form-group">
															<label class="control-label col-md-3"
																for="ContractDetails_ReceivedAmount">Retention
																Amount (Rands)</label>
															<div class="col-md-8">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	id="ContractDetails_ReceivedAmount"
																	name="contractDetails.receivedAmount" theme="simple"
																	value="%{contractDetailsViewModel.contractDetails.receivedAmount}"
																	type="number"></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="ContractDetails.ReceivedAmount"
																	data-valmsg-replace="true"></span>
															</div>
														</div>

													</div>

												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div id="menu3" class="tab-pane fade">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Supplier Information
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_OriginalPromisedDeliveryDate">Original
															Promised Delivery Date</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker text-box single-line"
																id="ContractDetails_OriginalPromisedDeliveryDate" type="datetime"
																name="contractDetails.originalPromisedDeliveryDate" theme="simple">
																<s:param name="value">
																	<s:date
																		name="contractDetailsViewModel.contractDetails.originalPromisedDeliveryDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.OriginalPromisedDeliveryDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>



													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_SupplierShippedFrom">Supplier
															Shipped From</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_SupplierShippedFrom"
																name="contractDetails.supplierShippedFrom"
																theme="simple"
																value="%{contractDetailsViewModel.contractDetails.supplierShippedFrom}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.SupplierShippedFrom"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_ShipmentNo">Shipment No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_ShipmentNo"
																name="contractDetails.shipmentNo" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.shipmentNo}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.ShipmentNo"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_LoadNo">Load No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_LoadNo"
																name="contractDetails.loadNo" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.loadNo}"
																onkeypress="OnValidKeyPress(event);" type="number"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.LoadNo"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_CommodityCode">Commodity
															Classification Code</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_CommodityCode"
																name="contractDetails.commodityCode" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.commodityCode}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.CommodityCode"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_DeliveryInstructionsId">Delivery
															Instruction</label>
														<div class="col-md-8">
															<s:select list="#application.deliveryInstructionMap"
																id="ContractDetails_DeliveryInstructionsId"
																name="contractDetails.deliveryInstructionsId"
																cssClass="form-control" theme="simple" headerKey="-1"
																headerValue="--Select--"
																value="%{contractDetailsViewModel.contractDetails.deliveryInstructionsId}"></s:select>
														</div>
													</div>


												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div id="menu4" class="tab-pane fade">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Vote Number
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_VoteNoSegment1">Vote Number
															1</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_VoteNoSegment1"
																name="contractDetails.voteNoSegment1" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.voteNoSegment1}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.VoteNoSegment1"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_VoteNoSegment2">Vote Number
															2</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_VoteNoSegment2"
																name="contractDetails.voteNoSegment2" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.voteNoSegment2}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.VoteNoSegment2"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_VoteNoSegment3">Vote Number
															3</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_VoteNoSegment3"
																name="contractDetails.voteNoSegment3" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.voteNoSegment3}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.VoteNoSegment3"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_VoteNoSegment4">Vote Number
															4</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_VoteNoSegment4"
																name="contractDetails.voteNoSegment4" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.voteNoSegment4}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.VoteNoSegment4"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="ContractDetails_VoteNoSegment5">Vote Number
															5</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="ContractDetails_VoteNoSegment5"
																name="contractDetails.voteNoSegment5" theme="simple"
																value="%{contractDetailsViewModel.contractDetails.voteNoSegment5}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="ContractDetails.VoteNoSegment5"
																data-valmsg-replace="true"></span>
														</div>
													</div>


												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

						</div>

						<div id="menu5" class="tab-pane fade">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Signatories (Supplier)
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierSignatureDate">SupplierSignatureDate</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker text-box single-line"
																id="Signatory_SupplierSignatureDate" type="datetime"
																name="contractDetails.supplierSignatureDate" theme="simple">
																<s:param name="value">
																	<s:date 
																		name="contractDetailsViewModel.signatory.supplierSignatureDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierSignatureDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierPlaceOfContractSignature">Place
															Of Contract Signature</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierPlaceOfContractSignature"
																name="contractDetails.supplierPlaceOfContractSignature"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.SupplierPlaceOfContractSignature}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierPlaceOfContractSignature"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierAuthorizedSignatory">Authorized
															Signatory</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierAuthorizedSignatory"
																name="contractDetails.supplierAuthorizedSignatory"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.supplierAuthorizedSignatory}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierAuthorizedSignatory"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierAuthorizedName">Authorized
															Name</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierAuthorizedName"
																name="contractDetails.supplierAuthorizedName"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.supplierAuthorizedName}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierAuthorizedName"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierDesignation">Designation</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierDesignation"
																name="contractDetails.supplierDesignation"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.supplierDesignation}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierDesignation"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierWitness1">Witness 1</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierWitness1"
																name="contractDetails.supplierWitness1" theme="simple"
																value="%{contractDetailsViewModel.signatory.supplierWitness1}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierPlaceOfContractSignature"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SupplierWitness2">Witness 2</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_SupplierWitness2"
																name="contractDetails.supplierWitness2" theme="simple"
																value="%{contractDetailsViewModel.signatory.supplierWitness2}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SupplierWitness2"
																data-valmsg-replace="true"></span>
														</div>
													</div>
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
												Signatories (COE)
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_SignatureDate">Signature Date</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control datePicker text-box single-line"
																id="Signatory_SignatureDate" type="datetime"
																name="contractDetails.signatureDate" theme="simple">
																<s:param name="value">
																	<s:date
																		name="contractDetailsViewModel.signatory.signatureDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.SignatureDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_PlaceOfContractSignature">Place Of
															Contract Signature</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_PlaceOfContractSignature"
																name="contractDetails.placeOfContractSignature"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.placeOfContractSignature}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.PlaceOfContractSignature"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_AuthorizedSignatory">Authorized
															Signatory</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_AuthorizedSignatory"
																name="contractDetails.authorizedSignatory"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.authorizedSignatory}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.AuthorizedSignatory"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_AuthorizedName">Authorized Name</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_AuthorizedName"
																name="contractDetails.authorizedName" theme="simple"
																value="%{contractDetailsViewModel.signatory.authorizedName}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.AuthorizedName"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_Designation">Designation</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_Designation"
																name="contractDetails.designation" theme="simple"
																value="%{contractDetailsViewModel.signatory.designation}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.Designation"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_Witness1">Witness 1</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_Witness1" name="contractDetails.witness1"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.witness1}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.Witness1"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Signatory_Witness2">Witness 2</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Signatory_Witness2" name="contractDetails.witness2"
																theme="simple"
																value="%{contractDetailsViewModel.signatory.witness2}"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Signatory.Witness2"
																data-valmsg-replace="true"></span>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>

								</div>
							</div>

						</div>

						<input type="text" hidden id="hiddenClause" name="hiddenClause" />

						<div id="menu6" class="tab-pane fade">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="form-horizontal">
											<div class="panel-body">
												<div class="col-md-12 text-muted" id="dvClause">


													<s:if test="contractDetailsViewModel.clauses != null">
														<s:if
															test="contractDetailsViewModel.contractDetails.contractMasterId != null && contractDetailsViewModel.contractDetails.contractMasterId != 0">
															<jsp:include page="clauseCoreDetails.jsp"></jsp:include>
														</s:if>
														<s:else>
															<jsp:include page="clauseEditDetail.jsp"></jsp:include>
														</s:else>
													</s:if>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div id="menu7" class="tab-pane fade">
							<div class="form-horizontal">
								<jsp:include page="../documents/documents.jsp"></jsp:include>
							</div>
						</div>

					</div>


					<script type="text/javascript">

    $(document).ready(function () {
            ContractGroupValidation();
            CheckRetention();


            $('input, textarea , input[type = "number"]').on('focus', function () {
                markNeutral($(this));
                var $helpText = $(this).closest($inputWrapper).siblings($helperClass);
                $message = $helpText.attr('data-helper');
                helperDown($(this), $helpText, $message);
            });

            $('input:not("input[type =number]")').on('blur', function () {
                if ($(this).val() === '' && $(this).closest($inputWrapper).hasClass($requiredClass)) {
                    markInvalid($(this), $(this).closest($inputWrapper).siblings($helperClass).attr('data-error'));
                }
                else {
                    helperUp($(this));
                }
            });

            $('input:not("input[type =number]")').on('keyup change', function (event) {
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

            $('body').on('click', '.list-group .list-group-item', function () {
                $(this).toggleClass('active');
            });

            $('.list-arrows button').click(function () {
                var $button = $(this), actives = '';
                if ($button.hasClass('move-left')) {
                    actives = $('.list-right ul li.active');
                    actives.clone().appendTo('.list-left ul');
                    actives.remove();
                } else if ($button.hasClass('move-right')) {

                    actives = $('.list-left ul li.active');
                    actives.clone().appendTo('.list-right ul');
                    actives.remove();

                }
            });

            $('.dual-list .selector').click(function () {
                var $checkBox = $(this);
                if (!$checkBox.hasClass('selected')) {
                    $checkBox.addClass('selected').closest('.well').find('ul li:not(.active)').addClass('active');
                    $checkBox.children('i').removeClass('glyphicon-unchecked').addClass('glyphicon-check');
                } else {
                    $checkBox.removeClass('selected').closest('.well').find('ul li.active').removeClass('active');
                    $checkBox.children('i').removeClass('glyphicon-check').addClass('glyphicon-unchecked');
                }
            });

            $('[name="SearchDualList"]').keyup(function (e) {
                var code = e.keyCode || e.which;
                if (code == '9') return;
                if (code == '27') $(this).val(null);
                var $rows = $(this).closest('.dual-list').find('.list-group li');
                var val = $.trim($(this).val()).replace(/ +/g, ' ').toLowerCase();
                $rows.show().filter(function () {
                    var text = $(this).text().replace(/\s+/g, ' ').toLowerCase();
                    return !~text.indexOf(val);
                }).hide();
            });

            $('#btnSaveValue').click(function () {

                var clauseArray = [];
                var itemList = document.querySelectorAll('.list-right li');
                for (var i = 0; i < itemList.length; i++) {
                    clauseArray.push(itemList[i].id);
                }
                var modelData = JSON.stringify(clauseArray);

                var serializedData = $("#formContractDetails").serializeArray();

                $('#hiddenClause').val(modelData);

                $.ajax({
                    type: "POST",
                    url: '/ContractDetails/Create',
                    contentType: 'application/json',
                    data: serializedData,

                });
            })

            $('#btnSaveDetails').click(function () {

                var clauseArray = [];
                var itemList = document.querySelectorAll('.list-right li');
                for (var i = 0; i < itemList.length; i++) {
                    clauseArray.push(itemList[i].id);
                }
                var modelData = JSON.stringify(clauseArray);

                var serializedData = $("#formContractDetails").serializeArray();

                $('#hiddenClause').val(modelData);

                $.ajax({
                    type: "POST",
                    url: '/ContractDetails/Details',
                    contentType: 'application/json',
                    data: serializedData,

                });
            })

            $('#ContractDetails_RetentionYN').change(function () {
            debugger;
            CheckRetention();
        });
        });

    function CheckRetention() {
        debugger;
        var value = $("#ContractDetails_RetentionYN").is(":checked")
        if (value == false) {
            $('#hiddenDev').hide();
        }
        else {
           $('#hiddenDev').show();
        }
    }


    function CommodityPricePopulation() {
        debugger;
        //Commodity Id selection
        var ItemId = $('#ddlItemNo').val();
        //Quantity Ordered
            var QOrdered = $('#QuantityOrdered').val();
        $.ajax
            ({
                url: "/ContractDetails/PopulateCommodityPrice",
                data: { InventoryId: ItemId, Quantity: QOrdered, contractMasterId: 44, contractDetailsId:3},
                type: 'post',
                success: function (data) {
                    var price = data.Commodity;
                    if (price != null || price >= 0) {
                        // total
                        $('#ExtendedAmount').val(price);
                        // Subtotal
                        if (data.DetailsCount == 0) {
                            $('#UnitAmount').val(price);
                        }
                        else {
                            $('#UnitAmount').val(data.TotalMainAmount);
                        }
                    }
                },
                error: function(data){

                }

            });
    }

    $('#ddlItemNo').change(function () {
        debugger;
         CommodityPricePopulation();
         DoWork();
     });

    $('#QuantityOrdered').change(function () {
        debugger;
        CommodityPricePopulation();
        DoWork();
    });

    $('#ContractDetails_OnHoldAmount').change(function () {

        DoWork();
    });

    $('#ddlItemNo').change(function () {
        DoWork();

    });

    function DoWork() {
        debugger;
        //commodity Item
        var ItemId = $('#ddlItemNo').val();
        //retention percentage
        var amount = $('#ContractDetails_OnHoldAmount').val();
        //Quantity Ordered
        var quantity = $('#QuantityOrdered').val();
        $.ajax
            ({
                url: "../ContractDetails/ChangeRetentionAmount",
                data: { RetentionPercentage: amount, InventoryId: ItemId, ContractMasterId: 44 , Quantity: quantity,contractDetailsId:3},
                type: 'post',
                success: function (data) {
                    var price = data.retentionAmount;
                    if (price != null || price >= 0) {
                        $('#ContractDetails_ReceivedAmount').val(price);
                    }
                },
                error: function (data) {

                }

            });
    }

    //function TogglePanel() {
    //    $('#ddlContractType').change(function () {
    //            CheckContractTypeValue();
    //        });
    //}

    //function CheckContractTypeValue() {
    //        var contractValue = $('#ddlContractType').val();

    //        if (contractValue == 1242) {

    //            $('#PanelAmount :input').attr('readonly', false);
    //            $('#PanelAmount :input').attr("disabled", false);

    //            $('#PanelQuantity :input').attr('readonly', 'readonly');
    //            $('#PanelQuantity :input').attr("disabled", true);
    //            $('#PanelQuantity :input').addClass('readonly');


    //        }
    //        else if (contractValue == 1240) {

    //            $('#PanelAmount :input').attr('readonly', 'readonly');
    //            $('#PanelAmount :input').attr("disabled", true);
    //            $('#PanelAmount :input').addClass('readonly');

    //            $('#PanelQuantity :input').attr('readonly', false);
    //            $('#PanelQuantity :input').attr("disabled", false);


    //        }
    //}

    function OnValidKeyPress(event) {

        var charCode = event.which;
        if (charCode === 45 && charCode > 31 && (charCode < 48 || charCode > 57)) {
            event.preventDefault();
            return false;
        }
        else {
            return true;
        }


    }

    function PopulateSupplierAddress()
    {
        var supplierId = $('#ddlSupplier').val();
         $.ajax
            ({
                url: "/ContractDetails/PopulateSupplierAddress",
                data: { SupplierId: supplierId },
                type: 'post',
                success: function (data) {
                    var address = data.Address;
                    $('#SupplierPhysicalAddress').val(address);
                },
                error: function (data) {

                }

            });

    }

    $('#ddlSupplier').change(function () {
        PopulateSupplierAddress();
    });

    function NotifySupplierOnHold() {
        var supplierId = $('#ddlSupplier').val();
         $.ajax
            ({
                url: "/ContractDetails/AlertSupplierOnHold",
                data: { SupplierId: supplierId },
                type: 'post',
                success: function (data) {
                    var message = data.HoldMessage;
                    var isAlerted = data.isAlerted;
                    if (isAlerted === true) {
                        swal({
                            title: "Supplier On Hold",
                            text: message
                        });
                    }
                    else {

                    }
                },
                error: function (data) {

                }

            });
    }

    $('#ddlSupplier').change(function () {
        NotifySupplierOnHold();
    });

</script>



				</div>






			</div>

			<div class="space-30">&nbsp;</div>

			<jsp:include page="../footer.jsp"></jsp:include>

			<script type="text/javascript">

        $(document).ready(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#home"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu1"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu2"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu3"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu4"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu5"]').click(function () {
            $('#btnSaveDetails').hide();
        });
        $('[href = "#menu6"]').click(function () {
            $('#btnSaveDetails').show();
        });
        $(function () {
            //Extends bootstrap select
            //To allow server side live search. plugin => https://www.jqueryscript.net/form/AJAX-Autocomplete-Bootstrap-Select.html
            $('#ddlItemNo').selectpicker().ajaxSelectPicker({
                ajax: {
                    url: '../Inventory/GetInventories',
                    type: 'POST',
                    dataType: 'json',
                    // Use "{{{q}}}" as a placeholder and Ajax Bootstrap Select will
                    // automatically replace it with the value of the search query.
                    data: {
                        q: '{{{q}}}',
                        searchType: function () { return $('#inventory-search-type').val(); }
                    }
                },
                preserveSelected: false,
                // function to preprocess JSON data
                preprocessData: function (data) {
                    var i, l = data.length, array = [];
                    if (l) {
                        for (i = 0; i < l; i++) {
                            array.push($.extend(true, data[i], {
                                text: data[i].Text,
                                value: data[i].Value
                                //data: {
                                //    subtext: data[i].CodeValue
                                //}
                            }));
                        }
                    }
                    // You must always return a valid array when processing data. The
                    // data argument passed is a clone and cannot be modified directly.
                    return array;
                }

            });

            //Extends bootstrap select
            //To allow server side live search. plugin => https://www.jqueryscript.net/form/AJAX-Autocomplete-Bootstrap-Select.html
            $('#ddlSupplier').selectpicker().ajaxSelectPicker({
                ajax: {
                    url: '/Suppliers/GetSuppliers',
                    type: 'POST',
                    dataType: 'json',
                    // Use "{{{q}}}" as a placeholder and Ajax Bootstrap Select will
                    // automatically replace it with the value of the search query.
                    data: {
                        q: '{{{q}}}',
                        searchType: function () { return $('#supplier-search-type').val(); }
                    }
                },
                preserveSelected: false,
                // function to preprocess JSON data
                preprocessData: function (data) {
                    var i, l = data.length, array = [];
                    if (l) {
                        for (i = 0; i < l; i++) {
                            array.push($.extend(true, data[i], {
                                text: data[i].Text,
                                value: data[i].Value
                                //data: {
                                //    subtext: data[i].CodeValue
                                //}
                            }));
                        }
                    }
                    // You must always return a valid array when processing data. The
                    // data argument passed is a clone and cannot be modified directly.
                    return array;
                }
            });


        });

    </script>
	</s:form>


</body>
</html>