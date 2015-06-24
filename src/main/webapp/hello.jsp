<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style type="text/css">
        table tr td:first-child {
            background-color: darkblue;
            color: ghostwhite;
        }

        tr:first-child td:last-child {
            background-color: darkblue;
            color: ghostwhite;
        }

        body {
            background: url("1392191.jpg")
        }

        h1 {
            color: black;
            font-size: 2rem;
            font-family: fantasyt;
            text-align: center
        }

        table {
            border: 1px solid blue;
            position: fixed;
            top: 30px;
            right: 5px;
            font-size: 1rem;
            -webkit-box-sizing: content-box;
            -moz-box-sizing: content-box;
            box-sizing: content-box;
            color: black;
            -o-text-overflow: ellipsis;
            text-overflow: ellipsis;
            text-shadow: 2px 2px 2px rgba(0, 0, 255, 1);
            background-color: white
        }

        tr, td {
            border: 1px solid blue;
            text-align: center
        }

    </style>
</head>
<body>
<h1>Multiply</h1>
<table>
    <%

        for (int x = 1; x <= 10; x++) {
            out.println("<tr>");
            for (int y = 1; y <= 10; y++) {
                out.println("<td>" + x * y + "</td>");
            }
            out.println("</tr>");
        }
    %>
</table>
</body>
</html>
