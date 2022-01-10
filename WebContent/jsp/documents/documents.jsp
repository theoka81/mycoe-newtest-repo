<%@ taglib prefix="s" uri="/struts-tags"%>
<style>
#uploadFiles {
	max-width: 600px;
	margin: 20px auto;
}

#uploadFiles .insUpload {
	font-size: 12px;
	margin: 0 0 10px;
}

.user-files {
	position: relative;
	background: #fff;
	margin-top: 10px;
	padding-left: 40px;
	padding-right: 40px;
	margin-bottom: 30px;
	border-radius: 4px;
	box-shadow: 0px 1px 6px rgba(0, 0, 0, 0.1);
}

.user-files ul {
	margin: 0;
	padding: 0;
}

.user-files li {
	list-style: none;
	padding: 10px 0;
	border-bottom: 1px solid #f7f6f6;
	font-size: 14px;
	color: #000;
}

.user-files li:last-child {
	border-bottom: none;
}

.user-files .upld-list, .user-files .upd-iconName {
	display: -webkit-flex;
	display: -moz-flex;
	display: flex;
}

.user-files .upld-list, .user-files .upd-iconName {
	-webkit-align-items: center;
	align-items: center;
}

.user-files .upld-list {
	position: relative;
	-webkit-justify-content: space-between;
	justify-content: space-between;
}

.user-files .uploaded-icon {
	position: relative;
	width: 26px;
	height: 26px;
	border-radius: 100%;
	background-size: 52px;
	margin-right: 15px;
}

.user-files .docName {
	font-weight: 400;
}

.user-files .docType {
	display: none;
	color: #b3b3b3;
	font-size: 12px;
}

.upld-list .msg {
	color: #ff0000;
	font-size: 11px;
	display: block;
	margin-top: 2px;
	display: none;
}

.user-files input {
	display: none;
}

.user-files label {
	position: relative;
	display: inline-block;
	color: #5e94c3;
	font-size: 15px;
	font-weight: 600;
	padding: 10px;
	right: -10px;
	cursor: pointer;
}

.user-files .mdot {
	width: 3px;
	height: 3px;
	border-radius: 100%;
	background: #b3b3b3;
	margin: 0 10px;
	display: inline-block;
	vertical-align: middle;
}

.user-files .error {
	color: #ff0000;
	font-size: 13px;
	position: absolute;
	left: 0;
	width: 100%;
	bottom: -24px;
	font-weight: 300;
	display: none;
}

.user-files .uploaded-icon svg {
	width: 100%;
	height: 100%;
}

#uploadFiles svg {
	fill: #5a5a5a;
}

#uploadFiles .uploaded svg {
	fill: #23D717;
}

.upld-list .closeStyle, .uploaded .upld-list label {
	display: none;
}

.uploaded .upld-list .closeStyle {
	display: block;
}

.upld-list .closeStyle {
	top: 0;
	bottom: 0;
	margin: auto;
	position: absolute;
	right: -10px;
	width: 40px;
	height: 40px;
	cursor: pointer;
}

.upld-list .closeStyle:before, .upld-list .closeStyle:after {
	content: '';
	position: absolute;
	width: 24px;
	height: 1.5px;
	background: #7b7b7b;
	top: 0;
	right: 0;
	bottom: 0;
	left: 0;
	margin: auto;
}

.upld-list .closeStyle:before {
	-webkit-transform: rotate(45deg);
	transform: rotate(45deg);
}

.upld-list .closeStyle:after {
	-webkit-transform: rotate(-45deg);
	transform: rotate(-45deg);
}

.submit-btn {
	background: #5e94c3;
	border: 1px solid #5e94c3;
	color: #fff;
	padding: 16px 39px;
	font-size: 17px;
	border-radius: 30px;
	outline: 0;
}
</style>

<div id="documentResponseModal" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Progress</h4>
			</div>
			<div class="modal-body">
				<div class="container" id="modalText"></div>
			</div>
			<div class="modal-footer">
				<button id="processResponseBtn" type="button"
					class="btn btn-primary" data-dismiss="modal">OK</button>
			</div>
		</div>
	</div>
