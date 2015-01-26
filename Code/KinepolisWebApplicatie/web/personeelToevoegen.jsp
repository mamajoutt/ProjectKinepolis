<%-- 
    Document   : personeelToevoegen
    Created on : 22-jan-2015, 4:30:40
    Author     : Mohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="opmaak.css" rel="stylesheet" type="text/css"/>
        <title>Personeel toevoegen</title>
    </head>
    <body>
        <%@include file="StandaardHoofding.jsp"%>
        <div id="div">
            <form id ="formulier" name="formulier" action="Toevoegen" method="post">
                <h1>Nieuwe werknemer</h1>
                <p>Om een nieuwe werknemer toe te voegen moet u onderstaande gegevens invullen.</p>
                
                <label>Gebruikersnaam: <span class="onderOmschrijving">Vul gebruikersnaam in.</span></label>
                <input type="text" name="Account" id="Account"/><br><br><br>
                <label>Paswoord: <span class="onderOmschrijving">Vul paswoord in.</span></label>
                <input type="password" name="Paswoord" id="Paswoord"/><br><br><br>
                <label>Functie: <span class="onderOmschrijving">Kies functie.</span></label>
                <select name="Functie" id="Functie">
                    <option value="Balie">Balie</option>
                    <option value="Beheerder">Beheerder</option>
                    <option value="Verantwoordelijke">Verantwoordelijke</option>
                </select><br><br><br>
                <label>Naam: <span class="onderOmschrijving">Vul naam in.</span></label>
                <input type="text" name="Naam" id="Naam"/><br><br><br>
                <label>Voornaam: <span class="onderOmschrijving">Vul voornaam in.</span></label>
                <input type="text" name="Voornaam" id="Voornaam"/><br><br><br>
                <label>GSM: <span class="onderOmschrijving">Vul GSM-nummer in.</span></label>
                <input type="text" name="GSM" id="GSM"/><br><br><br>
                <label>Email: <span class="onderOmschrijving">Vul email in.</span></label>
                <input type="text" name="Email" id="Email"/><br><br><br>
                <button type="submit">Opslagen</button>
                
            </form>
        </div>
        <div id="witRuimtes"></div>
    </body>
</html>
