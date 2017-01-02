package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class MemberDetailAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		 String url = "memberDetail.jsp";

		    String mem_id = request.getParameter("mem_id");
//		    System.out.println("id : "+mem_id);
		    RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		    
		    
		    RaceMemberVo memberVo = null;
		    try {
		    	memberVo = raceMemberService.selectVo(mem_id);
//		    	System.out.println(memberVo);
		   } catch (SQLException e) {
		      e.printStackTrace();
		   }
		    request.setAttribute("memberVo", memberVo);
		    
		    return url;
	}

}
