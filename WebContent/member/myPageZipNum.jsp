<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>우편 번호 검색</title>
<style type="text/css">
/* body{   
   background-color:#B96DB5;
   font-family: Verdana;
} */
#popup{   
	margin:0 auto;
}
#popup h1 {
   font-family: "Times New Roman", Times, serif;
   font-size: 45px;
   color: #000000;
   font-weight: bold;
    font-family: Verdana;
    text-align:center;
}

table#zipcode {
    border-collapse:collapse;    /* border 사이의 간격 없앰 */   
    border-top: 3px solid  #000000;  
    border-bottom: 3px solid  #000000;
    width: 100%;  
    margin-top: 10px; 
    margin-right:30px;
    
}
table#zipcode tr{
	margin-left:1%;
	
}
table#zipcode th, table#zipcode td{   
   text-align: center;
   border-bottom: 1px dotted  #000000;  
   color:#000000;   
}
table th, td{
  padding: 10px;
}
table#zipcode  a{
   display:block; 
    height:20px;
    text-decoration:none;
    color:#000000;
    padding: 10px;
}


table#zipcode a:hover{
    color: #F90;
    font-weight: bold;
}

#form{
margin-left:24%;
}

#inputt{
	border-radius:12px;
}
</style>
<script type="text/javascript">
function result(zipcode,sido,gugun,dong) {
	
   opener.document.updateForm.zipcode.value=zipcode;
   opener.document.updateForm.add1.value=sido+" "+gugun+" "+dong;
   self.close();
};
</script>
</head>
<body>
<div id="popup">
  <h1>우편번호검색</h1>
  <form method=post name=formm action="raceMyPageUpZipNum.do" id="form">
    동 이름 : <input name="dong" type="text" id="inputt">
           <input type="submit" class="btn btn-defalut" value="찾기">
  </form>
  <table id="zipcode">
    <tr>
      <th>우편번호</th>
      <th>주소</th>
    </tr>
    <c:forEach items="${raceZip}" var="raceZipTbVo">
    <tr>
      <td>${raceZipTbVo.zipcode}</td>
        <td>
          <a href="#" onclick="return result('${raceZipTbVo.zipcode}'
,'${raceZipTbVo.sido}', '${raceZipTbVo.gugun}','${raceZipTbVo.dong}')">
            ${raceZipTbVo.sido} ${raceZipTbVo.gugun} ${raceZipTbVo.dong} 
          </a>
        </td>
    </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>