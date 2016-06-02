<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
#css_table {
	display: table;
	margin: auto;
}

.css_tr {
	display: table-row;
}

.css_td {
	display: table-cell;
}
</style>
<title>文章列表</title>
</head>
<body>
	<div>欢迎你: ${user.nick}</div>
	<form action="deleteTopics.action">
		<div id="css_table" align="center">
			<div class="css_tr">
				<div class="css_td">编号</div>
				<div class="css_td">标题</div>
				<div class="css_td">内容</div>
				<div class="css_td">操作</div>
			</div>

			<c:choose>
				<c:when test="${not empty list}">

					<c:forEach var="topic" items="${list }">
						<div class="css_tr">
							<div class="css_td">${topic.id }
								<input type="checkbox" value="${topic.id }" name="ids" />
							</div>
							<div class="css_td">${topic.title }</div>
							<div class="css_td">${topic.content }</div>
							<div class="css_td">
								<a href="queryTopicById.action?id=${topic.id }">修改</a> <a
									href="deleteTopic.action?id=${topic.id }">删除</a>
							</div>
						</div>
					</c:forEach>

				</c:when>
				<c:otherwise>
					<div class="css_tr">并没有什么文章....</div>
				</c:otherwise>
			</c:choose>
			<div class="css_tr">
				<div class="css_td">
					<a href="addTopic.jsp">添加文章</a>
				</div>
				<div class="css_td">
					<input type="submit" value="批量删除" />
				</div>

			</div>

		</div>
	</form>
</body>
</html>