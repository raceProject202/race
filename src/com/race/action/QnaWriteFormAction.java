package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;
import com.race.dto.RaceQnaVo;
import com.race.service.RaceQnaServiceImpl;

public class QnaWriteFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String url = "qna/qnaWriteForm.jsp";	
		HttpSession session = request.getSession();
		RaceMemberVo raceVo = new RaceMemberVo();
		raceVo = (RaceMemberVo) session.getAttribute("loginUser");
		String RaceId = raceVo.getMem_id();
		request.setAttribute("RaceId", RaceId);
		return url;
	}

}
