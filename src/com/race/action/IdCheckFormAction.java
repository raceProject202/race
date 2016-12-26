package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.service.RaceMemberServiceImpl;


public class IdCheckFormAction implements RaceAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "/member/idcheck.jsp";
		String id = request.getParameter("id").trim();
		
		//MemberDAO memberDAO=MemberDAO_JDBC.getInstance();		
		RaceMemberServiceImpl raceMember = RaceMemberServiceImpl.getInstance();
		int message=-1;
		try {
			message = raceMember.confirmID(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("message", message);
		request.setAttribute("id", id);
		
		return url;
	}

}
