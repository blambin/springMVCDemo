<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
#css_table {
      display:table;
      margin: auto;
  }
.css_tr {
      display: table-row;
  }
.css_td {
      display: table-cell;
  }
</style>

<title>增加文章</title>
</head>
<body>
	<form action="addTopic.action" method="post">
		<div id="css_table" align="center">
			<div class="css_tr">
				<div class="css_td">标题</div>
				<div class="css_td">内容</div>
			</div>
			<div class="css_tr">
				<div class="css_td">
					<input type="text"  name="title"/>
				</div>
				<div class="css_td">
					<textarea rows="10" cols="20" name="content"></textarea>
				</div>
				<div class="css_td">
					<input type="submit" value="发表"/>
				</div>
			</div>
		</div>
	</form>
</body>
</html>