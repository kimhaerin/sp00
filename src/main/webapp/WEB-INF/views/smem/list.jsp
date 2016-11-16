<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h2>list page</h2>

<style>
li {
	list-style: none;
	color: threedlightshadow;
}

a {
	color: orange;
}

ul {
	background-color: teal;
}
</style>

<body>
	<ul>
		<c:forEach items="${list}" var="vo">
			<li><a href="read/${vo.userid}">${vo.userid}</a>
				&nbsp;&nbsp;&nbsp; : &nbsp;&nbsp;&nbsp; ${vo.userpw}
		</c:forEach>
	</ul>

</body>

</html>