</div>

<div id="uploadFiles">
	<p class="insUpload">Only JPG, PNG, GIF,DOCX, XLS , XLSX and PDF
		documents are supported and size should not exceed 4 MB</p>
	<input type="text" hidden id="hiddenChecklists" name="hiddenChecklists" />
	<s:if test="documentViewModal.isUploadView">

	<s:hidden name="referenceId" id="hiddenReferenceId" value="%{documentViewModal.referenceId}"/>
	<s:hidden name="documentsCount" id="documentsCount" value="%{documentViewModal.documents.size()}"/>
		<s:hidden name="documentViewModal.jsonStringDocumentCheck"
			id="jsonStringDocumentCheck" theme="simple" />
		<s:hidden name="documentViewModal.jsonStringDocumentCheckLists"
			id="jsonStringDocumentCheckLists" theme="simple" />

		<s:iterator value="documentViewModal.documentCheckLists" status="stat">

			<div class="user-files user-files1">
				<ul>
					<li>
						<div id='docDetails_<s:property value="id"/>' class="docDetails">
							<div class="upld-list">
								<div class="upd-iconName">
									<span class="uploaded-icon"> <svg
											viewBox="-448.5 266.5 28.9 29">
                                            <use
												xlink:href="#upload-svg"></use>
                                        </svg>
									</span>

									<div>
										<span class="docName"><s:property value="description" /></span>
										<div class="docType">
											<span class="fileName"></span> <i class="mdot"></i><span
												class="fileSize"></span>
										</div>
										<div class="msg" id='msg_<s:property value="id"/>'></div>
									</div>
								</div>
								<div>
									<input type="file" class="upload-img"
										name='upload'
										id='upload-img_<s:property value="id"/>'> <label
										for='upload-img_<s:property value="id"/>'>Browse</label> <span
										class="closeStyle removeFile"></span>
										<!-- name="%{'upload['+#stat.index+']'}" -->
								</div>
							</div>
						</div>

					</li>
				</ul>
			</div>
		</s:iterator>
		<!--  <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <input type="button" value="Upload" class="btn btn-primary" id="upload" />
                </div>
            </div>-->

		<svg class="mainSvg" viewBox="-448.5 266.5 28.9 29"
			style="display: none">
            <g id="upload-svg">
                <path class="st0"
				d="M-434,295.5c-8,0-14.5-6.5-14.5-14.5s6.5-14.5,14.5-14.5c2.5,0,5,0.7,7.2,1.9c0.3,0.2,0.4,0.6,0.2,0.8c-0.1,0.2-0.3,0.3-0.5,0.3c-0.1,0-0.2,0-0.3-0.1c-2-1.2-4.3-1.8-6.6-1.8c-7.3,0.1-13.3,6.1-13.3,13.4s5.9,13.3,13.3,13.3s13.3-6,13.3-13.3c0-0.6,0-1.2-0.1-1.8c-0.1-1-0.4-2-0.8-3c-0.2-0.6-0.5-1.3-0.9-1.8c-0.1-0.1-0.1-0.3-0.1-0.5c0-0.2,0.1-0.3,0.3-0.4c0.1-0.1,0.2-0.1,0.3-0.1c0.2,0,0.4,0.1,0.5,0.3c0.4,0.6,0.7,1.3,1,2c0.4,1.1,0.7,2.2,0.8,3.3c0.1,0.6,0.1,1.3,0.1,1.9C-419.5,289-426,295.5-434,295.5" />
                <path class="st0"
				d="M-435.9,286.2c-0.2,0-0.3-0.1-0.4-0.2l-3.7-3.6c-0.2-0.2-0.2-0.6,0-0.9c0.1-0.1,0.3-0.2,0.4-0.2c0.2,0,0.3,0.1,0.4,0.2l3,3c0.1,0.1,0.1,0.1,0.2,0.1s0.2,0,0.2-0.1l6.7-6.7c0.1-0.1,0.3-0.2,0.4-0.2c0.1,0,0.3,0.1,0.4,0.2c0.2,0.2,0.2,0.6,0,0.9l-7.4,7.4C-435.5,286.2-435.7,286.2-435.9,286.2" />
            </g>
        </svg>
	</s:if>
