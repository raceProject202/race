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

    <title>Ho!!</title>

<script type="text/javascript">
function go_view(lgu) {
	document.frm.lgu.value = lgu;
	document.frm.action = "productForm.do";
	document.frm.submit();
}
	function Detail(prod_id,prod_lgu) {
		document.frm.prod_id.value = prod_id;
		document.frm.prod_lgu.value = prod_lgu;
		document.frm.action = "prodDetail.do";
		document.frm.submit();
	}

</script>
</head>

<body>
<form name="frm" method="post">
<input type="hidden" name="prod_id">
<input type="hidden" name="prod_lgu">
<input type="hidden" name="lgu">
    <!-- Page Content -->
    <div class="container" style="margin-top: 130px;">

        <div class="row">

            <div class="col-md-3"><!-- <br><br><br><br><br><br> -->
                <p class="lead">BIKE</p>
                <div class="list-group">
                    <a href="#" onclick="go_view('1')" class="list-group-item">하이브리드</a>
                    <a href="#" onclick="go_view('2')" class="list-group-item">MTB</a>
                    <a href="#" onclick="go_view('3')" class="list-group-item">픽시</a>
                    <a href="#" onclick="go_view('4')" class="list-group-item">전기자전거</a>
                </div>
            </div>
		
            <div class="col-md-9">
				<!-- <br><br><br><br><br><br> -->
                <div class="row carousel-holder">

                    <div class="col-md-12">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                            	<div class="item active">
                                    <img class="slide-image" src="img/${ProdList.get(0).prod_image1 }" style="width: 800px; height:400px">
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="img/${ProdList.get(1).prod_image1 }" style="width: 800px; height:400px">
                                </div>
                                <div class="item">
                                    <img class="slide-image" src="img/${ProdList.get(2).prod_image1 }" style="width: 800px; height:400px">
                                </div>
                            </div>
                            <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                                <span class="glyphicon glyphicon-chevron-left"></span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                                <span class="glyphicon glyphicon-chevron-right"></span>
                            </a>
                        </div>
                    </div>

                </div>
                
                <br/><br/>

                <div class="row">
					<c:forEach items="${ProdList}" var="ProdVo">
					<div class="col-sm-4 col-lg-4 col-md-4">
                        <div class="thumbnail">
                            <img src="img/${ ProdVo.prod_image1 }" style="width: 320px; height:150px">
                            <div class="caption">
                                <h4 class="pull-right">${ ProdVo.prod_price }</h4>
                                <h4><a href="#" onClick="Detail('${ProdVo.prod_id}','${ProdVo.prod_lgu}')">${ProdVo.prod_name}</a>
                                </h4>
                                <p>${ProdVo.prod_cn}</p>
                            </div>
                            <div class="ratings">
                                <p class="pull-right">${ProdVo.read_count }&nbsp;&nbsp;review</p>
                                <p>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star"></span>
                                    <span class="glyphicon glyphicon-star-empty"></span>
                                </p>
                            </div>
                        </div>
                    </div>
                    
					</c:forEach>
					
                    
                </div>

            </div>

        </div>

    </div>
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
</form>
</body>

</html>
