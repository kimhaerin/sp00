<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
div {
	color: orange;
	background-color: teal;
	height: 100%;
}
</style>
<body>
	<h2>view page</h2>
	<form action="../delete" method='POST'>

		<div>
			<h2>아이디 : ${vo.userid}</h2>
			<h2>패스워드 : ${vo.userpw}</h2>
			<input type="hidden" value='${vo.userid}' name='userid'>
		</div>
		<button>삭제</button>
		
	</form>
	<form action="../updateAction" method='POST'>
	<input type="hidden" value='${vo.userid}' name='userid'>
	<input type="hidden" value='${vo.userpw}' name='userpw'>
	<button>수정</button></form>
	</div>
</body>
</html>