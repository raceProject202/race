package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.race.dao.RaceQnaDaoImpl;
import com.race.dto.RaceQnaVo;

public class AdminQnaResaveAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String url = "QnaStart.do";

		String qna_qseq = request.getParameter("qseq");
		String qna_reply = request.getParameter("reply").trim();

		RaceQnaVo raceQnaVo = new RaceQnaVo();
		raceQnaVo.setQna_qseq(Integer.parseInt(qna_qseq));
		raceQnaVo.setQna_reply(qna_reply);

		/* QnaDAO qnaDAO = QnaDAO_JDBC.getInstance(); */
		RaceQnaDaoImpl raceQnaDaoImpl= RaceQnaDaoImpl.getInstance();
		try {
			raceQnaDaoImpl.updateRe(raceQnaVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return url;
	}
}
