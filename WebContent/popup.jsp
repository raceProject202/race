<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<style type="text/css">

#popup {
   background-color: #EDEDED;
   -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=50)";
   -moz-opacity: 1;
   -khtml-opacity: 1;
   width: 400px;
   height: 400px;
   position: absolute;
   left: 1%;
   top:200px;
   z-index: 1;
}

#popup>div {
   position:relative;
}

 h1 {
   margin-left:20px;
} 

p {
   font-size: 20px;
   text-align: center;
}
#left{
	margin-left:180px;
	margin-top:30px;
}
#popHeader{
	background-color: #FF0000;
} 
</style>

<div id="popup">
      <h1>Race</h1>
      <p>어서오세요&nbsp;Race&nbsp;홈페이지 입니다.<p>
      <br><br><br><br><br><br>
	<div id="popupImg">
      <img src="img/electric/popup.png" alt="">
      <a href="productElectric.do">alton</a>
 </div>
   <div id = "left">
      <form name="form" method="get" action="<%=request.getContextPath()%>/popup.do" >
      <input type="checkbox" id="check" name="one_day" value="check" />
         <label for="check">오늘하루보이지않기</label>
         <button id="btn" onclick="return close_click(this.form);">close</button>
      </form>
   </div>
</div>

<script>
   function close_click(form) {
      var popup = document.getElementById("popup");

      if (document.getElementById("check").checked) {
         popup.style.display = "none";
         return true;
      } else {
         popup.style.display = "none";
         return false;
      }

   }
</script>

