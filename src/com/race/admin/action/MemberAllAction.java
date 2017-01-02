package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;


public class MemberAllAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		String url = "memberListForm.jsp";
		
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
		
		
		List<RaceMemberVo> list = null;
		String paging=null;
		try {
			list = raceMemberService.selectAllPage(Integer.parseInt(tpage), key);
			System.out.println("member : "+list);
			paging = raceMemberService.pageNumber(Integer.parseInt(tpage), key);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int n=list.size();   
	      request.setAttribute("memberListSize",n); 
	      request.setAttribute("paging", paging); 
		request.setAttribute("memberList", list);
		
		return url;
	}

}
