<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title></title>

<script type="text/javascript">
	function goDelete() {
		document.frm.action = "delectProd.do";
		document.frm.submit();
	}
	function prodHome() {
		alsert("a");
		document.frm.action = "ProdStart.do";
		document.frm.submit();
	}
</script>
</head>


<body>
	<form class="form-horizontal" method="post" name="frm">
		<fieldset>
			<!-- Text input-->
			<div class="form-group" style="margin-top: 130px;">

				<label class="col-md-4 control-label" for="id">상품번호</label>
				<div class="col-md-3">
					<input id="id" name="id" type="text" placeholder="Id"
						class="form-control input-md" readonly value="${ProdVo.prod_id }">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="name">삼품 명</label>
				<div class="col-md-3">
					<input type="text" placeholder="name" class="form-control input-md"
						readonly value="${ProdVo.prod_name }">
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="email">구매가</label>
				<div class="col-md-3">
					<input type="text" placeholder="email"
						class="form-control input-md" readonly
						value="${ ProdVo.prod_cost }">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="zip">판매가</label>
				<div class="col-md-3">
					<input type="text" placeholder="Zip Code"
						class="form-control input-md" readonly
						value="${ ProdVo.prod_price}">
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label">수량</label>
				<div class="col-md-3">
					<input type="text" class="form-control input-md" readonly
						value="${ ProdVo.prod_qty }">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label">이미지</label>
				<div class="col-md-3">
					<input type="text" class="form-control input-md" readonly
						value="${ ProdVo.prod_image1 }">

				</div>
			</div>


			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="phone">상품코드</label>
				<div class="col-md-3">
					<input type="text" placeholder="Phone#"
						class="form-control input-md" readonly
						value="${ ProdVo.prod_lgu }">

				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="phone">상품설명</label>
				<div class="col-md-3">
					<input type="text" placeholder="Phone#"
						class="form-control input-md" readonly value="${ ProdVo.prod_cn}">

				</div>
			</div>

			<!-- Button -->
			<div class="form-group" style="padding-top: 50px;">
				<label class="col-md-5 control-label" for="cancle"></label>
				<div class="col-md-5">
					<label class="col-md-5 control-label" for="submit"></label>
					<div class="col-md-2">
						<button id="submit" name="submit" class="btn btn-primary"
							onClick="goDelete();">삭제</button>
					</div>
					<div class="col-md-2">
						<a href="ProdStart.do"><button class="btn btn-primary">홈으로</button></a>
					</div>
				</div>
			</div>
		</fieldset>
	</form>
	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>