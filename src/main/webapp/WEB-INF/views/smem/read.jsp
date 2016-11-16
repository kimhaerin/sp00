<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "../delete" method = 'POST'>
	<h2>view page</h2>
	<h2>아이디 : ${vo.userid}</h2>
	<h2>패스워드 : ${vo.userpw}</h2>
	<input type="hidden" value= '${vo.userid}' name='userid'>
	<button>삭제</button>
</form>
</body>
</html>