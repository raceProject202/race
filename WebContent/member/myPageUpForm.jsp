<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title></title>
	
<script>
	function post_zipUp(){
			  var url = "raceMyPageUpZipNum.do";
			  window.open( url, "_blank_1",
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=550, height=500, top=300, left=300, ");
	}
	function upDate_cancle(form){
		location.href="<%=request.getContextPath()%>/myPageUp.do";
	}
</script>
	
	
</head>


<body>
	<form class="form-horizontal" action="myPageUpForm.do" method="post" name="updateForm">
		<fieldset>
			<!-- Text input-->
			<div class="form-group" style="margin-top: 130px;" >

				<label class="col-md-4 control-label" for="id">ID</label>
				<div class="col-md-1">
					<input id="fn" name="id" type="text" placeholder="Id"
						class="form-control input-md" value=${upList.mem_id } readonly="readonly">
				</div>
					<!-- <button id="button" name="cancle" class="btn btn-primary">중복확인</button> -->
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="name">Name</label>
				<div class="col-md-1">
					<input id="fn" name="name" type="text" placeholder="name"
						class="form-control input-md" value=${upList.mem_name }>
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="cmpny">Password</label>
				<div class="col-md-2">
					<input id="cmpny" name="password" type="password"
						placeholder="password" class="form-control input-md" value=${upList.mem_pass }>

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="email">Email</label>
				<div class="col-md-2">
					<input id="email" name="email" type="text" placeholder="email"
						class="form-control input-md" value=${upList.mem_email }>

				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="zip">Zip Code</label>
				<div class="col-md-2">
					<input id="zip" name="zipcode" type="text" placeholder="Zip Code"
						class="form-control input-md" value=${upList.mem_zip }>
				</div>
				<button id="button" name="cancle" class="btn btn-primary" onclick="post_zipUp()">우편번호 검색</button>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="add1">Address 1</label>
				<div class="col-md-3">
					<input id="add1" name="add1" type="text" placeholder="주소"
						class="form-control input-md" value="${upList.mem_add1 }">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="add2">Address 2</label>
				<div class="col-md-3">
					<input id="add2" name="add2" type="text" placeholder="상세주소"
						class="form-control input-md" value=${upList.mem_add2 }>

				</div>
			</div>


			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="phone">Phone</label>
				<div class="col-md-2">
					<input id="phone" name="phone" type="text" placeholder="Phone#"
						class="form-control input-md" value=${upList.mem_hp }>

				</div>
			</div>



			<!-- Button -->
			<div class="form-group" style="padding-top:50px;">
				<label class="col-md-5 control-label" for="cancle"></label>
				<div class="col-md-5">
					<button id="button" name="cancle" class="btn btn-primary" onclick="upDate_cancle(this.form)">취소</button>
					<label class="col-md-5 control-label" for="submit"></label>
					<div class="col-md-2">
						<button id="submit" name="submit" class="btn btn-primary">수정</button>
					</div>
				</div>
			</div>
		</fieldset>
	</form>
	 <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>