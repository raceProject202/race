<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath }/css/modern-business.css" rel="stylesheet" type="text/css">
<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath }/font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<style>
.navbar-brand{
	font-size:70px;
}
.btn-defalut {
	width: 100%;
	text-align: center;
}
.navlogo{
	height:50px;
}
.di{
	font-size:20px;
	font-weight:bold;
}
#copy{
	width:100%;
	text-align:center;
	}

</style>
<decorator:head/>
</head>
<div id="body">
    <div id="content">
<body>
	<!-- Navigation -->
	
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<nav class="navlogo">
 	 <div class="container-fluid">
    <div class="navbar-header">
    </div>
       <ul class="nav navbar-nav navbar-right">
        <li><a href="adminLoginForm.do"><span class="glyphicon glyphicon-log-in"></span> LOGOUT</a></li>
      </ul>
  </div>
 </nav>
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="ProdStart.do">RACE</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class = "di">
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="ProdStart.do">상품리스트</a></li>
					<li><a href="MemberAll.do">회원리스트</a></li>
					<li><a href="cartListAll.do">주문리스트</a></li>
					<li><a href="QnaStart.do">QnA리스트</a></li>
				</ul>
			</div>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	
	<div class="clear"></div>
    <div id="foot">
     </div>
</div>
    <br><br><br><br>
	<decorator:body/>
  <footer id="foot" style="margin-bottom:100px;">  
    <hr>
    <div id="copy">
  		 회사명 : xxxxxx  대표자 : 임종구 <br> E-Mail : stee90@naver.com <br>Tel : 042-222-8202 <br>Fax : 042-252-0678 사업자번호 : 306-82-05291
		 301-805 대전광역시 중구 중앙로 76 (대흥동,영민빌딩 2층)<br><br>
		 copyright © 대덕인재개발원. All Rights Reserved.
    </div>         
  </footer>
  </div>
  
  <!-- jQuery -->
	<script src="${pageContext.request.contextPath }/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
			interval : 5000
		//changes the speed
		})
	</script>
	
</body>
</html>