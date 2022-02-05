<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Owner List</title>

</head>
<body>
<table align="right" >
	<tr >
		<c:choose>
			<c:when test="${isLogOn == true && member != null}">
				<td>
					<input type="button" name="logout" value="로그아웃" onClick="location.href='/semi/logout'"  />
				</td>
			</c:when>
			<c:otherwise>
				<td>
					<input type="button" name="join" value="회원가입" onClick="location.href='/semi/view_joinForm'"  />
			   		<input type="button" name="login" value="로그인" onClick="location.href='/semi/view_login'"  />
			   	</td>
			</c:otherwise>
		</c:choose>
	</tr>
</table><br><br>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="lightgray">
      <th>가게이름</th>
      <th>종목</th>
      <th>월</th>
      <th>화</th>
      <th>수</th>
      <th>목</th>
      <th>금</th>
      <th>토</th>
      <th>일</th> 
   </tr>
   
	<c:forEach var="owner" items="${ownersList}" >
	   	<tr align="center">
	   		<td><a href="${contextPath}/boardList?ownerId=${owner.id}">${owner.name}</a></td>
	   		<td>${owner.contents}</td>
	   		<td><a href="${contextPath}/view_board">${owner.mon}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.tue}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.wed}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.thu}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.fri}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.sat}</a></td>
	   		<td><a href="${contextPath}/view_board">${owner.sun}</a></td>
	   	</tr>
	</c:forEach>
</table>
</body>
</html>