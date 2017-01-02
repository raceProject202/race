<%@page import="com.race.controller.CookieBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Modern Business - Start Bootstrap Template</title>
<script type="text/javascript">
 
   function go_view() {
      var theForm = document.frm;
      theForm.lgu.value = "1";
      theForm.action = "productForm.do";
      theForm.submit();
   }
</script>
</head>
<body>
   <form name="frm" method="post">
         <input type="hidden" name="lgu">
   </form>
   <header id="myCarousel" class="carousel slide">
      <!-- Indicators -->
      <ol class="carousel-indicators">
         <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
         <li data-target="#myCarousel" data-slide-to="1"></li>
         <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner">
         <div class="item active">
            <div class="fill" style="background-image: url('img/electric/carMain.png');"></div>
            <div class="carousel-caption">
            </div>
         </div>
         <div class="item">
            <div class="fill" style="background-image: url('img/fixi/carMain.jpg');"></div>
            <div class="carousel-caption">
            </div>
         </div>
         <div class="item">
            <div class="fill" style="background-image: url('img/hybrid/carMain.PNG');"></div>
            <div class="carousel-caption">
            </div>
         </div>
      </div>

      <!-- Controls -->
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">
         <span class="icon-prev"></span>
      </a> <a class="right carousel-control" href="#myCarousel"
         data-slide="next"> <span class="icon-next"></span>
      </a>

   </header>
   <!-- Page Content -->
   <div class="container">
      <!-- Portfolio Section -->
      <div class="row">
         <div class="col-lg-12">
            <h2 class="page-header">New Items</h2>
         </div>
         <div class="col-md-4 col-sm-6">
            <a href="productFixi.do"> <img
               class="img-responsive img-portfolio img-hover" src="img/fixi/fixi01.jpg"
               alt="">
            </a>
         </div>
         <div class="col-md-4 col-sm-6">
            <a href="productElectric.do"> <img
               class="img-responsive img-portfolio img-hover" src="img/electric/scgMain.png"
               alt="">
            </a>
         </div>
         <div class="col-md-4 col-sm-6">
            <a href="productHybrid.do"> <img
               class="img-responsive img-portfolio img-hover" src="img/hybrid/hybMain.png"
               alt="">
            </a>
         </div>
      </div>
      <!-- /.row -->

      <a href="#" onClick="go_view()" class="btn btn-defalut" role="button">VIEW
         COLLECTION</a>

   </div>
   <%
      CookieBox cookieBox = new CookieBox(request);   
      if(!cookieBox.exists("POPUP1")){   
   %>
      <%@ include file="/popup.jsp" %>
   <%  } %>
</body>

</html>
