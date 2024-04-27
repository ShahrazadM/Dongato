<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.List" %>   
<%@ page import ="basedatitos.Clientes"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de Capacitacion</h1>
<%
	List <Clientes>listaCapacitacion = (List) request.getSession().getAttribute("listarcapacitacion");
	int cont = 1;
	for (Clientes usu: listaCapacitacion){
%>
<p><b>Cliente N°<%=cont%></b></p>
<p><b>Nombre <%=usu.getNombre()%></b></p>
<p><b>Apellidos <%=usu.getApellidos()%></b></p>
<p><b>Direccion <%=usu.getDireccion()%></b></p>
<p>...................................</p>
<%cont = cont = + 1 ; %>
<%} %>
</body>
</html>