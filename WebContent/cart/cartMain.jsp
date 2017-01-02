<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	int i=0;
%>
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
			alert("주문처리할 항목을 선택해 주세요.");
		} else {
			document.frm.action = "cartGocart.do";
			document.frm.submit();
		}
	}
</script>
<style>
#mains {
	margin: 5px 20% 15% 20%;
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
					<th>상품 이미지</th>
					<th>상품 명</th>
					<th>상품 수량</th>
					<th>상품 가격</th>
					<th>배송비</th>
					<th>합  계</th>
				</tr>
				<c:forEach items="${cartProdList}" var="cart">
				<c:choose>
					<c:when test='${cart.cart_ok eq "n"}'>
					<tr>
						<td><input type="checkbox" name="result"
												value="${cart.cart_no}"><%= ++i %></td>
						<td>
						<img src="img/${cart.prod_image1}" style="width: 200px; height:100px"></td>
						<td>${cart.prod_name}</td>
						<td>${cart.cart_qty}</td>
						<td>${cart.prod_price}</td>
						<td>무료</td>
						<td>${cart.cart_qty * cart.prod_price}</td>
					</tr>
					</c:when>
					<c:otherwise>
					</c:otherwise>
				</c:choose>
				</c:forEach>
			</table>
				<input type="button" value="주문처리" onClick="orders()">
		
		</form>
	</div>
</body>
</html>