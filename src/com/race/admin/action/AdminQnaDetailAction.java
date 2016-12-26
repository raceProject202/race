package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dao.RaceQnaDaoImpl;
import com.race.dto.RaceQnaVo;


public class AdminQnaDetailAction implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
    String url = "qnaDetail.jsp";

    String qseq = request.getParameter("qseq").trim();

    /*QnaDAO qnaDAO = QnaDAO_JDBC.getInstance();*/
    RaceQnaDaoImpl raceQnaDaoImpl= RaceQnaDaoImpl.getInstance();
    RaceQnaVo raceQnaVo=null;
	try {
		raceQnaVo = raceQnaDaoImpl.selectVo(Integer.parseInt(qseq));
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}

    request.setAttribute("QnaVo", raceQnaVo);
        
    return url;
  }
}
