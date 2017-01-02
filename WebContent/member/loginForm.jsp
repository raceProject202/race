<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div id="login">
		<form id="login_form" action="login.do" name="loginForm">
			
			<div class="field_container">
				<input type="text" placeholder="ID" name="id">
			</div>
			<div class="field_container">
				<input type="Password" placeholder="Password" name="password">
				<button id="sign_in_button">
					<span class="button_text">Sign In</span>
				</button>
			</div>

			<div id="sign_in_options" class="field_container">
				<div id="sign_in_alternatives_container">
					<span id="google_sign_in_option">or you can <a href="#"
						id="google_sign_in" class="login_link">sign in with Google</a></span> <span
						id="password_sign_in_option">or you can <a href="#"
						id="password_sign_in" class="login_link">sign in using a
							password</a></span>
				</div>
				<div id="remember_me_container">
					<input name="user[remember_me]" type="hidden" value="0"><input
						id="user_remember_me" name="user[remember_me]" type="checkbox"
						value="1"> <label class="login_link"
						for="user_remember_me" id="remember_me_label">stay signed
						in</label>
				</div>
				<div class="clearfix"></div>
			</div>
		</form>
	</div>


</body>
</html>
