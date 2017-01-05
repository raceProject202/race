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

		RaceQnaServiceImpl raceQnaService = RaceQnaServiceImpl.getInstance();
		String url = "/qna/qnaForm.jsp";

		HttpSession session = request.getSession();
		RaceMemberVo raceMember = (RaceMemberVo) session
				.getAttribute("loginUser");

		String key = request.getParameter("key");
		String tpage = request.getParameter("tpage");
		if (key == null) {
			key = "";
		}
		if (tpage == null) {
			tpage = "1"; // 현재 페이지 (default 1)
		} else if (tpage.equals("")) {
			tpage = "1";
		}
		request.setAttribute("key", key);
		request.setAttribute("tpage", tpage);

		List<RaceQnaVo> listQna = null;
		String paging = null;

		try {
			listQna = raceQnaService
					.selectAllPage(Integer.parseInt(tpage), key);
			paging = raceQnaService.pageNumber2(Integer.parseInt(tpage), key);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(listQna.get(1) + "가나다라마바사");
		int n=listQna.size();   
	    request.setAttribute("qnaListSize",n); 
	    request.setAttribute("paging", paging); 
		request.setAttribute("listQna", listQna);

		return url;
	}

}
