<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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
	<div>
		<form action="update" method="post">
			<input type="text" name='userid' value = '${vo.userid}' readonly="readonly"> 
			<input type="text" name='userpw' value = '${vo.userpw}'>
			<button>확인</button>
		</form>

	</div>

</body>
</html>