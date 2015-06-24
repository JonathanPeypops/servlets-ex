<%@ page import="java.util.List" %>
<%@ page import="be.vdab.Film" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <c:forEach var="film" items="${fi}">
        <tr>
            <td>${film.title}</td>
        </tr>
    </c:forEach>

    <%--<% List<Film> fi = (List<Film>) request.getAttribute("films");--%>
        <%--for (Film film : fi) {--%>
            <%--out.println("<tr>");--%>
            <%--out.println("<td>" + film.getId() + "</td>");--%>
            <%--out.println("<td>" + film.getTitle() + "</td>");--%>
            <%--out.println("<td>" + film.getYear() + "</td>");--%>
            <%--out.println("<td>" + film.getDirector() + "</td>");--%>
            <%--out.println("</tr>");}--%>
    <%--%>--%>
</table>
</body>
</html>