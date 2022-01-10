<form action="../" method="post">
	<div class="modal fade" id="queryModal" tabindex="-1" role="dialog"
		aria-labelledby="queryModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title text-center" id="queryModalLabel">Support
						Query</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div id="bodyContentModal">
						<div class="form-group">
							<label for="recipient-name" class="col-form-label">Query
								Type:</label><br /> <select class="form-control " data-val="true"
								data-val-number="The field QueryType must be a number."
								id="QueryType" name="QueryType"><option value="-1">-Select-</option>
								<option value="63265">Login Issue</option>
								<option value="63266">Registration Issue</option>
								<option value="63267">Email Confirmation Issue</option>
								<option value="63268">Other</option>
							</select>
							<p class="errorMessage" hidden id="queryTypeMessage"
								style="color: red; font-weight: bold">Please select a query
								Type to proceed</p>
						</div>
						<div class="form-group">
							<label for="message-text" class="col-form-label">Query
								Comment:</label>
							<textarea class="form-control" cols="93" id="QueryComment"
								name="QueryComment" rows="8">
							</textarea>
							<p class="errorMessage" hidden id="queryCommentMessage"
								style="color: red; font-weight: bold">Please provide a
								description describing the issues that your are struggling with
								to proceed.</p>
						</div>
					</div>
					<div id="SucessContent" hidden>
						<div class="text-center">
							<img src="/ScmQa/Content/img/undraw_Mail_sent_re_0ofv.png"
								class="img-responsive text-center"
								style="height: 300px; width: 300px; margin-left: 120px;" /> <b
								style="font-size: 12px">Your Query has been successfully
								forwarded to support , hang tight they will get back to you as
								soon as possible...</b> <br />

						</div>
					</div>
					<div id="errorContent" hidden>
						<div class="text-center">
							<img src="/ScmQa/Content/img/undraw_Notify_re_65on.png"
								class="img-responsive"
								style="height: 300px; width: 300px; margin-left: 120px;" /> <b
								style="font-size: 12px">Oops Something went wrong , please
								try again or contact support if this error persists..</b> <br />

						</div>
					</div>
					<div class="modal-footer" id="originalFooter">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary" data-save="modal"
							id="sendMessage">Send Message</button>
					</div>

					<div class="modal-footer" id="footerSuccess" hidden>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>

			</div>
		</div>
	</div>
</form>
<script>

    $('#sendMessage').click(function () {
        debugger;
        var queryType = $('#QueryType').val();
        var queryComment = $('#QueryComment').val();
        var emailAddress = $('#EmailAddress').val();
        var viewModel = { QueryType: queryType, QueryComment: queryComment, SupplierId: null, EmailAddress: emailAddress, StatusId: null };
        if (queryType == -1 || queryType == '-1') {
            $('#queryTypeMessage').show();
        }
        if (queryComment === '' || queryComment === null) {
            $('#queryCommentMessage').show();
        }

        else {
             $.ajax({
                url: "<%=request.getContextPath()%>/SupportQueries/AddOrEdit",
                data: viewModel,
                type: 'post',
                success: function (data) {
                    if (data.successMessage == 'true') {
                        $('#originalFooter').hide();
                        $('#bodyContentModal').hide();
                        $('#SucessContent').show();
                        $('#footerSuccess').show();
                        $('#QueryType').val('');
                        $('#QueryComment').val('');
                    }
                    else {
                        $('#originalFooter').hide();
                        $('#bodyContentModal').hide();
                        $('#errorContent').show();
                        $('#footerSuccess').show();
                    }
                },
            error: function (data) {
                if (data.successMessage == 'false') {
                    $('#originalFooter').hide();
                    $('#bodyContent').hide();
                    $('#errorContent').show();
                    $('#footerSuccess').show();
                }
                }



        });
        }


    });
</script>