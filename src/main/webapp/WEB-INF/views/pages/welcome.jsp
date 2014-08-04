<!DOCTYPE html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>Gerer ma coloc - Login</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="author" content="Alvaro Trigo Lopez" />
		<meta name="description" content="fullPage full-screen navigation and sections control menu." />
		<meta name="keywords"  content="fullpage,jquery,demo,screen,fullscreen,navigation,control arrows, dots" />
		<meta name="Resource-type" content="Document" />
		
		<script type="text/javascript" src="resources/js/jquery.min.js"></script>
		<script type="text/javascript" src="resources/js/jquery.form.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$("#login").ajaxForm({
					type: 'post',
					dataType: 'json',
					success: function(result) {
						if (result.login == 'success') {
						    location.href="dashboard";
						} else {
							$(".error").remove();
				            $("#login").prepend("<div class='error'>Login Failed. Username or Password is incorrect.</div>");
						}
					},
					error: function() {
						$(".error").remove();
			            $("#login").prepend("<div class='error'>Login Failed. Username or Password is incorrect.</div>");
					}
				});
			});
		</script>
	</head>
	
	<body>
		<div id="fullpage">
			<div class="section " id="section0">
				<div class="intro">
					<h1>Login</h1>
					<form id="login" action="<c:url value="/login"/>">
						<input type="text" name="userName" title="Entrez votre e-mail" size="25" value="" placeholder="Email"/>
						<br/>
						<input type="password" name="password" title="Entrez votre mot de passe" size="25" value="" placeholder="Mot de passe"/>
						<input type="submit" value="Se connecter"/> <input type="submit" value="Mot de passe oublié"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>