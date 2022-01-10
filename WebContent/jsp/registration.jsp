<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<jsp:include page="header.jsp" />

<!-- Main view -->
<div id="wrapper">

	<div class="body-content">
		<div class="divider">&nbsp;</div>


		<style>
#wrapper {
	background-color: #ffffff;
}

button {
	border-radius: 20px;
	border: 1px solid #f6f5f7;
	background-color: #51c914;
	color: #FFFFFF;
	font-size: 11px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
}

button:active {
	transform: scale(0.95);
}

button:focus {
	outline: none;
}

button.ghost {
	background-color: transparent;
	border-color: #FFFFFF;
}
</style>

		<div class="alert alert-info text-center" role="alert"
			style="background-color: #ffffff">
			<b>Suppliers are required to first register on the Central
				Supplier Database (CSD) before registering on the COE SCM Portal.</b> <b>CSD
				website:<a href="https://secure.csd.gov.za/" target="_blank"
				class="size">www.csd.gov.za</a>
			</b>
		</div>
		<s:if test="hasFieldErrors()">
			<input type="hidden" name="noLoad" id="browserFingerprint"
				value="clear" />
		</s:if>
		<s:else>
			<s:hidden name="noLoad" id="browserFingerprint" theme="simple" />
		</s:else>
		<div class="container-register" style="background-color: #ffffff;">
			<div class="col-md-12" style="background-color: #ffffff">
				<div class="col-md-push-1 col-md-6"
					style="background-color: #ffffff">
					<img src="../Content/img/map.png" width="367px" height="449px"
						class="img-responsive" />
				</div>

				<div class="col-md-6" style="background-color: #ffffff">
					<form action="../Account/saveSupplier" class="form-horizontal"
						method="post" role="form">

						<div class="validation-summary-valid text-danger"
							data-valmsg-summary="true">
							<s:actionerror />
							<s:actionmessage />
							<s:fielderror></s:fielderror>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield id="MaaaNumber" name="maaaNumber"
									cssClass="form-control input-sm" placeholder="MAAA Number"
									theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield id="FirstName" name="firstName"
									cssClass="form-control input-sm" placeholder="First Name"
									theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield id="LastName" name="lastName"
									cssClass="form-control input-sm" placeholder="Last Name"
									theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield id="Cellphone" maxlength="10" name="cellphone"
									cssClass="form-control input-sm" onkeypress="isNumber(event);"
									placeholder="Cellphone" theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield name="identificationNumber"
									id="IdentificationNumber" maxlength="13"
									onkeypress="isNumber(event);" placeholder="SAID Number"
									cssClass="form-control input-sm" theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:textfield name="email" id="Email" placeholder="Email"
									cssClass="form-control input-sm" theme="simple"></s:textfield>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:password name="password" id="Password" placeholder="Password"
									cssClass="form-control input-sm" theme="simple"></s:password>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-8">
								<s:password name="confirmPassword" id="ConfirmPassword"
									cssClass="form-control input-sm" placeholder="Confirm Password"
									theme="simple"></s:password>
							</div>
						</div>
						<br />
						<div class="form-group">
							<div class="col-md-3 text-center">
								<button type="submit">Register</button>
							</div>
						</div>
						<div class="overlay">
							<div class="container">
								<div class="row">
									<div class="col-xs-12 col-sm-8 col-sm-offset-2">

										<div class="titles">
											<br /> <br /> <br />
											<h1 class="title">Terms & Conditions and Privacy Notice</h1>
											<h2 class="subtitle">To create an account, please read
												and agree to our Terms & Conditions and Privacy Notice</h2>
										</div>

										<div class="legal">

											<!-- Legal Instructions -->
											<div class="legal__instructions">
												<div class="alert alert-info" role="alert">
													<strong> <i class="fa fa-exclamation-triangle"></i>
														Important.
													</strong> <span>In order to continue, you must read the Terms
														& Conditions and Privacy Notice by scrolling to the
														bottom.</span>
												</div>
											</div>
											<!-- / -->
											<!-- Legal Navigation -->
											<nav class="legal__navigation">
												<span>Navigate to:</span>
												<ol>
													<li><a class="terms-nav" href="#terms-and-conditions">Terms
															& Conditions</a></li>

												</ol>
												<div class="legal__progress"></div>
											</nav>
											<!-- / -->
											<!-- Legal Terms, Conditions, Notices -->
											<div class="legal__terms">
												<div class="legal__terms-scroll">
													<div id="terms-and-conditions">
														<strong>Terms and Conditions</strong> <br />
														<p>In order to use this site please accept the Terms
															and Conditions.</p>
														<p>
															<strong>1.Introduction</strong>
														</p>
														<br />
														<p>These conditions will govern the relationship
															between the Municipality and the registered service
															provider as rendered by the eKurhuleni Municipality on
															the eKurhuleni Service.</p>
														<p>The service provider understands that by submitting
															their registration to subscribe to the service that they
															have familiarized themselves with the contents in the
															Conditions of Use, and that the service provider intends
															to be bound by the contents</p>
														<p>This Agreement will commence when the eKurhuleni
															Municipality accepts the service providers request to
															subscribe to Service, which acceptance will manifest at
															that point in time when the eKurhuleni Municipality sends
															the service providers a PR Number (the "commencement
															date").</p>
														<p>
															<strong> 2. Definitions</strong> <br />
														</p>
														<p>"User" means all persons who access, view, download
															from, or use the eKurhuleni Municipality site whether on
															the Internet or a copy thereof. "Users" includes
															"Registered service providers"</p>
														<p>"Service" means the electronic statement
															presentation, enquiry, contracts, terminations and
															de-registrations, black listing and payment solution as
															approved by the eKurhuleni Municipality.</p>
														<p>"the eKurhuleni Municipality site" means the
															website through which the eKurhuleni Municipality
															provides the Service.</p>
														<p>"Registered service provider" means a registered
															service provider with the eKurhuleni Municipality who
															subscribes to the Service either personally or through an
															authorized agent.</p>
														<p>"eKurhuleni Municipality " means a municipality
															established in terms of section 12 of Local Government
															Act, 1998 (Act no: 117 of 1998).</p>
														<p>"submit" or "submission" means the action whereby
															the service provider indicates to the eKurhuleni
															Municipality that they want utilize service.</p>
														<p>"writing" means documents reduced to writing and
															shall include e-mails, fax or registered post</p>
														<strong> 3. Application</strong> <br />
														<p>These Conditions of Use shall apply to all Users
															and becomes binding between the eKurhuleni Municipality
															and a user immediately upon the user accessing, viewing
															or using the Service or its contents.</p>
														<strong> 4. Electronic Communications </strong> <br />
														<p>When a user visits the eKurhuleni Municipality
															website or sends e-mails to the eKurhuleni Municipality,
															that user consents to receiving communications from the
															eKurhuleni Municipality electronically and agrees that
															all agreements, notices, disclosures and other
															communications sent by the eKurhuleni Municipality
															satisfies any legal requirements, including but not
															limited, to the requirement that such communications are
															considered to be "in writing" with the same legal stature
															as a written document.</p>
														<strong>5. User Name and Password</strong> <br />
														<p>The service provider undertakes to ensure that the
															user name and password are neither easily accessible nor
															disclosed to any unauthorized person. Storing the
															username and/or password on a computer or network will be
															regarded as prima facie negligence.</p>
														<p>The service provider undertakes to report any
															actual or attempted unauthorised access to the eKurhuleni
															Municipality, without delay, via the support desk of the
															eKurhuleni Municipality and provide the eKurhuleni
															Municipality with written confirmation thereof within 24
															(twenty-four) hours of such notification. On receipt of
															notification, the eKurhuleni Municipality reserves the
															right to deactivate the user name and/or password without
															further notice.</p>
														<p>The eKurhuleni Municipality may at its sole
															discretion and for whatever reason, require an service
															provider to change their user name and / or password from
															time to time and the service provider undertakes to
															unconditionally comply with such a requirement.</p>
														<strong> 6. Information and Privacy </strong>
														<p>The eKurhuleni Municipality understands that the
															information provided by the service provider to the
															eKurhuleni Municipality (the "information"), includes
															private and sensitive information. The eKurhuleni
															Municipality will, save for the circumstances as set out
															in clause 10 bullet 2 below, not share any such
															information with any third party without the prior
															written consent of the service provider.</p>
														<p>The eKurhuleni Municipality will only disclose the
															information to a third party:
														<ul>
															<li>to perform the Service;</li>
															<li>if the eKurhuleni Municipality is required by
																law or court order to disclose the information; and/or</li>
															<li>The eKurhuleni Municipality will store
																information on its system for a period of 12 (twelve)
																months after the termination of this agreement, or for a
																period of 5 (five) years after submission of information
																if this agreement remains in force for longer than 5
																(years), whichever might be the case.</li>
														</ul>
														</p>
														<p>Although the eKurhuleni Municipality will take all
															reasonable measures to ensure that the information will
															not be compromised, the service provider acknowledges
															that they need to keep copies of the information under
															their own control in order to mitigate potential damages
															that might result from a loss or corruption of
															information.</p>

														<strong>7. Use of User Information by the
															eKurhuleni Municipality</strong> <br />
														<p>The eKurhuleni Municipality may in the widest sense
															possible distribute, loan, sell or otherwise share with
															other persons or entities information constituting or
															descriptive of demographic information, habits, usage
															patterns, preferences, survey data or other descriptive
															or related data which does not permit recipients to
															individually identify any particular user of the
															information service.</p>

														<p>The eKurhuleni Municipality will be entitled in its
															sole discretion and without notice to provide user
															information and records to the courts, law enforcement
															agencies, others involved in prosecuting claims or
															investigations for conduct or conditions alleged or
															believed to be illegal or the violation or threatening of
															rights of any person or entity, and to maintain and use
															such information and records internally.</p>

														<p>The eKurhuleni Municipality may provide online and
															e-mail communications to the user on matters pertaining
															to the information service, its features, its sponsors,
															or its use without compensation to the user, but shall do
															so reasonably and in good faith.</p>
														<p>The user acknowledges:
														<ul>
															<li>that communications within the information
																service may be monitored or reviewed for quality control
																and other reasonable business and/or legal purposes;</li>
															<li>The use of user information and the disposal or
																dissemination thereof shall not constitute invasion of
																privacy by the eKurhuleni Municipality.</li>
														</ul>
														</p>

														<strong>8. Use of Software</strong> <br />
														<p>Users are required to use and maintain only
															hardware and software of sufficient minimum quality and
															performance capabilities as indicated on the eKurhuleni
															Municipality home page and to use only the specified
															makes and versions of Internet browser software. Users
															acknowledge that their failure to use a specified browser
															may result in a higher security risk and/or cause or all
															of the functionality of the website not to operate
															properly or at all.</p>
														<p>Software, if any, made available for download on or
															via the website is governed by the license conditions
															establishing a legal relationship between the User and
															the licensor of such software. The user indemnifies the
															eKurhuleni Municipality against any breach of such
															license conditions.</p>
														<p>The eKurhuleni Municipality gives no warranty and
															makes no representation, whether express or implied, as
															to the quality or compatibility of such software.</p>

														<strong>9. Unavailability of the eKurhuleni
															Municipality Services </strong> <br />
														<p>The eKurhuleni Municipality shall at all times and
															for whatever reason, have the sole and exclusive right to
															suspend or terminate the Service with prior written
															notification and provide reason for such termination or
															suspension. However, without prejudice to the foregoing,
															the eKurhuleni Municipality will not exercise its rights
															in terms of this clause without just cause.</p>

														<p>The user acknowledges and accepts that the
															eKurhuleni Municipality service may become unavailable
															from time-to-time due to various circumstances,
															including:
														<ul>
															<li>technical failure or problems with the
																eKurhuleni Municipality ;</li>
															<li>infrastructure or technical problems with third
																party information technology systems;</li>
															<li>unavailability of telecommunication or
																electricity services;</li>
															<li>or other circumstances beyond the control of the
																eKurhuleni Municipality.</li>
														</ul>
														</p>
														<strong> 10. No Warranties or Representations </strong> <br />
														<p>The Conditions of Use evidences the sole terms and
															conditions governing the Services.</p>
														<p>Users acknowledge and agree that any warranties,
															statements or representations of whatever nature and in
															whatever form, including promotional materials, granted
															or made by the eKurhuleni Municipality, its employees,
															agents or advisors which are not stated in the Conditions
															of Use shall not be valid and enforceable and Users shall
															not hold the eKurhuleni Municipality liable to any such
															warranty or representation, whether made prior to, during
															or after concluding the Conditions of Use.</p>
														<p>The eKurhuleni Municipality site and Service are
															provided "as is" and the eKurhuleni Municipality makes no
															express or implied representations or warranties with
															regard thereto. Without limiting the generality of the
															aforegoing:- o the eKurhuleni Municipality does not
															warrant that the website; its contents; the third party
															content and services; payment or the Municipal Services
															will be error free or will meet any particular criteria
															of accuracy, completeness or reliability of information,
															performance or quality. The eKurhuleni Municipality
															expressly disclaims all implied warranties, including,
															without limitation, warranties of merchantability, title,
															fitness for a particular purpose, non-infringement,
															compatibility, security and accuracy; and o whilst the
															eKurhuleni Municipality has taken reasonable measures to
															ensure the integrity of the Services, no warranty,
															whether express or implied is given that any files,
															downloads or applications available via the website are
															free of viruses or any other data or code which has the
															ability to corrupt or affect the operation of a user's
															system.</p>
														<strong> 11.Governing Law and Jurisdiction</strong> <br />
														<p>These conditions are governed by the laws of the
															Republic of South Africa.</p>
														<br />
													</div>

												</div>
											</div>
											<!-- / -->
											<!-- Legal Rules -->
											<div class="legal__rules" aria-expanded="false"
												aria-hidden="true"
												style="display: none; opacity: 0; filter: alpha(opacity = 0);">



												<div class="legal__rule is-required">
													<div class="toggle--checkbox">

														<label class="toggle__agree"> <input
															type="checkbox" class="checkbox" id="agree" name="agree" />
															<span class="control-indicator"></span> <span
															class="toggle__button">I agree to the terms and
																conditions</span>
														</label>

													</div>
												</div>

											</div>
											<div class="legal__actions">

												<div style="float: right;">
													<button type="button"
														class="btn btn-success | overlay--close" id="proceed">Continue</button>
												</div>
											</div>


										</div>

									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>




	</div>

	<div class="space-30">&nbsp;</div>

	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	<br /> <br /> <br /> <br />

	<jsp:include page="footer.jsp" />


	<!-- Handler for local scripts -->

	<script src="../Scripts/jquery.validate.min.js"></script>


	<script type="text/javascript">

        $(document).ready(function () {
            $('.validation-summary-errors > ul > li').each(function() {
                var thisObj = $(this);
                var html = thisObj.text().replace('{{TreasuryLink}}',
                    "<a href='https://secure.csd.gov.za/' target='_blank'><code>National Treasury's Central Supplier Database</code></a>");

                thisObj.html(html);
            });
        });

    </script>

	<script type="text/javascript">

        $(document).ready(function () {

            loadOverlay();
            legalTerms();
            legalRules();
            overlay();
            CheckValid();
        });

        function OnValidKeyPress(event) {
            debugger;
            var charCode = event.which;
            if ((charCode === 45 && charCode > 31) && (charCode < 48 || charCode > 57) || charCode === 69 || charCode === 190) {
                event.preventDefault();
                return false;
            }

            else {
                return true;
            }


        }

        function isNumber(evt) {
            evt = (evt) ? evt : window.event;
            var charCode = (evt.which) ? evt.which : evt.keyCode;
            if (charCode > 31 && (charCode < 48 || charCode > 57)) {
                evt.preventDefault();
                return false;
            }
            return true;
        }
   
        function legalTerms() {

            var totalLegalRules = $('.legal__rule').length;

            if ($('.legal').hasClass('is-expanded')) {
                $('.legal__rules').attr('aria-expanded', 'true').attr('aria-hidden', 'false').css('opacity', '1.0').show();
                $('.legal__terms').on('scroll', function () {
                    legalProgress();
                });
            } else {
                $('.legal__terms').on('scroll', function () {
                    
                    if ($(this).scrollTop() + $(this).innerHeight() >= (this.scrollHeight - 100)) {
                        $('.legal__rules')
                            .attr('aria-expanded', 'true')
                            .attr('aria-hidden', 'false')
                            .slideDown(100 * totalLegalRules)
                            .animate({
                                opacity: "1"
                            }, 175);
                    }

                    legalProgress();

                });
            }

        }

        function legalRules() {

            $(document).on('click', '.toggle--buttons .toggle__agree .checkbox', function () {

                if ($(this).prop('checked', true)) {

                    // Terms & Conditions - Required Buttons
                    $('.control-indicator').closest('.legal__rule').css('background', '#fff');
                }
            });
        }

        function legalProgress() {
            var legalTermsScrollHeight = $('.legal__terms-scroll').height() - $('.legal__terms').height();
            var legalTermsScrollTop = $('.legal__terms').scrollTop();
            var legalProgress = Math.max(0, Math.min(1, legalTermsScrollTop / legalTermsScrollHeight));
            $('.legal__progress').css({
                width: legalProgress * 100 + '%'
            });
        }

        function overlay() {

            $(document).on('click', '.overlay--close', function () {
                $('body').css('overflow', 'visible');
                $('.overlay > .container').fadeOut(400).animate({
                    marginTop: "-10px"
                }, 800);
                $('.overlay').fadeOut(200);
            });

        }

        function loadOverlay() {

            var onload = $('#browserFingerprint').val();
            if (onload == "clear") {

            }
            else {
                setTimeout(function () {
                    $('body').css('overflow', 'hidden');
                    $('.overlay').fadeIn(200);
                    $('.overlay > .container').fadeIn(3000).animate({
                        marginTop: "10px"
                    }, 800);
                }, 0);
            }
        }

        function CheckValid() {

            $('#proceed').hide();
            var $check = $('input[name ="agree"]');

            $check.change(function () {
                if ($('.control-indicator').closest('.legal__rule').hasClass('is-required')) {

                    var checked = $(this).prop('checked');
                    if (checked) {
                        $('#proceed').show();
                    }
                    else {
                        $('#proceed').hide();
                    }
                }
            });
        }

    </script>

	</body>
</html>


