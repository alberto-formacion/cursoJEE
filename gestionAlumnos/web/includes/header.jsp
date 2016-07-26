<%@page import="com.ipartek.gestionAlumnos.vo.Alumno"%>
<div>
	Hola, <%= ((Alumno)request.getSession().getAttribute("alumno")).getNombre() %>
</div>