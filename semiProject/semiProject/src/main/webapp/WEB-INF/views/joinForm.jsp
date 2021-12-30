<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
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
<title>회원가입</title>
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
<form action="${contextPath}/addMember" method="post">
	<table align="center">
		<tr><th colspan="2">회원가입</th></tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" id="id"></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="pwd" id="pwd"></td>
			
		</tr>
		<tr>
			<td>(가게)이름</td>
			<td><input type="text" name="name" id="name"></td>
			
		</tr>
		<tr>
			<td>종목</td>
			<td><textarea rows="5" cols="30" name="contents" id="contents"></textarea>
			</td>
			
		</tr>
		<tr>
			<td>가게or손님</td>
			<td>
				<select name="store" id="store">
					<option>--선택--</option>
					<option>가게</option>
					<option>손님</option>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="가입" id="validate"><input type="reset" value="다시입력"></td>
			
		</tr>
	</table>
	</form>
</body>
</html>