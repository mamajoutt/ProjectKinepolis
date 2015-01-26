<%-- 
    Document   : StandaardHoofding
    Created on : 22-jan-2015, 4:21:41
    Author     : Mohamed
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kinepolis Antwerpen</title>
    </head>
    <body>
    <center>
        <div id="hoofding" style="border: none;">
            <h1>Welkom <%=session.getAttribute("account")%> op de webapplicatie van Kinepolis!</h1>
            <p>
                <%=new Date()%><br> <br>
            <a href="persLijstTonen.jsp">Personeelslijst</a><br>
            <a href="personeelToevoegen.jsp">Personeel toevoegen</a><br>
            
            
            </p>
        </div>
    </center>
    </body>
</html>
