package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceMemberVo;
import com.race.dto.RaceQnaVo;
import com.race.service.RaceQnaServiceImpl;

public class QnaListFormAction implements RaceAction {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "/qna/qnaForm.jsp";

		HttpSession session = request.getSession();
		RaceMemberVo raceMember = (RaceMemberVo) session
				.getAttribute("loginUser");

		RaceQnaServiceImpl raceQnaService = RaceQnaServiceImpl.getInstance();
		List<RaceQnaVo> listQna = null;
		
			
		
			try {
				listQna = raceQnaService.selectAll();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(listQna.get(1) + "가나다라마바사");
			request.setAttribute("listQna", listQna);
		
		return url;
	}

}
