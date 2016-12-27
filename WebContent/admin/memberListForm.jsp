<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<script type="text/javascript">
   function search_go(form) {
      document.frm.action = "Membersearch.do";
      document.frm.submit();
   }
	function go_view(mem_id) {
		var theForm = document.frm;
		theForm.mem_id.value = mem_id;
		theForm.action = "memberDetail.do";
		theForm.submit();
	}
</script>
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
   <div id="mains">
      <h1>회원리스트</h1>
      <form name="frm" method="post">
      	<input type="hidden" name="mem_id">
         <table style="float: right;">
            <tr>
               <td>회원 이름 : <input type="text" name="key"> <input
                  class="btn" type="button" value="검색" onclick="search_go(this.form);">
               </td>
            </tr>
         </table>
         <br>
         <table id="orderList">
            <tr>
               <th>아이디</th>
               <th>이름</th>
               <th>이메일</th>
               <th>주소</th>
               <th>전화</th>
               <th>가입일</th>
            </tr>
            <c:forEach items="${memberList}" var="memberVO">
               <tr>
                  <td>${memberVO.mem_id}</td>
                  <td>
                  	<a href="#" onClick="javascript:go_view('${memberVO.mem_id}')">${memberVO.mem_name}</a>
				  </td>
                  <td>${memberVO.mem_email}</td>
                  <td>${memberVO.mem_add1}</td>
                  <td>${memberVO.mem_hp}</td>
                  <td>${memberVO.mem_date}</td>
               </tr>
            </c:forEach>
            <ul>
            </ul>
         </table>
      </form>
   </div>
</body>
</html>