<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<script type="text/javascript">
   function goProdName() {
      document.frm.action = "Prodsearch.do";
      document.frm.submit();
   }
   function insertProd() {
         document.frm.action = "InsertFormProd.do";
         document.frm.submit();
      }
   function delet(prod_id) {
      alert(prod_id);
       document.frm.prod_id.value = prod_id;
       document.frm.action = "prodDeleteForm.do";
       document.frm.submit();
   }
   function updat(prod_id) {
       document.frm.prod_id.value = prod_id;
       document.frm.action = "prodUpdateForm.do";
       document.frm.submit();
   }
</script>
<style>
#mains {
   margin: 5px 10% 5px 10%;
}

/* tr:nth-of-type(odd) {
   background: #eee;
} */

th {
   background: #333;
   color: white;
   font-weight: bold;
}

td, th {
   padding: 6px;
   border: 1px solid #ccc;
   text-align: left;
}

#orderList {
   width: 100%;
   border-collapse: collapse;
}

#tdid{
   border:none;
}
</style>
</head>
<body>
   <div id="mains">
      <h1>상품리스트</h1>
      <form name="frm" method="post">
        <input type="hidden" name="prod_id">
         <table style="float: right;">
            <tr>
               <td id="tdid"> 상품 이름 : <input type="text" name="key"> <input
                  class="btn btn-default" type="button" value="name" onclick="goProdName()">
               </td>
               <td><button onclick="insertProd()">상품등록</button></td>
               
            </tr>
         </table>
         <br>
         <table id="orderList">
            <tr>
               <th>품명</th>
               <th>등록코드</th>
               <th>구매가</th>
               <th>판매가</th>
               <th>수량</th>
               <th>등록날짜</th>
               <th>수정/삭제</th>
            </tr>
            <c:choose>
    <c:when test="${productListSize<=0}">
    <tr>
      <td width="100%" colspan="7" align="center" height="23">
        등록된 상품이 없습니다.
      </td>      
    </tr>
    </c:when>
	<c:otherwise>
            <c:forEach items="${ProdList}" var="ProdVo">
               <tr>
                  <td>${ProdVo.prod_name}</td>
                  <td>${ProdVo.prod_lgu}</td>
                  <td>${ProdVo.prod_cost}</td>
                  <td>${ProdVo.prod_price}</td>
                  <td>${ProdVo.prod_qty}</td>
                  <td>${ProdVo.prod_date}</td>
                  <td>
                     <a href="#" onClick="javascript:updat('${ProdVo.prod_id}')">수정</a>/
                     <a href="#" onClick="javascript:delet('${ProdVo.prod_id}')">삭제</a>
                  </td>
               </tr>
            </c:forEach>
            <tr><td colspan="6" style="text-align: center;"> ${paging} </td></tr>
            </c:otherwise>	
</c:choose>  
         </table>
      </form>
   </div>
</body>
</html>