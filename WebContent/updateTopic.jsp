<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
<form action="updateTopic.action" method="post">
    <input type="text" readonly="readonly" name="id" value="${topic.id}">
    <input type="text" name="title" value="${topic.title}"/>
    <input type="text" name="content" value="${topic.content}"/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>