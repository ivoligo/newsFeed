<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h3>Новостная лента</h3>
<br>

<form:form action="add" modelAttribute="news">

    <form:hidden path="id"/>
    Название
    <form:input path="name"/>
    <br>
    Дата
    <form:input path="date"/>
    <br>
    Содержание
    <form:input path="content"/>
    <br>
    Категория
    <form:select path="category">
        <form:option value=""></form:option>
    </form:select>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>