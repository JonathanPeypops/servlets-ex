<%@ page import="java.util.List" %>
<%@ page import="be.vdab.Film" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>

    <c:forEach var="film" items="${films}">
        <c:choose>

            <c:when test="${empty film}">
               <tr><td>Film not found</td> </tr>
            </c:when>
            <c:otherwise>
              <tr><td> Film title: ${film.title} </td> </tr>

            </c:otherwise>
        </c:choose>
    </c:forEach>

    <%--<c:forEach var="film" items="${films}">--%>
    <%--<tr>--%>
    <%--<td>${film.title}</td>--%>
    <%--</tr>--%>
    <%--</c:forEach>--%>

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