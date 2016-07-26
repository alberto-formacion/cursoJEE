<%@page import="com.ipartek.gestionAlumnos.vo.Curso"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de cursos</title>
</head>
<body>
	<%@include file="../includes/header.jsp" %>
	
	<%ArrayList<Curso> cursos = ((Alumno)request.getSession().getAttribute("alumno")).getCursos(); %>
	
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Duracion</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<%for(Curso c : cursos){ %>
				<tr>
					<td><%=c.getNombre() %></td>
					<td><%=c.getDuracion() %></td>
					<td><a href="../curso?id=<%=c.getId()%>">mas info</a></td>
				</tr>
			<%} %>
		</tbody>
	</table>
	
	<%@include file="../includes/footer.jsp" %>
</body>
</html>