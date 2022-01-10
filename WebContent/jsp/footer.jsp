<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Footer-->
<footer class="footer">
	<span class="pull-right"> <s:text name="scm.city" />
	</span>
	<s:text name="scm.copyright" />
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

<div class="modal fade" id="loadingErrorsModal" role="dialog"
	style="text-align: center;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Loading Errors</h4>
			</div>
			<div class="modal-body">
				<span
					style="border-radius: 50%; border: 20px solid #e74c3c; font-size: 100px; color: #e74c3c; padding: 20px;"
					class="glyphicon glyphicon-remove" aria-hidden="true"></span> <br />
				<br />
				<p>
					The page loaded with errors. <br />Click on
					<code>Close</code>
					to ignore this dialog or
					<code>Reload</code>
					to try again
				</p>
			</div>
			<div class="modal-footer" style="text-align: center;">
				<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" data-dismiss="modal"
					id="reloadPage">Reload Page</button>
			</div>
		</div>
	</div>
</div>



<script type="text/javascript">
    var ajaxErrorCount = 0;
    var heartBeatUrl = '../HeartBeat/Ping';

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
    <script type="text/javascript">
        $(function () {
            $.sessionTimeout({
                keepAliveUrl: heartBeatUrl,
                redirUrl: '../Account/ExpireSession?sessionExpired=True',
                logoutUrl: '../Account/Login',
                warnAfter: 900000, // 15 minutes
                redirAfter: 1200000, // 20 minutes
                keepAliveInterval: 60000,// 1 min
                countdownMessage: 'Logging you out in {timer}',
                countdownBar: true,
                countdownSmart: true,
            });
        });
        </script>
    