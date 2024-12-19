<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>First springBoot</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
    <form action="addUser">
    <h1>User Detail entry</h1>
    ID : <input type="text" name="id"><br> <br>
    USERNAME : <input type="text" name="username">
    <input type="submit">
    </form>
    <br>


    <form action="getUser">
    <h2>Get user By Id</h2>
        Enter ID : <input type="text" name="id"><br> <br>
        <input type="submit">
        </form>

    <form action="deleteUser">
        <h2>Get user By Id</h2>
            Enter ID : <input type="text" name="id"><br> <br>
            <input type="submit">
            </form>
    <form action="editUser">
            <h2>Get user By Id</h2>
                Enter ID : <input type="text" name="id"><br> <br>
                <input type="submit">
                </form>
</body>
</html>