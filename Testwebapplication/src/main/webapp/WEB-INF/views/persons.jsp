<%-- 
    Document   : persons
    Created on : 29.6.2013, 19:07:09
    Author     : Scorpion
--%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Persons</h1>
        <table cellpadding="5"> 
            <tr style="background-color:lightgoldenrodyellow">
            <th>First Name:${person.firstname}</th>
            <th>&nbsp;</th>
            <th>Last Name:${person.lastname}</th>
            <th>&nbsp;</th>
        </tr>
        </table>
    </body>
</html>
