package com.race.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dao.RaceQnaDaoImpl;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceQnaVo;


public class QnaDetailAction implements RaceAction {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();            
	
	String url = "/member/QnaDetail.jsp";
    
    HttpSession session = request.getSession();
	RaceMemberVo raceMember = (RaceMemberVo) session
			.getAttribute("loginUser");
	
	if(raceMember==null){
		out.println("<script>alert('로그인을 해주세요.');</script>");
		return "qnaListForm.do";
	}
    String qseq = request.getParameter("qseq").trim();
    String id = request.getParameter("id").trim();
    String loginId = raceMember.getMem_id();
   
    if(loginId.equals(id)){
    
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
    
    }else{
    out.println("<script>alert('작성자만 볼수있습니다.');</script>");
    url="qnaListForm.do";
    }
    return url;
  }
}
