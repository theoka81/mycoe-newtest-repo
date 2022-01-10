<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Contract/MasterDetails" id="formContractMaster"
		method="post" theme="simple">
		
<br/>
<br/>
<br/>
		<s:hidden name="contractId" id="contractId" />
		<!-- Filters -->
		<aside id="menu">
			<div id="navigation">
				<!-- Handler for local filters -->

				<div class="panel-body">
					<div class="m-b-md">
						<h4>Filters</h4>
					</div>
					<div class="form-group">
						<label class="control-label">Contract Status:</label>
						<div class="input-group center-block">
							<s:select list="#application.statusMap" id="ddlContractStatus"
								name="statusId" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Contract Type:</label>
						<div class="input-group center-block">
							<s:select list="#application.contractTypeMap"
								id="ddlContractType" name="contractTypeId"
								cssClass="form-control form-control-xs input-xs" theme="simple"
								headerKey="-1" headerValue="Select..."></s:select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Procurement Type:</label>
						<div class="input-group center-block">
							<s:select list="#application.procurementTypeMap"
								id="ddlProcurementType" name="procurementTypeId"
								cssClass="form-control form-control-xs input-xs" theme="simple"
								headerKey="-1" headerValue="Select..."></s:select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Requesting Unit:</label>
						<div class="input-group center-block">
							<s:select list="#application.requestedUnitMap"
								id="ddlRequestingUnit" name="requestedUnitId"
								cssClass="form-control form-control-xs input-xs" theme="simple"
								headerKey="-1" headerValue="Select..."></s:select>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label">Supplier:</label>
						<div class="input-group center-block">
							<s:select list="#application.supplierTradingMap" id="ddlSupplier"
								name="supplierId"
								cssClass="form-control form-control-xs input-xs" theme="simple"
								headerKey="-1" headerValue="Select..."></s:select>
						</div>
					</div>

					<div class="divider">&nbsp;</div>
					<input type="button" name="apply" id="btnFilter" value="Apply"
						class="btn btn-success btn-block btn-xs" /> <input id="btnReset"
						type="button" value="Reset"
						class="btn btn-warning btn-block btn-xs" />
				</div>


			</div>
		</aside>

		<!-- Main view -->
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<div id="notificationsDiv"></div>

				<div class="row">
					<div class="col-xs-12">
						<h4>
							<s:property value="contractTitleView" />
						</h4>
						<div class="row">
							<div class="col-xs-3">
								<input type="button" id="btnFilterDisplay" value="Show Filters"
									class="btn btn-primary btn-xs hide-menu" /> <a
									class="btn btn-warning btn-xs" href="/">Close</a>
							</div>
						</div>
						<div class="divider">&nbsp;</div>
						<div class="row">
							<div class="col-xs-12">
								<table class="table table-striped table-bordered"
									id="gridContractMaster">
									<thead>
										<tr>
											<th>Contract No (COE)</th>
											<th>Contract Name</th>
											<th>Contract Status</th>
											<th>Contract Type</th>
											<th>Contract SubType</th>
											<th>Requesting Unit</th>
											<th>Contract Begin Date</th>
											<th>Contract Expiry Date</th>
											<th>Modified Date</th>
											<th>Modified By</th>
											<th></th>
										</tr>
									</thead>
									<tbody></tbody>
								</table>
							</div>
						</div>

					</div>
				</div>


			</div>

			<div class="space-30">&nbsp;</div>


			<!-- Main view -->
			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
		</div>
	</s:form>

	<script type="text/javascript">
		var odTable;
		var GetStatusValue;
		$(document).ready(function() {
			debugger;
			GetStatusValue = GetStatusId();
			LoadContractMaster(GetStatusValue);

			$('#btnFilter').click(function() {
				GetStatusValue = GetStatusId();
				LoadContractMaster(GetStatusValue);
				//odTable.ajax.reload();
			});

			$('#btnReset').click(function() {
				resetFilters();
			});
		});

		function resetFilters() {
			//$('#ddlContractStatus').val(0);
			$('#ddlContractType').val('');
			$('#ddlProcurementType').val('');
			$('#ddlRequestingUnit').val('');
			$('#ddlSupplier').val('');
			LoadContractMaster(document.getElementById('menuStatusId').value);
			// odTable.ajax.reload();
		}

		function GetStatusId() {
			debugger;
			statusValue = document.getElementById('ddlContractStatus').value;
			var controllerValue = document.getElementById('menuStatusId').value;

			if (statusValue == null || statusValue == '') {
				return controllerValue;
			}
			if (statusValue != null || !statusValue == '') {
				return statusValue;
			}

		}

		function LoadContractMaster(statusValueId) {
			odTable = $('#gridContractMaster')
					.DataTable(
							{
								"bFilter" : true,
								"serverSide" : true,
								"bDestroy" : true,
								"bSort" : false,
								"ajax" : {
									"url" : "../Contract/LoadContractsMasterDetails",
									"type" : "POST",
									"data" : function(p) {
										p.statusId = document
												.getElementById('ddlContractStatus').value = statusValueId;
										p.contractTypeId = document
												.getElementById('ddlContractType').value;
										p.procurementTypeId = document
												.getElementById('ddlProcurementType').value;
										p.requestedUnitId = document
												.getElementById('ddlRequestingUnit').value;
										p.supplierId = document
												.getElementById('ddlSupplier').value;
									},
									"datatype" : "json",
									"timeout" : 60000,
									"lengthMenu" : [ [ 10, 25, 50, -1 ],
											[ 10, 25, 50, "All" ] ]
								},
								dom : "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>>tp",
								"lengthMenu" : [ [ 10, 25, 50, -1 ],
										[ 10, 25, 50, "All" ] ],
								buttons : [ {
									extend : 'copy',
									className : 'btn-xs'
								}, {
									extend : 'csv',
									title : 'ExampleFile',
									className : 'btn-xs'
								}, {
									extend : 'pdf',
									title : 'ExampleFile',
									className : 'btn-xs'
								}, {
									extend : 'print',
									className : 'btn-xs'
								} ],
								language : {
									search : "",
									searchPlaceholder : "Search..."
								},
								"columns" : [
										{
											"data" : "contractNo",
											"autoWidth" : true
										},
										{
											"data" : "contractTitle",
											"autoWidth" : true
										},
										{
											"data" : "status",
											"autoWidth" : true
										},
										{
											"data" : "contractType",
											"autoWidth" : true
										},
										{
											"data" : "procurementType",
											"autoWidth" : true
										},
										{
											"data" : "requestingUnit",
											"autoWidth" : true
										},
										{
											"data" : "contractStartDate",
											"autoWidth" : true
										},
										{
											"data" : "contractEndDate",
											"autoWidth" : true
										},
										{
											"data" : "modifiedDate",
											"autoWidth" : true
										},
										{
											"data" : "modifiedBy",
											"autoWidth" : true
										},
										{
											"data" : "id",
											"title" : "",
											"render" : function(data, type, row) {
												return '<a href=\"javascript:void(0)\" onclick=\"openContractMasterDetails('
														+ data
														+ ')\" class=\"btn btn-sm btn-primary btn-xs\">Edit</a> ';
											}
										} ],
								"language" : {
									"emptyTable" : "No records!"
								}
							});
		}
		function openContractMasterDetails(contractId) {
			document.getElementById("contractId").value = contractId;
			$("#formContractMaster").submit();
		}
	</script>

</body>
</html>
