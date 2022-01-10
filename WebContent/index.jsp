<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>CoE SCM | Home</title>

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>

    <!-- Primary vendor style -->
    <link href="vendor/fontawesome/css/font-awesome.min.css" rel="stylesheet"/>

    <link href="vendor/animate.css/animate.min.css" rel="stylesheet"/>

    <link href="vendor/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet"/>

    <link href="Icons/pe-icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet"/>


    <link href="vendor/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet"/>


    <link href="vendor/bootstrap-datepicker-master/dist/css/bootstrap-datepicker3.min.css" rel="stylesheet"/>

    <link href="vendor/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet"/>

    <link href="vendor/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css" rel="stylesheet"/>


    <link href="Content/bootstrap-select.min.css" rel="stylesheet"/>

    <link href="Content/ajax-bootstrap-select.min.css" rel="stylesheet"/>

    <link href="vendor/sweetalert/lib/sweet-alert.css" rel="stylesheet"/>


    <!-- Add local styles, mostly for plugins css file -->

    <!-- Primary HOMER style -->
    <link href="Content/style.fonts.css" rel="stylesheet"/>
<link href="Content/style.css" rel="stylesheet"/>

<style>
        /* For desktop: */
.col-1 {width: 8.33%;}
.col-2 {width: 16.66%;}
.col-3 {width: 25%;}
.col-4 {width: 33.33%;}
.col-5 {width: 41.66%;}
.col-6 {width: 50%;}
.col-7 {width: 58.33%;}
.col-8 {width: 66.66%;}
.col-9 {width: 75%;}
.col-10 {width: 83.33%;}
.col-11 {width: 91.66%;}
.col-12 {width: 100%;}

@media only screen and (max-width: 768px) {
  /* For mobile phones: */
  [class*="col-"] {
    width: 100%;
  }
}
</style>
</head>
<body class="landing-page hide-sidebar">
    <script src="https://www.google.com/recaptcha/api.js?render=6Lc2gGQaAAAAAKMYZOntcCkuxIX-KPWTs0rABvKT"></script>
    <input type="hidden" id="g-recaptcha-response" name="g-recaptcha-response" class="g-recaptcha-response" />
    <!--[if lt IE 7]>
        <p class="alert alert-danger">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <!-- Header -->
    <div id="header">

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="" class="navbar-brand"><img src="Content/img/logo.png" width="25px" height="25px" /></a>
            <div class="brand-desc">
                SCM - City of Ekurhuleni
            </div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-left">









            </ul>
            
<ul class="nav navbar-nav navbar-right">
    <li>
        <a data-toggle="modal" data-target="#queryModal" title="Support Queries">
            <i class="pe-7s-chat" style="font-size:25px"></i>
        </a>
    </li>
    <li><a class="page-scroll" href="Account/Register" id="registerLink">Register</a></li>
    <li><a class="page-scroll" href="Account/Login" id="loginLink">Log in</a></li>
</ul>



<style>

    /*
    .longInput {
        width: 540px;
 } */  

</style>
<form action="/scmqa" method="post"><input name="__RequestVerificationToken" type="hidden" value="1tQ-o7LS65-KQEj2imDGJ0R-KfnuOELI31q_CJ_e75SmD0JCZ8dg6DuJYBK0cziEb7e0CZp7B0FXG6mdyknehUZuYzSwShYXPSmXCnaRujI1" />    <div class="modal fade" id="queryModal" tabindex="-1" role="dialog" aria-labelledby="queryModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title text-center" id="queryModalLabel">Support Query</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div id="bodyContentModal">
                        <div class="form-group">
                            <label for="recipient-name" class="col-form-label">Query Type:</label><br />
                            <select class="form-control " data-val="true" data-val-number="The field QueryType must be a number." id="QueryType" name="QueryType"><option value="-1">-Select-</option>
