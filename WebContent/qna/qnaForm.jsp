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
	function go_view(qseq,id) {
		var theForm = document.frm;
		theForm.qseq.value = qseq;
		theForm.id.value = id;
		theForm.action = "memberQnaDetail.do";
		theForm.submit();
	}
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

#tdid {
	border: none;
}

#orderList {
	width: 100%;
	border-collapse: collapse;
	text-align: center;
}
</style>
</head>
<article>
	<h1>QnA리스트</h1>
	<form name="frm" method="post" id="mains">
		<table style="float: right;">
			<tr>
				<td id="tdid"><b>제 목 : </b><input type="text" name="key">
					<input class="btn btn-default" type="button" value="검색"
					onclick="go_search()"></td>
				<td id="tdid"><a href="qnaWirteForm.do" class="btn btn-default"
					role="button">글쓰기</a></td>
			</tr>
		</table>
		<input type="hidden" name="qseq">
		<input type="hidden" name="id">
		<table id="orderList">
			<tr>
				<th>작성자아이디</th>
				<th>제목</th>
				<th>질문날짜</th>
				<th>기본키(답변여부)</th>
			</tr>
			<c:forEach items="${listQna}" var="QnaVo">
				<tr>
					<td>${QnaVo.qna_id}</td>
					<td><a href="#"
						onClick="javascript:go_view('${QnaVo.qna_qseq}','${QnaVo.qna_id}')">
							${QnaVo.qna_title} </a></td>
					<td>${QnaVo.qna_date}</td>
					<td>${QnaVo.qna_qseq}<c:choose>
							<c:when test='${QnaVo.qna_rep=="n"}'>(미처리)</c:when>
							<c:otherwise>(답변처리완료)</c:otherwise>
						</c:choose>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</article>
</html>