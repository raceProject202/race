<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<script type="text/javascript">
   function go_search() {
      document.frm.action = "searchQna.do";
      document.frm.submit();
   }
</script>
<style>
#mains {
   margin: 5px 10% 5px 10%;
}

tr:nth-of-type(odd) {
   /* background: #eee; */
}

th {
   background: #333;
   color: white;
   font-weight: bold;
}

td, th {
   padding: 6px;
   border: 1px solid #ccc;
   text-align: center;
}

 #tdid{
border:none;
}
 
#orderList {
   width: 100%;
   border-collapse: collapse;
   text-align:center;
}
</style>
</head>
<body>
   <div id="mains" style="margin-top: 130px;">
      <h1>Q & A</h1>
      <form name="frm" method="post">
         <table style="float: right;">
            <tr>
               <td id="tdid"><b>제 목 : </b><input type="text" name="key"> <input
                  class="btn btn-default" type="button" value="검색" onclick="go_search()">
               </td>
               <td id="tdid">
               	<a href="qnaWirteForm.do" class="btn btn-default" role="button">글쓰기</a>
               </td>
            </tr>
         </table>
         <br>
         <table id="orderList">
            <tr>
               <th>번 호</th>
               <th>제 목</th>
               <th>I D</th>
               <th>등 록 일</th>
               <th>답변여부</th>
            </tr>
            <c:forEach items="${listQna}" var="raceQnaVo">
               <tr>
                  <td>${raceQnaVo.qna_qseq}</td>
                  <td>${raceQnaVo.qna_content}</td>
                  <td>${raceQnaVo.qna_id}</td>
                  <td>${raceQnaVo.qna_date}</td>
                  <td>
                  <c:choose>
                  <c:when test='${raceQnaVo.qna_rep=="n"}'>(미처리)</c:when>
                     <c:otherwise>(답변처리완료)</c:otherwise>
                  </c:choose>
                  </td>
                  
               </tr>
            </c:forEach>
         </table>
      </form>
   </div>
</body>
</html>