<option value="63265">Login Issue</option>
<option value="63266">Registration Issue</option>
<option value="63267">Email Confirmation Issue</option>
<option value="63268">Other</option>
</select>
                            <p class="errorMessage" hidden id="queryTypeMessage" style="color:red; font-weight:bold">Please select a query Type to proceed</p>
                        </div>
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Email Address:</label><br />
                                <input class="form-control text-box single-line" id="EmailAddress" name="EmailAddress" type="text" value="" />
                                <p class="errorMessage" hidden id="queryTypeMessage" style="color:red; font-weight:bold">Please select a query Type to proceed</p>
                            </div>
                        <div class="form-group">
                            <label for="message-text" class="col-form-label">Query Comment:</label>
                            <textarea class="form-control" cols="93" id="QueryComment" name="QueryComment" rows="8">
</textarea>
                            <p class="errorMessage" hidden id="queryCommentMessage" style="color:red; font-weight:bold">Please provide a description describing the issues that your are struggling with to proceed.</p>
                        </div>
                    </div>
                    <div id="SucessContent" hidden>
                        <div class="text-center">
                            <img src="Content/img/undraw_Mail_sent_re_0ofv.png" class="img-responsive text-center" style="height:300px; width:300px; margin-left:120px;" />
                            <b style="font-size:12px">Your Query has been successfully forwarded to support , hang tight they will get back to you as soon as possible...</b>
                            <br />

                        </div>
                    </div>
                    <div id="errorContent" hidden>
                        <div class="text-center">
                            <img src="Content/img/undraw_Notify_re_65on.png" class="img-responsive" style="height:300px; width:300px; margin-left:120px;" />
                            <b style="font-size:12px">Oops Something went wrong , please try again or contact support if this error persists..</b>
                            <br />

                        </div>
                    </div>
                    <div class="modal-footer" id="originalFooter">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" data-save="modal" id="sendMessage">Send Message</button>
                    </div>

                    <div class="modal-footer" id="footerSuccess" hidden>
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>
    </div>
</form><script src="Scripts/jquery-3.3.1.min.js"></script>
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
                url: "SupportQueries/AddOrEdit",
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

        <!-- Banners -->


    <div style="margin-top: 15px; margin-left: 25px; font-size: 1.2em;">
        <p style="color: red;"><b>Notice:</b></p>
        <p>
            Welcome to the City of Ekurhuleni Online Supply Chain Management System. If you are a new supplier, please go ahead and register via the registration link. If you have previously traded or registered with COE, please check your email addresses for a invite to the system. If you have not received an email, please email <a href="mailto:scm@ekurhuleni.gov.za"><b>scm@ekurhuleni.gov.za</b></a> or phone <b>011 999 5102</b> with the following information available when contacting us:
            <ul>
                <li>Company Registration Number</li>
                <li>CSD MAAA Number</li>
                <li>Company Name</li>
                <li>COE Supplier Number - if available, usually starts with the first 3 characters of your company name.</li>
                <li>Principal director name, mobile and email address.</li>
                <li>Principal contact name, mobile and email address.</li>
                <li>Vat No - if applicable.</li>
                <li>Tax No</li>
            </ul>
            Thank you.
        </p>
    </div>

    <div class="banner">
        <div class="banner-inner">
            <h3>COE SCM</h3>
            <p class="lead">COE SCM' supplier module maintains a database of organisations, institutions and individuals who can provide goods and services to city. The COE SCM' supplier module serves as the single source of key supplier information for the city, providing consolidated, accurate, up-to-date, complete and verified supplier information. The COE SCM' supplier module is also integrated to National Treasury' Central Supplier Database (CSD). If you are a prospective suppliers interested in pursuing opportunities within the City of Ekurhuleni, you can self-register on the city' SCM supplier module.</p>
            <br/>
            <p>For any queries please email:   <strong style="font-size:19px">scm@ekurhuleni.gov.za</strong></p>
        </div>
        &nbsp;
    </div>


