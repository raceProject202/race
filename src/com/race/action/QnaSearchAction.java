package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceQnaVo;
import com.race.service.RaceQnaServiceImpl;

public class QnaSearchAction implements RaceAction {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String url = "/qna/qnaForm.jsp";

		HttpSession session = request.getSession();
		String search = request.getParameter("key");
		System.out.println(search);

		RaceQnaServiceImpl raceQnaService = RaceQnaServiceImpl.getInstance();
		List<RaceQnaVo> list = null;
		try {
			list = raceQnaService.search(search);
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("listQna", list);

		return url;
	}
}
