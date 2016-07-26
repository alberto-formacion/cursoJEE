<%@page import="com.ipartek.gestionAlumnos.vo.Curso"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detalle curso</title>
</head>
<body>
	<%Curso c = (Curso) session.getAttribute("curso"); %>
	<%@include file="../includes/header.jsp" %>
	<div>Datos del curso</div>
	<div>Nombre: <%=c.getNombre() %></div>
	<div>Descripcion:<%=c.getDescripcion() %></div>
	<div>Duracion:<%=c.getDuracion() %>h</div>
	<%@include file="../includes/footer.jsp" %>
</body>
</html>