<jsp:include page="jsp/queriesModal.jsp"></jsp:include>


    <!-- Main view -->
    <div id="wrapper">

        <div class="body-content">
            <div class="divider">&nbsp;</div>
            



                    <div class="row">
                        <div class="col-md-4">
                            <h2>SCM Systems</h2>
                            <p>
                                Supply chain management (SCM) systems are inter-organizational systems that enable companies to efficiently handle the flow of good from suppliers to customers. A supply chain is a network of organizations and facilities that transforms raw materials into products delivered to customers.
                            </p>
                        </div>
                        <div class="col-md-4">
                            <h2>Supply Chain Types</h2>
                            <p>Depending on the functions the supply chain management systems perform, they are classified into two categories, namely supply chain planning systems and supply chain execution systems.</p>
                        </div>
                        <div class="col-md-4">
                            <h2>Major Elements</h2>
                            <p>There are four major elements of supply chain management: integration, operations, purchasing and distribution. Each relies on the others to provide a seamless path from plan to completion as affordably as possible.</p>
                        </div>
                    </div>




        </div>
        <div class="space-30">&nbsp;</div>

            <!-- Footer-->


                                            <div class="divider">&nbsp;</div>

                                                    <!-- Footer-->

<footer class="footer-home">
    <span class="pull-right">
        <br />
        <br />
        <br />
        <br />
        &copy; 2021 - CoE SCM :: City of Ekurhuleni
    </span>    
</footer>


    </div>

    <!-- Modal -->
    <div class="modal fade" id="loadingModal" role="dialog">
        <div class="modal-dialog loader-modal-dialog">
            <div class="loader-modal-content">
                <div class="loader"></div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="loadingErrorsModal" role="dialog" style="text-align: center;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Loading Errors</h4>
                </div>
                <div class="modal-body">
                    <span style="border-radius: 50%; border: 20px solid  #e74c3c; font-size: 100px; color: #e74c3c; padding: 20px;" class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                    <br />
                    <br />
                    <p>The page loaded with errors. <br />Click on <code>Close</code> to ignore this dialog or <code>Reload</code> to try again</p>
                </div>
                <div class="modal-footer" style="text-align: center;">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal" id="reloadPage">Reload Page</button>
                </div>
            </div>
        </div>
    </div>

    <!-- Section for main scripts render -->

    <script src="vendor/jquery/dist/jquery.min.js"></script>

    <script src="vendor/bootstrap/dist/js/bootstrap.min.js"></script>

    <script src="vendor/metisMenu/dist/metisMenu.min.js"></script>
<script src="vendor/slimScroll/jquery.slimscroll.min.js"></script>
<script src="vendor/iCheck/icheck.min.js"></script>
<script src="vendor/peity/jquery.peity.min.js"></script>
<script src="vendor/sparkline/index.js"></script>
<script src="Scripts/homer.js"></script>
<script src="Scripts/charts.js"></script>

    <script src="vendor/datatables/media/js/jquery.dataTables.min.js"></script>

    <script src="vendor/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>

    <script src="vendor/pdfmake/build/pdfmake.min.js"></script>
