<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form id="login-form" action="authenticateUser" method="post">
			<h3>Log In</h3>
			<span class="form-field-span"> <label id="username-label"
				class="form-label" for="username">Username</label> <input
				id="username" class="form-input" type="text" name="username" />
			</span> 
			<span class="form-field-span"> <label id="password-label"
				class="form-label" for="password">Password</label> <input
				id="password" class="form-input" type="password" name="password" />
			</span> <span class="form-field-span">
				<button id="form-submit-btn" type="submit">Login</button>
			</span>
		</form>
	</div>


</body>

</html>