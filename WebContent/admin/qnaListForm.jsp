<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<script type="text/javascript">
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
   text-align: left;
}

#orderList {
   width: 100%;
   border-collapse: collapse;
}
</style>
</head>
<script type="text/javascript">
	function go_view(qseq) {
		var theForm = document.frm;
		theForm.qseq.value = qseq;
		theForm.action = "adminQnaDetail.do";
		theForm.submit();
	}
</script>
<article>
      <h1>QnA리스트</h1>
      <form name="frm" method="post" id="mains">
      <input type="hidden" name="qseq">
         <table id="orderList">
            <tr>
               <th>기본키(답변여부)</th>
               <th>질문내용</th>
               <th>답변내용</th>
               <th>질문타이틀</th>
               <th>작성자아이디</th>
               <th>질문날짜</th>
            </tr>
            <c:forEach items="${QnaList}" var="QnaVo">
               <tr>
                 <td>${QnaVo.qna_qseq} <c:choose>
							<c:when test='${QnaVo.qna_rep=="n"}'>(미처리)</c:when>
							<c:otherwise>(답변처리완료)</c:otherwise>
						</c:choose>
				  </td>
                  <td>${QnaVo.qna_content}</td>
                  <td>${QnaVo.qna_reply}</td>
                  <td><a href="#" onClick="javascript:go_view('${QnaVo.qna_qseq}')">	${QnaVo.qna_title} </a></td>
                  <td>${QnaVo.qna_id}</td>
                  <td>${QnaVo.qna_date}</td>
               </tr>
            </c:forEach>
         </table>
      </form>
</article>
</html>