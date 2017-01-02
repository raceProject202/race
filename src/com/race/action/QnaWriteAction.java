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

public class QnaWriteAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String url = "qnaListForm.do";
		
		HttpSession session = request.getSession();
		RaceMemberVo raceMember = (RaceMemberVo) session.getAttribute("loginUser");
		
		if(raceMember == null){
			url = "/qna/qna_fail.jsp";
		}else{
			RaceQnaVo qnaVo = new RaceQnaVo();
			System.out.println("안녕");
			qnaVo.setQna_id(raceMember.getMem_id());
			qnaVo.setQna_title(request.getParameter("title"));
			qnaVo.setQna_content(request.getParameter("content"));
			RaceQnaServiceImpl raceQna = RaceQnaServiceImpl.getInstance();
			
			
			try {
				raceQna.insert(qnaVo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return url;
	}

}
