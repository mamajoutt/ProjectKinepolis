<%-- 
    Document   : personeelWijzigen
    Created on : 22-jan-2015, 14:03:00
    Author     : 11627
--%>

<%@page import="BO.Personeel"%>
<%@page import="BO.Service.PersoneelServices"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="opmaak.css" rel="stylesheet" type="text/css"/>
        <title>Personeel wijzigen</title>
    </head>
    <body>
       <%@include file="StandaardHoofding.jsp"%>
       <%
           int personeelID = Integer.parseInt(request.getParameter("wijzigPersoneelID"));
           PersoneelServices ps = new PersoneelServices();
           Personeel p = ps.personeelOphalen(personeelID);
       %>
        <div id="div">
            <form id ="formulier" name="formulier" action="Wijzigen" method="post">
                <h1>Werknemer <%=p.getNaam()%> <%=p.getVoornaam()%> wijzigen:</h1>
                <p>Om een werknemer te wijzigen moet u onderstaande gegevens invullen.</p>
                <label><input type="hidden" name="personeelID" id="personeelID" value="<%=p.getPersoneelID()%>"/><span class="small"></span></label>
                <label>Gebruikersnaam: <span class="onderOmschrijving">Vul gebruikersnaam in.</span></label>
                <input type="text" name="Account" id="Account" value="<%=String.valueOf(p.getAccount())%>"/><br><br><br>
                <label>Paswoord: <span class="onderOmschrijving">Vul paswoord in.</span></label>
                <input type="password" name="Paswoord" id="Paswoord" value="<%=String.valueOf(p.getPaswoord())%>"/><br><br><br>
                <label>Functie: <span class="onderOmschrijving">Kies functie.</span></label>
                <select name="Functie" id="Functie" >
                    <option value="Balie" >Balie</option>
                    <option value="Beheerder">Beheerder</option>
                    <option value="Verantwoordelijke">Verantwoordelijke</option>
                </select><br><br><br>
                <label>Naam: <span class="onderOmschrijving">Vul naam in.</span></label>
                <input type="text" name="Naam" id="Naam" value="<%=String.valueOf(p.getNaam())%>"/><br><br><br>
                <label>Voornaam: <span class="onderOmschrijving">Vul voornaam in.</span></label>
                <input type="text" name="Voornaam" id="Voornaam" value="<%=String.valueOf(p.getVoornaam())%>"/><br><br><br>
                <label>GSM: <span class="onderOmschrijving">Vul GSM-nummer in.</span></label>
                <input type="text" name="GSM" id="GSM" value="<%=String.valueOf(p.getGsm())%>"/><br><br><br>
                <label>Email: <span class="onderOmschrijving">Vul email in.</span></label>
                <input type="text" name="Email" id="Email" value="<%=String.valueOf(p.getEmail())%>"/><br><br><br>
                <button type="submit">Wijziging opslagen</button>
                
            </form>
        </div>
        <div id="witRuimtes"></div>
    </body>
</html>
