<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>

<form action="todo" method="post">
    <input type="hidden" name="action" value="add">
    <label>Add Todo:</label>
    <input type="text" name="description" required>
    <button type="submit">Add</button>
</form>

<h2>Todos:</h2>
<ul>
    <c:forEach var="todo" items="${todos}">
        <li>
                ${todo.description}
            <form action="todo" method="post" style="display:inline;">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="${todo.id}">
                <button type="submit">Delete</button>
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>
