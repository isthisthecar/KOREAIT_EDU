<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--Person에 등록할 정보를 person.jsp에서 입력을 받아서 person_process.jsp로 전송 
	Person_process.jsp에서는 받은 이름과 나이를 Person 객체를 생성해서 request에 저장
	키값은 obj에 저장 후 person_result.jsp로 이동
	
	person_result.jsp에서는 저장되어 있는 Person 객체를 읽어와서 이름과 나이를 출력-->

	<h2>사람 정보</h2>
	<form action="person_process.jsp" method="get">
		<input type="text" name="name" placeholder="이름을 입력하세요"><br>
		<input type="number" name="age" placeholder="나이를 입력하세요"><br>
		<button>사람정보 전송</button>
	</form>
</body>
</html>