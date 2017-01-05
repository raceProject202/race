package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class MyPageUpFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "/member/myPageUpForm.jsp";
		
		HttpSession session = request.getSession();
		RaceMemberVo raceMember = (RaceMemberVo) session.getAttribute("loginUser");
		
		 
//       System.out.println("id : "+mem_id);
       RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
       
       
       RaceMemberVo memberVo = null;
       try {
          memberVo = raceMemberService.selectVo(raceMember.getMem_id());
          System.out.println(memberVo);
      } catch (SQLException e) {
         e.printStackTrace();
      }
       request.setAttribute("upList", memberVo);
		return url;
	}

}
