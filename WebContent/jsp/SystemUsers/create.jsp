<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../SystemUsers/Details" id="formSystemUsers"
		method="post" theme="simple">
		<s:hidden name="systemUserId" id="systemUserId" />
		<br />
		<br />
		<br />
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<h4>Add User</h4>

				<form action="../SystemUsers/saveUser" method="post">
					<p>
						<input type="submit" name="submit" value="Submit"
							class="btn btn-primary btn-xs" id="SubmitValue"> <a
							class="btn btn-warning btn-xs" href="/ScmQa/SystemUsers">Close</a>
					</p>
					<ul class="nav nav-tabs text-center">
						<li class="active"><a data-toggle="tab" href="#summary">Summary</a></li>
					</ul>
					<div id="summary" class="tab-pane fade in active">
						<div class="container-fluid">
							<div class="row">
								<div class="form-horizontal">
									<br /> <br />

									<div class="form-group">
										<label class="control-label col-md-2" for="FirstName">FirstName</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="FirstName" name="firstName"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="FirstName" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="LastName">LastName</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="LastName" name="lastName"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="LastName" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="UserName">UserName</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="UserName" name="userName"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="UserName" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="CompanyName">CompanyName</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="CompanyName" name="companyName"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="CompanyName" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="Designation">Designation</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="Designation" name="designation"></s:textfield>
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
												type="email"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="EmailAddress" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="SystemUserTypeId">SystemUserTypeId</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="SystemUserTypeId" name="systemUserTypeId"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="SystemUserTypeId"
												data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="StatusId">StatusId</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="StatusId" name="statusId"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="StatusId" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2"
											for="IdentificationNumber">ID/ Passport No</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="IdentificationNumber"
												name="identificationNumber" maxlength="100"></s:textfield>
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
												theme="simple" id="MobileNumber" name="mobileNumber"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="MobileNumber" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="MaaaNumber">MAAA
											Number</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="MaaaNumber" name="maaaNumber"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="MaaaNumber" data-valmsg-replace="true"></span>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-2" for="Code">Code</label>
										<div class="col-md-10">
											<s:textfield cssClass="form-control text-box single-line"
												theme="simple" id="Code" name="code"></s:textfield>
											<span class="field-validation-valid text-danger"
												data-valmsg-for="Code" data-valmsg-replace="true"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form>

			</div>

			<!-- Main view -->
			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
		</div>


	</s:form>
</body>
</html>