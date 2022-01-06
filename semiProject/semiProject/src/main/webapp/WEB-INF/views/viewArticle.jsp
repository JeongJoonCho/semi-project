<%@page import="java.util.ArrayList"%>
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
<title>예약내용</title>
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
<form action="${contextPath}/view_commitForm" method="post">
<h1 align="center">예약 내용</h1>
<table>

	<tr><th>글번호</th><td>${board.articleNO }</td></tr>
	<tr><th>작성 시간</th><td>${board.writedate }</td></tr>
	<tr><th>작성자</th><td><input type="text" style="border:none" name="id" value="${board.id }" readonly></td></tr>
	<tr><th>가게 이름</th><td><input type="text" style="border:none" name="ownerId" value="${board.ownerId }" readonly></td></tr>
	<tr><th>글제목</th><td>${board.title }</td></tr>
	<tr><th>글내용</th><td>${board.content}</td></tr>


<br/>
<br/>

<c:choose>
	<c:when test="${isLogOn == true && member.id == board.ownerId}">
	<tr>
		<td colspan="2">
			<input type="submit" value="예약확인" id="validate">
			<input type=button value="뒤로가기" onClick="history.back();" />
		</td>
	</tr>
	</c:when>
	<c:otherwise>
	<tr>
		<td colspan="2">
			<input type=button value="뒤로가기" onClick="history.back();" />
		</td>
	</tr>
	</c:otherwise>
</c:choose>
</table>
</form>
</body>
</html>