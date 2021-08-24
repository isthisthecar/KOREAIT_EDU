<%@page import="obj.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--Exception 발생 시 이동할 페이지 설정  -->
<%@ page errorPage="error.jsp" %>

<%
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	
	request.setAttribute("obj", new Person(name,age)); 
	//데이터 보내는것
	
	request.getRequestDispatcher("person_result.jsp").forward(request,response);
%>
