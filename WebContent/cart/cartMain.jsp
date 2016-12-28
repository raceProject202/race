<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>

<style>
#mains {
	margin: 5px 10% 5px 10%;
}

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
<br/><br/><br/>
	<div id="mains">
		<h1>장바구니</h1>
		<form name="frm" method="post">
			<br>
			<table id="orderList">
				<tr>
					<th>장바구니 번호</th>
					<th>상품 번호</th>
					<th>회원 이름</th>
					<th>상품 수량</th>
					<th>주문 날짜</th>
				</tr>
				<c:forEach items="${cartList}" var="cart">
					<tr>
						<td>${cart.cart_no}</td>
						<td>
							<c:choose>
								<c:when test="${cart.cart_prod == '1'}">
									<a href="productHybridDetail1.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '2'}">
									<a href="productHybridDetail2.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '3'}">
									<a href="productHybridDetail3.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '4'}">
									<a href="productHybridDetail4.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '5'}">
									<a href="productHybridDetail5.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '6'}">
									<a href="productMtbDetail1.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '7'}">
									<a href="productMtbDetail2.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '8'}">
									<a href="productMtbDetail3.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '9'}">
									<a href="productMtbDetail4.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '10'}">
									<a href="productMtbDetail5.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '11'}">
									<a href="productFixiDetail1.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '12'}">
									<a href="productFixiDetail2.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '13'}">
									<a href="productFixiDetail3.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '14'}">
									<a href="productFixiDetail4.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '15'}">
									<a href="productFixiDetail5.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '16'}">
									<a href="productElectricDetail1.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '17'}">
									<a href="productElectricDetail2.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '18'}">
									<a href="productElectricDetail3.do">${cart.cart_prod}</a>
								</c:when>								
								<c:when test="${cart.cart_prod == '19'}">
									<a href="productElectricDetail4.do">${cart.cart_prod}</a>
								</c:when>
								<c:when test="${cart.cart_prod == '20'}">
									<a href="productElectricDetail5.do">${cart.cart_prod}</a>
								</c:when>
								
							</c:choose>
						</td>
						<td>${cart.cart_member}</td>
						<td>${cart.cart_qty}</td>
						<td>${cart.cart_date}</td>
					</tr>
				</c:forEach>
			</table>
		
		</form>
	</div>
</body>
</html>