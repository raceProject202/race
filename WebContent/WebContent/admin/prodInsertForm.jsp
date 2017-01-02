<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
  	table tr td{
  		padding : 5px;
  	}
  	#line{
  		border: 1px solid black;
  		width : 100%;
  		height: 100px;
  	}
  </style>
</head>
<body>

<form action="InsertProd.do" enctype="multipart/form-data"   method="post">
<div class="container">
  <h2>Bordered Table</h2>
  <p>The .table-bordered class adds borders to a table:</p>            
  <table>
      <tr>
        <td>상품 분류 :</td> 
        <td>
        <select name="prod_lgu">
        	<c:forEach items="${LprodList}" var="lprod">
			<option value="${ lprod.lprod_gu }">${ lprod.lprod_nm }</option>
			</c:forEach>
		</select>
        </td>
        </tr>
        <tr>
        <th>상품 명 : </th>
        <td colspan="3"><input type="text" class="form-control" id="usr" name="prod_name">
        
        </td>
      </tr>
      <tr>
        <td>구매가 : </td>
        <td><input type="text" class="form-control" id="usr" name="prod_cost"></td>
        <td>판매가 : </td>
        <td><input type="text" class="form-control" id="usr" name="prod_price"></td>
      </tr>
      
      <tr>
        <td>상품 수량 : </td><td><input type="text" class="form-control" id="usr" name="prod_qty"></td>
        <td>상품 이미지 : </td><td ><input type="file" name="imgName" value="이미지 추가" ></td>
      </tr>
      <tr>
        <td>상품 설명</td>
        <td colspan="3"><textarea class="form-control" rows="5" id="comment" name="prod_cn"></textarea></div></td>
      </tr>
      <tr>
        <td colspan="4"><input type="submit" value="등록" class="btn btn-default"></td>
      </tr>
  </table>
</div>
  </form>

</body>
</html>
