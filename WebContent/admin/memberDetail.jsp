<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

   
</head>


<body>
   <form class="form-horizontal" action="adminStart.do" method="post" name="joinForm">
      <fieldset>
         <!-- Text input-->
         <div class="form-group" style="margin-top: 130px;">

            <label class="col-md-4 control-label" for="id">ID</label>
            <div class="col-md-3">
               <input id="fn" name="id" type="text" placeholder="Id"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_id }">
            </div>
         </div>

         <div class="form-group">
            <label class="col-md-4 control-label" for="name">Name</label>
            <div class="col-md-3">
               <input id="fn" name="name" type="text" placeholder="name"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_name }">
            </div>
         </div>

         <!-- Text input-->
         <div class="form-group">
            <label class="col-md-4 control-label" for="email">Email</label>
            <div class="col-md-3">
               <input id="email" name="email" type="text" placeholder="email"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_email }">

            </div>
         </div>
         
         <!-- Text input-->
         <div class="form-group">
            <label class="col-md-4 control-label" for="zip">Zip Code</label>
            <div class="col-md-3">
               <input id="zip" name="zipcode" type="text" placeholder="Zip Code"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_zip }">
            </div>
         </div>

         <!-- Text input-->
         <div class="form-group">
            <label class="col-md-4 control-label" for="add1">Address 1</label>
            <div class="col-md-3">
               <input id="add1" name="add1" type="text" placeholder="주소"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_add1 }">

            </div>
         </div>

         <!-- Text input-->
         <div class="form-group">
            <label class="col-md-4 control-label" for="add2">Address 2</label>
            <div class="col-md-3">
               <input id="add2" name="add2" type="text" placeholder="상세주소"
                  class="form-control input-md" readonly value="${ memberVo.mem_add2 }">

            </div>
         </div>


         <!-- Text input-->
         <div class="form-group">
            <label class="col-md-4 control-label" for="phone">Phone</label>
            <div class="col-md-3">
               <input id="phone" name="phone" type="text" placeholder="Phone#"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_hp }">

            </div>
         </div>
         
         <div class="form-group">
            <label class="col-md-4 control-label" for="phone">가입날짜</label>
            <div class="col-md-3">
               <input id="phone" name="phone" type="text" placeholder="Phone#"
                  class="form-control input-md" required="" readonly value="${ memberVo.mem_date }">

            </div>
         </div>
         
         <div class="form-group">
            <label class="col-md-4 control-label" for="phone">탈퇴여부</label>
            <div class="col-md-3">
            <c:choose>
            <c:when test='${memberVo.mem_delete=="y"}'>
               <input id="phone" name="phone" type="text" placeholder="Phone#"
                  class="form-control input-md" required="" readonly value="일반회원">
						    </c:when>
						    <c:otherwise>
						                   <input id="phone" name="phone" type="text" placeholder="Phone#"
                  class="form-control input-md" required="" readonly value="탈퇴회원">
						   	</c:otherwise>
</c:choose>
            </div>
         </div>



         <!-- Button -->
         <div class="form-group" style="padding-top:50px;">
            <label class="col-md-5 control-label" for="cancle"></label>
            <div class="col-md-5">
               <label class="col-md-5 control-label" for="submit"></label>
               <div class="col-md-2">
                  <button id="submit" name="submit" class="btn btn-primary">홈으로</button>
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