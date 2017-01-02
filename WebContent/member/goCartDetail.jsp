<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	function update() {
		var theForm = document.fr;
		theForm.cart_no.value = cart_no;
		theForm.action = "goCartUpdateAction.do";
		theForm.submit();
	}
	function home() {
		var theForm = document.fr;
		theForm.cart_no.value = cart_no;
		theForm.action = "goCartListAction.do";
		theForm.submit();
	}
	/* $(function(){
		
		$("#cart_qty").onchange(function(){
			
			var prod_price = $("#prod_price").val();
			var cart_qty = $("#cart_qty").val();
			
			var qty = (prod_price * 1) * (cart_qty*1);
			$("#qty").val(qty);
		});
	}); */
</script>
<style>
table tr td {
	padding: 5px;
}

table {
	width: 80%;
	border-collapse: collapse;
}

#line {
	border: 1px solid black;
	width: 100%;
	height: 100px;
}

#tdiv {
	margin: 100px 25% 10% 25%;
}
</style>
</head>
<body>
	<form action = "goCartUpdateAction.do" name="fr" method="post">
		<input type="hidden" name="cart_no" value="${cartProdDto.cart_no }">
		<div class="container" id="tdiv">
			<h2>수정</h2>
			<p>The .table-bordered class adds borders to a table:</p>
			<table>
				<tr>
					<td colspan="2">이미지</td>
					<th>상 품 명 :</th>
					<td><input type="text" class="form-control" id="prod_name"
						name="prod_name" readonly value="${cartProdDto.prod_name }"></td>
				</tr>
				<tr>
					<td colspan="2" rowspan="7"><img
						src="./img/${cartProdDto.prod_image1 }"
						style="width: 400px; height: 250px"></td>
					<th>가 격 :</th>
					<td><input type="text" class="form-control" id="prod_price"
						name="prod_price" readonly value="${cartProdDto.prod_price }"></td>
				</tr>
				<tr>
					<th>개 수 :</th>
					<td><input type="text" class="form-control" id="cart_qty"
						name="cart_qty" value="${cartProdDto.cart_qty }"></td>
				</tr>
				<tr>
					<th>합 계 :</th>
					<td><input type="text" class="form-control" id="qty"
						name="qty"
						readonly value="${cartProdDto.prod_price * cartProdDto.cart_qty}"></td>
				</tr>
				<tr>
					<th>주 소1 :</th>
					<td><input type="text" class="form-control" id="mem_add1"
						name="mem_add1" value="${loginUser.mem_add1 }"></td>
				</tr>
				<tr>
					<th>주 소2 :</th>
					<td><input type="text" class="form-control" id="mem_add2"
						name="mem_add2" value="${loginUser.mem_add2 }"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" onclick="update(this)" value="수정">
					<a href="goCartListAction.do"><button >홈으로</button></a></td>
				</tr>

			</table>
		</div>
	</form>
</body>
</html>