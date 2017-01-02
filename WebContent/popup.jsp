<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<style type="text/css">

#popup {
   background-color: #121212;
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

/* #popup>div {
   position:relative;
} */

 h1 {
   margin-left:20px;
} 

p {
   font-size: 20px;
   text-align: center;
}
#left{
	margin-left:20px;
	color:#FFFFFF;
	margin-top:5px;
	
}
#popHeader{
	background-color: #FF0000;
} 
#popupImg{
	margin-left:20px;
	
}
#popupRace{
	margin-top:5px;
	margin-left:10px;
}
#pp{
	padding:5px;
	color:#FFFFFF;
}
#popupFont{
	color:#FFFFFF;
}
#popupFont2{
	color:#FFFFFF;
	padding-left:50px;
	padding-top:100px;
}
#popupImg2{
	margin-left:140px;
}
#btn{
	color:#000000;
}
</style>

<div id="popup">
      <img id="popupRace"src="img/popupRace.jpg">
      <p id = "pp"><b>어서오세요&nbsp;Race&nbsp;홈페이지 입니다.<br>New Item 입니다. 구경하고 가세요!</b></p>
	 <div id="popupImg">
      <a href="productElectric.do" id="popupFont"><img src="img/popup.png" alt=""></a>
      <div id="popupImg2">
      <a href="productElectric.do" id="popupFont2"><img src="img/popup2.png" alt=""></a>
     </div>
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

