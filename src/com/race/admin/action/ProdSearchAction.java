package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;


public class ProdSearchAction implements Action{

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
         
      List<RaceProdVo> list = null;
      String paging=null;
      try {
         list = raceProdService.selectAllPage(Integer.parseInt(tpage), key);
         paging = raceProdService.pageNumber(Integer.parseInt(tpage), key);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      int n=list.size();
      request.setAttribute("ProdList", list);
      request.setAttribute("productListSize",n); 
      request.setAttribute("paging", paging);  
      
      return url;
   }

}