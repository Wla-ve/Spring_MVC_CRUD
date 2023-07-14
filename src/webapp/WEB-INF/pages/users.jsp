<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Users </h2>
<br>

<table>
    <tr>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Age</th>
    </tr>
    <c:forEach var="us" items="${users}">
        <c:url value="updateInfo" var="updateButton">
            <c:param name="usId" value="${us.id}"/>
        </c:url>

        <c:url value="deleteUser" var="deleteButton">
            <c:param name="usId" value="${us.id}"/>
        </c:url>
        <tr>
            <td>${us.name}</td>
            <td>${us.lastName}</td>
            <td>${us.age}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href = '${updateButton}'"/>

                <input type="button" value="Delete"
                       onclick="window.location.href = '${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>

<input type="button" value="Add"
       onclick="window.location.href = 'addNewUser'"/>
</body>
</html>