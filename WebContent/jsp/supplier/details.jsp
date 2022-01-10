<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Suppliers/saveDetails" id="form"
		enctype="multipart/form-data" method="POST" theme="simple">
<br/>
<br/>
<br/>
		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<div class="form-horizontal">
					<s:if
						test="supplierViewModel.message neq null  && supplierViewModel.message neq ''">
						<div class="alert alert-success">
							<a href="#" class="close" data-dismiss="alert">&times;</a>
							<s:property value="supplierViewModel.message" />
						</div>
					</s:if>
					<div class="alert alert-success" id="alertMessage">
						<a href="#" class="close" data-dismiss="alert">&times;</a>
						<div id="message"></div>
					</div>
				</div>

				<div class="row">
					<div class="col-sm-6">
						<h4>Supplier Information</h4>
						<h4>
							CSD No:
							<s:property value="supplierViewModel.supplier.supplierNumber" />
							<br />Supplier Name:
							<s:property value="supplierViewModel.supplier.legalName" />
						</h4>
						<div class="form-horizontal">
							<div class="form-group">
								<div class="col-md-12">
									<s:if test="supplierViewModel.supplier.csdId >= 0">
										<input type="submit" name="submitButton" value="Save"
											class="btn btn-primary hidden" />
										<input type="submit" name="submitButton" value="Submit"
											class="btn btn-primary" id="SubmitSupplier" />
									</s:if>
									<s:else>
										<input type="submit" name="submitButton" value="CSD Update"
											class="btn btn-primary" id="SubmitTakeOn" />
									</s:else>
									<input type="submit" name="submitButton" value="Close"
										class="btn btn-primary" />
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-6"></div>
				</div>
				<div id="view">

					<head>

