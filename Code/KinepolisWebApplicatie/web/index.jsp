<%-- 
    Document   : index
    Created on : 26-jan-2015, 10:06:23
    Author     : Mohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inloggen op Kinepolis</title>
    </head>
    <body>
        <form action="Login" method="post">
            <fieldset style="width: 300px">
                <legend>INLOGGEN</legend>
                <table>
                    <tr>
                        <td>Gebruikersnaam: </td>
                        <td><input type="text" name="account" required="required"/></td>
                    </tr>
                    <tr>
                        <td>Paswoord: </td>
                        <td><input type="password" name="paswoord" required="required"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Login"/></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
