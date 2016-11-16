<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
dir{
	border: 2px solid blue;
	width: 400px;
	height: 30px;
}


</style>
<body>
<h2>가입</h2>
	<dir>
		<form action="create" method="post">
			<input type="text" name='userid'> <input type="password"
				name='userpw'>
			<button>확인</button>
		</form>
	</dir>
</body>
</html>