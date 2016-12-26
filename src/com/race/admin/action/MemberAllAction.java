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
		String url = "MemberList.jsp";
		
		List<RaceMemberVo> list = null;
		try {
			list = raceMemberService.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("raceMemberList", list);
		
		return url;
	}

}
