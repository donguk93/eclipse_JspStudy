<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>문자와 숫자를 입력</h3>
 <form method="post" name="repeat" action="/JspStudy/RepeatServlet2">
	반복할 문자열:<input type="text" name="msg"><br>
	반복할 숫 자:<input type="text" name="number"><br>
	<input type="submit" value="전송">
</form>
</body>
</html>