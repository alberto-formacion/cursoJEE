<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<% if(request.getParameter("loginKO")!=null){ %>
		<div>
			El usuario o la contraseña son incorrectos
		</div>
	<%} %>
	<form action="login" method="post">
		<div>
			<label for="user">Usuario</label>
		</div>
		<div>
			<input type="text" name="user" id="user"/>
		</div>
		<div>
			<label for="pass">Contraseña</label>
		</div>
		<div>
			<input type="text" name="pass" id="pass"/>
		</div>
		<div>
			<input type="checkbox" name="recordar"/>Recordarme
		</div>
		<div>
			<button type="submit">Enviar</button>
		</div>
	</form>
</body>
</html>