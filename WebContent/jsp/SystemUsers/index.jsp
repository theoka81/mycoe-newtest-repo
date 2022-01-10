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

				<div class="row">
					<div class="col-xs-12">
						<h4>Users</h4>
						<div class="row">
							<div class="col-xs-3">
								<a class="btn btn-primary btn-xs"
									href="../SystemUsers/Create">Create New</a> | <a
									class="btn btn-primary btn-xs" href="../SystemUsers/Roles">Sync
									Roles</a>
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
											<th>MAAA Number</th>
											<th>User</th>
											<th>UserName</th>
											<th>Email Address</th>
											<th>Is Active</th>
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
										"url" : "../SystemUsers/loadSystemUsers",
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
												"data" : "maaaNumber",
												"autoWidth" : true
											},
											{
												"data" : "fullName",
												"autoWidth" : true
											},
											{
												"data" : "userName",
												"autoWidth" : true
											},
											{
												"data" : "email",
												"autoWidth" : true
											},
											{
												"data" : "active",
												"render" : function(data, type,
														row) {
													return '<input type="checkbox" id="isactive" checked="'+data+'" disabled="disabled"/>'
												}
											},
											{
												"data" : "userId",
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
			function openUserDetails(systemUserId) {
				document.getElementById("systemUserId").value = systemUserId;
				$("#formSystemUsers").submit();
			}
		</script>
	</s:form>
</body>
</html>
