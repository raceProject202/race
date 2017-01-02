package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceQnaVo;
import com.race.service.RaceQnaServiceImpl;


public class QnaListAllAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceQnaServiceImpl raceQnaService = RaceQnaServiceImpl.getInstance();
		String url = "qnaListForm.jsp";
		
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
	      
		List<RaceQnaVo> list = null;
		String paging=null;
		try {
			list = raceQnaService.selectAllPage(Integer.parseInt(tpage), key);
//			System.out.println("list end : "+list);
			paging = raceQnaService.pageNumber(Integer.parseInt(tpage), key);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int n=list.size();   
	      request.setAttribute("qnaListSize",n); 
	      request.setAttribute("paging", paging); 
		request.setAttribute("QnaList", list);
		
		return url;
	}

}
