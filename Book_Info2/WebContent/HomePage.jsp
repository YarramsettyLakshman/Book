<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<body  bgcolor=green text=white>
<h1 align="center">Welcome to HomePage
<br><br><br>
<a href="AddBook.jsp"><button type="button">AddBook</button></a>
<form action="SearchBookServlet.com" method="post">
<h1>ID : <input type="text" name="ID"></h1>
<input type="submit" value="SearchBook">
</form>
<form action="DeleteBookServlet.com" method="post">
<h1>ID : <input type="text" name="ID1"></h1>
<input type="submit" value="DeleteBook">
</form>
</h1>
</body>
</html>