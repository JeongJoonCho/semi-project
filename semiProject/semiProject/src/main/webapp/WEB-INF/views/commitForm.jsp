<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 확정</title>
<style type="text/css">
	table {
		border : solid 1px black;
		border-collapse : collapse;
		margin : 50px auto;
	}
	
	td {
		border : solid 1px black;
		border-collapse : collapse;
		padding-left: 6px;
	}
	
	th {
		height : 50px;
		font-size : 16px;
		border : solid 1px black;
		border-collapse : collapse;
		width : 150px;
	}
</style>
</head>
<body>
<h1 align="center">예약 확정</h1>
<form action="${contextPath}/commitFin" method="post">
<table>

	<tr><td>작성자</td><td colspan="2"><input style="border:none" type="text" name="id" value="${id }" readonly></td></tr>
	<tr><td>가게 이름</td><td colspan="2"><input style="border:none" type="text" name="ownerId" value="${ownerId }" readonly></td></tr>
	<tr><td name = "day">예약 요일</td>
		<td>
			<input type="radio" name="day" value="mon"> 월 <br>
			<input type="radio" name="day" value="tue"> 화 <br> 
			<input type="radio" name="day" value="wed"> 수 <br>
			<input type="radio" name="day" value="thu"> 목 <br>
			<input type="radio" name="day" value="fri"> 금 <br>
			<input type="radio" name="day" value="sat"> 토 <br>
			<input type="radio" name="day" value="sun"> 일 <br>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="확정" id="validate">
			<input type=button value="뒤로가기" onClick="history.back();" />
		</td>
	</tr>
</table>
</form>
</body>
</html>