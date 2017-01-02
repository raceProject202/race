<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<!-- Navigation -->
	
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<nav class="navlogo">
 	 <div class="container-fluid">
    <div class="navbar-header">
    </div>
     <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 회원가입</a></li>
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
				<a class="navbar-brand" id = "head" href="index.jsp">start</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class = "di">
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">하이브리드</a></li>
					<li><a href="#">산악바이크</a></li>
					<li><a href="#">픽시</a></li>
					<li><a href="#">전기바이크</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">악세사리/부품 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">1 Column Portfolio</a></li>
							<li><a href="#">2 Column Portfolio</a></li>
							<li><a href="#">3 Column Portfolio</a></li>
							<li><a href="#">4 Column Portfolio</a></li>
							<li><a href="#">Single Portfolio Item</a>
							</li>
						</ul></li>
				</ul>
			</div>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	
</body>

</html>