package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceLprodVo;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceLprodServiceImpl;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;


public class ProdListAction implements Action{

   @Override
   public String execute(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
      RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
      String url = "prodListForm.jsp";
      
      String key=request.getParameter("key");
      String tpage=request.getParameter("tpage");
      if(key==null){
       key="";
      }    
      if(tpage== null){
        tpage="1"; //현재 페이지 (default 1)                        
      }else if(tpage.equals("")){
         tpage="1";  
      }
      request.setAttribute("key", key);
      request.setAttribute("tpage",tpage);
      
      List<RaceProdVo> prodList = null;
      String paging=null;
      try {
    	  prodList = raceProdService.selectAllPage(Integer.parseInt(tpage), key);
    	  paging = raceProdService.pageNumber(Integer.parseInt(tpage), key);
//         System.out.println("list end : "+prodList);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      int n=prodList.size();   
      request.setAttribute("ProdList", prodList);
      request.setAttribute("productListSize",n); 
      request.setAttribute("paging", paging);   
      
      return url;
   }

}