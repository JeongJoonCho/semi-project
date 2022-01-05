<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style type="text/css">
	table {
		border : solid 1px black;
		border-collapse : collapse;
		margin : 50px auto;
	}
	
	td {
		border : solid 1px black;
		border-collapse : collapse;
	}
	
	th {
		height : 50px;
		font-size : 20px;
	}
</style>
</head>
<body>
<form action="${contextPath}/login" method="post" >
<table align="center">
		<tr><th colspan="2">Login</th></tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" id="id"></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="pwd" id="pwd"></td>		
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="로그인" id="validate">
				<input type="reset" value="다시입력">
				<input type=button value="뒤로가기" onClick="history.back();" />
			</td>
		</tr>
</table>
</form>
</body>
</html>