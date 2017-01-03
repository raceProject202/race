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
  
  
  <script type="text/javascript">
	function goUpdate(prod_id) {
		document.frm.prod_id.value = prod_id;
		document.frm.action ="updateProd.do";
		document.frm.submit();
	}
	function prodHome() {
		alsert("a");
		document.frm.action = "ProdStart.do";
		document.frm.submit();
	}
</script>
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

<form enctype="multipart/form-data"  name="frm" method="post">
<input type="hidden" name="prod_id">
<input type="hidden" name="prod_id">
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
        <td colspan="3"><input type="text" class="form-control" id="usr" name="prod_name" value="${ProdVo.prod_name}">
        
        </td>
      </tr>
      <tr>
        <td>구매가 : </td>
        <td><input type="text" class="form-control" id="usr" name="prod_cost" value="${ProdVo.prod_cost}"></td>
        <td>판매가 : </td>
        <td><input type="text" class="form-control" id="usr" name="prod_price" value="${ProdVo.prod_price}"></td>
      </tr>
      
      <tr>
        <td>상품 수량 : </td><td><input type="text" class="form-control" id="usr" name="prod_qty" value="${ProdVo.prod_qty}"></td>
      </tr>
      <tr>
        <td>상품 설명</td>
        <td colspan="3"><textarea class="form-control" rows="5" id="comment" name="prod_cn">${ProdVo.prod_cn}</textarea></div></td>
      </tr>
      <tr>
        <td>상품 이미지 : </td>
        <td colspan="3"><img src="<c:url value="../img"/>/${ProdVo.prod_image1}" width="200pt" />     
      		<br><input type="file" name="imgName" value="이미지 추가" ></td>
      </tr>
      <tr>
        <td colspan="4"><input type="button" value="수정" class="btn btn-default" onClick="javascript:goUpdate('${ ProdVo.prod_id}');" ></td>
      </tr>
  </table>
</div>
  </form>

</body>
</html>
