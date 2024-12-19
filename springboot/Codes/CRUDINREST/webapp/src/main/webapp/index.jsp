<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>This is my welcome messages</h1>
    <form action="addUser">
    Enter ID : <input type="text" name="id"><br>
    Enter UName : <input type="text" name="username"> <br><br>
    <input type="submit">
    </form>

    <br><br>
    <form action="getUser">
        Enter ID : <input type="text" name="id"><br>
        <br>
        <input type="submit">
        </form>

     <form action="deleteUser">
             Enter ID : <input type="text" name="id"><br>
             <br>
             <input type="submit">
             </form>
</body>
</html>