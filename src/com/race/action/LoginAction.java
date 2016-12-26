package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class LoginAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "/index.jsp";
		
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		RaceMemberServiceImpl raceMemberServie = RaceMemberServiceImpl.getInstance();
		RaceMemberVo raceMemberVo = null;
		
		try {
			raceMemberVo = raceMemberServie.selectVo(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (raceMemberVo != null) {
			if (raceMemberVo.getMem_pass().equals(password)) {
				session.setAttribute("loginUser", raceMemberVo);
			}
		}
		return url;
	}
	
}
		
		
		
		
		/*if(raceMemberVo == null){
			url = "member/login_fail.jsp";
		}else{
			if(raceMemberVo.getMem_pass().equals(password)){
				session.removeAttribute("id");
				session.setAttribute("loginUser", raceMemberVo);
				url = "main.do?login=1";
				System.out.println("로그인 성공");
			}
		}
		System.out.println("로그인 실패");*/
		/*return url;*/