</div>



<script>
    var iFileSize = 0,
    docChecklists = [];
    var DocumentCheck = [];
    function readURL(fileInput) {
            var files = fileInput.files;
            for (var i = 0; i < files.length; i++) {
                var file = files[i];
                iFileSize = file.size;
                var imageType = /image.*/;
                if (!file.type.match(imageType)) {
                    continue;
                }
            }
    }

    function bytesToSize(bytes) {
            var sizes = ['Bytes', 'KB', 'MB', 'GB', 'TB'];
            if (bytes == 0) return '0 Byte';
            var i = parseInt(Math.floor(Math.log(bytes) / Math.log(1024)));
            return Math.round(bytes / Math.pow(1024, i), 2) + ' ' + sizes[i];
    };

    function updIndvDocs() {
        $(".upload-img").change(function (e) {
            readURL(this);
            var $this = $(this);
            var file = $this[0].files[0];
            var fileName = e.target.files[0].name;
            var ext = $this.val().split('.').pop().toLowerCase();
            var $par = $(this).parents('li');
            var $msg = $par.find('.msg');
            var $fn = $par.find('.fileName');
            var $dt = $par.find('.docType');
            var $ds = $par.find('.fileSize');
            $msg.hide();
            $dt.hide();
            $par.removeClass('uploaded');
            $(this).parents('.user-files').find('.error').hide();

            var name = $this.attr('id');
            var checkListId = name.substring(name.indexOf('_') + 1, name.length);
            var id = '#upload-img_' + checkListId;

            
            var files = $(id).prop("files");
            var names = $.map(files, function (val) { return val });
           
            fileName = '';

            names.forEach(function (value, index, array) {
                fileName = fileName == '' ? value.name : fileName + " , " + value.name;
                iFileSize = iFileSize + iFileSize;
                docChecklists.push(checkListId);
            });

            if (iFileSize >= 4000000) { // 4 mb
                $msg.show().text('File is too large. Max 4 MB');
                $this.val('');
            } else if ($.inArray(ext, ['png', 'jpg', 'gif', 'pdf', 'docx', 'xlsx', 'xls']) == -1 && ext != '') {
                $msg.show().text('Invalid file format.');
                $this.val('');
            } else {
                $par.addClass('uploaded');
                $dt.show();
                $ds.text(bytesToSize(iFileSize));
                $fn.html(fileName);
            }
        });

        $(document).on('click', '.removeFile', function () {
            var $par = $(this).parents('li');
            $par.find('.msg, .docType').hide();
            $par.find('input').val('');
            $par.removeClass('uploaded');
        });
    }

    function getUnique(array) {
        var uniqueArray = [];
        for (var i = 0; i < array.length; i++) {
            if (uniqueArray.indexOf(array[i]) === -1) {
                uniqueArray.push(array[i]);
            }
        }
        return uniqueArray;
    }

    function sideForm5() {
            var valid = true,
                indvUploads = [],
                allCheck1;
            $('.user-files1 input').each(function () {
                indvUploads.push($(this).val());
            });
            allCheck1 = $.inArray('', indvUploads);
            if (allCheck1 != -1) {
                $('.user-files1 .error').show();
                valid = false;
            }
            return valid;
        }

    $(document).ready(function () {

        debugger;
        updIndvDocs();
        //C8.Core.Mvc.ViewModels.DocumentViewModel?.Documents?.Count() >
        //Removed '?' because it was breaking the javascript for clauses and documents
        //NC - 30/07/2020 - 17:21
        if ($('#documentsCount').val() > 0) {
            renderDocumentDetails();
        }

       var DocumentCheck1 =  decodeURIComponent($('#jsonStringDocumentCheck').val());
       DocumentCheck1 = DocumentCheck1.substring(1,DocumentCheck1.length-1)+",";
        var tempdoc = DocumentCheck1.split("},");
        for(var i in tempdoc) {
        	if(tempdoc[i] != '')
        		DocumentCheck.push(tempdoc[i]+'}');
        }
        
        $('.js-submit').click(function () { 
            if (sideForm5()) {
                console.log('Done')
            }
        });

        //Contract
        $('#btnSave').click(function () {
            var inputValue = $('.upload-img').val();
            if (inputValue === "") {
                $('[href ="#menu2"]').tab('show');
                $('.msg').text("Please select a file to continue").show();
                $('.upload-img').prop('required', true);
                return false;
            }
            else {
                var checkLists = JSON.stringify(docChecklists);
                $('#hiddenChecklists').val(checkLists);
            }
        });

        //Supplier BackOffice

        //$('#SubmitValue').click(function () {
        //    debugger;
        //    DocumentCheck.forEach(elem => {
        //        debugger;
        //        var xElement = elem.Id;
        //        var inputValue = $('#upload-img_'+ xElement).val();
        //        if (inputValue === "") {
        //            $('[href ="#menu5"]').tab('show');
        //            $('#msg_' + xElement).text("Please select a file to continue").show();
        //            $('#upload-img_'+ xElement).prop('required', true);
        //            return false;
        //        }
        //        var checkLists = JSON.stringify(docChecklists);
        //        $('#hiddenChecklists').val(checkLists);
        //    });

        //});

        $('#SubmitSupplier').click(function (e) {
            var count = 0;
            debugger;
            var submit = false;
            DocumentCheck.forEach(obj => {
            	var elemt = JSON.parse(obj);
                
                var xElements = elemt.id;
                var inputValue = $('#upload-img_' + xElements).val();
                if (inputValue === "") {
                    $('[href ="#menu5"]').tab('show');
                    $('#msg_' + xElements).text("Please select a file to continue").show();
                    $('#upload-img_' + xElements).prop('required', true);
                    count+=1;
                    return submit = false;
                   
                }
                else {
                    var nameValue = getUnique(docChecklists);
                    //var checkLists = JSON.stringify(nameValue);
                    $('#hiddenChecklists').val(nameValue);
                    return submit = true;
                }
            });

            if (count > 0) {
                e.preventDefault();
                return submit = false;
            }
            return submit;

        });
    });

    function initFormData() {
        var formdata = new FormData();

        // Information to associate the documents to.
        formdata.append('referenceId', $('#hiddenReferenceId').val());

        return formdata;
    }

    function getDocument(docId) {


        var formdata = new FormData();
        var xhr = new XMLHttpRequest();

        xhr.open('POST', '../Document/GetDocument?documentId=' + docId);
        xhr.send(formdata);
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                //HoldOn.close();
            }
        }

        return false;
    }

    function renderDocumentDetails() {
        var documentCheckLists = JSON.parse(decodeURIComponent($('#jsonStringDocumentCheck').val()));
        $('.docDetails').each(function (i, value) {
            var elementId = $(value).attr('id');
            var documentCheckListId = elementId.substring(elementId.indexOf('_') + 1, elementId.length);
            var list = $.grep(documentCheckLists, function (e, i) {
                return e.id == documentCheckListId;
            });
            $.ajax({
                method: "GET",
                url: "../Document/RenderDocumentDetails",
                data: { referenceId: $('#hiddenReferenceId').val(), userCodeId: list[0].id },
                dataType:'html',
                contentType: 'text/html',
                success: function (data) {
                    //if (data.status == "Success") {
                        $(value).html(data);
                   /* }
                    else {
                        $(elementId).html('');
                    }*/
                },
                error: function () {
                    $("#modalText").html("Document failed to upload or be deleted... please try again");
                    $("#documentResponseModal").modal('show');
                }
            });

        });
    }

    function deleteDocument(documentId) {

        var formdata = initFormData();
        var xhr = new XMLHttpRequest();

        xhr.open('POST', '../Document/DeleteDocument?documentId=' + documentId);
        xhr.send(formdata);
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                //HoldOn.close();
                $("#modalText").html("Document Deleted");
                $("#documentResponseModal").modal('show');
                renderDocumentDetails();
            }
        }

        return false;
    }

</script>