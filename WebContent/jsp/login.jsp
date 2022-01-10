<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title><s:text name="scm.project.title" /></title>
<link href="../Content/SignUp.css" rel="stylesheet" />
</head>

<div class="container" id="container">
	<div class="form-container sign-in-container">
		<div>
			<s:form action="../Account/goLogin" class="form-horizontal"
				id="loginForm" method="post" role="form">
				<input name="__RequestVerificationToken" type="hidden"
					value="FaLreN-MGli8Y8EwuXmjxszvWD3Oka5J5M1tAeibeI6ERPHRljFKqHdVgP7lOGpx5K-Z3btI9Pu3sFPz_G7DaX9nENmhe1r9pL10ORtKcmU1" />
				<h1 id="sign">
					<s:text name="scm.signin" />
				</h1>
				<br />
				<span><s:text name="scm.register.info" /></span>
				<input type="text" placeholder="example@gmail.com"
					title="Please enter you email" required="" value="" name="email"
					id="Email">
				<input type="password" title="Please enter your password"
					placeholder="******" required="" value="" name="password"
					id="Password" class="form-control">
				<a href="#"><s:text name="scm.forgot.password" /></a>
				<button type="submit">
					<s:text name="scm.signin" />
				</button>
			</s:form>
		</div>
	</div>
	<div class="overlay-container">
		<div class="overlay">

			<div class="overlay-panel overlay-right">
				<h1>
					<s:text name="scm.welcome.back" />
				</h1>
				<p class="text-center">
					<s:text name="scm.login.info" />
				</p>
				<div class="row">
					<button class="ghost" id="signUpHome"
						onclick="location.href = '../Account/Register'">
						<s:text name="scm.login.register" />
					</button>
					<br /> <br />
					<button class="ghost" id="signUpHome"
						onclick="location.href = '../'">
						<s:text name="scm.login.go.home" />
					</button>
				</div>

			</div>
		</div>
	</div>
</div>