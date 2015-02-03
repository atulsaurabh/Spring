<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style type="text/css">
            .error
            {
                color: red
            }
        </style>
    </head>

    <body>
        <form:form action="login.htm" method="post" id="testform" name="testform" commandName="user">
            <b>Name:</b><input type="text" name="uname"/>:::<form:errors path="uname"  cssClass="error" element="label"/><br>
            <b>Password:</b><input type="password" name="upass"/>:::<form:errors path="upass" cssClass="error"/><br>
            <button type="submit">Go</button>
        </form:form>
    </body>
</html>
