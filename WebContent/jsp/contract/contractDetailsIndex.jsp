<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<body class="landing-page hide-sidebar">
	<jsp:include page="../mainHeader.jsp"></jsp:include>
	<s:form action="../Contract/Details" target="_blank"
		id="formContractDetails" method="post" theme="simple">
<br/>
<br/>
<br/>

		<!-- Main view -->
		<div id="wrapper">
			<s:hidden name="contractId" id="contractId" />
			<s:hidden name="contrctDetailsId" id="contrctDetailsId" />
			<div class="body-content">
				<div class="divider">&nbsp;</div>

				<div class="row">
					<div class="col-xs-12">
						<h4>Contract Details</h4>
						<div class="row">
							<div class="col-xs-3">
								<s:a class="btn btn-primary btn-xs"
									href="../Contract/MasterDetails?contractId=%{contractId}">Close</s:a>
							</div>
						</div>
						<div class="divider">&nbsp;</div>
						<div class="row">
							<div class="col-xs-12">
								<table id="tblContractDetails"
									class="table table-striped table-bordered table-condensed"
									style="width: 100%;">
									<thead>
										<tr>
											<th>Contract ID</th>
											<th>Contract No (COE)</th>

											<th>Item Description</th>
											<th>Supplier</th>


											<th>Sub Contract Amount (Rands)</th>
											<th>Total Main Contract Amount (Rands)</th>

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

			<jsp:include page="../footer.jsp"></jsp:include>

			<script type="text/javascript">
				var table;
				$(document)
						.ready(
								function() {
									var contractId = document
											.getElementById("contractId").value;
									table = $('#tblContractDetails')
											.DataTable(
													{
														"bFilter" : true,
														"serverSide" : true,
														"bDestroy" : true,
														"bSort" : true,
														"ajax" : {
															"url" : "../Contract/LoadContractDetailsIndex",
															"type" : "POST",
															"data" : function(p) {
																p.contractId = contractId;
															},
															"datatype" : "json",
															"timeout" : 60000,
															"lengthMenu" : [
																	[ 10, 25,
																			50,
																			-1 ],
																	[ 10, 25,
																			50,
																			"All" ] ]
														},
														"columns" : [
																{
																	"data" : "contractMasterId",
																	"autoWidth" : true,
																	"searchable" : true
																},
																{
																	"data" : "contractNo",
																	"autoWidth" : true,
																	"searchable" : true
																},
																//{ "data": "LineNo", "autoWidth": true, "searchable": true },

																{
																	"data" : "commodityDescription",
																	"autoWidth" : true,
																	"searchable" : true
																},
																{
																	"data" : "supplierName",
																	"autoWidth" : true,
																	"searchable" : true
																},
																//{ "data": "ContractTitle", "autoWidth": true, "searchable": true },
																//{ "data": "ContractStatus", "autoWidth": true, "searchable": true },
																//{ "data": "ContractType", "autoWidth": true, "searchable": true },
																//{ "data": "ProcurementType", "autoWidth": true, "searchable": true },
																//{ "data": "QuantityOrdered", "autoWidth": true, "searchable": true },
																{
																	"data" : "extendedPrice",
																	"autoWidth" : true,
																	"searchable" : true
																},
																{
																	"data" : "unitPrice",
																	"autoWidth" : true,
																	"searchable" : true
																},
																//{ "data": "ExtendedPrice", "autoWidth": true, "searchable": true },
																//{ "data": "ContractBeginDate", "autoWidth": true, "searchable": true },
																//{ "data": "ContractExpiryDate", "autoWidth": true, "searchable": true },
																{
																	"data" : "contractDetailsId",
																	"title" : "Details",
																	"render" : function(
																			data,
																			type,
																			row) {
																		return '<a href=\"javascript:void(0)\" onclick=\"openContractDetails('
																				+ data
																				+ ')\" class=\"btn btn-sm btn-primary btn-xs\">Details</a> ';
																	}
																} ],
														"language" : {
															"emptyTable" : "No records!"
														}
													});
								});
				function openContractDetails(contrctDetailsId) {
					document.getElementById("contrctDetailsId").value = contrctDetailsId;
					$("#formContractDetails").submit();
				}
			</script>
	</s:form>
</body>
</html>