<style>
.btn-circle.btn-xs {
	padding: 1px 1px 1px 1px;
}
</style>
					</head>
					<ul class="nav nav-tabs text-center">
						<li class="active"><a data-toggle="tab" href="#summary">Summary</a></li>
						<li><a data-toggle="tab" href="#home">Details</a></li>
						<s:if
							test="#session['SESSION_USER_ROLE'] != null && #session['SESSION_USER_ROLE'] neq 'Supplier'">
							<li><a data-toggle="tab" href="#menu6">Ceded Supplier</a></li>
							<li><a data-toggle="tab" href="#menu1">Classification</a></li>
						</s:if>
						<li><a data-toggle="tab" href="#menu2">Supplier</a></li>
						<li><a data-toggle="tab" href="#menu3">BBBEEE</a></li>
						<li><a data-toggle="tab" href="#menu4">Information</a></li>
						<li class="hidden"><a data-toggle="tab" href="#menu7">Contacts</a></li>
						<s:if
							test="supplierViewModel.supplierMaster != null && supplierViewModel.supplierMaster.id != null && supplierViewModel.supplierMaster.isApplicationSubmitted">
							<li><a data-toggle="tab" href="#menu8">Documents</a></li>
						</s:if>
						<s:else>
							<li><a data-toggle="tab" href="#menu5">Documents</a></li>
						</s:else>
					</ul>

					<div class="tab-content">
						<br />

						<div id="summary" class="tab-pane fade in active">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Supplier Summary
											</div>
											<div class="panel-body">
												<div class="container invoice">
													<div class="invoice-header">
														<div class="row">
															<div class="col-xs-8">
																<h1>
																	<strong><s:property
																			value="supplierViewModel.supplier.legalName" /></strong>
																</h1>
																<h6>
																	<strong>SUPPLIER NO:&nbsp;&nbsp;</strong>
																	<s:property
																		value="supplierViewModel.supplier.supplierNumber" />
																	| <strong>COMPANY NO:&nbsp;&nbsp;</strong>
																	<s:property
																		value="supplierViewModel.supplier.saCompanyNumber" />
																</h6>
															</div>

														</div>
													</div>
													<div class="invoice-body">
														<div class="row">
															<div class="col-xs-6">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">Supplier Details</h3>
																	</div>
																	<div class="panel-body">
																		<dl class="dl-horizontal">
																			<dt>Trading Name :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplier.tradingName" /></strong>
																			</dd>
																			<dt>Legal Name :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplier.legalName" /></strong>
																			</dd>

																			<dt>Supplier MAAA No:</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplierMaster.supplierRefNo" /></strong>
																			</dd>

																			<dt>Supplier COE No :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplierMaster.supplierXRef1" /></strong>
																			</dd>

																			<dt>Company Number :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplier.saCompanyNumber" /></strong>
																			</dd>

																			<dt>Registration Date :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplier.registrationDate" /></strong>
																			</dd>

																			<dt>Has Company Bank Account :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplier.haveBankAccount" /></strong>
																			</dd>

																			<dt>Supplier Department :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplierMaster.userCode3.description" /></strong>
																			</dd>

																			<dt>Supplier Business Unit:</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplierMaster.userCode12.description" /></strong>
																			</dd>

																			<dt>Supplier Status :</dt>
																			<dd>
																				<strong><s:property
																						value="supplierViewModel.supplierMaster.userCode8.description" /></strong>
																			</dd>
																		</dl>
																	</div>
																</div>
															</div>
															<div class="col-xs-6">
																<div class="panel panel-default">
																	<div class="panel-heading">
																		<h3 class="panel-title">Details</h3>
																	</div>
																	<div class="panel-body">

																		<dl class="dl-horizontal">
																			<s:if test="supplierViewModel.addresses.size() > 0">
																				<dt>Address:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.addresses[0].addressLine1" /></strong>
																				</dd>
																				<dt>Postal Code :</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.addresses[0].postalCode" /></strong>
																				</dd>
																			</s:if>
																			<s:if test="supplierViewModel.directors.size() > 0">
																				<dt>Director:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.directors[0].name" /></strong>
																				</dd>
																				<dt>Director SA ID Number:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.directors[0].saIdNumber" /></strong>
																				</dd>
																			</s:if>
																			<s:if test="supplierViewModel.contact.size() > 0">
																				<dt>Contact Fullname:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.contact[0].name" /><strong><s:property
																								value="supplierViewModel.contact[0].surname" /></strong></strong>
																				</dd>
																				<dt>Contact SA ID Number :</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.contact[0].saIdNumber" /></strong>
																				</dd>
																				<dt>Contact Email :</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.contact[0].emailAddress" /></strong>
																				</dd>
																				<dt>Contact Cellphone:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.contact[0].cellphoneNumber" /></strong>
																				</dd>
																			</s:if>
																			<s:if test="supplierViewModel.taxes.size() > 0">
																				<dt>Income Tax No:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.taxes[0].incomeTaxNumber" /></strong>
																				</dd>
																				<dt>Tax Expiration Date:</dt>
																				<dd>
																					<strong><s:property
																							value="supplierViewModel.taxes[0].field1" /></strong>
																				</dd>
																			</s:if>
																		</dl>

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


							</div>
						</div>

						<div id="home" class="tab-pane fade in">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Identification
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<s:hidden name="supplierBean.supplierMasterId"
														value="%{supplierViewModel.supplierMaster.id}"
														id="SupplierMaster_Id" theme="simple" />
													<s:hidden name="supplierBean.supplierCodesId"
														value="%{supplierViewModel.supplierCodes.id}"
														id="SupplierCodes_Id" theme="simple" />
													<s:hidden name="supplierBean.supplierCodesSupplierId"
														value="%{supplierViewModel.supplierCodes.supplierId}"
														id="SupplierCodes_SupplierId" theme="simple" />
													<s:hidden name="supplierBean.supplierMasterSupplierRefId"
														value="%{supplierViewModel.supplierMaster.supplierRefId}"
														id="SupplierMaster_SupplierRefId" theme="simple" />

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_SupplierRefNo">CSD Maaa No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																name="supplierBean.supplierMasterSupplierRefNo"
																value="%{supplierViewModel.supplierMaster.supplierRefNo}"
																id="SupplierMaster_SupplierRefNo" readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.SupplierRefNo"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample"
																aria-expanded="false" aria-controls="collapseExample">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>CSD Maaa Number</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by national
																	treasury upon registration on the <b>CSD (Central
																		Supplier Database)</b> , this information is automatically
																	derived from CSD and pulled into SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_SupplierXRef1">Supplier COE
															No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																name="supplierBean.supplierMasterSupplierXRef1"
																value="%{supplierViewModel.supplierMaster.supplierXRef1}"
																id="SupplierMaster_SupplierXRef1" readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.SupplierXRef1"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample1"
																aria-expanded="false" aria-controls="collapseExample1">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample1">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>COE Registration Number</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>


													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_ClusterId">Cluster</label>
														<div class="col-md-8">
															<s:select list="#application.cluster"
																id="SupplierMaster_ClusterId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierMasterClusterId"
																value="%{supplierViewModel.supplierMaster.userCode1.id}"
																headerKey="-1" headerValue="Please select..."
																 />

															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.ClusterId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample2"
																aria-expanded="false" aria-controls="collapseExample2">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample2">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Cluster</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_CompanyId">Company</label>
														<div class="col-md-8">
															<s:select list="#application.company"
																id="SupplierMaster_CompanyId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierMasterCompanyId"
																value="%{supplierViewModel.supplierMaster.userCode2.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.CompanyId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample3"
																aria-expanded="false" aria-controls="collapseExample3">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample3">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Company</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_DepartmentId">Department</label>
														<div class="col-md-8">
															<s:select list="#application.department"
																id="SupplierMaster_DepartmentId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierMasterDepartmentId"
																value="%{supplierViewModel.supplierMaster.userCode3.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.DepartmentId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample4"
																aria-expanded="false" aria-controls="collapseExample4">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample4">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Department</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_UnitId">Unit</label>
														<div class="col-md-8">
															<s:select list="#application.unit"
																id="SupplierMaster_UnitId" cssClass="form-control"
																theme="simple" name="supplierBean.supplierMasterUnitId"
																value="%{supplierViewModel.supplierMaster.userCode12.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.UnitId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample5"
																aria-expanded="false" aria-controls="collapseExample5">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample5">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Unit</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>



													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_StatusId">Status</label>
														<div class="col-md-8">
															<div class="columns">
																<div class="relative input-wrap is-required">
																	<s:select list="#application.status"
																		id="SupplierMaster_StatusId" cssClass="form-control"
																		theme="simple"
																		name="supplierBean.supplierMasterStatusId"
																		value="%{supplierViewModel.supplierMaster.userCode8.id}"
																		headerKey="-1" headerValue="Please select..."
																		 />
																	<span class="field-validation-valid text-danger"
																		data-valmsg-for="SupplierMaster.StatusId"
																		data-valmsg-replace="true"></span> <span
																		class="icon validation success hide"> <span
																		class="fa fa-check" style="font-size: 10px;"></span>
																	</span> <span class="icon validation error hide"> <span
																		class="fa fa-remove" style="font-size: 10px;"></span>
																	</span>

																</div>
															</div>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample7"
																aria-expanded="false" aria-controls="collapseExample7">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample7">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Supplier Status</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12" id="HoldReason">
														<label class="control-label col-md-3"
															for="SupplierMaster_SupplierHoldId">Supplier Hold
															Reason</label>
														<div class="col-md-8">
															<s:select list="#application.supplierHold"
																id="SupplierMaster_SupplierHoldId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierMasterSupplierHoldId"
																value="%{supplierViewModel.supplierMaster.userCode10.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.SupplierHoldId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample6"
																aria-expanded="false" aria-controls="collapseExample6">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample6">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Supplier Hold Reason</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_SupplierTypeId">Supplier Type</label>
														<div class="col-md-8">
															<div class="columns">
																<div class="relative input-wrap is-required">
																	<s:select list="#application.transactionType"
																		id="SupplierMaster_SupplierTypeId"
																		cssClass="form-control" theme="simple"
																		name="supplierBean.supplierMasterSupplierTypeId"
																		value="%{supplierViewModel.supplierMaster.userCode11.id}"
																		headerKey="-1" headerValue="Please select..."
																		 />
																	<span class="field-validation-valid text-danger"
																		data-valmsg-for="SupplierMaster.SupplierTypeId"
																		data-valmsg-replace="true"></span> <span
																		class="icon validation success hide"> <span
																		class="fa fa-check" style="font-size: 10px;"></span>
																	</span> <span class="icon validation error hide"> <span
																		class="fa fa-remove" style="font-size: 10px;"></span>
																	</span>
																</div>
															</div>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample8"
																aria-expanded="false" aria-controls="collapseExample8">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample8">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Supplier Type</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
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
												Credit Information
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_SupplierCodeId">Supplier Code</label>
														<div class="col-md-8">
															<s:select list="#application.supplierCode"
																id="SupplierMaster_SupplierCodeId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierMasterSupplierCodeId"
																value="%{supplierViewModel.supplierMaster.userCode9.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.SupplierCodeId"
																data-valmsg-replace="true"></span>
														</div>

														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample10"
																aria-expanded="false" aria-controls="collapseExample10">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample10">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Supplier Code</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_PaymentTermsId">Payment Terms</label>
														<div class="col-md-8">
															<s:select list="#application.paymentTerms"
																id="SupplierMaster_PaymentTermsId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierMasterPaymentTermsId"
																value="%{supplierViewModel.supplierMaster.userCode5.id}"
																headerKey="-1" headerValue="Please select..." />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.PaymentTermsId"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample11"
																aria-expanded="false" aria-controls="collapseExample11">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample11">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Payment Terms</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_PaymentInstrumentId">Payment
															Instrument</label>
														<div class="col-md-8">
															<s:select list="#application.paymentInstrument"
																id="SupplierMaster_PaymentInstrumentId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierMasterPaymentInstrumentId"
																value="%{supplierViewModel.supplierMaster.userCode4.id}"
																headerKey="-1" headerValue="Please select..." />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.PaymentInstrumentId"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample12"
																aria-expanded="false" aria-controls="collapseExample12">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample12">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Payment Instrument</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_RemitTypeId">Remit Type</label>
														<div class="col-md-8">
															<s:select list="#application.remitType"
																id="SupplierMaster_RemitTypeId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierMasterRemitTypeId"
																value="%{supplierViewModel.supplierMaster.userCode7.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.RemitTypeId"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample13"
																aria-expanded="false" aria-controls="collapseExample13">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample13">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Remit Type</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_LastInvoiceDate">Last Invoice
															Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="SupplierMaster_LastInvoiceDate" type="datetime"
																name="supplierBean.supplierMasterLastInvoiceDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplierMaster.lastInvoiceDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.LastInvoiceDate"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample14"
																aria-expanded="false" aria-controls="collapseExample14">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample14">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Last Invoice Date</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_LastPaymentDate">Last Payment
															Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="SupplierMaster_LastPaymentDate" type="datetime"
																name="supplierBean.supplierMasterLastPaymentDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplierMaster.lastPaymentDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.LastPaymentDate"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample15"
																aria-expanded="false" aria-controls="collapseExample15">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample15">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Last Payment Date</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_ParentNo">Supplier Parent No.</label>
														<div class="col-md-8">
															<s:textfield theme="simple"
																name="supplierBean.supplierMasterParentNo"
																value="%{supplierViewModel.supplierMaster.parentNo}"
																id="SupplierMaster_ParentNo"
																cssClass="form-control text-box single-line"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.ParentNo"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample16"
																aria-expanded="false" aria-controls="collapseExample16">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample16">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Parent Number</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_PrintMessageId">Print Message</label>
														<div class="col-md-8">
															<s:select list="#application.printMessage"
																id="SupplierMaster_PrintMessageId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierMasterPrintMessageId"
																value="%{supplierViewModel.supplierMaster.userCode6.id}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.PrintMessageId"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample17"
																aria-expanded="false" aria-controls="collapseExample17">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample17">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Print Message</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
															</div>
														</div>
													</div>

													<div class="form-group col-md-12">
														<label class="control-label col-md-3"
															for="SupplierMaster_DeliveryInstructions">Delivery
															Instructions</label>
														<div class="col-md-8">
															<s:textfield theme="simple"
																name="supplierBean.supplierMasterDeliveryInstructions"
																value="%{supplierViewModel.supplierMaster.deliveryInstructions}"
																id="SupplierMaster_DeliveryInstructions"
																cssClass="form-control text-box single-line"
																maxlength="512" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierMaster.DeliveryInstructions"
																data-valmsg-replace="true"></span>
														</div>
														<div class="col-md-1">
															<button type="button"
																class="btn btn-xs btn-default btn-circle"
																data-toggle="collapse" data-target="#collapseExample18"
																aria-expanded="false" aria-controls="collapseExample18">
																<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
															</button>
														</div>
														<br /> <br />
														<div class="collapse" id="collapseExample18">
															<div class="well well-sm">
																<h6 class="font-bold">
																	<strong>Delivery Instructions</strong>
																</h6>
																<p>
																	Supplier unique reference number provided by the city
																	of ekurhuleni upon registration on the <b>SCM
																		(Supply Chain Management)</b> portal , this information is
																	automatically derived from SCM
																</p>
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
						<s:if
							test="#session['SESSION_USER_ROLE'] != null && #session['SESSION_USER_ROLE'] neq 'Supplier'">
							<div id="menu6" class="tab-pane fade">
								<div class="container-fluid">
									<div class="row">
										<div class="col-md-12">
											<div class="hpanel">
												<div class="panel-heading">
													<div class="panel-tools">
														<a class="showhide"><i class="fa fa-chevron-up"></i></a>
													</div>
													Ceded Supplier
												</div>
												<div class="panel-body">
													<div class="form-horizontal">
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierNumber">Supplier
																Number</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierNumber"
																	value="%{supplierViewModel.cededSupplier.supplierNumber}"
																	id="CededSupplier_SupplierNumber"
																	cssClass="form-control text-box single-line"
																	maxlength="6" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierNumber"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample19"
																	aria-expanded="false" aria-controls="collapseExample19">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample19">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Number</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierName">Supplier Name</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierName"
																	value="%{supplierViewModel.cededSupplier.supplierName}"
																	id="CededSupplier_SupplierName"
																	cssClass="form-control text-box single-line"
																	maxlength="128" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierName"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample20"
																	aria-expanded="false" aria-controls="collapseExample20">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample20">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Name</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierPostalAddress">Supplier
																Postal Address</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierPostalAddress"
																	value="%{supplierViewModel.cededSupplier.supplierPostalAddress}"
																	id="CededSupplier_SupplierPostalAddress"
																	cssClass="form-control text-box single-line"
																	maxlength="128" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierPostalAddress"
																	data-valmsg-replace="true"></span>
															</div>

															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample21"
																	aria-expanded="false" aria-controls="collapseExample21">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample21">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Postal Address</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierPostalCode">Supplier
																Postal Code</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierPostalCode"
																	value="%{supplierViewModel.cededSupplier.supplierPostalCode}"
																	id="CededSupplier_SupplierPostalCode"
																	cssClass="form-control text-box single-line"
																	></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierPostalCode"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample22"
																	aria-expanded="false" aria-controls="collapseExample22">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample22">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Postal Code</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierFileReference">Supplier
																File Reference</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierFileReference"
																	value="%{supplierViewModel.cededSupplier.supplierFileReference}"
																	id="CededSupplier_SupplierFileReference"
																	cssClass="form-control text-box single-line"
																	maxlength="20" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierFileReference"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample23"
																	aria-expanded="false" aria-controls="collapseExample23">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample23">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier File Reference</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierPaymentInstrument">Supplier
																Payment Instrument</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierSupplierPaymentInstrument"
																	value="%{supplierViewModel.cededSupplier.supplierPaymentInstrument}"
																	id="CededSupplier_SupplierPaymentInstrument"
																	cssClass="form-control text-box single-line"
																	maxlength="4" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierPaymentInstrument"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample24"
																	aria-expanded="false" aria-controls="collapseExample24">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample24">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Payment instrument</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierStartDate">Supplier
																Start Date</label>
															<div class="col-md-8">
																<s:textfield
																	cssClass="form-control datePicker text-box single-line"
																	id="CededSupplier_SupplierStartDate" type="datetime"
																	name="supplierBean.cededSupplierSupplierStartDate"
																	theme="simple" >
																	<s:param name="value">
																		<s:date
																			name="supplierViewModel.cededSupplier.supplierStartDate"
																			format="yyyy/MM/dd" />
																	</s:param>
																</s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierStartDate"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample25"
																	aria-expanded="false" aria-controls="collapseExample25">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample25">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier Start Date</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_SupplierEndDate">Supplier End
																Date</label>
															<div class="col-md-8">
																<s:textfield
																	cssClass="form-control datePicker text-box single-line"
																	id="CededSupplier_SupplierEndDate" type="datetime"
																	name="supplierBean.cededSupplierSupplierEndDate"
																	theme="simple" >
																	<s:param name="value">
																		<s:date
																			name="supplierViewModel.cededSupplier.supplierEndDate"
																			format="yyyy/MM/dd" />
																	</s:param>
																</s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.SupplierEndDate"
																	data-valmsg-replace="true"></span>
															</div>

															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample26"
																	aria-expanded="false" aria-controls="collapseExample26">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample26">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Ceded Supplier End Date</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_AuthoriseUser">Authorise User</label>
															<div class="col-md-8">
																<s:textfield theme="simple"
																	name="supplierBean.cededSupplierAuthoriseUser"
																	value="%{supplierViewModel.cededSupplier.authoriseUser}"
																	id="CededSupplier_AuthoriseUser"
																	cssClass="form-control text-box single-line"
																	maxlength="6" ></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.AuthoriseUser"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample27"
																	aria-expanded="false" aria-controls="collapseExample27">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample27">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Authorization user</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="CededSupplier_AuthoriseDate">Authorise Date</label>
															<div class="col-md-8">
																<s:textfield
																	cssClass="form-control datePicker text-box single-line"
																	id="CededSupplier_AuthoriseDate" type="datetime"
																	name="supplierBean.cededSupplierAuthoriseDate"
																	theme="simple" >
																	<s:param name="value">
																		<s:date
																			name="supplierViewModel.cededSupplier.authoriseDate"
																			format="yyyy/MM/dd" />
																	</s:param>
																</s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="CededSupplier.AuthoriseDate"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample28"
																	aria-expanded="false" aria-controls="collapseExample28">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample28">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Authorization Date</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
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


							<div id="menu1" class="tab-pane fade">
								<div class="container-fluid">
									<div class="row">
										<div class="col-md-6">
											<div class="hpanel">
												<div class="panel-heading">
													<div class="panel-tools">
														<a class="showhide"><i class="fa fa-chevron-up"></i></a>
													</div>
													Commodity Classification
												</div>
												<div class="panel-body">
													<div class="form-horizontal">
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode1Id">Main
																Supplier Category</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode1"
																	id="SupplierCodes_CategoryCode1Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode1Id"
																	value="%{supplierViewModel.supplierCodes.userCode11.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode1Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample29"
																	aria-expanded="false" aria-controls="collapseExample29">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample29">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Main Supplier Category</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode2Id">Supplier
																Class</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode2"
																	id="SupplierCodes_CategoryCode2Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode2Id"
																	value="%{supplierViewModel.supplierCodes.userCode13.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode2Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample30"
																	aria-expanded="false" aria-controls="collapseExample30">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample30">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Supplier Class</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode3Id">CIDB Grading</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode3"
																	id="SupplierCodes_CategoryCode3Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode3Id"
																	value="%{supplierViewModel.supplierCodes.userCode14.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode3Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample31"
																	aria-expanded="false" aria-controls="collapseExample31">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample31">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>CIDB Grading</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode4Id">Supplier Own
																Reference</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode4"
																	id="SupplierCodes_CategoryCode4Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode4Id"
																	value="%{supplierViewModel.supplierCodes.userCode15.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode4Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample32"
																	aria-expanded="false" aria-controls="collapseExample32">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample32">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Supplier Own Reference</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode5Id">Willing to
																Sub-Contract Indicator</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode5"
																	id="SupplierCodes_CategoryCode5Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode5Id"
																	value="%{supplierViewModel.supplierCodes.userCode16.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode5Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample33"
																	aria-expanded="false" aria-controls="collapseExample33">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br /> <br />
															<div class="collapse" id="collapseExample33">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Willing to Sub-Contract indicator</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
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
													Organizational Classification
												</div>
												<div class="panel-body">
													<div class="form-horizontal">

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode6Id">Finance
																Transactions Exist For Supplier Indicator</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode6"
																	id="SupplierCodes_CategoryCode6Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode6Id"
																	value="%{supplierViewModel.supplierCodes.userCode17.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode6Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample34"
																	aria-expanded="false" aria-controls="collapseExample34">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br /> <br />
															<div class="collapse" id="collapseExample34">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Finance Transactions Exist For
																			Supplier Indicator</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode7Id">B-BBEE
																Scorecard Classification</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode7"
																	id="SupplierCodes_CategoryCode7Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode7Id"
																	value="%{supplierViewModel.supplierCodes.userCode18.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode7Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample35"
																	aria-expanded="false" aria-controls="collapseExample35">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample35">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>B-BBEE Scorecard Classification</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode8Id">Muncipal
																Service Council Name</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode8"
																	id="SupplierCodes_CategoryCode8Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode8Id"
																	value="%{supplierViewModel.supplierCodes.userCode19.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode8Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample36"
																	aria-expanded="false" aria-controls="collapseExample36">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample36">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Muncipal Service Council Name</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
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
													Other Classification
												</div>
												<div class="panel-body">
													<div class="form-horizontal">
														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode9Id">Take On
																Indicator</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode9"
																	id="SupplierCodes_CategoryCode9Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode9Id"
																	value="%{supplierViewModel.supplierCodes.userCode20.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode9Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample37"
																	aria-expanded="false" aria-controls="collapseExample37">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br />
															<div class="collapse" id="collapseExample37">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Take On Indicator</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
																</div>
															</div>
														</div>

														<div class="form-group col-md-12">
															<label class="control-label col-md-3"
																for="SupplierCodes_CategoryCode10Id">Municipal
																Service Account Number</label>
															<div class="col-md-8">
																<s:select list="#application.categoryCode10"
																	id="SupplierCodes_CategoryCode10Id"
																	cssClass="form-control" theme="simple"
																	name="supplierBean.supplierCodesCategoryCode10Id"
																	value="%{supplierViewModel.supplierCodes.userCode1.id}"
																	headerKey="-1" headerValue="Please select..."
																	 />
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierCodes.CategoryCode10Id"
																	data-valmsg-replace="true"></span>
															</div>
															<div class="col-md-1">
																<button type="button"
																	class="btn btn-xs btn-default btn-circle"
																	data-toggle="collapse" data-target="#collapseExample38"
																	aria-expanded="false" aria-controls="collapseExample38">
																	<span class="pe pe-7s-help1" style="font-size: 16px;"></span>
																</button>
															</div>
															<br /> <br /> <br />
															<div class="collapse" id="collapseExample38">
																<div class="well well-sm">
																	<h6 class="font-bold">
																		<strong>Municipal Service Account Number</strong>
																	</h6>
																	<p>
																		Supplier unique reference number provided by the city
																		of ekurhuleni upon registration on the <b>SCM
																			(Supply Chain Management)</b> portal , this information
																		is automatically derived from SCM
																	</p>
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

						</s:if>
						<div id="menu2" class="tab-pane fade">
							<s:hidden id="Supplier_Id" name="supplierBean.supplierId"
								value="%{supplierViewModel.supplier.id}" theme="simple" />
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
															for="Supplier_IsActive">Is Active</label>
														<div class="col-md-8">

															<s:checkbox id="IsActive" theme="simple"
																name="supplierBean.supplierIsActive"
																value="%{supplierViewModel.supplier.isActive}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.IsActive"
																data-valmsg-replace="true"></span>

														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SupplierInactiveReason">Inactive
															Reason</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																maxlength="256" id="Supplier_SupplierInactiveReason"
																name="supplierBean.supplierInactiveReason"
																value="%{supplierViewModel.supplier.supplierInactiveReason}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SupplierInactiveReason"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SupplierInactiveDate">Supplier
															Inactive Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Supplier_SupplierInactiveDate" type="datetime"
																name="supplierBean.supplierInactiveDate" theme="simple"
																>
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplier.supplierInactiveDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SupplierInactiveDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SupplierStateId">Supplier State</label>
														<div class="col-md-8">
															<s:select list="#application.supplierStates"
																id="Supplier_SupplierStateId" cssClass="form-control"
																theme="simple" name="supplierBean.supplierStateId"
																value="%{supplierViewModel.supplier.supplierState.supplierStateId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SupplierStateId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_IsAssociated">Is Associated</label>
														<div class="col-md-8">
															<s:checkbox id="Supplier_IsAssociated" theme="simple"
																name="supplierBean.supplierIsAssociated"
																value="%{supplierViewModel.supplier.isAssociated}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.IsAssociated"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SupplierTypeId">Supplier Type</label>
														<div class="col-md-8">
															<s:select list="#application.supplierType"
																id="Supplier_SupplierTypeId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierClassificationId"
																value="%{supplierViewModel.supplier.supplierClassification.supplierClassificationId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SupplierTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SupplierSubTypeId">Supplier Sub
															Type</label>
														<div class="col-md-8">
															<s:select list="#application.supplierSubType"
																id="Supplier_SupplierSubTypeId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierSubClassificationId"
																value="%{supplierViewModel.supplier.supplierSubClassification.supplierSubClassificationId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SupplierSubTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_GovernmentTypeId">Government Type</label>
														<div class="col-md-8">
															<s:select list="#application.governmentTypes"
																id="Supplier_GovernmentTypeId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierGovernmentTypeId"
																value="%{supplierViewModel.supplier.governmentTypeId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.GovernmentTypeId"
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_CountryOfOriginId">Country of
															Origin</label>
														<div class="col-md-8">
															<s:select list="#application.countryOfOrigin"
																id="Supplier_CountryOfOriginId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierCountryOfOriginId"
																value="%{supplierViewModel.supplier.countryOfOriginId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.CountryOfOriginId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_LegalName">Legal Name</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_LegalName"
																name="supplierBean.supplierLegalName"
																value="%{supplierViewModel.supplier.legalName}"
																maxlength="128" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.LegalName"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_TradingName">Trading Name</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_TradingName"
																name="supplierBean.supplierTradingName"
																value="%{supplierViewModel.supplier.tradingName}"
																maxlength="128" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.TradingName"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_IdTypeId">IdTypeId</label>
														<div class="col-md-8">
															<s:select list="#application.idType"
																id="Supplier_IdTypeId" cssClass="form-control"
																theme="simple" name="supplierBean.supplierIdTypeId"
																value="%{supplierViewModel.supplier.idTypeId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.IdTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SaIdNumber">SA ID No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_SaIdNumber"
																name="supplierBean.supplierSaIdNumber"
																value="%{supplierViewModel.supplier.saIdNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SaIdNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_ForeignIdNumber">Foreign ID No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_ForeignIdNumber"
																name="supplierBean.supplierForeignIdNumber"
																value="%{supplierViewModel.supplier.foreignIdNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.ForeignIdNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_ForeignPassportNumber">Foreign
															Passport No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_ForeignPassportNumber"
																name="supplierBean.supplierForeignPassportNumber"
																value="%{supplierViewModel.supplier.foreignPassportNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.ForeignPassportNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_WorkPermitNumber">Work Permit No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_WorkPermitNumber"
																name="supplierBean.supplierWorkPermitNumber"
																value="%{supplierViewModel.supplier.workPermitNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.WorkPermitNumber"
																data-valmsg-replace="true"></span>
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SaCompanyNumber">SA Company No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_SaCompanyNumber"
																name="supplierBean.supplierSaCompanyNumber"
																value="%{supplierViewModel.supplier.saCompanyNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SaCompanyNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_RegistrationDate">Registration Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Supplier_RegistrationDate" type="datetime"
																name="supplierBean.supplierRegistrationDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplier.registrationDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.RegistrationDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_ForeignCompanyRegistrationNumber">Foreign
															Company Registration No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_ForeignCompanyRegistrationNumber"
																name="supplierBean.supplierForeignCompanyRegistrationNumber"
																value="%{supplierViewModel.supplier.foreignCompanyRegistrationNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.ForeignCompanyRegistrationNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_SaTrustRegistrationNumber">SA Trust
															Registration No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_SaTrustRegistrationNumber"
																name="supplierBean.supplierSaTrustRegistrationNumber"
																value="%{supplierViewModel.supplier.saTrustRegistrationNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.SaTrustRegistrationNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_ForeignTrustRegistrationNumber">Foreign
															Trust Registration No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_ForeignTrustRegistrationNumber"
																name="supplierBean.supplierForeignTrustRegistrationNumber"
																value="%{supplierViewModel.supplier.foreignTrustRegistrationNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.ForeignTrustRegistrationNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_NonProfitOrganisationNumber">Non
															Profit Org No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Supplier_NonProfitOrganisationNumber"
																name="supplierBean.supplierNonProfitOrganisationNumber"
																value="%{supplierViewModel.supplier.nonProfitOrganisationNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.NonProfitOrganisationNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_DateOperationsStarted">Date
															Operation Started</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Supplier_DateOperationsStarted" type="datetime"
																name="supplierBean.supplierDateOperationsStarted"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplier.dateOperationsStarted"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.DateOperationsStarted"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_HaveBankAccount">Have Bank Account</label>
														<div class="col-md-8">
															<s:checkbox id="Supplier_HaveBankAccount" theme="simple"
																name="supplierBean.supplierHaveBankAccount"
																value="%{supplierViewModel.supplier.haveBankAccount}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.HaveBankAccount"
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_BusinessStatusId">Business Status</label>
														<div class="col-md-8">
															<s:select list="#application.businessStatus"
																id="Supplier_BusinessStatusId" cssClass="form-control"
																theme="simple"
																name="supplierBean.supplierBusinessStatusId"
																value="%{supplierViewModel.supplier.businessStatusId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.BusinessStatusId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_BusinessStatusLastVerificationDate">Last
															Verification Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Supplier_BusinessStatusLastVerificationDate"
																type="datetime"
																name="supplierBean.supplierBusinessStatusLastVerificationDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplier.businessStatusLastVerificationDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.BusinessStatusLastVerificationDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_IsListedOnStockExchange">Is Listed
															Company</label>
														<div class="col-md-8">
															<s:checkbox id="Supplier_IsListedOnStockExchange"
																theme="simple"
																name="supplierBean.supplierIsListedOnStockExchange"
																value="%{supplierViewModel.supplier.isListedOnStockExchange}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.IsListedOnStockExchange"
																data-valmsg-replace="true"></span>

														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_IsOwnedByNaturalSAPerson">Is Owned
															by Natural SA Person</label>
														<div class="col-md-8">
															<s:checkbox id="Supplier_IsOwnedByNaturalSAPerson"
																theme="simple"
																name="supplierBean.supplierIsOwnedByNaturalSAPerson"
																value="%{supplierViewModel.supplier.isOwnedByNaturalSAPerson}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.IsOwnedByNaturalSAPerson"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_TotalAnnualTurnoverId">Total Annual
															Turnover</label>
														<div class="col-md-8">
															<s:select list="#application.totalAnnualTurnover"
																id="Supplier_TotalAnnualTurnoverId"
																cssClass="form-control" theme="simple"
																name="supplierBean.supplierTotalAnnualTurnoverId"
																value="%{supplierViewModel.supplier.totalAnnualTurnoverId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.TotalAnnualTurnoverId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Supplier_FinancialYearStartDate">Financial
															Year Start</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Supplier_FinancialYearStartDate" type="datetime"
																name="supplierBean.supplierFinancialYearStartDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.supplier.financialYearStartDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Supplier.FinancialYearStartDate"
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


						<div id="menu3" class="tab-pane fade">
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
															for="Bbbee_CertificateTypeId">Certificate Type</label>
														<div class="col-md-8">
															<s:select list="#application.certificateType"
																id="Bbbee_CertificateTypeId" cssClass="form-control"
																theme="simple"
																name="supplierBean.bbbeeCertificateTypeId"
																value="%{supplierViewModel.bbbee.bbbeeCertificateType.certificateTypeId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_VerificationRegulatorId">Verification
															Regulator</label>
														<div class="col-md-8">
															<s:select list="#application.verificationRegulatorMap"
																id="Bbbee_VerificationRegulatorId"
																cssClass="form-control" theme="simple"
																name="supplierBean.bbbeeVerificationRegulatorId"
																value="%{supplierViewModel.bbbee.bbbeeVerificationRegulator.verificationRegulatorId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.VerificationRegulatorId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_CertificateNumber">Certificate No.</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_CertificateNumber"
																name="supplierBean.bbbeeCertificateNumber"
																value="%{supplierViewModel.bbbee.certificateNumber}"
																maxlength="16" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_CertificateIssueDate">Certificate
															Issue Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Bbbee_CertificateIssueDate" type="datetime"
																name="supplierBean.bbbeeCertificateIssueDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.bbbee.certificateIssueDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateIssueDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_CertificateExpiryDate">Certificate
															Expiry Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Bbbee_CertificateExpiryDate" type="datetime"
																name="supplierBean.bbbeeCertificateExpiryDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.bbbee.certificateExpiryDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateExpiryDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_StatusLevelOfContributorId">Status
															Level Of Contributor</label>
														<div class="col-md-8">
															<s:select list="#application.statusLevelOfContributor"
																id="Bbbee_StatusLevelOfContributorId"
																cssClass="form-control" theme="simple"
																name="supplierBean.bbbeeStatusLevelOfContributorId"
																value="%{supplierViewModel.bbbee.bbbeeStatusLevelOfContributor.BBBEEStatusLevelOfContributorId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.StatusLevelOfContributorId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_BlackOwnership">Black Ownership</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_BlackOwnership"
																name="supplierBean.bbbeeBlackOwnership"
																value="%{supplierViewModel.bbbee.blackOwnership}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.BlackOwnership"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_BlackWomanOwnership">Black Woman
															Ownership</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_BlackWomanOwnership"
																name="supplierBean.bbbeeBlackWomanOwnership"
																value="%{supplierViewModel.bbbee.blackWomanOwnership}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.BlackWomanOwnership"
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_IsAcceptUnderstandAffidavid">Is Accept
															Understand Affidavid</label>
														<div class="col-md-8">
															<s:checkbox id="Bbbee_IsAcceptUnderstandAffidavid"
																theme="simple"
																name="supplierBean.bbbeeIsAcceptUnderstandAffidavid"
																value="%{supplierViewModel.Bbbee.isAcceptUnderstandAffidavid}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.IsAcceptUnderstandAffidavid"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_CertificateSignedBy">Certificate
															Signed By</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_CertificateSignedBy"
																name="supplierBean.bbbeeCertificateSignedBy"
																value="%{supplierViewModel.bbbee.certificateSignedBy}"
																maxlength="64" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateSignedBy"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_CertificateSignDate">Certificate Sign
															Date</label>
														<div class="col-md-8">
															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="Bbbee_CertificateSignDate" type="datetime"
																name="supplierBean.bbbeeCertificateSignDate"
																theme="simple" >
																<s:param name="value">
																	<s:date
																		name="supplierViewModel.bbbee.certificateSignDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.CertificateSignDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_SectorCharterId">Sector Charter</label>
														<div class="col-md-8">
															<s:select list="#application.sectorCharter"
																id="Bbbee_SectorCharterId" cssClass="form-control"
																theme="simple" name="supplierBean.bbbeeSectorCharterId"
																value="%{supplierViewModel.bbbee.bbbeeSectorCharter1.sectorCharterId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.SectorCharterId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_ValueAddingSupplier">Value Adding
															Supplier</label>
														<div class="col-md-8">
															<s:checkbox id="Bbbee_ValueAddingSupplier" theme="simple"
																name="supplierBean.bbbeeValueAddingSupplier"
																value="%{supplierViewModel.Bbbee.valueAddingSupplier}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.ValueAddingSupplier"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EmpoweringSupplier">Empowering
															Supplier</label>
														<div class="col-md-8">
															<s:checkbox id="Bbbee_EmpoweringSupplier" theme="simple"
																name="supplierBean.bbbeeEmpoweringSupplier"
																value="%{supplierViewModel.Bbbee.empoweringSupplier}"
																cssClass="i-check"></s:checkbox>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EmpoweringSupplier"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_IrbaRegisteredAuditorId">IRBA
															Registered Auditor</label>
														<div class="col-md-8">
															<s:select list="#application.irbaRegisteredAuditor"
																id="Bbbee_IrbaRegisteredAuditorId"
																cssClass="form-control" theme="simple"
																name="supplierBean.bbbeeIrbaRegisteredAuditor"
																value="%{supplierViewModel.bbbee.bbbeeIrbaRegisteredAuditor.bbbeeIrbaRegisteredAuditor}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.IrbaRegisteredAuditorId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_SanasAccreditedAgencyId">SANAS
															Accredited Agency</label>
														<div class="col-md-8">
															<s:select list="#application.sanasAccreditedAgency"
																id="Bbbee_SanasAccreditedAgencyId"
																cssClass="form-control" theme="simple"
																name="supplierBean.sanasBbbeeVerificationAgencyId"
																value="%{supplierViewModel.bbbee.sanasBbbeeVerificationAgency.sanasBbbeeVerificationAgencyId}"
																headerKey="-1" headerValue="Please select..."
																 />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.SanasAccreditedAgencyId"
																data-valmsg-replace="true"></span>
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">


													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_OwnershipScore">Ownership Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_OwnershipScore"
																name="supplierBean.bbbeeOwnershipScore"
																value="%{supplierViewModel.bbbee.ownershipScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.OwnershipScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_ManagementControlScore">Management
															Control Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_ManagementControlScore"
																name="supplierBean.bbbeeManagementControlScore"
																value="%{supplierViewModel.bbbee.managementControlScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.ManagementControlScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EmploymentEquityScore">Employment
															Equity Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_EmploymentEquityScore"
																name="supplierBean.bbbeeEmploymentEquityScore"
																value="%{supplierViewModel.bbbee.employmentEquityScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EmploymentEquityScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_SkillsDevelopmentScore">Skills
															Development Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_SkillsDevelopmentScore"
																name="supplierBean.bbbeeSkillsDevelopmentScore"
																value="%{supplierViewModel.bbbee.skillsDevelopmentScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.SkillsDevelopmentScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_PreferentialProcurementScore">Preferential
															Procurement Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_PreferentialProcurementScore"
																name="supplierBean.bbbeePreferentialProcurementScore"
																value="%{supplierViewModel.bbbee.preferentialProcurementScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.PreferentialProcurementScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EnterpriseDevelopmentScore">Enterprise
															Development Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_EnterpriseDevelopmentScore"
																name="supplierBean.bbbeeEnterpriseDevelopmentScore"
																value="%{supplierViewModel.bbbee.enterpriseDevelopmentScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EnterpriseDevelopmentScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_SocioEconomicDevelopmentScore">SocioEconomic
															Development Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_SocioEconomicDevelopmentScore"
																name="supplierBean.bbbeeSocioEconomicDevelopmentScore"
																value="%{supplierViewModel.bbbee.socioEconomicDevelopmentScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.SocioEconomicDevelopmentScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EnterpriseSupplierDevelopmentScore">Enterprise
															Supplier Development Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_EnterpriseSupplierDevelopmentScore"
																name="supplierBean.bbbeeEnterpriseSupplierDevelopmentScore"
																value="%{supplierViewModel.bbbee.enterpriseSupplierDevelopmentScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EnterpriseSupplierDevelopmentScore"
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
												Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_LandOwnershipScore">Land Ownership
															Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_LandOwnershipScore"
																name="supplierBean.bbbeeLandOwnershipScore"
																value="%{supplierViewModel.bbbee.landOwnershipScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.LandOwnershipScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EmpowermentFinancingScore">Empowerment
															Financing Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_EmpowermentFinancingScore"
																name="supplierBean.bbbeeEmpowermentFinancingScore"
																value="%{supplierViewModel.bbbee.empowermentFinancingScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EmpowermentFinancingScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_AccessFinancialServicesScore">Access
															Financial Services Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_AccessFinancialServicesScore"
																name="supplierBean.bbbeeAccessFinancialServicesScore"
																value="%{supplierViewModel.bbbee.accessFinancialServicesScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.AccessFinancialServicesScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_EconomicDevelopmentScore">Economic
															Development Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_EconomicDevelopmentScore"
																name="supplierBean.bbbeeEconomicDevelopmentScore"
																value="%{supplierViewModel.bbbee.economicDevelopmentScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.EconomicDevelopmentScore"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="Bbbee_ForeignOwnershipScore">Foreign
															Ownership Score</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="Bbbee_ForeignOwnershipScore"
																name="supplierBean.bbbeeForeignOwnershipScore"
																value="%{supplierViewModel.bbbee.foreignOwnershipScore}"
																maxlength="8" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="Bbbee.ForeignOwnershipScore"
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


						<div id="menu4" class="tab-pane fade">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Addresses
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.addresses != null && supplierViewModel.addresses.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Is Preferred</th>
															<th>Address Type</th>
															<th>Address Line 1</th>
															<th>Address Line 2</th>
															<th>Country</th>
															<th>Province</th>
															<th>District</th>
															<th>Municipality</th>
															<th>City</th>
															<th>Suburb</th>
															<th>Ward</th>
															<th>Postal Code</th>
														</tr>
														<s:iterator value="supplierViewModel.addresses" var="stat">
															<tr>
																<td><s:checkbox id="item_IsPreferred_Value"
																		theme="simple" name="isPreferred" cssClass="i-check"
																		></s:checkbox></td>
																<td><s:property value="addressType.name" /></td>
																<td><s:property value="addressLine1" /></td>
																<td><s:property value="addressLine2" /></td>
																<td><s:property value="country.name" /></td>
																<td><s:property value="province.name" /></td>
																<td><s:property value="district.name" /></td>
																<td><s:property value="municipality.name" /></td>
																<td><s:property value="city.name" /></td>
																<td><s:property value="suburb.name" /></td>
																<td><s:property value="ward.name" /></td>
																<td><s:property value="postalCode" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		address information available</h3>
																	<br />
																	<div class="text-center">
																		<img
																			src="<%=request.getContextPath()%>/Content/img/undraw_No_data_re_kwbl.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Directors
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.directors != null && supplierViewModel.directors.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Name</th>
															<th>Surname</th>
															<th>Is Active</th>
															<th>Country</th>
															<th>DirectorStatus</th>
															<th>SA ID No.</th>
															<th>Is Owner</th>
															<th>Gender</th>
															<th>Ownership Percentage</th>
														</tr>
														<s:iterator value="supplierViewModel.directors" var="stat">
															<tr>
																<td><s:property value="name" /></td>
																<td><s:property value="surname" /></td>
																<td><s:checkbox id="item_IsActive_Value"
																		theme="simple" name="isActive" cssClass="i-check"
																		></s:checkbox></td>
																<td><s:property value="country.name" /></td>
																<td><s:property value="directorStatus.name" /></td>
																<td><s:property value="saIdNumber" /></td>
																<td><s:checkbox id="item_IsOwner_Value"
																		theme="simple" name="isOwner" cssClass="i-check"
																		></s:checkbox></td>
																<td><s:property value="gender.name" /></td>
																<td><s:property value="ownershipPercentage" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		director information available</h3>
																	<br />
																	<div class="text-center">
																		<img
																			src="<%=request.getContextPath()%>/Content/img/undraw_No_data_re_kwbl.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Bank
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.bankAccounts != null && supplierViewModel.bankAccounts.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Account Holder</th>
															<th>Bank Name</th>
															<th>Branch Name</th>
															<th>Branch Number</th>
															<th>Account Number</th>
														</tr>
														<s:iterator value="supplierViewModel.bankAccounts"
															var="stat">
															<tr>
																<td><s:property value="accountHolder" /></td>
																<td><s:property value="bankName" /></td>
																<td><s:property value="branchName" /></td>
																<td><s:property value="branchNumber" /></td>
																<td><s:property value="accountNumber" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		bank account information available</h3>
																	<br />
																	<div class="text-center">
																		<img src="../Content/img/undraw_Savings_re_eq4w.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Commodities &amp; &nbsp;Classifications
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.commodityGroups != null && supplierViewModel.commodityGroups.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Name</th>
															<th>Description</th>
															<th>NationWide</th>
															<th>ProvinceWide</th>
															<th>Is Active</th>
														</tr>
														<s:iterator value="supplierViewModel.bankAccounts"
															var="stat">
															<tr>
																<td><s:property value="name" /></td>
																<td><s:property value="description" /></td>
																<td><s:property value="nationWide" /></td>
																<td><s:property value="provinceWide" /></td>
																<td><s:property value="isActive" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		commodity & classification information available</h3>
																	<br />
																	<div class="text-center">
																		<img
																			src="<%=request.getContextPath()%>/Content/img/undraw_No_data_re_kwbl.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Contacts
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.contact != null && supplierViewModel.contact.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Name</th>
															<th>Surname</th>
															<th>SA ID No.</th>
															<th>Email Address</th>
															<th>Cellphone No.</th>
															<th>Telephone No.</th>
														</tr>
														<s:iterator value="supplierViewModel.contact">
															<tr>
																<td><s:property value="name" /></td>
																<td><s:property value="surname" /></td>
																<td><s:property value="saIdNumber" /></td>
																<td><s:property value="emailAddress" /></td>
																<td><s:property value="cellphoneNumber" /></td>
																<td><s:property value="telephoneNumber" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		contact information available</h3>
																	<br />
																	<div class="text-center">
																		<img
																			src="<%=request.getContextPath()%>/Content/img/undraw_No_data_re_kwbl.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Tax
											</div>
											<div class="panel-body">
												<s:if
													test="supplierViewModel.taxes != null && supplierViewModel.taxes.size() > 0">
													<table
														class="table table-bordered table-condensed table-hover">
														<tr>
															<th>Income Tax No.</th>
															<th>Payee No.</th>
															<th>Vat No.</th>
															<th>Is Pin Provided</th>
															<th>Is Valid Certificate</th>
															<th>Is Vat Vendor</th>
															<th>Validation Response</th>
															<th>Last Verification Date</th>
														</tr>
														<s:iterator value="supplierViewModel.taxes">
															<tr>
																<td><s:property value="incomeTaxNumber" /></td>
																<td><s:property value="payeNumber" /></td>
																<td><s:property value="vatNumber" /></td>
																<td><s:property value="isPinProvided" /></td>
																<td><s:property value="isValidCertificate" /></td>
																<td><s:property value="isVatVendor" /></td>
																<td><s:property value="validationResponse" /></td>
																<td><s:property value="lastVerificationDate" /></td>
															</tr>
														</s:iterator>
													</table>
												</s:if>
												<s:else>
													<div class="col-md-12">
														<div class="hpanel">
															<div class="panel-body">
																<div class="form-horizontal" style="height: 180px;">
																	<h3 class="text-center">Oops... Sorry there's no
																		tax information available</h3>
																	<br />
																	<div class="text-center">
																		<img
																			src="<%=request.getContextPath()%>/Content/img/undraw_No_data_re_kwbl.png"
																			width="200px" height="170px" />
																	</div>
																</div>

															</div>
														</div>
													</div>
												</s:else>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div id="menu7" class="tab-pane fade hidden">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Sales
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_SalesContactPerson">Sales
															Contact</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_SalesContactPerson"
																name="supplierBean.supplierContactSalesContactPerson"
																value="%{supplierViewModel.supplierContact.salesContactPerson}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.SalesContactPerson"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_SalesTelephoneNumber">Sales
															Telephone No.</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_SalesTelephoneNumber"
																name="supplierBean.supplierContactSalesTelephoneNumber"
																value="%{supplierViewModel.supplierContact.salesTelephoneNumber}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.SalesTelephoneNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_SalesFaxNumber">Sales Fax
															No</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_SalesFaxNumber"
																name="supplierBean.supplierContactSalesFaxNumber"
																value="%{supplierViewModel.supplierContact.salesFaxNumber}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.SalesFaxNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_SalesEmail">Sales Email</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_SalesEmail"
																name="supplierBean.supplierContactSalesEmail"
																value="%{supplierViewModel.supplierContact.salesEmail}"
																type="email" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.SalesEmail"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_QuoteFaxNumber">Quote Fax
															No</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_QuoteFaxNumber"
																name="supplierBean.supplierContactQuoteFaxNumber"
																value="%{supplierViewModel.supplierContact.quoteFaxNumber}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.QuoteFaxNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_QuoteEmail">Quote Email</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_QuoteEmail"
																name="supplierBean.supplierContactQuoteEmail"
																value="%{supplierViewModel.supplierContact.quoteEmail}"
																type="email" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.QuoteEmail"
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
												Accounts
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_AccountsContactPerson">Accounts
															Contact</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_AccountsContactPerson"
																name="supplierBean.supplierContactAccountsContactPerson"
																value="%{supplierViewModel.supplierContact.accountsContactPerson}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.AccountsContactPerson"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_AccountsTelephoneNumber">Accounts
															Telephone No.</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_AccountsTelephoneNumber"
																name="supplierBean.supplierContactAccountsTelephoneNumber"
																value="%{supplierViewModel.supplierContact.accountsTelephoneNumber}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.AccountsTelephoneNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_AccountsFaxNumber">Accounts
															Fax No.</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_AccountsFaxNumber"
																name="supplierBean.supplierContactAccountsFaxNumber"
																value="%{supplierViewModel.supplierContact.accountsFaxNumber}"
																></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.AccountsFaxNumber"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="SupplierContacts_AccountsEmail">Accounts
															Email</label>
														<div class="col-md-8">
															<s:textfield class="form-control text-box single-line"
																id="SupplierContacts_AccountsEmail"
																name="supplierBean.supplierContactAccountsEmail"
																value="%{supplierViewModel.supplierContact.accountsEmail}"
																type="email" ></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="SupplierContacts.AccountsEmail"
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
						<s:if
							test="supplierViewModel.supplierMaster != null && supplierViewModel.supplierMaster.id != null && supplierViewModel.supplierMaster.isApplicationSubmitted">
							<div id="menu8" class="tab-pane fade">
								<div class="form-horizontal">
									<jsp:include page="../documents/fileManager.jsp"></jsp:include>
								</div>

							</div>
						</s:if>
						<s:else>
							<div id="menu5" class="tab-pane fade">
								<div class="form-horizontal">
									<jsp:include page="../documents/documents.jsp"></jsp:include>
								</div>

							</div>
						</s:else>
					</div>


					<script>
						$(document)
								.ready(
										function() {

											showHoldReason();
											$('input, textarea')
													.on(
															'focus',
															function() {
																markNeutral($(this));
																var $helpText = $(
																		this)
																		.closest(
																				$inputWrapper)
																		.siblings(
																				$helperClass);
																$message = $helpText
																		.attr('data-helper');
																helperDown(
																		$(this),
																		$helpText,
																		$message);
															});

											$(
													'input:not("input[type=url], input[type=password], input[name=email], input[type=tel]"), textarea')
													.on(
															'blur',
															function() {
																if ($(this)
																		.val() === ''
																		&& $(
																				this)
																				.closest(
																						$inputWrapper)
																				.hasClass(
																						$requiredClass)) {
																	markInvalid(
																			$(this),
																			$(
																					this)
																					.closest(
																							$inputWrapper)
																					.siblings(
																							$helperClass)
																					.attr(
																							'data-error'));
																} else {
																	helperUp($(this));
																}
															});

											$(
													'input:not("input[type=url], input[type=password], input[name=email], input[type=tel]"), textarea')
													.on(
															'keyup',
															function(event) {
																if ($(this)
																		.val() !== '') {
																	markValid($(this));
																}
															});

											$('select')
													.on(
															'change',
															function() {
																var $currentSelect = $(this), $selects = $(
																		'select ',
																		$currentSelect
																				.closest($inputWrapper)), $numSelects = $selects.length;

																if ($numSelects > 1) { // handle multiple selects
																	if (!$currentSelect
																			.hasClass('changed')) {
																		$currentSelect
																				.addClass('changed');
																	}

																	var $selectsValues = [];
																	var $numChanges = $(
																			'.changed ',
																			$currentSelect
																					.closest($inputWrapper)).length;

																	if ($numChanges === $numSelects) {
																		$selects
																				.each(function() {
																					if ($(
																							this)
																							.val() === '') {
																						$selectsValues
																								.push('empty'); // need a value to push to the array (can't use 'empty' in markup if '' is needed elsewhere)
																					} else {
																						$selectsValues
																								.push($(
																										this)
																										.val());
																					}
																				});

																		var $numEmpty = 0;

																		for (i = 0; i < $selectsValues.length; i++) {
																			if ($selectsValues[i] === 'empty') {
																				$numEmpty++;
																			}
																		}

																		var $iconSuccess = $(
																				'.icon.success',
																				$(
																						this)
																						.closest(
																								$inputWrapper)), $iconError = $(
																				'.icon.error',
																				$(
																						this)
																						.closest(
																								$inputWrapper));

																		if ($numEmpty > 0) {
																			setIconMulti(
																					$iconSuccess,
																					$iconError,
																					'invalid');
																			setField(
																					$currentSelect,
																					$currentSelect
																							.closest($inputWrapper),
																					'invalid');
																		} else {
																			setIconMulti(
																					$iconSuccess,
																					$iconError,
																					'valid');
																			setField(
																					$currentSelect,
																					$currentSelect
																							.closest($inputWrapper),
																					'valid');
																		}
																	}

																} else { // handle single selects
																	if ($(this)
																			.val() === '') {
																		markInvalid(
																				$(this),
																				'Please make a selection');
																	} else {
																		markValid($(this));
																	}
																}
															});

											$('input[type=color]').on(
													'click change focus hover',
													function() {
														markValid($(this));
													});
										});
						$('#SupplierMaster_StatusId').change(function() {
							debugger;
							showHoldReason();
						});

						function showHoldReason() {
							debugger;
							var StatusId = $('#SupplierMaster_StatusId').val();
							if (StatusId == "21424") {
								$('#HoldReason').show();
							} else {
								$('#HoldReason').hide();
							}
						}
					</script>

				</div>
			</div>



			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
	</s:form>
</body>
</html>