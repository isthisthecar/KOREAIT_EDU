<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("req","request value");
		//세션 설정
		//세션 만료 시간 설정
		session.setMaxInactiveInterval(10);//초단위 30초 동안만 살려두겠다.
		session.setAttribute("session", "session value");
		
		//페이지 이동 -1 forward
		request.getRequestDispatcher("session_result.jsp").forward(request,response);
		
		//페이지 이동 -2 sendRedirect
		response.sendRedirect("session_result.jsp");
	%>
</body>
</html>