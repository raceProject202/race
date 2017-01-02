package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dao.RaceDao;
import com.race.dao.RaceMemberDaoImpl;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class JoinAction implements RaceAction {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String url = "/index.jsp";	// 바꿀것!로그인했을시 넘어가는 화면으로 처리해야할것!
		
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
		
		RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		/*RaceDao raceDao = RaceMemberDaoImpl.getInstance();*/
		try {
			raceMemberService.insert(raceMemberVo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute("id", request.getParameter("id"));
		return url;
	}

}
