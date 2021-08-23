<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>펜션</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<style>
* {
	margin: 0;
	padding: 0;
}

.flex_container {
	display: flex;
	flex-direction: column;
	width: 1200px;
	margin: 0 auto;
	font-size: 0px;
}

#member_bar {
	height: 50px;
	background-color: #e9e9e9;
	text-align: right;
}

#member_bar img {
	width: 50px;
	float: left;
}

#member_bar>div>p {
	width: 200px;
	float: left;
	font-size: 16px;
	text-align: left;
	padding-left: 5px;
	margin-top: 2px;
}

#member_bar>div {
	width: 300px;
	display: inline-block;
}

nav {
	padding: 20px 100px;
	background-color: #e9e9e9;
}

nav ul {
	list-style-type: none;
	display: flex;
	flex-direction: row;
	justify-content: space-around;
}

nav a:link, nav a:visited {
	font-size: 20px;
	font-weight: bold;
	text-decoration: none;
	color: black;
}

.ad_img {
	position: relative;
}

.ad_img button {
	background: none;
	border: none;
	position: absolute;
	background-color: rgba(255, 255, 255, 0.5);
	border-radius: 25px;
	width: 50px;
}

.ad_img button img {
	width: 50px;
}

.ad_img>img:last-of-type {
	width: 100%;
	height: 500px;
}

.left_arrow {
	top: calc(50% - 50px);
}

.right_arrow {
	top: calc(50% - 50px);
	right: 50px;
}

section {
	margin-top: 40px;
	display: flex;
	flex-direction: row;
	justify-content: space-around;
}

section h2 {
	font-size: 24px;
	margin-bottom: 20px;
	text-align: center;
}

section table {
	width: 100%;
	border-collapse: collapse;
	font-size: 16px;
	text-align: center;
}

section table td, section table th {
	padding: 7px 20px;
	border-top: 1px solid #e9e9e9;
	border-bottom: 1px solid #e9e9e9;
}

article {
	width: 400px;
}

footer {
	margin-top: 50px;
	padding: 30px 0px;
	font-size: 16px;
	background-color: #e9e9e9;
}

footer ul {
	list-style-type: none;
}

footer ul li {
	margin: 5px 0px;
}
</style>
</head>

<body>
	<div class="flex_container">
		<jsp:include page="template/pheader.jsp"></jsp:include>

		<section>
			<article>
				<h2>공지사항</h2>
				<table>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
					<tr>
						<th>4</th>
						<th>제목4</th>
						<th>2021.07.26</th>
						<th>23</th>
					</tr>
					<tr>
						<th>3</th>
						<th>제목3</th>
						<th>2021.07.25</th>
						<th>33</th>
					</tr>
					<tr>
						<th>2</th>
						<th>제목2</th>
						<th>2021.07.24</th>
						<th>43</th>
					</tr>
					<tr>
						<th>1</th>
						<th>제목1</th>
						<th>2021.07.23</th>
						<th>53</th>
					</tr>
				</table>
			</article>
			<article>
				<h2>이벤트</h2>
				<table>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
					<tr>
						<th>4</th>
						<th>제목4</th>
						<th>2021.07.26</th>
						<th>23</th>
					</tr>
					<tr>
						<th>3</th>
						<th>제목3</th>
						<th>2021.07.25</th>
						<th>33</th>
					</tr>
					<tr>
						<th>2</th>
						<th>제목2</th>
						<th>2021.07.24</th>
						<th>43</th>
					</tr>
					<tr>
						<th>1</th>
						<th>제목1</th>
						<th>2021.07.23</th>
						<th>53</th>
					</tr>
				</table>
			</article>
		</section>
		<jsp:include page="template/pfooter.jsp"></jsp:include>
	</div>
</body>

</html>