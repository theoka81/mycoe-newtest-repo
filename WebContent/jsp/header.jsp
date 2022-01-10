<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta charset="UTF-8">
<title><s:text name="scm.project.title" /></title>

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700'
	rel='stylesheet' type='text/css'>

<!-- Primary vendor style -->
    <link href="../vendor/fontawesome/css/font-awesome.min.css" rel="stylesheet"/>

    <link href="../vendor/animate.css/animate.min.css" rel="stylesheet"/>

    <link href="../vendor/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet"/>

    <link href="../Icons/pe-icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet"/>


    <link href="../vendor/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet"/>


    <link href="../vendor/bootstrap-datepicker-master/dist/css/bootstrap-datepicker3.min.css" rel="stylesheet"/>

    <link href="../vendor/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet"/>

    <link href="../vendor/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" rel="stylesheet"/>


    <link href="../Content/bootstrap-select.min.css" rel="stylesheet"/>

    <link href="../Content/ajax-bootstrap-select.min.css" rel="stylesheet"/>

    <link href="../vendor/sweetalert/lib/sweet-alert.css" rel="stylesheet"/>


    <!-- Add local styles, mostly for plugins css file -->

    <!-- Primary HOMER style -->
    <link href="../Content/style.fonts.css" rel="stylesheet"/>
<link href="../Content/style.css" rel="stylesheet"/>
<link href="../Content/style.css" rel="stylesheet"/>
<link href="../Content/Terms.css" rel="stylesheet" />

<!-- Section for main scripts render -->
<script src="../vendor/jquery/dist/jquery.min.js"></script>
<script src="../vendor/bootstrap/dist/js/bootstrap.min.js"></script>

<script src="../vendor/metisMenu/dist/metisMenu.min.js"></script>
<script src="../vendor/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../vendor/iCheck/icheck.min.js"></script>
<script src="../vendor/peity/jquery.peity.min.js"></script>
<script src="../vendor/sparkline/index.js"></script>
<script src="../Scripts/homer.js"></script>
<script src="../Scripts/charts.js"></script>

<script src="../vendor/datatables/media/js/jquery.dataTables.min.js"></script>
<script src="../vendor/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>

<script src="../vendor/pdfmake/build/pdfmake.min.js"></script>
<script src="../vendor/pdfmake/build/vfs_fonts.js"></script>
<script src="../vendor/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="../vendor/datatables.net-buttons/js/buttons.print.min.js"></script>
<script
	src="../vendor/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script
	src="../vendor/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>

<script
	src="../vendor/bootstrap-session-timeout/bootstrap-session-timeout.min.js"></script>

<script src="../vendor/moment/moment.js"></script>
<script
	src="../vendor/bootstrap-datepicker-master/dist/js/bootstrap-datepicker.min.js"></script>
<script
	src="../vendor/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>

<script src="../Scripts/timeline-horizontal.js"></script>
<script src="../Scripts/bootstrap-select.min.js"></script>
<script src="../Scripts/ajax-bootstrap-select.min.js"></script>
<script src="../vendor/sweetalert/lib/sweet-alert.js"></script>
<script src="../Scripts/search-filters.js"></script>
<script src="../Scripts/Security.js"></script>
<style>
/* For desktop: */
.col-1 {
	width: 8.33%;
}

.col-2 {
	width: 16.66%;
}

.col-3 {
	width: 25%;
}

.col-4 {
	width: 33.33%;
}

.col-5 {
	width: 41.66%;
}

.col-6 {
	width: 50%;
}

.col-7 {
	width: 58.33%;
}

.col-8 {
	width: 66.66%;
}

.col-9 {
	width: 75%;
}

.col-10 {
	width: 83.33%;
}

.col-11 {
	width: 91.66%;
}

.col-12 {
	width: 100%;
}

