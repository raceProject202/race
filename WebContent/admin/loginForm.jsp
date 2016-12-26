<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath }/css/modern-business.css" rel="stylesheet" type="text/css">
<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath }/font-awesome/css/font-awesome.min.css" rel="stylesheet"
   type="text/css">
<style>
@import url(http://weloveiconfonts.com/api/?family=entypo);
@import url(http://fonts.googleapis.com/css?family=Roboto);

/* zocial */
[class*="entypo-"]:before {
  font-family: 'entypo', sans-serif;
}

*,
*:before,
*:after {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box; 
}


h2 {
  color:rgba(255,255,255,.8);
  margin-left:12px;
}

body {
  background: #272125;
  font-family: 'Roboto', sans-serif;
  
}

form {
  position:relative;
  margin: 50px auto;
  width: 380px;
  height: auto;
}

input {
  padding: 16px;
  border-radius:7px;
  border:0px;
  background: rgba(255,255,255,.2);
  display: block;
  margin: 15px;
  width: 300px;  
  color:white;
  font-size:18px;
  height: 54px;
}

input:focus {
  outline-color: rgba(0,0,0,0);
  background: rgba(255,255,255,.95);
  color: #e74c3c;
}

button {
  float:right;
  height: 121px;
  width: 50px;
  border: 0px;
  background: #e74c3c;
  border-radius:7px;
  padding: 10px;
  color:white;
  font-size:22px;
}

.inputUserIcon {
  position:absolute;
  top:68px;
  right: 80px;
  color:white;
}

.inputPassIcon {
  position:absolute;
  top:136px;
  right: 80px;
  color:white;
}

input::-webkit-input-placeholder {
  color: white;
}

input:focus::-webkit-input-placeholder {
  color: #e74c3c;
}
.navbar-brand{
   font-size:70px;
}
.btn-defalut {
   width: 100%;
   text-align: center;
}
.navlogo{
   height:50px;
}
.di{
   font-size:20px;
   font-weight:bold;
}
#copy{
   width:100%;
   text-align:center;
   }
#home{
  float:right;
  height: 121px;
  width: 50px;
  border: 0px;
  background: #e74c3c;
  border-radius:7px;
  padding: 10px;
  color:white;
  font-size:22px;
}
</style>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
   <nav class="navlogo">
     <div class="container-fluid">
    <div class="navbar-header">
    </div>

  </div>
 </nav>
      <div class="container">
         <!-- Brand and toggle get grouped for better mobile display -->
         <div class="navbar-header">
         
            <button type="button" class="navbar-toggle" data-toggle="collapse"
               data-target="#bs-example-navbar-collapse-1">
               <span class="sr-only">Toggle navigation</span> <span
                  class="icon-bar"></span> <span class="icon-bar"></span> <span>
                  class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.jsp">RACE</a>
         </div>
         
         <!-- Collect the nav links, forms, and other content for toggling -->
         <div class = "di">
         <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
         </div>
         </div>
         <!-- /.navbar-collapse -->
      </div>
      <!-- /.container -->
   </nav>

<br><br><br><br><br><br><br><br><br><br><br>
<form name ="f" action="adminLogin.do">

  <h2><span class="entypo-login"></span> ADMIN</h2>
  <button class="submit"><span class="entypo-lock"></span></button>
  <span class="entypo-user inputUserIcon"></span>
  <input type="text" name="id" class="user" placeholder="ursername" value="admin"/>
  <span class="entypo-key inputPassIcon"></span>
  <input type="password" name="pwd" class="pass"placeholder="password" value="admin"/>
</form>
  
    <br><br><br><br><br><br><br><br><br><br>
   
  <footer id="foot" style="margin-bottom:0px;">
    <hr>
    <div id="copy">
         회사명 : xxxxxx  대표자 : 임종구 <br> E-Mail : stee90@naver.com <br>Tel : 042-222-8202 <br>Fax : 042-252-0678 사업자번호 : 306-82-05291
       301-805 대전광역시 중구 중앙로 76 (대흥동,영민빌딩 2층)<br><br>
       copyright © 대덕인재개발원. All Rights Reserved.
    </div>         
  </footer>
</body>
</html>