<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>

</head>
<body>

<h1 align="center">
예약 게시판
</h1>
<table align="right" >
<tr >
<c:choose>
	<c:when test="${isLogOn == true && member != null}">
		<td><input type="button" name="write" value="글쓰기" onClick="location.href='/semi/view_requestReserve?ownerId=${ownerId }'"  />
		<input type="button" name="logout" value="로그아웃" onClick="location.href='/semi/logout'"  /></td>
	</c:when>
	<c:otherwise>
		<td><input type="button" name="join" value="회원가입" onClick="location.href='/semi/view_joinForm'"  />
		<input type="button" name="login" value="로그인" onClick="location.href='/semi/view_login'"  /></td>
	</c:otherwise>
</c:choose>
</tr><br><br>
</table>
<br/>
<br/>
<table align="center" border="1"  width="80%"  >
	<tr height="10" align="center"  bgcolor="lightgreen">
     <th >글번호</th>
     <th >작성자</th>              
     <th width= 450px >제목</th>
     <th >가게 이름</th>
     <th >작성일</th>
	</tr>
<c:forEach var="list" items="${list}">
	<tr height="10" align="center">
		<td name="articleNO" id="articleNO">${list.articleNO }</td>
		<td name="id" id="id">${list.id }</td>
		<td name="title" id="title"><a href="${contextPath}/view_article?articleNO=${list.articleNO}">${list.title }</a></td>
		<td name="ownerId" id="ownerId">${list.ownerId }</td>
		<td name="writeDate" id="writeDate">${list.writedate }</td>
	</tr>
	
</c:forEach>
</table>

</body>
</html>