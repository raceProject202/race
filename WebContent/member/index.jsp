<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Modern Business - Start Bootstrap Template</title>
</head>
<body>

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
				<div class="fill" style="background-image: url('img/electric/filamain1.png');"></div>
				<div class="carousel-caption">
					<h2>Caption 1</h2>
				</div>
			</div>
			<div class="item">
				<div class="fill" style="background-image: url('img/hybrid/s3.png');"></div>
				<div class="carousel-caption">
				</div>
			</div>
			<div class="item">
				<div class="fill" style="background-image: url('img/fixi/fix04.png');"></div>
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
					class="img-responsive img-portfolio img-hover" src="img/fixi/fix01.png"
					alt="">
				</a>
			</div>
			<div class="col-md-4 col-sm-6">
				<a href="productElectric.do"> <img
					class="img-responsive img-portfolio img-hover" src="img/electric/scgmain1.png"
					alt="">
				</a>
			</div>
			<div class="col-md-4 col-sm-6">
				<a href="productHybrid.do"> <img
					class="img-responsive img-portfolio img-hover" src="img/hybrid/hyb2.png"
					alt="">
				</a>
			</div>
		</div>
		<!-- /.row -->

		<a href="productHybrid.do" class="btn btn-defalut" role="button">VIEW
			COLLECTION</a>

	</div>
	<!-- /.container -->
</body>

</html>
