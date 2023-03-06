<%-- 
    Document   : login
    Created on : Feb 28, 2023, 3:45:13 PM
    Author     : Ducbui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <section>  
            <h1>Đăng nhập</h1>
            <form method="post" action="Login_Servlet">
                Email: <input type="text" name="email" value="trongtruong@gmail.com"><br>
                Mật khẩu: <input type="password" name="password" value="1111"><br>
                <!--<input type="submit" value="Đăng nhập">-->
                <button type="submit" value="login">Đăng nhập</button>
            </form>
        </section>
    </body>
</html>
