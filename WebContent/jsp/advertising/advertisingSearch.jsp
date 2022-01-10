<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<jsp:include page="../header.jsp" />

<!-- Main view -->
<div id="wrapper">

	<div class="body-content">
		<div class="divider">&nbsp;</div>

		<ul class="nav nav-tabs text-center">
			<li class="active"><a data-toggle="tab" href="#home"><s:text name="scm.advertising.tab.requisition"/></a></li>
			<li><a data-toggle="tab" href="#menu1"><s:text name="scm.advertising.tab.tender"/></a></li>
		</ul>

		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<div class="hpanel">
								<div class="panel-heading">
									<div class="panel-tools">
										<a class="showhide"><i class="fa fa-chevron-up"></i></a>
									</div>
									<s:text name="scm.advertising.tab.tender.title"/>
								</div>
								<div class="panel-body">
									<div class="form-horizontal">

										<table id="SupplierAdvertising"
											class="table table-striped table-bordered">
											<thead>
												<tr>
													<th><s:text name="scm.advertising.requisition.id.label"/></th>
													<th><s:text name="scm.advertising.requisition.details.id.label"/></th>
													<th><s:text name="scm.advertising.requisition.line.no.label"/></th>
													<th><s:text name="scm.advertising.requisition.order.no.label"/></th>
													<th><s:text name="scm.advertising.requisition.order.type.label"/></th>
													<th><s:text name="scm.advertising.requisition.unit.label"/></th>
													<th><s:text name="scm.advertising.requisition.commodity.description.label"/></th>
													<th><s:text name="scm.advertising.requisition.commodity.no.label"/></th>
													<th><s:text name="scm.advertising.requisition.extended.price.label"/></th>
													<th><s:text name="scm.advertising.requisition.unit.cost.label"/></th>
													<th><s:text name="scm.advertising.requisition.unit.of.measure.label"/></th>
													<th><s:text name="scm.advertising.requisition.transaction.order.date.label"/></th>
													<th><s:text name="scm.advertising.requisition.currency.code.label"/></th>

												</tr>
											</thead>
											<tbody>

											</tbody>

										</table>

										<script src="../Scripts/jquery-3.3.1.min.js"></script>

										<script>
											$(document)
													.ready(
															function() {
																$(
																		'#SupplierAdvertising')
																		.DataTable();
															});
										</script>


									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div id="menu1" class="tab-pane fade in">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<div class="hpanel">
								<div class="panel-heading">
									<div class="panel-tools">
										<a class="showhide"><i class="fa fa-chevron-up"></i></a>
									</div>
									<s:text name="scm.advertising.tab.tender.title"/>
								</div>
								<div class="panel-body">
									<div class="form-horizontal">
										<table class="table table-bordered table-striped"
											id="TenderSpecs">
											<thead>
												<tr>
													<th><s:text name="scm.advertising.tender.id.label"/></th>
													<th><s:text name="scm.advertising.tender.description.label"/></th>
													<th><s:text name="scm.advertising.tender.closing.date"/></th>
													<th><s:text name="scm.advertising.tender.bid.closing.date.label"/></th>
													<th><s:text name="scm.advertising.tender.breifing.session.date.label"/></th>
													<th><s:text name="scm.advertising.tender.type.label"/></th>
													<th><s:text name="scm.advertising.tender.status.label"/></th>
												</tr>
											</thead>
											<tbody>

											</tbody>
										</table>

										<script src="../Scripts/jquery-3.3.1.min.js"></script>

										<script>
											$(document).ready(function() {
												$('#TenderSpecs').DataTable();
											});
										</script>

									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>


		</div>



	</div>


	<div class="space-30">&nbsp;</div>

	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br />

	<jsp:include page="../footer.jsp" />

	</body>
</html>