@media only screen and (max-width: 768px) {
	/* For mobile phones: */
	[class*="col-"] {
		width: 100%;
	}
}
</style>
</head>
<body class="landing-page hide-sidebar">
	<script
		src="https://www.google.com/recaptcha/api.js?render=6Lc2gGQaAAAAAKMYZOntcCkuxIX-KPWTs0rABvKT"></script>
	<input type="hidden" id="g-recaptcha-response"
		name="g-recaptcha-response" class="g-recaptcha-response" />
	<!--[if lt IE 7]>
        <p class="alert alert-danger">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
	<!-- Header -->
	<div id="header">

		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button aria-controls="navbar" aria-expanded="false"
						data-target="#navbar" data-toggle="collapse"
						class="navbar-toggle collapsed" type="button">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a href="../" class="navbar-brand"><img
						src="../Content/img/logo.png" width="25px" height="25px" /></a>
					<div class="brand-desc">SCM - City of Ekurhuleni</div>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-left">

					</ul>

					<ul class="nav navbar-nav navbar-right">
						<li><a data-toggle="modal" data-target="#queryModal"
							title="Support Queries"> <i class="pe-7s-chat"
								style="font-size: 25px"></i>
						</a></li>
						<li><a class="page-scroll" href="../Account/Register"
							id="registerLink">Register</a></li>
						<li><a class="page-scroll" href="../Account/Login"
							id="loginLink">Log in</a></li>
					</ul>
					<jsp:include page="queriesModal.jsp"></jsp:include>
					<form action="../Account/Register" method="post">
						<input name="__RequestVerificationToken" type="hidden"
							value="0I8Uq1sHR4uy-nU_dFVZOHwdsxFNOinnxyK3T_z0I88u64tMroh6o7J5kG5q3S3dLa2PNVzIIGy91n0fsctXTv8CZkTm6Rtl1o-b5uYAJPU1" />
						<div class="modal fade" id="queryModal" tabindex="-1"
							role="dialog" aria-labelledby="queryModalLabel"
							aria-hidden="true">
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
													style="color: red; font-weight: bold">Please select a
													query Type to proceed</p>
											</div>
											<div class="form-group">
												<label for="recipient-name" class="col-form-label">Email
													Address:</label><br /> <input
													class="form-control text-box single-line" id="EmailAddress"
													name="EmailAddress" type="text" value="" />
												<p class="errorMessage" hidden id="queryTypeMessage"
													style="color: red; font-weight: bold">Please select a
													query Type to proceed</p>
											</div>
											<div class="form-group">
												<label for="message-text" class="col-form-label">Query
													Comment:</label>
												<textarea class="form-control" cols="93" id="QueryComment"
													name="QueryComment" rows="8">
</textarea>
												<p class="errorMessage" hidden id="queryCommentMessage"
													style="color: red; font-weight: bold">Please provide a
													description describing the issues that your are struggling
													with to proceed.</p>
											</div>
										</div>
										<div id="SucessContent" hidden>
											<div class="text-center">
												<img src="../Content/img/undraw_Mail_sent_re_0ofv.png"
													class="img-responsive text-center"
													style="height: 300px; width: 300px; margin-left: 120px;" />
												<b style="font-size: 12px">Your Query has been
													successfully forwarded to support , hang tight they will
													get back to you as soon as possible...</b> <br />

											</div>
										</div>
										<div id="errorContent" hidden>
											<div class="text-center">
												<img src="../Content/img/undraw_Notify_re_65on.png"
													class="img-responsive"
													style="height: 300px; width: 300px; margin-left: 120px;" />
												<b style="font-size: 12px">Oops Something went wrong ,
													please try again or contact support if this error
													persists..</b> <br />

											</div>
										</div>
										<div class="modal-footer" id="originalFooter">
											<button type="button" class="btn btn-secondary"
												data-dismiss="modal">Close</button>
											<button type="button" class="btn btn-primary"
												data-save="modal" id="sendMessage">Send Message</button>
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
                url: "../SupportQueries/AddOrEdit",
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


				</div>
			</div>
		</nav>

	</div>