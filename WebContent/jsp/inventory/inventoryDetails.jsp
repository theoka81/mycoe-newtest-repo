<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Inventory/saveDetails" id="form"
		enctype="multipart/form-data" method="POST" theme="simple">

		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>
				<br/>
<br/>        
<br/>
				<h4>Add Commodity Identification</h4>
				<div class="form-horizontal">
					<div class="alert alert-success hidden">
						<a href="#" class="close" data-dismiss="alert">&times;</a>

					</div>

					<div class="alert alert-success" id="alertMessage">
						<a href="#" class="close" data-dismiss="alert">&times;</a>
						<div id="message"></div>
					</div>


				</div>
				<s:hidden name="inventoryBean.inventoryId"
					value="%{inventoryViewModel.inventoryDefinition.id}"
					id="inventoryDefinition_Id" theme="simple" />
				<s:hidden name="inventoryBean.inventoryWarehouseDefaultsId"
					value="%{inventoryViewModel.inventoryWarehouseDefaults.id}"
					id="InventoryWarehouseDefaults_Id" theme="simple" />
				<s:hidden name="inventoryBean.inventoryPricingId"
					value="%{inventoryViewModel.inventoryPricing.id}"
					id="InventoryPricing_id" theme="simple" />
				<s:hidden name="inventoryBean.uomConversionId"
					value="%{inventoryViewModel.uomConversion.id}"
					id="uomConversion_Id" theme="simple" />
				<s:hidden name="inventoryBean.inventorySpecificationId"
					value="%{inventoryViewModel.inventorySpecification.id}"
					id="InventorySpecification_id" theme="simple" />
					
					<s:hidden name="statusId" id="statusId" />
					<s:hidden name="configId" id="configId" />
				<div class="row">
					<input type="submit" id="submit" name="submit" value="Submit"
						class="btn btn-primary" /> <a class="btn btn-primary" href="#"
						onclick="GoIndexPage()">Close</a>
				</div>
				<div id="view">


					<ul class="nav nav-tabs text-center">
						<li class="active"><a data-toggle="tab" href="#home">Identification</a></li>
						<li><a data-toggle="tab" href="#menu1">Catalogue</a></li>
						<li><a data-toggle="tab" href="#menu2">Attributes</a></li>

						<li class="hidden"><a data-toggle="tab" href="#menu3">Shipping</a></li>
						<li class="hidden"><a data-toggle="tab" href="#menu4">Commodity
								Pricing</a></li>
						<li class="hidden"><a data-toggle="tab" href="#menu5">Warehouse
								Defaults</a></li>
						<li><a data-toggle="tab" href="#menu6">Documents</a></li>

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
												Identifier
											</div>
											<div class="panel-body">
												<div class="form-horizontal">



													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemNo">COE
															No</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																value="%{inventoryViewModel.inventoryDefinition.itemNo}"
																name="inventoryBean.inventoryDefinitionItemNo"
																id="inventoryViewModel.inventoryDefinition_ItemNo"
																readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.itemNo"
																data-valmsg-replace="true"></span>

														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemDescription">Commodity
															Description</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required">
																<s:textfield
																	cssClass="form-control text-box single-line"
																	value="%{inventoryViewModel.inventoryDefinition.itemDescription}"
																	name="inventoryBean.inventoryDefinitionItemDescription"
																	id="inventoryViewModel.inventoryDefinition_ItemDescription"
																	readonly="true"></s:textfield>
																<span class="field-validation-valid text-danger"
																	data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemDescription"
																	data-valmsg-replace="true"></span>
																<!--  <span class="icon validation success hide">
                                                    <span class="fa fa-check" style="font-size:10px;"></span>
                                                </span>
                                                <span class="icon validation error hide">
                                                    <span class="fa fa-remove" style="font-size:10px;"></span>
                                                </span>-->

															</div>
															<div class="is-helpful"
																data-helper="Validated if commodity description is not empty."
																data-error="Please enter a commodity description to proceed"></div>
														</div>

													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_StockingType">Stocking
															Type</label>
														<div class="col-md-8">
															<div class="columns">
																<div class="relative input-wrap is-required">
																	<s:select list="#application.stockType"
																		id="InventoryDefinition_StockTypeId"
																		cssClass="form-control" theme="simple"
																		value="%{inventoryViewModel.inventoryDefinition.stockTypeId}"
																		name="inventoryBean.inventoryDefinitionStockTypeId"
																		headerKey="-1" headerValue="Please select..." />

																	<span class="field-validation-valid text-danger"
																		data-valmsg-for="InventoryDefinition.StockTypeId"
																		data-valmsg-replace="true"></span>




																</div>
																<div class="is-helpful"
																	data-helper="Validates if a stocking type is selected."
																	data-error="Please select a stocking type to proceed."></div>
															</div>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemStatus">Status</label>
														<div class="col-md-8">
															<div class="columns">
																<div class="relative input-wrap is-required">

																	<s:select list="#application.itemStatus"
																		id="InventoryDefinition_ItemStatusId"
																		cssClass="form-control" theme="simple"
																		value="%{inventoryViewModel.inventoryDefinition.itemStatusId}"
																		name="inventoryBean.inventoryDefinitionItemStatusId"
																		headerKey="-1" headerValue="Please select..." />

																	<span class="field-validation-valid text-danger"
																		data-valmsg-for="InventoryDefinition.StockTypeId"
																		data-valmsg-replace="true"></span>


																</div>
																<div class="is-helpful"
																	data-helper="Validates if not empty."
																	data-error="Please select a status to proceed."></div>
															</div>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ShortDescription">Short
															Description</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																value="%{inventoryViewModel.inventoryDefinition.shortDescription}"
																name="inventoryBean.inventoryDefinitionShortDescription"
																id="inventoryViewModel.inventoryDefinition_ShortDescription"
																readonly="true"></s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ShortDescription"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemXRef3">Commodity
															Type</label>
														<div class="col-md-8">
															<s:select list="#application.commodityType"
																id="InventoryDefinition_ItemXRef3"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemXRef3"
																value="%{inventoryViewModel.inventoryDefinition.itemXRef3}"
																headerKey="-1" headerValue="Please select..." />

															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryDefinition.itemXRef3"
																data-valmsg-replace="true"></span> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemXRef3"
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

						<div id="menu1" class="tab-pane fade">

							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Commodity Classification
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ProductFamily">Level
															2 - Family</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="product-family-search-type"
																	id="product-family-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" name="start" selected>Start
																		with</option>
																	<option value="contains" name="contains">Contains</option>
																</select>
																<s:select list="#application.productFamily"
																	id="InventoryDefinition_ProductFamilyId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Level 2 - Family must be a number."
																	name="inventoryBean.inventoryDefinitionProductFamilyId"
																	value="%{inventoryViewModel.inventoryDefinition.productFamilyId}"
																	headerKey="-1" headerValue="Please select..." />

																<span class="field-validation-valid text-danger"
																	data-valmsg-for="SupplierMaster.ClusterId"
																	data-valmsg-replace="true"></span>

															</div>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ProductFamily"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_FamilySection">Level
															1 - Segment</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="family-section-search-type"
																	id="family-section-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" name="start" selected>Start
																		with</option>
																	<option value="contains" name="contains">Contains</option>
																</select>
																<s:select list="#application.familySection"
																	id="InventoryDefinition_FamilySectionId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Level 1 - Segment must be a number."
																	name="inventoryBean.inventoryDefinitionFamilySectionId"
																	value="%{inventoryViewModel.inventoryDefinition.familySectionId}"
																	headerKey="-1" headerValue="Please select..." />

																<span class="field-validation-valid text-danger"
																	data-valmsg-for="inventoryViewModel.inventoryDefinition.familySectionId"
																	data-valmsg-replace="true"></span>


															</div>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.FamilySection"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ProductLine">Product
															Line</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="product-line-search-type"
																	id="product-line-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" name="start" selected>Start
																		with</option>
																	<option value="contains" name="contains">Contains</option>
																</select>

																<s:select list="#application.productLine"
																	id="InventoryDefinition_ProductLineId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Product Line must be a number."
																	name="inventoryBean.inventoryDefinitionProductLineId"
																	value="%{inventoryViewModel.inventoryDefinition.productLineId}"
																	headerKey="-1" headerValue="Please select..." />

															</div>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ProductLine"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ProductGroup">Level
															4 - Group</label>
														<div class="col-md-8">

															<s:select list="#application.productGroup"
																id="InventoryDefinition_ProductGroupId"
																cssClass="form-control selectpicker" theme="simple"
																data-live-search="true" data-val="true"
																data-val-number="The field Level 4 - Group must be a number.."
																name="inventoryBean.inventoryDefinitionProducGroupId"
																value="%{inventoryViewModel.inventoryDefinition.producGroupId}"
																headerKey="-1" headerValue="Please select..." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ProductGroupId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CommodityClass">Level
															3 - Class</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="commodity-class-search-type"
																	id="commodity-class-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" selected>Start with</option>
																	<option value="contains">Contains</option>
																</select>

																<s:select list="#application.commodityClass"
																	id="InventoryDefinition_CommodityClassId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Level 3 - Class must be a number."
																	name="inventoryBean.inventoryDefinitionCommodityClassId"
																	value="%{inventoryViewModel.inventoryDefinition.commodityClassId}"
																	headerKey="-1" headerValue="Please select..." />
															</div>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.CommodityClassId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CommoditySubClass">Commodity
															Sub Class</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="commodity-sub-search-type"
																	id="commodity-sub-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" selected>Start with</option>
																	<option value="contains">Contains</option>
																</select>

																<s:select list="#application.commoditySubClass"
																	id="InventoryDefinition_CommoditySubClassId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Commodity Sub Class must be a number."
																	name="inventoryBean.inventoryDefinitionCommoditySubClassId"
																	value="%{inventoryViewModel.inventoryDefinition.commoditySubClassId}"
																	headerKey="-1" headerValue="Please select..." />


															</div>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.CommoditySubClassId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CommodityCode">Commodity
															Code</label>
														<div class="col-md-8">
															<div class="input-group">
																<select name="commodity-code-search-type"
																	id="commodity-code-search-type"
																	class="col-md-3 form-control selectpicker">
																	<option value="start_with" selected>Start with</option>
																	<option value="contains">Contains</option>
																</select>

																<s:select list="#application.commodityCode"
																	id="InventoryDefinition_CommodityCodeId"
																	cssClass="form-control selectpicker" theme="simple"
																	data-live-search="true" data-val="true"
																	data-val-number="The field Commodity Code must be a number."
																	name="inventoryBean.inventoryDefinitionCommodityCodeId"
																	value="%{inventoryViewModel.inventoryDefinition.commodityCodeId}"
																	headerKey="-1" headerValue="Please select..." />



															</div>

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.CommodityCodeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_PlanningCode">Planning
															Code</label>
														<div class="col-md-8">

															<s:select list="#application.planningCode"
																id="InventoryDefinition_PlanningCodeId"
																cssClass="form-control selectpicker" theme="simple"
																data-live-search="true" data-val="true"
																data-val-number="The field Commodity Planning Code must be a number."
																name="inventoryBean.inventoryDefinitionPlanningCodeId"
																value="%{inventoryViewModel.inventoryDefinition.planningCodeId}"
																headerKey="-1" headerValue="Please select..." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.PlanningCodeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
												</div>
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
												Organizational Classification
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode1">Costing
															Method</label>
														<div class="col-md-8">
															<s:select list="#application.costingMethod"
																id="inventoryViewModel_inventoryDefinition_itemCodeId1"
																cssClass="form-control" theme="simple"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId1}"
																name="inventoryBean.inventoryDefinitionItemCodeId1"
																headerKey="-1" headerValue="Please select..." />

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.itemCodeId1"
																data-valmsg-replace="true"></span>


														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode2">Item
															Category</label>
														<div class="col-md-8">
															<s:select list="#application.itemCategory"
																id="InventoryDefinitionItemCodeId2"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId2"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId2}"
																headerKey="-1" headerValue="Please select..." />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId2"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode3">Item
															Sub Category</label>
														<div class="col-md-8">
															<s:select list="#application.itemSubCategory"
																id="InventoryDefinitionItemCodeId3"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId3"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId3}"
																headerKey="-1" headerValue="Please select..." />

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId3"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode4">Strategic
															Sourcing Parent</label>
														<div class="col-md-8">
															<s:select list="#application.strategicSourcingParent"
																id="InventoryDefinitionItemCodeId4"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId4"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId4}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Strategic Sourcing Parent must be a number." />

															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId4"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode5">Strategic
															Sourcing Child</label>
														<div class="col-md-8">

															<s:select list="#application.strategicSourcingChild"
																id="InventoryDefinitionItemCodeId5"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId5"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId5}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Strategic Sourcing Child must be a number." />
															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId5"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode6">ABC
															Coding</label>
														<div class="col-md-8">
															<s:select list="#application.aBCCoding"
																id="InventoryDefinitionItemCodeId6"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId6"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId6}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field ABC Coding must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId6"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode7">Transversal
															Contract</label>
														<div class="col-md-8">
															<s:select list="#application.transversalContract"
																id="InventoryDefinitionItemCodeId7"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId7"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId7}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Transversal Contract must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId7"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ProvincialContract">Provincial
															Contract</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_ProvincialContract"
																name="inventoryBean.inventoryDefinitioProvincialContract"
																value="%{inventoryViewModel.inventoryDefinition.provincialContract}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ProvincialContract"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemCode8">Standard
															Industrial Classification (SIC)</label>
														<div class="col-md-8">

															<s:select list="#application.sIC"
																id="InventoryDefinitionItemCodeId8"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemCodeId8"
																value="%{inventoryViewModel.inventoryDefinition.itemCodeId8}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Standard Industrial Classification (SIC) must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemCodeId8"
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
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Dimensions
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemDimensionLength">Commodity
															Dimensions Length</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryDefinition_ItemDimensionLength" maxlength="9"
																name="inventoryBean.inventoryDefinitionItemDimensionLength"
																value="%{inventoryViewModel.inventoryDefinition.itemDimensionLength}"
																onKeyPress="if(this.value.length==9) return false;"
																onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																theme="simple"/> 
																<span
																	class="icon validation success hide"> <span
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
															for="inventoryViewModel.inventoryDefinition_ItemDimensionWidth">Commodity
															Dimensions Width</label>
														<div class="col-md-8">

															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_ItemDimensionWidth"
																	name="inventoryBean.inventoryDefinitionItemDimensionWidth"
																	value="%{inventoryViewModel.inventoryDefinition.itemDimensionWidth}"
																	onKeyPress="if(this.value.length==9) return false;"
																	onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																	theme="simple"/> 
																<span
																	class="icon validation success hide"> <span
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
															for="inventoryViewModel.inventoryDefinition_ItemDimensionHeight">Commodity
															Dimensions Height</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_ItemDimensionHeight"
																	name="inventoryBean.inventoryDefinitionItemDimensionHeight"
																	value="%{inventoryViewModel.inventoryDefinition.itemDimensionHeight}"
																	onKeyPress="if(this.value.length==9) return false;"
																	onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																	theme="simple"/> 
																<span
																	class="icon validation success hide"> <span
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
															for="inventoryViewModel.inventoryDefinition_ItemDimensionVolume">Commodity
															Dimensions Volume</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_ItemDimensionVolume"
																	name="inventoryBean.inventoryDefinitionItemDimensionVolume"
																	value="%{inventoryViewModel.inventoryDefinition.itemDimensionVolume}"
																	onKeyPress="if(this.value.length==9) return false;"
																	onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																	theme="simple"/> 
																<span
																	class="icon validation success hide"> <span
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
															for="inventoryViewModel.inventoryDefinition_ItemTemperaturePreferredFrom">Commodity
															Temperature Preferred From</label>
														<div class="col-md-8">
															<s:select list="#application.itemTemperature"
																id="ItemTemperaturePreferredFromId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemTemperaturePreferredFromId"
																value="%{inventoryViewModel.inventoryDefinition.itemTemperaturePreferredFromId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Commodity Temperature Preferred From must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemTemperaturePreferredFromId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ItemTemperaturePreferredTo">Commodity
															Temperature Preferred To</label>
														<div class="col-md-8">
															<s:select list="#application.itemTemperature"
																id="ItemTemperaturePreferredToId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionItemTemperaturePreferredToId"
																value="%{inventoryViewModel.inventoryDefinition.itemTemperaturePreferredToId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Commodity Temperature Preferred To must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ItemTemperaturePreferredToId"
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
												Units Of Measure
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_UomPrimary">Uom
															Primary</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionUomPrimaryId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionUomPrimaryId"
																value="%{inventoryViewModel.inventoryDefinition.uomPrimaryId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Uom Primary must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.UomPrimaryId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_UomSecondary">Uom
															Secondary</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionUomSecondaryId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionUomSecondaryId"
																value="%{inventoryViewModel.inventoryDefinition.uomSecondaryId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Uom Secondary must be a number." />





															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.UomSecondaryId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_UomPurchasing">Uom
															Purchasing</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionUomPurchasingId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionUomPurchasingId"
																value="%{inventoryViewModel.inventoryDefinition.uomPurchasingId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Uom Purchasing must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.UomPurchasing"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_UomPricing">Uom
															Pricing</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionUomPricingId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionUomPricingId"
																value="%{inventoryViewModel.inventoryDefinition.uomPricingId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Uom Pricing must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.UomPricingId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_UomShipping">Uom
															Shipping</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionUomShippingId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionUomShippingId"
																value="%{inventoryViewModel.inventoryDefinition.uomShippingId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Uom Shipping must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.UomShippingId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_MscoaItemSegment">mSCOA
															Item Segment</label>
														<div class="col-md-8">
															<s:select list="#application.mscoaItemSegment"
																id="InventoryDefinitionMscoaItemSegmentId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionMscoaItemSegmentId"
																value="%{inventoryViewModel.inventoryDefinition.mscoaItemSegmentId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field mSCOA Item Segment must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.MscoaItemSegment"
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
												Specifications
											</div>
											<div class="panel-body">
												<div class="form-horizontal">


													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_StandardAgreementTemplateId">Standard
															Agreement Template</label>
														<div class="col-md-8">
															<s:select list="#application.standardAgreementTemplate"
																id="InventoryDefinitionStandardAgreementTemplateId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionStandardAgreementTemplateId"
																value="%{inventoryViewModel.inventoryDefinition.standardAgreementTemplateId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Standard Agreement Template must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.StandardAgreementTemplateId"
																data-valmsg-replace="true"></span>
														</div>
													</div>



													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_RelatedAssetId">Related
															Asset ID</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_RelatedAssetId" maxlength="9"
																name="inventoryBean.InventorySpecificationRelatedAssetId"
																value="%{inventoryBean.InventorySpecification.relatedAssetId}"
																theme="simple"/> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.RelatedAssetId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_RelatedAssetDescription">Related
															Asset Description</label>
														<div class="col-md-8">
															<s:textarea cols="75"
																cssClass="form-control"
																id="InventorySpecification_RelatedAssetDescription"
																name="inventoryBean.inventorySpecificationRelatedAssetDescription"
																value="%{inventoryBean.inventorySpecification.relatedAssetDescription}"
																rows="1" theme="simple">
															</s:textarea>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.RelatedAssetDescription"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_SpecifiedState">Specified
															State</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_SpecifiedState"
																name="inventoryBean.inventorySpecificationSpecifiedState"
																value="%{inventoryBean.inventorySpecification.specifiedState}"
																theme="simple"/> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.SpecifiedState"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_SpecifiedEffectiveDate">Specified
															Effective Date</label>
														<div class="col-md-8">

															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="InventorySpecification_SpecifiedEffectiveDate"
																type="datetime"
																name="inventoryBean.inventorySpecificationSpecifiedEffectiveDate"
																theme="simple" disabled="true">
																<s:param name="value">
																	<s:date
																		name="inventoryViewModel.inventorySpecification.specifiedEffectiveDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.SpecifiedEffectiveDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_ProductModelGroup">Product
															Model Group</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_ProductModelGroup"
																name="inventoryBean.inventorySpecificationProductModelGroup"
																value="%{inventoryViewModel.inventorySpecification.productModelGroup}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.ProductModelGroup"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_ProductModel">Product
															Model</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_ProductModel"
																value="%{inventoryViewModel.inventorySpecification.productModel}"
																name="inventoryBean.inventorySpecificationProductModel"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.ProductModel"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_VariantSpecification">Variant
															Specification</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_VariantSpecification"
																value="%{inventoryViewModel.inventorySpecification.variantSpecification}"
																name="inventoryBean.inventorySpecificationVariantSpecification"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.VariantSpecification"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_VariantBaseline">Variant
															Baseline</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventorySpecification_VariantBaseline"
																name="inventoryBean.inventorySpecificationVariantBaseline"
																value="%{inventoryViewModel.inventorySpecification.variantBaseline}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.VariantBaseline"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_UseOemPartFlag">OEM
															Part Flag</label>
														<div class="col-md-8">
														<s:checkbox id="InventorySpecification_UseOemPartFlag" theme="simple"
																value="%{inventoryViewModel.inventorySpecification.useOemPartFla}"
																name="inventoryBean.inventorySpecificationUseOemPartFlag"
																cssClass="i-check"></s:checkbox>
															<span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.UseOemPartFlag"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventorySpecification_CanUseSubstituteFlag">Use
															Substitute Flag</label>
														<div class="col-md-8">
														<s:checkbox id="InventorySpecification_UseOemPartFlag" theme="simple"
																value="%{inventoryViewModel.inventorySpecification.canUseSubstituteFlag}"
																name="inventoryBean.inventorySpecificationCanUseSubstituteFlag"
																cssClass="i-check"></s:checkbox>
															<span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventorySpecification.CanUseSubstituteFlag"
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
												Defaults
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CycleCountCategory">Cycle
															Count Category</label>
														<div class="col-md-8">
															<s:select list="#application.cycleCountCategory"
																id="InventoryDefinitionCycleCountCategoryId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionCycleCountCategoryId"
																value="%{inventoryViewModel.inventoryDefinition.cycleCountCategoryId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Cycle Count Category must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.CycleCountCategoryId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CategoryGl">Category
															Gl</label>
														<div class="col-md-8">
															<s:select list="#application.categoryGl"
																id="InventoryDefinitionCategoryGlId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionCategoryGlId"
																value="%{inventoryViewModel.inventoryDefinition.categoryGlId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Category GL must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.CategoryGlId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_MethodKitConfiguratorPricing">Method
															Kit Configuration Pricing</label>
														<div class="col-md-8">
															<s:select
																list="#application.methodKitConfiguratorPricing"
																id="InventoryDefinitionMethodKitConfiguratorPricingIdId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionMethodKitConfiguratorPricingId"
																value="%{inventoryViewModel.inventoryDefinition.methodKitConfiguratorPricingId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Method Kit Configuration Pricing must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.MethodKitConfiguratorPricingId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_TypeWarranty">Type
															Warranty</label>
														<div class="col-md-8">
															<s:select list="#application.typeWarranty"
																id="InventoryDefinitionMethodKitConfiguratorPricingId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionTypeWarrantyId"
																value="%{inventoryViewModel.inventoryDefinition.typeWarrantyId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Type Warranty must be a number." />


															<select class="form-control" data-val="true"
																data-val-number="The field Type Warranty must be a number."
																id="inventoryViewModel.inventoryDefinition_TypeWarrantyId"
																name="inventoryBean.inventoryDefinition.TypeWarrantyId"><option
																	value="">--Select--</option>
															</select> <span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.TypeWarranty"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_CommissionCategory">Commission
															Category</label>
														<div class="col-md-8">
															<s:select list="#application.commissionCategory"
																id="InventoryDefinitionCommissionCategoryId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionCommissionCategoryId"
																value="%{inventoryViewModel.inventoryDefinition.commissionCategoryId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Commission Category must be a number." />


														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_SerialNoRequired">Serial
															Required</label>
														<div class="col-md-8">
															<s:select list="#application.serialNoRequired"
																id="InventoryDefinitionSerialNoRequiredId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionSerialNoRequiredId"
																value="%{inventoryViewModel.inventoryDefinition.serialNoRequiredId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Serial Required must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.SerialNoRequiredId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_FifoProcessing">Fifo
															Pricing</label>
														<div class="col-md-8">
															<s:select list="#application.fifoProcessing"
																id="InventoryDefinitionFifoProcessingId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionFifoProcessingId"
																value="%{inventoryViewModel.inventoryDefinition.fifoProcessingId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Fifo Processing must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.FifoProcessingId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_LotStatusCode">Lot
															Status Code</label>
														<div class="col-md-8">
															<s:select list="#application.lotStatusCode"
																id="InventoryDefinitionLotStatusCodeId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionLotStatusCodeId"
																value="%{inventoryViewModel.inventoryDefinition.lotStatusCodeId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Lot Status must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.LotStatusCodeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_DaysShelfLifeDays">Days
															Shelf Life Days</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_DaysShelfLifeDays"
																	name="inventoryBean.inventoryDefinitionDaysShelfLifeDays"
																	value="%{inventoryViewModel.inventoryDefinition.daysShelfLifeDays}"
																	onKeyPress="if(this.value.length==9) return false;"
																	onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																	theme="simple"/>
																<span
																	class="icon validation success hide"> <span
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
												Conversions
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="UomConversion_Description">Conversion
															Description</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																maxlength="128"
																id="UomConversion_Description"
																name="inventoryBean.uomConversionDescription"
																value="%{inventoryViewModel.uomConversion.description}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="UomConversion.Description"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="UomConversion_ConversionFactor">Conversion
															Factor</label>
														<div class="col-md-8">
														<s:textfield cssClass="form-control text-box single-line"
																id="UomConversion_ConversionFactor"
																name="inventoryBean.uomConversionConversionFactor"
																value="%{inventoryViewModel.uomConversion.conversionFactor}"
																onKeyPress="if(this.value.length==9) return false;"
																onkeydown="if(event.keyCode == 69 || event.keyCode == 190|| event.keyCode == 189|| event.keyCode == 187|| event.keyCode == 107|| event.keyCode == 109|| event.keyCode == 110)return false;"
																theme="simple"/>
															<span
																class="field-validation-valid text-danger"
																data-valmsg-for="UomConversion.ConversionFactor"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="UomConversion_FromUomId">FromUomId</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionFromUomId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionFromUomId"
																value="%{inventoryViewModel.inventoryDefinition.fromUomId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field From UOM must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="UomConversion.FromUomId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="UomConversion_ToUomId">ToUomId</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryDefinitionToUomId" cssClass="form-control"
																theme="simple"
																name="inventoryBean.inventoryDefinitionToUomId"
																value="%{inventoryViewModel.inventoryDefinition.toUomId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field To UOM must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="UomConversion.ToUomId"
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

						<div id="menu3" class="tab-pane fade hidden" >


							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Shipping Details
											</div>
											<div class="panel-body">
												<div class="form-horizontal">

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_BuyerNo">Buyer
															No.</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_BuyerNo"
																	name="inventoryBean.inventoryDefinitionBuyerNo"
																	value="%{inventoryViewModel.inventoryDefinition.buyerNo}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/>
																<span class="icon validation success hide">
																	<span class="fa fa-check" style="font-size: 10px;"></span>
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
															for="inventoryViewModel.inventoryDefinition_DrawingNo">Drawing
															No.</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_DrawingNo"
																	name="inventoryBean.inventoryDefinitionDrawingNo"
																	value="%{inventoryViewModel.inventoryDefinition.drawingNo}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/>
																<span class="icon validation success hide">
																	<span class="fa fa-check" style="font-size: 10px;"></span>
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
															for="inventoryViewModel.inventoryDefinition_CarrierNo">Carrier
															No.</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_CarrierNo"
																	name="inventoryBean.inventoryDefinitionCarrierNo"
																	value="%{inventoryViewModel.inventoryDefinition.carrierNo}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/>
																<span class="icon validation success hide">
																	<span class="fa fa-check" style="font-size: 10px;"></span>
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
															for="inventoryViewModel.inventoryDefinition_PreferredCarrier">Preferred
															Carrier</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryDefinition_PreferredCarrier"
																name="inventoryBean.inventoryDefinitionPreferredCarrier"
																value="%{inventoryViewModel.inventoryDefinition.preferredCarrier}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.PreferredCarrier"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ShippingConditionsCode">Shipping
															Conditions Code</label>
														<div class="col-md-8">
															<s:select list="#application.shippingConditionsCode"
																id="InventoryDefinitionShippingConditionsCodeId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionShippingConditionsCodeId"
																value="%{inventoryViewModel.inventoryDefinition.shippingConditionsCodeId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Shipping Condidition must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ShippingConditionsCodeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_ShippingCommodityClass">Shipping
															Commodity Class</label>
														<div class="col-md-8">
															<s:select list="#application.shippingCommodityClass"
																id="InventoryDefinitionShippingCommodityClassId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryDefinitionShippingCommodityClassId"
																value="%{inventoryViewModel.inventoryDefinition.shippingCommodityClassId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Shipping Commodity Class must be a number." />





															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.ShippingCommodityClass"
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

						<div id="menu4" class="tab-pane fade hidden">
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-12">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Pricing
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_PricingDate">Pricing Date</label>
														<div class="col-md-8">

															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="InventoryPricing_PricingDate" type="datetime"
																name="inventoryBean.inventoryPricingPricingDate"
																theme="simple" disabled="true">
																<s:param name="value">
																	<s:date
																		name="inventoryViewModel.inventoryPricing.pricingDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>
															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.PricingDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_PricingTypeId">Pricing Type</label>
														<div class="col-md-8">
															<s:select list="#application.pricingType"
																id="InventoryPricingPricingTypeId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryPricingPricingTypeId"
																value="%{inventoryViewModel.inventoryPricing.PricingTypeId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Pricing Type must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.PricingTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_PricingUomId">Pricing UOM</label>
														<div class="col-md-8">

															<s:select list="#application.unitOfMeasure"
																id="InventoryPricingPricingUomId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryPricingPricingUomId"
																value="%{inventoryViewModel.inventoryPricing.pricingUomId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Pricing UOM must be a number." />




															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.PricingUomId"
																data-valmsg-replace="true"></span>
														</div>
													</div>


													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_Price">Price</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control  text-box single-line"
																id="InventoryPricing_Price"
																value="%{inventoryViewModel.inventory.pricingPrice}"
																name="inventoryBean.inventoryPricingPrice"
																onkeypress="isNumber(event);" theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.Price"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_CurrencyId">Currency</label>
														<div class="col-md-8">
															<s:select list="#application.unitOfMeasure"
																id="InventoryPricingCurrencyId" cssClass="form-control"
																theme="simple"
																name="inventoryBean.inventoryPricingCurrencyId"
																value="%{inventoryViewModel.inventoryPricing.currencyId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Currency must be a number." />


															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.CurrencyId"
																data-valmsg-replace="true"></span>
														</div>
													</div>



													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryPricing_ItemPriceStatusId">Status</label>
														<div class="col-md-8">
															<s:select list="#application.itemPricingStatus"
																id="InventoryPricingItemPriceStatusId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryPricingItemPriceStatusId"
																value="%{inventoryViewModel.inventoryPricing.itemPriceStatusId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Currency must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryPricing.ItemPriceStatusId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_LastInvoiceEffectiveDate">Last
															Invoice Effective Date</label>
														<div class="col-md-8">


															<s:textfield
																cssClass="form-control datePicker text-box single-line"
																id="InventoryDefinition_LastInvoiceEffectiveDate"
																type="datetime"
																name="inventoryBean.inventoryDefinitionLastInvoiceEffectiveDate"
																theme="simple" disabled="true">
																<s:param name="value">
																	<s:date
																		name="inventoryViewModel.inventoryDefinition.lastInvoiceEffectiveDate"
																		format="yyyy/MM/dd" />
																</s:param>
															</s:textfield>


															<span class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.LastInvoiceEffectiveDate"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_LastInvoiceUnitPrice">Last
															Invoice Unit Price</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_LastInvoiceUnitPrice"
																name="inventoryBean.inventoryDefinitionLastInvoiceUnitPrice"
																value="%{inventoryViewModel.inventoryDefinition.lastInvoiceUnitPrice}"
																onkeypress="isNumber(event);" theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.LastInvoiceUnitPrice"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="inventoryViewModel.inventoryDefinition_LastInvoiceUom">Last
															Invoice UOM</label>
														<div class="col-md-8">
															<s:textfield cssClass="form-control text-box single-line"
																id="inventoryViewModel.inventoryDefinition_LastInvoiceUom"
																name="inventoryBean.inventoryDefinitionLastInvoiceUom"
																value="%{inventoryViewModel.inventoryDefinition.lastInvoiceUom}"
																theme="simple" /> <span
																class="field-validation-valid text-danger"
																data-valmsg-for="inventoryViewModel.inventoryDefinition.LastInvoiceUom"
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

						<div id="menu5" class="tab-pane fade hidden" >

							<div class="container-fluid">
								<div class="row">
									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Warehouse Defaults
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryWarehouseDefault_RebateTypeId">Rebate</label>
														<div class="col-md-8">
															<s:select list="#application.rebateType"
																id="InventoryWarehouseDefaultRebateTypeId"
																cssClass="form-control" theme="simple"
																name="inventoryBean.inventoryWarehouseDefaultRebateTypeId"
																value="%{inventoryViewModel.inventoryWarehouseDefault.rebateTypeId}"
																headerKey="-1" headerValue="Please select..."
																data-val="true"
																data-val-number="The field Currency must be a number." />



															<span class="field-validation-valid text-danger"
																data-valmsg-for="InventoryWarehouseDefault.RebateTypeId"
																data-valmsg-replace="true"></span>
														</div>
													</div>

													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryWarehouseDefault_LastSupplierNumber">Last
															Supplier Number</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_LastSupplierNumber"
																	name="inventoryBean.inventoryWarehouseDefaultLastSupplierNumber"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.lastSupplierNumber}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/> 
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
															for="InventoryWarehouseDefault_BuyerNumber">Buyer
															Number</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_BuyerNumber"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.buyerNumber}"
																	name="inventoryBean.inventoryWarehouseDefaultBuyerNumber"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ReorderPointInput">Reorder
															Point</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ReorderPointInput"
																	name="inventoryBean.inventoryWarehouseDefaultReorderPointInput"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.reorderPointInput}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ReorderQuantityInput">Reorder
															Quantity</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ReorderQuantityInput"
																	name="inventoryBean.inventoryWarehouseDefaultReorderQuantityInput"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.reorderQuantityInput}"
																	onkeypress="OnValidKeyPress(event);" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ReorderQuantityMaximum">Reorder
															Qty Max</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ReorderQuantityMaximum"
																	name="inventoryBean.inventoryWarehouseDefaultReorderQuantityMaximum"
																	onkeypress="OnValidKeyPress(event);" type="number"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.reorderQuantityMaximum}" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ReorderQuantityMinimum">Reorder
															Qty Min</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ReorderQuantityMinimum"
																	name="inventoryBean.inventoryWarehouseDefaultReorderQuantityMinimum"
																	onkeypress="OnValidKeyPress(event);"
																	value="%{inventoryViewModel.inventoryWarehouseDefault.reorderQuantityMinimum}" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ServiceLevel">Service
															Level</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ServiceLevel" min="0"
																	name="inventoryBean.inventoryWarehouseDefaultServiceLevel"
																	onkeypress="OnValidKeyPress(event);" 
																	value="%{inventoryViewModel.inventoryWarehouseDefault.serviceLevel}" theme="simple"/> 
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

									<div class="col-md-6">
										<div class="hpanel">
											<div class="panel-heading">
												<div class="panel-tools">
													<a class="showhide"><i class="fa fa-chevron-up"></i></a>
												</div>
												Warehouse Defaults
											</div>
											<div class="panel-body">
												<div class="form-horizontal">
													<div class="form-group">
														<label class="control-label col-md-3"
															for="InventoryWarehouseDefault_SafetyStock">Safety
															Stock</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_SafetyStock" 
																	name="inventoryBean.inventoryWarehouseDefaultSafetyStock"
																	onkeypress="OnValidKeyPress(event);" 
																	value="%{inventoryViewModel.inventoryWarehouseDefault.safetyStock}" theme="simple"/> 
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
															for="InventoryWarehouseDefault_ShelfLifeDays">Shelf
															Life (Days)</label>
														<div class="col-md-8">
															<div class="relative input-wrap is-required negative">
															<s:textfield cssClass="form-control text-box single-line"
																id="InventoryWarehouseDefault_ShelfLifeDays"
																	name="inventoryBean.inventoryWarehouseDefaultShelfLifeDays"
																	onkeypress="OnValidKeyPress(event);" 
																	value="%{inventoryViewModel.inventoryWarehouseDefault.shelfLifeDays}" theme="simple"/> 
																<span class="fa fa-check" style="font-size: 10px;"></span>
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
									<div class="col-md-6"></div>
								</div>
							</div>






						</div>

						<div id="menu6" class="tab-pane fade">

							<jsp:include page="../documents/documents.jsp"></jsp:include>
							<div class="divider">&nbsp; &nbsp;&nbsp;</div>

							<div class="divider">&nbsp; &nbsp;&nbsp;</div>
							<div class="divider">&nbsp; &nbsp;&nbsp;</div>
						</div>

					</div>
				</div>
			</div>



			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
	</s:form>
</body>
</html>