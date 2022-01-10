<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>

	<s:form action="../Address/Details" id="formSupplierAddress"
		method="post" theme="simple">
		<s:hidden name="addressId" id="addressId" />
		<br />
		<br />
		<br />
		<div id="wrapper">

			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<div class="row">
					<div class="col-xs-12">
						<h4>Addresses</h4>
						<div class="row">
							<div class="col-xs-3">
								<a class="btn btn-primary btn-xs"
									href="../Address/Create">Add New Address</a>
							</div>
						</div>
						<div class="divider">&nbsp;</div>
						<div class="row">
							<div class="col-xs-12">
								<table
									class="table table-striped table-bordered table-responsive"
									id="tblUsers">
									<thead>
										<tr role="row">
											<th>Supplier Id</th>
											<th>Supplier Number</th>
											<th>Addressline 1</th>
											<th>Addressline 2</th>
											<th>Is Active</th>
											<th>Is Preferred</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>


			<!-- Main view -->
			<div class="space-30">&nbsp;</div>


			<jsp:include page="../footer.jsp"></jsp:include>
		</div>

		<script type="text/javascript">
		var table;
			$(document).ready(function() {
				LoadSystemUsers();
			});

			function LoadSystemUsers() {
				table = $('#tblUsers')
						.DataTable(
								{
									"bFilter" : true,
									"serverSide" : true,
									"bDestroy" : true,
									"bSort" : true,
									"pageLength": 10,
									"ajax" : {
										async : true,
										"url" : "../Address/loadSupplierAddress",
										"type" : "POST",
										"data" : function(p) {
										},
										"datatype" : "json",
										"timeout" : 60000,
										"lengthMenu" : [ [ 10, 25, 50 ],
												[ 10, 25, 50 ] ]
									},
									dom : "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>>tp",
									"lengthMenu" : [ [ 10, 25, 50 ],
											[ 10, 25, 50 ] ],
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
												"autoWidth" : true
											},
											{
												"data" : "supplierNumber",
												"autoWidth" : true
											},
											{
												"data" : "addressLine1",
												"autoWidth" : true
											},
											{
												"data" : "addressLine2",
												"autoWidth" : true
											},
											{
												"data" : "isActive",
												"render" : function(data, type,
														row) {
													return '<input type="checkbox" id="isactive" checked="'+data+'" disabled="disabled"/>'
												}
											},
											{
												"data" : "isPreferred",
												"render" : function(data, type,
														row) {
													return '<input type="checkbox" id="ispreferred" checked="'+data+'" disabled="disabled"/>'
												}
											},
											{
												"data" : "id",
												"title" : "",
												"render" : function(data, type,
														row) {
													return '<a href=\"javascript:void(0)\" onclick=\"openUserDetails('
															+ data
															+ ')\" class=\"btn btn-sm btn-primary btn-xs\">Details</a> ';
												}
											} ],
									"language" : {
										"emptyTable" : "No records!"
									}
								});
			}
			function openUserDetails(addressId) {
				document.getElementById("addressId").value = addressId;
				$("#formSupplierAddress").submit();
			}
		</script>
	</s:form>
</body>
</html>
