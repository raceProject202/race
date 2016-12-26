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

    <title>Portfolio Item - Start Bootstrap Template</title>

<!--     Bootstrap Core CSS
    <link href="css/bootstrap.min.css" rel="stylesheet">

    Custom CSS
    <link href="css/portfolio-item.css" rel="stylesheet"> -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    

    <!-- Page Content -->
    <div class="container">
		<br>
        <!-- Portfolio Item Heading -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Portfolio Item
                    <small>Item Subheading</small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Portfolio Item Row -->
        <div class="row">

            <div class="col-md-8">
                <img class="img-responsive" src="img/fixi/fix04.png" alt="">
            </div>

            <div class="col-md-4">
                <h3>Project Description</h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque urna varius vitae. Sed dui lorem, adipiscing in adipiscing et, interdum nec metus. Mauris ultricies, justo eu convallis placerat, felis enim.</p>
                <h3>Project Details</h3>
                <ul>
                    <li>Lorem Ipsum</li>
                    <li>Dolor Sit Amet</li>
                    <li>Consectetur</li>
                    <li>Adipiscing Elit</li>
                </ul>
            </div>
            <label> 가 격 : </label>
				<p>${productVO.price2} 원</p>
			<label> 수 량 : </label> <input type="text" name="quantity" size="2" value="1"><br><br>
            <div id="buttons">
            	<a class="btn icon-btn btn-success" href="#">
					<span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>
				장바구니에 담기 </a>
				<a class="btn icon-btn btn-info" href="#">
				<span class="glyphicon btn-glyphicon glyphicon-share img-circle text-info"></span>
				바로구매 </a>
				
			</div>

        </div>
        <!-- /.row -->

        <!-- Related Projects Row -->
        <div class="row">

             <div class="col-sm-3 col-xs-6">
                <a href="#" onClick="window.open('img/electric/fila1.png', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
                    <img class="img-responsive portfolio-item" src="img/fixi/fix04_01.png" alt="">
                </a>
            </div>

            <div class="col-sm-3 col-xs-6">
              <a href="#" onClick="window.open('img/electric/fila2.png', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
                    <img class="img-responsive portfolio-item" src="img/fixi/fix04_02.png" alt="">
                </a>
            </div>

            <div class="col-sm-3 col-xs-6">
                <a href="#" onClick="window.open('img/electric/fila3.png', 'width=614,height=620, status=no, toolbar=no, location=no, directories=no, menubar=no, scrollbars=yes, resizable=no');">
                    <img class="img-responsive portfolio-item" src="img/fixi/fix04_03.png" alt="">
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
