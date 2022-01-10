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

				<h4>Edit User</h4>

				<ul class="nav nav-tabs text-center">
					<li class="active"><a data-toggle="tab" href="#summary">Details</a></li>
				</ul>
				<div id="summary" class="tab-pane fade in active">
					<div class="container-fluid">
						<div class="row">
							<div class="form-horizontal">
								<br /> <br />
								<s:hidden name="systemUserId" id="systemUserId" theme="simple"></s:hidden>

								<div class="form-group">
									<label class="control-label col-md-2" for="FirstName">FirstName</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="FirstName" name="firstName"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="FirstName" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="LastName">LastName</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="LastName" name="lastName" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="LastName" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="UserName">UserName</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="UserName" name="userName" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="UserName" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="CompanyName">CompanyName</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="CompanyName" name="companyName"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CompanyName" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="Designation">Designation</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="Designation" name="designation"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="Designation" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="EmailAddress">Email
										Address</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="EmailAddress" name="emailAddress"
											type="email" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="EmailAddress" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="SystemUserTypeId">SystemUserTypeId</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="SystemUserTypeId" name="systemUserTypeId"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="SystemUserTypeId" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="StatusId">StatusId</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="StatusId" name="statusId" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="StatusId" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsPasswordReset">IsPasswordReset</label>
									<div class="col-md-10">
										<s:checkbox name="passwordReset" id="IsPasswordReset"></s:checkbox>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IsPasswordReset" data-valmsg-replace="true"></span>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsTemporaryPassword">IsTemporaryPassword</label>
									<div class="col-md-10">
										<s:checkbox name="temporaryPassword"
											id="IsTemporaryPassword"></s:checkbox>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IsTemporaryPassword"
											data-valmsg-replace="true"></span>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2"
										for="IdentificationNumber">ID/ Passport No</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="IdentificationNumber"
											name="identificationNumber" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IdentificationNumber"
											data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="MobileNumber">Mobile
										Number</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="MobileNumber" name="mobileNumber"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="MobileNumber" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="MaaaNumber">MAAA
										Number</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="MaaaNumber" name="maaaNumber"
											readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="MaaaNumber" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="Code">Code</label>
									<div class="col-md-10">
										<s:textfield cssClass="form-control text-box single-line"
											theme="simple" id="Code" name="code" readonly="true"></s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="Code" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsActive">Is
										Active</label>
									<div class="col-md-10">
										<s:checkbox name="active" id="IsActive" disabled="true"></s:checkbox>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IsActive" data-valmsg-replace="true"></span>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsDeleted">Is
										Deleted</label>
									<div class="col-md-10">
										<s:checkbox name="deleted" id="IsDeleted" disabled="true"></s:checkbox>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IsDeleted" data-valmsg-replace="true"></span>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="IsLocked">Is
										Locked</label>
									<div class="col-md-10">
										<s:checkbox name="locked" id="IsLocked" disabled="true"></s:checkbox>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="IsLocked" data-valmsg-replace="true"></span>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2"
										for="CreatedBySystemUserId">CreatedBySystemUserId</label>
									<div class="col-md-10">
										<s:select list="#application.requesterIdMap"
											id="CreatedBySystemUserId" name="createdBySystemUserId"
											headerKey="-1" headerValue="Select..."
											cssClass="form-control" theme="simple"></s:select>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CreatedBySystemUserId"
											data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2" for="CreatedDateTime">Created
										On</label>
									<div class="col-md-10">
										<s:textfield
											cssClass="form-control datePicker text-box single-line"
											id="CreatedDateTime" type="datetime" name="createdDateTime"
											theme="simple" readonly="true">
											<s:param name="value">
												<s:date name="createdDateTime" format="yyyy/MM/dd" />
											</s:param>
										</s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="CreatedDateTime" data-valmsg-replace="true"></span>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2"
										for="ModifiedBySystemUserId">ModifiedBySystemUserId</label>
									<div class="col-md-10">
										<s:select list="#application.requesterIdMap"
											id="ModifiedBySystemUserId" name="modifiedBySystemUserId"
											cssClass="form-control" theme="simple" headerKey="-1"
											headerValue="Select..."></s:select>
									</div>
								</div>


								<div class="form-group">
									<label class="control-label col-md-2" for="ModifiedDateTime">Modified
										On</label>
									<div class="col-md-10">
										<s:textfield
											cssClass="form-control datePicker text-box single-line"
											id="ModifiedDateTime" type="datetime" name="modifiedDateTime"
											theme="simple" readonly="true">
											<s:param name="value">
												<s:date name="modifiedDateTime" format="yyyy/MM/dd" />
											</s:param>
										</s:textfield>
										<span class="field-validation-valid text-danger"
											data-valmsg-for="ModifiedDateTime" data-valmsg-replace="true"></span>
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
					<a href="../SystemUsers/Index">Back to List</a>
				</div>
			</div>

			<!-- Main view -->
			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
		</div>


	</s:form>
</body>
</html>