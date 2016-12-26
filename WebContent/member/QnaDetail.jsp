<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%-- <%@ include file="/admin/header.jsp"%> --%>

<script type="text/javascript">
	function go_list() {
		var theForm = document.frm;
		theForm.action = "QnaListBack.do";
		theForm.submit();
	}

	function go_rep(qseq) {
		var theForm = document.frm;
		theForm.qseq.value = qseq;
		theForm.action = "adminQnaRepsave.do";
		theForm.submit();
	}
</script>
<article>
<br><br><br><br><br>
	<h1>QnA 게시판</h1>
	<form name="frm" method="post">
		<input type="hidden" name="qseq">
		<table id="orderList">
			<tr>
				<th width="20%">제목</th>
				<td>${QnaVo.qna_title} ${QnaVo.qna_rep}</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${QnaVo.qna_date}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${QnaVo.qna_content}</td>
			</tr>
		</table>
		<c:choose>
			<c:when test='${QnaVo.qna_rep=="n"}'>
				<table id="orderList">
					<tr>
						<th>댓글</th>
						<td>${QnaVo.qna_reply}</td>
					</tr>
				</table>
				<br>
			</c:when>
			<c:otherwise>
				<table id="orderList">
					<tr>
						<th>댓글</th>
						<td>${QnaVo.qna_reply}</td>
					</tr>
				</table>
			</c:otherwise>
		</c:choose>
		<input type="button" class="btn" value="목록" onClick="go_list()">
	</form>
</article>
<%-- <%@ include file="/admin/footer.jsp"%> --%>
</body>
</html>