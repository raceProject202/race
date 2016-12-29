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

<title>Shop Homepage - Start Bootstrap Template</title>
<script type="text/javascript">
	function back(cart_no) {
		var theForm = document.frm;
		theForm.cart_no.value = cart_no;
		theForm.action = "cartDetail.do";
		theForm.submit();
	}
	function back(cart_no) {
		var theForm = document.frm;
		theForm.cart_no.value = cart_no;
		theForm.action = "cartBack.do";
		theForm.submit();
	}
</script>
<style>
tr:nth-of-type(odd) {
	background: #eee;
}

th {
	background: #333;
	color: white;
	font-weight: bold;
}

td, th {
	padding: 6px;
	border: 1px solid #ccc;
}

#orderList {
	width: 100%;
	border-collapse: collapse;
}
</style>
</head>

<body>
	<form name="frm" method="post">
		<input type="hidden" name="cart_no">
	</form>
	<!-- Page Content -->
	<div class="container" style="margin-top: 130px;">
		<div class="row">
			<div class="col-md-3">
				<!-- <br><br><br><br><br><br> -->
				<p class="lead">My Page</p>
				<div class="list-group">
					<a href="myPageUpForm.do" class="list-group-item">회원 수정</a> <a
						href="goCartListAction.do" class="list-group-item">주문 내역</a>
				</div>
			</div>

			<div class="col-md-9">
				<!-- <br><br><br><br><br><br> -->
				<div id="mains">
					<h1>장바구니</h1>
					<form name="frm" method="post">
						<br>
						<table id="orderList">
							<tr>
								<th>주문일자</th>
								<th>상품 명</th>
								<th>삼품금액</th>
								<th>상품수량</th>
								<th>배송비</th>
								<th>주문상태</th>
								<th>확인/취소</th>
							</tr>
							<c:forEach items="${cartProdList}" var="cart">
								<c:choose>
									<c:when test='${cart.cart_ok eq "y"}'>
										<tr>
											<td><a href="#" onclick="detail('cart.cart_no')">${cart.cart_date}</a></td>
											<td>${cart.prod_name}</td>
											<td>${cart.prod_price}</td>
											<td>${cart.cart_qty}</td>
											<td>무료</td>
											<c:choose>
												<c:when test='${cart.cart_go == 0}'>
													<td>준비중</td>
													<td><button onclick="">취소</button></td>
													<input type="checkbox" name="result"
														value="${cart.cart_no}"> 미처리
						   			 	</c:when>
												<c:when test='${cart.cart_go == 1}'>
													<td><a
														href="https://service.epost.go.kr/iservice/usr/trace/usrtrc001k01.jsp">배송중(배송조회)</a></td>
													<td><button onclick="">확인</button>
														<button onclick="back('cart.cart_no')">취소</button></td>
												</c:when>
												<c:when test='${cart.cart_go == -1}'>
													<td>반품중</td>
													<td></td>
												</c:when>
												<c:otherwise>
													<td>처리 완료</td>
													<td></td>
												</c:otherwise>
											</c:choose>
										</tr>
									</c:when>
								</c:choose>
							</c:forEach>
						</table>
					</form>
				</div>
			</div>
		</div>
	</div>


	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>
