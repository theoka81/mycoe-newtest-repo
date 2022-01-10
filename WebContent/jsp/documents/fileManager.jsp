<%@ taglib prefix="s" uri="/struts-tags"%>
<s:hidden name="referenceId" id="hiddenReferenceId"
	value="%{documentViewModal.referenceId}" />
<div class="content">
	<div class="row">
		<div class="col-md-3">
			<div class="hpanel">
				<div class="panel-body">
					<ul class="h-list m-t">
						<s:iterator
							value="supplierViewModel.documentViewModel.documentCheckLists">
							<div class="row">
								<div class="col-md-9">
									<li class="active" id='<s:property value="id"/>'><a
										href="#"><i class="fa fa-folder"></i> <s:property value="description" /></a></li>
								</div>
								<div class="col-md-2">
									<button class="btn btn-outline btn-info btn-circle"
										type="button" data-toggle="modal"
										data-target='#myModal-<s:property value="id"/>'>
										<span class="pe-7s-cloud-upload"
											style="font-size: 23px; border-radius: 30px"
											id="_<s:property value="id"/>"></span>
									</button>
								</div>
							</div>
							<div id="myModal-<s:property value="id"/>" class="modal fade"
								role="dialog" data-backdrop="true">
								<div class="modal-dialog modal-sm">

									<!-- Modal content-->
									<div id="modalheader" class="modal-content"
										style="margin-bottom: 20px">
										<div class="modal-header" style="padding: 35px 50px;">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h3 class="text-center">
												Upload
												<s:property value="description" />
											</h3>
										</div>
										<div class="modal-body" style="padding: 40px 50px;">
											<div class="form-horizontal">
												<div class="form-group">
													<div class="col-md-12">
														<div class="text-center">
															<img src="../Content/img/undraw_Upload_re_pasx.png"
																width="200px" height="170px" /> <input type="file"
																id="uploadAdditional_<s:property value="id"/>"
																class="text-center" />
														</div>
														<div class="alert alert-warning" id="alertMessage">
															<a href="#" class="close" data-dismiss="alert">&times;</a>
															<div id="message"></div>
														</div>
													</div>
												</div>
											</div>
										</div>

										<div style="margin-top: 5px" class="modal-footer">
											<button type="button" class="btn btn-warning btn-outline"
												data-dismiss="modal">Close</button>
											<button type="button" class="btn btn-primary btn-outline"
												onclick='uploadAdditional(<s:property value="id"/>)'>Upload
												File</button>
										</div>
									</div>

								</div>
							</div>
						</s:iterator>
					</ul>
				</div>



			</div>


		</div>
		<div class="col-md-9">
			<div class="row">
				<s:iterator value="supplierViewModel.documentViewModel.documents">
					<div class="col-md-3">
						<div class="hpanel">
							<div class="panel-body file-body">
								<s:if test="contentType eq 'application/pdf'">
									<i class="fa fa-file-pdf-o text-danger"></i>
								</s:if>
								<s:elseif
									test="contentType eq 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet' || contentType eq 'application/vnd.ms-excel'">
									<i class="fa fa-file-excel-o text-success"></i>
								</s:elseif>
								<s:elseif
									test="contentType eq 'application/vnd.openxmlformats-officedocument.wordprocessingml.document'">
									<i class="fa fa-file-word-o text-info"></i>
								</s:elseif>
								<s:elseif
									test="contentType eq 'image/png' || contentType eq 'image/jpeg'">
									<i class="fa fa-file-picture-o text-primary"></i>
								</s:elseif>
								<s:else>
									<i class="fa fa-file-o text-danger"></i>
								</s:else>
							</div>
							<div class="panel-footer">
								<div class="row">
									<div class="col-md-9">
										<a href="#"><strong><s:property
													value="userCodeDesc" /></strong></a>
									</div>
									<div class="col-md-2">
										<s:a href="../Document/GetDocument?documentId=%{id}"
											theme="simple">
											<span class='pe-7s-cloud-download' id='downloadFile'
												style='font-size: 20px;'></span>
										</s:a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</s:iterator>
			</div>
		</div>
	</div>


</div>
<script>
$(document).ready(function() {
	$('#alertMessage').hide();
});

function uploadAdditional(itemId) {
	debugger;
	var fileSize = 0;
	var fileExtension = '';
	// Checking whether FormData is available in browser
	if (window.FormData !== undefined) {

		var fileUpload = $("#uploadAdditional_"+ itemId).get(0);
		var files = fileUpload.files[0];
		fileSize = files.size;
		fileExtension = files.type.substring(files.type.indexOf('/') + 1, files.type.length);

		// Create FormData object
		var formdata = new FormData();
		formdata.append('upload', files, files.name);
		formdata.append('referenceId', $('#hiddenReferenceId').val());
		formdata.append('userCodeId', itemId);

		if (fileSize >= 4000000) {
			$("#uploadAdditional_" + itemId)
					.val('');
			$('#alertMessage').hide();
			$('#alertMessage').show();
			$('#message').text('File is too large. Max 4 MB');
		}
		if ($("#uploadAdditional_" + itemId).val() == '') {
			$('#alertMessage').hide();
			$('#alertMessage').show();
			$('#message').text('Please upload a file to proceed!');
		}

		//else if ($.inArray(fileExtension, ['png', 'jpg', 'gif', 'pdf', 'docx', 'xlsx', 'xls', 'vnd.openxmlformats-officedocument.wordprocessingml.document','vnd.openxmlformats-officedocument.spreadsheetml.sheet']) == -1 && fileExtension != '') {
		//    $("#uploadAdditional_" + itemId).val('');
		//    $('#alertMessage').hide();
		//    $('#alertMessage').show();
		//    $('#message').text('Sorry we do not support uploads in' + '  ' + fileExtension + '  ' + 'format , please upload any file in the following formats :png , jpg , gif , pdf , docx , xlsx , xls , with a file size of no more than 4MB');
		//}
		else {
			$
					.ajax({
						url : "../Document/UploadAdditional",
						type : "POST",
						contentType : false, // Not to set any content header
						processData : false, // Not to process data
						data : formdata,
						success : function(result) {
							$('#myModal-'+ result.userCodeId).hide();
							swal({
									title : "Document Successfully Uploaded",
									type : "success"
								}, function(data) {
										window.location.reload();
							});

						},
						error : function(err) {
							$('.modal').hide();
							swal({
								title : "Alert",
								text : err.statusText
							});
						}
					});
		}

	} else {
		swal({
			title : "Alert",
			text : "Formdata is not supported"
		});

	}
}
</script>