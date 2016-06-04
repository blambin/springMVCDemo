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
.css_th{
    display: table-header-group;
}

.css_tr {
	display: table-row;
}

.css_td {
	display: table-cell;
}
</style>
<title>论坛 - 注册</title>
</head>
<body>
	<form action="register.action" method="post" enctype="multipart/form-data">
	    <h4 align="center">用户注册向导</h4>
	    <center>${msg}</center>
		<div id="css_table" align="center">
			<div class="css_tr">
				<div class="css_td">登陆用户名:</div>
				<div class="css_td">
					<input type="text" name="userName" />
				</div>
			</div>
			<div class="css_tr">
				<div class="css_td">密码:</div>
				<div class="css_td">
					<input type="password" name="password" />
				</div>
			</div>
			<div class="css_tr">
				<div class="css_td">重复密码:</div>
				<div class="css_td">
					<input type="password" />
				</div>
			</div>
			<div class="css_tr">
				<div class="css_td">你的昵称:</div>
				<div class="css_td">
					<input type="text" name="nick" />
				</div>
			</div>
			<div class="css_tr">
				<div class="css_td">你的头像:</div>
				<div class="css_td">
					<input type="file" name="photo" />
				</div>
			</div>
			<div class="css_tr">
				<div class="css_td"></div>
				<div class="css_td">
					<input type="submit" value="注册" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>