<script src="vendor/pdfmake/build/vfs_fonts.js"></script>
<script src="vendor/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="vendor/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="vendor/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="vendor/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>

    <script src="vendor/bootstrap-session-timeout/bootstrap-session-timeout.min.js"></script>


    <script src="vendor/moment/moment.js"></script>

    <script src="vendor/bootstrap-datepicker-master/dist/js/bootstrap-datepicker.min.js"></script>

    <script src="vendor/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>

    <script src="Scripts/timeline-horizontal.js"></script>

    <script src="Scripts/bootstrap-select.min.js"></script>

    <script src="Scripts/ajax-bootstrap-select.min.js"></script>

    <script src="vendor/sweetalert/lib/sweet-alert.js"></script>

    <script src="Scripts/search-filters.js"></script>

    <script src="Scripts/Security.js"></script>

    <script type="text/javascript">
    var ajaxErrorCount = 0;
    var heartBeatUrl = 'HeartBeat/Ping';

    $(document).ajaxSend(function (event, jqxhr, settings) {
        //dont show for heartbeats
        if (!(settings.url === heartBeatUrl && $.active === 1)) {
            if (!$('#loadingModal').is(':visible')) {
                $('#loadingModal').modal({ keyboard: false, backdrop: 'static' });
                $('#loadingModal').modal('show');
            }
        }
    });

    $(document).ajaxError(function () {
        ajaxErrorCount++;
    });

    $(document).ajaxStop(function() {
        $('#loadingModal').modal('hide');

        if (ajaxErrorCount) {
            //$('#loadingErrorsModal').modal();
            //$('#loadingErrorsModal').modal('show');
        }
    });

    getProgressBar = function (numerator, denominator, dataLabelDescription, counterLabel, percentage) {

        percentage = percentage ? percentage : +(Math.round((numerator / denominator * 100) + "e+" + 2) + "e-" + 2);

        var progressBar =
            '<div class="progress m-t-xs full progress-small">' +
                '<div style="width: ' +
                percentage +
                '%;"' +
                ' aria-valuemax="100" ' +
                ' aria-valuemin="0" ' +
                ' aria-valuenow="' +
                percentage +
                '"' +
                ' role="progressbar" ' +
                ' class="progress-bar progress-bar-success" ' +
                ' title="' +
                percentage +
                '%">' +
                (counterLabel ? counterLabel : percentage + '%') +
                '</div>' +
                '</div>';

        if (dataLabelDescription) {
            progressBar +=
                '<div>' +
                '   <label>'+ dataLabelDescription +': ' + numerator + '</label>' +
                '   <label class="pull-right">Total: '+ denominator +'</label>' +
                '</div>';
        }

        return progressBar;
    }

    $(document).ready(function () {
        

        
        $('input[type=button]').addClass('btn-xs');
        $('input[type=text]').addClass('input-sm');
        $('input[type=number]').addClass('input-sm');
        $('input[type=password]').addClass('input-sm');
        $('select').addClass('input-sm');
        $('input[type=submit]').addClass('btn-xs');
        $('a').addClass('btn-xs');
        $('.btn[value=Close]').addClass('btn-warning');
        $('a.btn')
            .filter(function(index) { return $(this).text() === "Close"; })
            .addClass('btn-warning');
        //$('.btn[value=Close]').on('click', function (e) {
        //    e.preventDefault();
        //    closeButtonLocationOrBack($(this));
        //});
        //$('a.btn')
        //    .filter(function (index) { return $(this).text() === "Close"; })
        //    .on('click', function (e) {
        //        e.preventDefault();
        //        closeButtonLocationOrBack($(this));
        //    });
        $('.btn[value=Reject]').addClass('btn-danger');
        $('a.btn')
            .filter(function (index) { return $(this).text() === "Reject"; })
            .addClass('btn-danger');

        $('.col-md-10').addClass('col-md-5');
        $('.col-md-5').removeClass('col-md-10');

        //Commented out because it was interfering with the default panel layout in bootstrap
        //NC - 2020/07/29 - 16:52

        //$('.form-group').addClass('input-sm small-form-group');
        //$('.form-group:has(.input-sm)').addClass('small-form-group');
        //$('.form-group.small-form-group > .control-label').addClass('small-control-label');

        $('#reloadPage').click(function() {
            location.reload();
        });

        //var datepicker = $.fn.datepicker.noConflict(); // return $.fn.datepicker to previously assigned value
        //$.fn.bootstrapDP = datepicker;                 // give $().bootstrapDP the bootstrap-datepicker functionality

        var $today = new Date(),
            $day = ("0" + $today.getDate()).slice(-2),
            $month = ("0" + ($today.getMonth() + 1)).slice(-2),
            $year = $today.getFullYear();

        $('.datePicker').datepicker({
            format: 'yyyy/mm/dd',
            startDate: $day,
            autoclose: true
        });
    });

    </script>



    <!-- Handler for local scripts -->
    
</body>
</html>


