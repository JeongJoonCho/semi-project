<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>Home</title>
</head>
<body>
<div>
	식당 예약 서비스
</div><br><br>
<div>
	<input style="float: center;  height: 50pt;" type="button" value="예약 서비스 이용하러 가기" onClick="location.href='/semi/ownerListForm'"  />
	<input style="float: center;  height: 50pt;" type="button" value="코코아 이용하러 가기" onClick="location.href='/cocoa/'"  />
</div>

</body>
</html>
