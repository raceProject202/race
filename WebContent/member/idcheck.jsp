<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>아이디 중복 체크</title>
<link href="CSS/subpage.css" rel="stylesheet">
<style type="text/css">

#wrap {
	margin: 0 20px;
}

h1 {
	font-family: "Times New Roman", Times, serif;
	font-size: 45px;
	color: #000000;
	font-weight: bold;
	margin-left:1.5cm;
}
#inputt{
	border-radius:12px;
	padding:5px;
	margin-top:6px;
}

input[type=button], input[type=submit] {
	float: right;
}
.btn-defalut{
	height:30px;
}
b{
	margin-left:1cm;
}
#bid{
	padding:50px;
}
</style>
<script type="text/javascript">
	function idok() {
		opener.joinForm.id.value = "${id}";
		opener.joinForm.reid.value = "${id}";
		self.close();
	}
</script>
</head>
<body>
	<div id="wrap">
		<h1>ID 중복확인</h1><hr>
		<form method=post name=formm style="margin-right: 0"
			action="idCheckForm.do">
			<b>User ID</b> <input type=text name="id" value="" id = "inputt"> 
			 <input type="submit" class="btn btn-success" value="검색">
			<div style="margin-top: 20px">
				<c:if test="${message == 1}">
					<script type="text/javascript">
						opener.document.formm.id.value = "";
					</script>
		
        <b>${id}는 이미 사용중인 아이디입니다.</b>
      </c:if>
				<c:if test="${message==-1}">
        <b>${id}는 사용 가능한 ID입니다.</b>
       
        <!-- <input type="button" value="사용" class="cancel" onclick="idok()"> -->
        <input type="button" class="btn btn-success" value="사용" onclick="idok()">
				</c:if>
			</div>
		</form>
	</div>
</body>
</html>