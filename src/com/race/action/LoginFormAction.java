package com.race.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;

public class LoginFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/member/loginForm.jsp";
		
		HttpSession session = request.getSession();
		RaceMemberVo loginUser = (RaceMemberVo) session.getAttribute("loginUser");
		
		if (loginUser != null) {
			url = "main.do";		
		} 
		
		return url;	
	}

}
