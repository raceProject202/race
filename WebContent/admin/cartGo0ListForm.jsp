<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<script type="text/javascript">
	function orders() {
		var str = null;
		for (var i = 0; i < document.frm.result.length; i++) { //체크된것만 넣는다
			if (document.frm.result[i].checked == true) {
				str += document.frm.result[i].value + "\n";
			}
		}
		alert(str);
		if (str == null) {
			alert("배송처리할 항목을 선택해 주세요.");
		} else {
			document.frm.action = "adminGo0Order.do";
			document.frm.submit();
		}
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
	<div class="container" style="margin-top: 130px;">
		<div class="row">
			<div class="col-md-3">
				<!-- <br><br><br><br><br><br> -->
				<p class="lead">My Page</p>
				<div class="list-group">
					<a href="cartListAll.do" class="list-group-item">주문 내역</a> 
					<a href="cartGo0ListAll.do" class="list-group-item">배송 내역</a>
					<a href="cartGoM1ListAll.do" class="list-group-item">반품 내역</a>
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
								<th>상품코드</th>
								<th>회원이름</th>
								<th>우편번호</th>
								<th>기본주소</th>
								<th>상세주소</th>
								<th>상품수량</th>
								<th>전화번호</th>
								<th>상품날짜</th>
								<th>처리여부</th>
							</tr>
							<c:forEach items="${raceCartList}" var="cart">
								<c:choose>
									<c:when test='${cart.cart_ok == "y" && cart.cart_go == 1  && cart.cart_last == "n"}'>
										<tr>
											<td>${cart.cart_prod}</td>
											<td>${cart.cart_name}</td>
											<td>${cart.cart_zip}</td>
											<td>${cart.cart_date}</td>
											<td>${cart.cart_add1}</td>
											<td>${cart.cart_add2}</td>
											<td>${cart.cart_hp}</td>
											<td>${cart.cart_date}</td>
											<td><input type="checkbox" name="result"
												value="${cart.cart_no}"> 미처리</td>
										</tr>
									</c:when>
								</c:choose>
							</c:forEach>
						</table>
						<input type="button" value="배송처리완료" onClick="orders()">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>