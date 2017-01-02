package com.race.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;

public class MyPageFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "/member/myPageForm.jsp";
		
		HttpSession session = request.getSession();
		RaceMemberVo raceMember = (RaceMemberVo) session.getAttribute("loginUser");
		
		if(raceMember == null){
			url = "/qna/qna_fail.jsp";	// alert창을 보여주기 위해서 썻음
		}
		
		
		return url;
	}

}
