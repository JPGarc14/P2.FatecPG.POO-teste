<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="p1.poo.fatecpg.ads.noite.Disciplinas" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P2 POO Fatec PG</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        <h1>Página Inicial</h1>
        <p>Nome: João Paulo Garcia Silva</p>
        <p>RA:1290481913021</p>
        <p>Disciplinas Matriculadas: <%=Disciplinas.getList().size()%></p>
    </body>
</html>