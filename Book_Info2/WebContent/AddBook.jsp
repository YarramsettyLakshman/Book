<!DOCTYPE html>
<html>
<head>
<style>
table{
border: 1px solid green;
align : center;
}
.Hending{
margin-left:50%;
}
.button{
background-color:green;
margin-left:500px;
margin-top:3vmin;
padding:8px 13px;
}
.button1{
background-color:blue;
margin-left:80px;
margin-top:3vmin;
padding:8px 13px;}

input{
border-radius : 10px;
text-align : center;}
</style>
<title>AddBook</title>
</head>
<body  text=black>
<form action="AddBookServlet.com" method="post">
<h1 class="Hending">Welcome to AddBook</h1>
<br><br>
<table align="center">
<tr><td>ID</td><td>         <input type="text" name="ID"></td></tr>
<tr><td>NAME</td> <td>      <input type="text" placeholder="Name" name="NAME"></td></tr>
<tr><td>AUTHOR</td><td>     <input type="text" placeholder="Author" name="AUTHOR"></td></tr>
<tr><td>PUBLISHED</td><td>  <input type="text" placeholder="Published"  name="PUBLISHED"></td></tr>
<tr><td>PAGES</td><td>      <input type="text" placeholder="Pages" name="PAGES"></td></tr>
</table>
<button class="button">Save</button>
<a href="HomePage.jsp"><button type="button" class="button1">HOME</button></a>

</form>
</body>
</html>