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
<title>예약하기</title>
</head>
<body>
<h1 align="center">예약신청</h1>
<form action="${contextPath}/addRequest" method="post">
<table border="0" align="center">
	<tr>
		<td align="right">아이디: </td>
		<td colspan=2  align="left"><input type="text" size="20" maxlength="100" name="id" value="${member.id}" readonly/> </td>
	</tr>
	<tr>
		<td align="right">가게이름: </td>
		<td colspan="2"><input type="text" size="20" maxlength="100" name="ownerId" value="${ownerId}" readonly></td>
	</tr>
	<tr>
		<td align="right">제목: </td>
		<td colspan="2"><input type="text" size="67"  maxlength="500" name="title" /></td>
	</tr>
	<tr>
		<td align="right" valign="top"><br>내용: </td>
		<td colspan=2><textarea name="content" rows="10" cols="65" maxlength="4000"></textarea> </td>
	</tr>

	<tr>
		<td colspan="4"><div id="d_file"></div></td>
	</tr>
	<tr>
		<td align="right"> </td>
		<td colspan="2">
			<input type="submit" value="글쓰기" />
			<input type=button value="뒤로가기"onClick="history.back();" />
		</td>
	</tr>
</table>
</form>
</body>
</html>