<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../SystemUsers/saveUser" id="formSystemUsers"
		method="post" theme="simple">
		<s:hidden name="systemUserId" id="systemUserId" />
		<br />
		<br />
		<br />
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<h4>Edit Address</h4>

				<ul class="nav nav-tabs text-center">
					<li class="active"><a data-toggle="tab" href="#summary">Details</a></li>
				</ul>
				<div id="summary" class="tab-pane fade in active">
					<div class="container-fluid">
						<div class="row">
							<div class="form-horizontal">
								<br /> <br /> <input data-val="true"
									data-val-number="The field Id must be a number."
									data-val-required="The Id field is required." id="Id" name="Id"
									type="hidden" value="1" />

								<div class="form-group">
									<label class="control-label col-md-2" for="SupplierId">SupplierId</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="SupplierId" name="supplierId" type="number"
											theme="simple"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="SupplierId" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="SupplierNumber">Supplier
										CSD No.</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="SupplierNumber" name="supplierNumber" theme="simple"
											maxlength="16"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="SupplierNumber" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsPreferred">Is
										Preferred</label>
									<div class="col-md-10">
											<s:checkbox id="IsPreferred" theme="simple" name="preferred"
												cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsPreferred" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsActive">Is
										Active</label>
									<div class="col-md-10">
											<s:checkbox id="IsActive" theme="simple" name="active"
												cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsActive" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="AddressTypeCode">AddressTypeCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="AddressTypeCode" name="addressTypeCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="AddressTypeCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="AddressLine1">Address
										Line 1</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="AddressLine1" name="addressLine1" theme="simple"
											maxlength="128"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="AddressLine1" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="AddressLine2">Address
										Line 2</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="AddressLine2" name="addressLine2" theme="simple"
											maxlength="128"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="AddressLine2" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="CountryCode">CountryCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="CountryCode" name="countryCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CountryCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="ProvinceCode">ProvinceCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="ProvinceCode" name="provinceCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="ProvinceCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="DistrictCode">DistrictCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="DistrictCode" name="districtCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="DistrictCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="MunicipalityCode">MunicipalityCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="MunicipalityCode" name="municipalityCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="MunicipalityCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="CityCode">CityCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="CityCode" name="cityCode" theme="simple" maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CityCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="SuburbCode">SuburbCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="SuburbCode" name="suburbCode" theme="simple"
											maxlength="20"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="SuburbCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="WardCode">WardCode</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="WardCode" name="wardCode" theme="simple" maxlength="20"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="WardCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="PostalCode">Postal
										Code</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="PostalCode" name="postalCode" theme="simple"
											maxlength="8"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="PostalCode" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsPostalAddress">IsPostal
										Address</label>
									<div class="col-md-10">
											<s:checkbox id="IsPostalAddress" theme="simple"
												name="postalAddress" cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsPostalAddress" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsDeliveryAddress">Is
										Delivery Address</label>
									<div class="col-md-10">
											<s:checkbox id="IsDeliveryAddress" theme="simple"
												name="deliveryAddress" cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsDeliveryAddress"
												data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsPhysicalAddress">Is
										Physical Address</label>
									<div class="col-md-10">
											<s:checkbox id="IsPhysicalAddress" theme="simple"
												name="physicalAddress" cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsPhysicalAddress"
												data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsPaymentAddress">Is
										Payment Address</label>
									<div class="col-md-10">
											<s:checkbox id="IsPaymentAddress" theme="simple"
												name="paymentAddress" cssClass="i-check"></s:checkbox>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="IsPaymentAddress"
												data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="Field1">Field1</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="Field1" name="field1" theme="simple" maxlength="64"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="Field1" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="Field2">Field2</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="Field2" name="field2" theme="simple" maxlength="64"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="Field2" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="Field3">Field3</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="Field3" name="field3" theme="simple" maxlength="64"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="Field3" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="CreatedDate">CreatedDate</label>
									<div class="col-md-10">
										<s:textfield
											cssClass="form-control datePicker text-box single-line"
											id="CreatedDate" type="datetime" name="createdDate"
											theme="simple" readonly="true">
											<s:param name="value">
												<s:date name="createdDate" format="yyyy/MM/dd" />
											</s:param>
										</s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CreatedDate" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="EditDate">EditDate</label>
									<div class="col-md-10">
										<s:textfield
											cssClass="form-control datePicker text-box single-line"
											id="EditDate" type="datetime" name="editDate" theme="simple"
											readonly="true">
											<s:param name="value">
												<s:date name="editDate" format="yyyy/MM/dd" />
											</s:param>
										</s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="EditDate" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="XmlFileId">XmlFileId</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											id="XmlFileId" name="xmlFileId" theme="simple"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="XmlFileId" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="ProcessedTimeStamp">ProcessedTimeStamp</label>
									<div class="col-md-10">
										<s:textfield
											cssClass="form-control datePicker text-box single-line"
											id="ProcessedTimeStamp" type="datetime"
											name="processedTimeStamp" theme="simple" readonly="true">
											<s:param name="value">
												<s:date name="processedTimeStamp" format="yyyy/MM/dd" />
											</s:param>
										</s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="ProcessedTimeStamp"
											data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<div class="col-md-offset-2 col-md-10">
										<input type="submit" value="Save" class="btn btn-default"
											disabled />
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div>
					<a href="../Address/Index">Back to List</a>
				</div>
			</div>

			<!-- Main view -->
			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
		</div>


	</s:form>
</body>
</html>