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

#uploadFiles svg {
	fill: #23D717;
	width: 100%;
	height: 100%;
}

#uploadFiles svg:hover {
	fill: black;
	width: 100%;
	height: 100%;
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

.user-files .doc {
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

#downloadFile:hover {
	border-radius: 40px;
	box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px
		rgba(0, 0, 0, 0.22);
}
</style>

<s:iterator value="documentList">
	<div class="">
		<ul>
			<li>
				<div id='docDetails1_<s:property value="id"/>' class="docDetails1">
					<div class="upld-list">
						<div class="upd-iconName">
							<span class="uploaded-icon"> <svg
									viewBox="-448.5 266.5 28.9 29">
                                    <use xlink:href="#upload-svg"></use>
                                </svg>
							</span>

							<div>

								<span><s:property value="userCodeDesc"/></span>
								<div class="doc">
									<span class="fileName"><s:property value="documentName" /></span>
									<!-- <i class="mdot"></i><span class="fileSize"><s:property
											value="fileSize" /></span> -->
								</div>
								<div class="msg"></div>
							</div>
						</div>
						<div>
						<s:a href="../Document/GetDocument?documentId=%{id}" theme="simple"><span
								class='pe-7s-cloud-download' id='downloadFile'
								style='font-size: 23px;'></span></s:a>
						<br />
						<s:if test="isLocked == false">
						&nbsp;&nbsp;<a href='javascript:void(0);'
								onclick='deleteDocument(<s:property value="id" />);'><span
								class='glyphicon glyphicon-remove'></span></a><br />
						</s:if>
							<!-- <input type="file" id="@Html.Raw( string.Format( "upload_{0}", d.UserCodeId ) )" />
                            <label for="@Html.Raw( string.Format( "upload_{0}", d.UserCodeId ) )"><span class='pe-7s-cloud-upload' id='downloadFile' style='font-size:23px;'></span> </label>-->
							<span class="closeStyle removeFile"></span>
						</div>
					</div>
				</div>

			</li>
		</ul>
	</div>
</s:iterator>