<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calendar</title>
</head>
<form action="animalservlet" method="post">
    <tr>
        <td>Animal Name</td>
        <td><input name="name"/></td>
    </tr>
    <tr>
        <td>Animal Breed</td>
        <td><input name="breed"/></td>
    </tr>
    <tr>
        <td>Animal Gender</td>
        <td><input name="gender"/></td>
    </tr>
    <tr>
        <td>Animal Age</td>
        <td><input name="age"/></td>
    </tr>
    </table>
    <input type="submit"/>
</form>
</body>
</html>