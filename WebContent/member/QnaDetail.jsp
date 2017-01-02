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
<style>
table {
color: #333;
font-family: Helvetica, Arial, sans-serif;
width: 640px;
border-collapse:
collapse; border-spacing: 0;
margin : 0% 50% 0% 30%;
}

td, th {
border: 1px solid transparent; /* No more visible border */
height: 30px;

}

th {
background: #DFDFDF; /* Darken header a bit */
font-weight: bold;
}

td {
background: #FAFAFA;
text-align: center;
}

/* Cells in even rows (2,4,6...) are one color */
tr:nth-child(even) td { background: #F1F1F1; }

/* Cells in odd rows (1,3,5...) are another (excludes header cells) */
tr:nth-child(odd) td { background: #FEFEFE; }



#btn{
margin :  2% 50% 0% 60%;
}

h1{
margin :  0% 50% 3% 30%;
}
</style>
<article>
<br><br><br><br><br>
	<form name="frm" method="post">
		<input type="hidden" name="qseq">
	<h1>QnA 게시판</h1>
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
						<th width="20%">댓글</th>
						<td>${QnaVo.qna_reply}</td>
					</tr>
				</table>
			</c:otherwise>
		</c:choose>
		<input type="button" class="btn" id="btn" value="목록" onClick="go_list()">
	</form>
</article>
<%-- <%@ include file="/admin/footer.jsp"%> --%>
</body>
</html>