<%@page import="com.race.dto.RaceProdVo"%>
<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	RaceProdVo  vo = (RaceProdVo)request.getAttribute("ProdVo");
	System.out.println(vo);
	String str = null;
	String str1 = null;
	String str2 = null;
	int x = vo.getProd_image1().indexOf(".");
	str1 = vo.getProd_image1().substring(0, x);
	str2 = vo.getProd_image1().substring(x);
	
%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Portfolio Item - Start Bootstrap Template</title>

</head>

<body>



	<!-- Page Content -->
	<div class="container">
		<br>
		<!-- Portfolio Item Heading -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">${ LprodVo.lprod_nm }
					<small>${ ProdVo.prod_name }</small>
				</h1>
			</div>
		</div>
		<!-- /.row -->

		<!-- Portfolio Item Row -->
		<div class="row">

			<div class="col-md-8">
				<img class="img-responsive" src="img/${ ProdVo.prod_image1 }" alt="">
			</div>

			<div class="col-md-4">
				<h3>Project Description</h3>
				<p>${ ProdVo.prod_cn }</p>
				<h3>Project Details</h3>
				<ul>
					<li>Lorem Ipsum</li>
					<li>Dolor Sit Amet</li>
					<li>Consectetur</li>
					<li>Adipiscing Elit</li>
				</ul>
			</div>
			<label> 가 격 : </label> <span>${ProdVo.prod_price} 원</span> <label>
				수 량 : </label> <input type="text" name="quantity" size="2"
				value="${ ProdVo.prod_qty }"><br>
			<br>
			<div id="buttons">
				<a class="btn icon-btn btn-success" href="#"> <span
					class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>
					장바구니에 담기
				</a> <a class="btn icon-btn btn-info" href="#"> <span
					class="glyphicon btn-glyphicon glyphicon-share img-circle text-info"></span>
					바로구매
				</a>

			</div>

		</div>
		<!-- /.row -->

		<!-- Related Projects Row -->
		<div class="row">

			<div class="col-lg-12">
				<h3 class="page-header">Related Projects</h3>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-1<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-1<%=str2 %>" alt="">
				</a>
			</div>

<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-2<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-2<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-3<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-3<%=str2 %>" alt="">
				</a>
			</div>
			
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-4<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-4<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-5<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-5<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-6<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-6<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-7<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-7<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/<%=str1 %>-8<%=str2 %>', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/<%=str1 %>-8<%=str2 %>" alt="">
				</a>
			</div>
			<div class="col-sm-3 col-xs-6">
				<a href="#"
					onClick="window.open('img/electric/alton7.png', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
					<img class="img-responsive portfolio-item"
					src="img/electric/alton7.png" alt="">
				</a>
			</div>

		</div>
		<!-- /.row -->


	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>




</body>

</html>
