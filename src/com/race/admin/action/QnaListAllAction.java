package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.race.dto.RaceQnaVo;
import com.race.service.RaceQnaServiceImpl;


public class QnaListAllAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceQnaServiceImpl raceQnaService = RaceQnaServiceImpl.getInstance();
		String url = "qnaListForm.jsp";
		
		List<RaceQnaVo> list = null;
		try {
			list = raceQnaService.selectAll();
			System.out.println("list end : "+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("QnaList", list);
		
		return url;
	}

}
