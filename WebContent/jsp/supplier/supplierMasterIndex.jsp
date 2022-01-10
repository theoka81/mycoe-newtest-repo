<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Suppliers/Details" id="formSupplierMaster"
		method="post" theme="simple">
		<s:hidden name="supplierId" id="supplierId" />
<br/>
<br/>
<br/>
		<!-- Filters -->
		<aside id="menu">
			<div id="navigation">
				<!-- Handler for local filters -->

				<div class="panel-body">
					<div class="m-b-md">
						<h4>Filters</h4>
					</div>
					<div class="form-group">
						<label class="control-label">Status:</label>
						<div class="input-group center-block">
							<s:select list="#application.status" id="ddlSupplierStatus"
								name="statusId" cssClass="form-control form-control-xs input-xs"
								theme="simple" headerKey="-1" headerValue="Select..."></s:select>
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

				<div class="row">
					<div class="col-xs-12">
						<h4>Supplier Registration</h4>
						<input type="button" id="btnFilterDisplay" value="Show Filters"
							class="btn btn-primary btn-xs hide-menu" />
						<div class="divider">&nbsp;</div>
						<div class="row">
							<div class="col-xs-12">
								<table
									class="table table-striped table-bordered table-responsive"
									id="tblSuppliers">
									<thead>
										<tr>
											<th>Supplier ID</th>
											<th>Supplier No (COE)</th>
											<th>CSD Registration No</th>
											<th>Legal Name</th>
											<th>SA Company No.</th>
											<th>Supplier Status</th>
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

	<!-- Handler for local scripts -->

	<script type="text/javascript">
		var table;
		var GetStatusValue;

		$(document).ready(function() {
			debugger;
			GetStatusValue = GetStatusId();
			LoadSupplier(GetStatusValue);

			$('#btnFilter').on('click', function() {
				GetStatusValue = GetStatusId();
				LoadSupplier(GetStatusValue);
				// table.ajax.reload();
			});

			$('#btnReset').click(function() {
				resetFilters();
			});

			function resetFilters() {

				LoadSupplier(document.getElementById('menuStatusId').value);
				//table.ajax.reload();
			}

		});

		function GetStatusId() {

			statusValue = document.getElementById('ddlSupplierStatus').value;
			var controllerValue = document.getElementById('menuStatusId').value;

			if (statusValue == null || statusValue == '-1') {
				return controllerValue;
			}
			if (statusValue != null || !statusValue == '-1') {
				return statusValue;
			}

		}

		function LoadSupplier(statusValueId) {
			debugger;
			table = $('#tblSuppliers')
					.DataTable(
							{
								"bFilter" : true,
								"serverSide" : true,
								"bDestroy" : true,
								"bSort" : true,
								"ajax" : {
									async : true,
									"url" : "../Suppliers/LoadSupplierBackOffice",
									"type" : "POST",
									"datatype" : "json",
									"timeout" : 200000,
									"data" : function(p) {
										debugger;
										p.statusId = document
												.getElementById('ddlSupplierStatus').value = statusValueId;
									},
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
											"data" : "supplierId",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "supplierXref1",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "supplierRefNo",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "legalName",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "saCompanyNumber",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "status",
											"autoWidth" : true,
											"searchable" : true
										},
										{
											"data" : "supplierId",
											"title" : "Details",
											"render" : function(data, type, row) {
												return '<a href=\"javascript:void(0)\" onclick=\"openSupplierDetails('
														+ data
														+ ')\" class=\"btn btn-sm btn-primary btn-xs\">Details</a> ';
											}
										} ],
								"language" : {
									"emptyTable" : "No records!"
								}
							});
		}

		function openSupplierDetails(supplierId) {
			document.getElementById("supplierId").value = supplierId;
			$("#formSupplierMaster").submit();
		}
	</script>

</body>
</html>
