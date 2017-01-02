<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	.form-horizontal{
		padding-top:30px;
	}
	
	.content{
		margin-left:610px;
		width:30%;
		padding-top:60px;
	}
</style>
</head>
<body>
	<form class="form-horizontal" action="qnaWrite.do" method="post" name="qnaWriteForm">
		<fieldset>
			<!-- Text input-->
			<div class="form-group" style="margin-top: 130px;">

				<div class = "content">
				
				<div class="form-group">
     			 <label for="usr">작성자 ID :  <%= request.getAttribute("RaceId") %></label><br>
     				<!--  <input type="text" class="form-control" id="usr" name="i" placeholder="제목"> -->
    			</div>
				
				
				<div class="form-group">
     			 <label for="usr">제 목</label><br>
     				 <input type="text" class="form-control" id="usr" name="title" placeholder="제목">
    			</div>
				
				<div class="form-group">
     			 <label for="comment">내 용</label><br>
      			<textarea class="form-control" rows="8" id="comment" name="content" placeholder="내용"></textarea>
   				 </div>
   				 </div>
			</div>
		
			<!-- Button -->
			<div class="form-group" style="padding-top:50px;">
				<label class="col-md-5 control-label" for="cancle"></label>
				<div class="col-md-5">
					<button id="submit" name="submit" class="btn btn-primary">작성하기</button>
					<label class="col-md-5 control-label" for="submit"></label>
					<div class="col-md-2">
						<a href="main.do"><button id="button" name="button" class="btn btn-primary">홈으로</button></a>
					</div>
				</div>
			</div>
		</fieldset>
	</form>
</body>
</html>