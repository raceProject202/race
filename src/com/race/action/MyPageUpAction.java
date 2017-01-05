package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class MyPageUpAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MyPageUpAction");
		request.setCharacterEncoding("UTF-8");
		
		String url = "/member/myPageForm.jsp";
		
		HttpSession session = request.getSession();
		
		RaceMemberVo raceMemberVo = new RaceMemberVo();
		
		raceMemberVo.setMem_id(request.getParameter("id"));
		raceMemberVo.setMem_name(request.getParameter("name"));
		raceMemberVo.setMem_pass(request.getParameter("password"));
		raceMemberVo.setMem_add1(request.getParameter("add1"));
		raceMemberVo.setMem_add2(request.getParameter("add2"));
		raceMemberVo.setMem_email(request.getParameter("email"));
		raceMemberVo.setMem_hp(request.getParameter("phone"));
		raceMemberVo.setMem_zip(request.getParameter("zipcode"));
		
		System.out.println("2132132132132+++++++++++++++");
		System.out.println(raceMemberVo);
		System.out.println("2132132132132");
		
		RaceMemberServiceImpl raceService = RaceMemberServiceImpl.getInstance();
	
		try {
			raceService.update(raceMemberVo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("id", request.getParameter("id"));
		return url;
	}

}
