<%-- 
    Document   : persLijstTonen
    Created on : 22-jan-2015, 4:27:42
    Author     : Mohamed
--%>




<%@page import="java.util.List"%>
<%@page import="BO.Personeel"%>
<%@page import="BO.Service.PersoneelServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="opmaak.css" rel="stylesheet" type="text/css"/>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="//cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../src/java/javascript/initialiseerPersoneelTabel.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="//cdn.datatables.net/1.10.4/css/jquery.dataTables.css"></script>
        <script src="//cdn.datatables.net/1.10.4/js/jquery.dataTables.js"></script>
        <script src="//cdn.datatables.net/plug-ins/3cfcc339e89/integration/bootstrap/3/dataTables.bootstrap.js"></script>
        
        <script>
            $(document).ready(function){
            $('#dataPersoneel').dataTable();
            });
        </script>
        <title>Personeelslijst</title>
    </head>
    <body>
        <%@include file="StandaardHoofding.jsp"%>
        <div>
            <table id="dataPersoneel" class="table table-striped table-bordered" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>PersoneelID</th>
                        <th>Gebruikersnaam</th>
                        <th>Paswoord</th>
                        <th>Functie</th>
                        <th>Naam</th>
                        <th>Voornaam</th>
                        <th>GSM</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                      PersoneelServices ps = new PersoneelServices();
                      List<Personeel> personeelsLijst = ps.personeelLijstOphalen();
                      for(Personeel p : personeelsLijst){
                    %>
                    <tr>
                        <td><%=String.valueOf(p.getPersoneelID())%></td>
                        <td><%=String.valueOf(p.getAccount())%></td>
                        <td><%=String.valueOf(p.getPaswoord())%></td>
                        <td><%=String.valueOf(p.getFunctie())%></td>
                        <td><%=String.valueOf(p.getNaam())%></td>
                        <td><%=String.valueOf(p.getVoornaam())%></td>
                        <td><%=String.valueOf(p.getGsm())%></td>
                        <td><%=String.valueOf(p.getEmail())%></td>
                        <td style="border: none;">
                            <div>
                                <form method="post" action="personeelWijzigen.jsp">
                                    <input type="hidden" id="wijzigPersoneelID" name="wijzigPersoneelID" value="<%=String.valueOf(p.getPersoneelID())%>"/>
                                    <input type="submit" value="Wijzig"/>
                                </form>
                            </div>
                        </td>
                        <td style="border: none;">
                            <div>
                                <form method="post" action="Verwijderen">
                                    <input type="hidden" id="verwijderPersoneelID" name="verwijderPersoneelID" value="<%=String.valueOf(p.getPersoneelID())%>"/>
                                    <input type="submit" value="Verwijder"/>
                                </form>
                            </div>
                        </td>
                    </tr>
                    <%
                      }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
