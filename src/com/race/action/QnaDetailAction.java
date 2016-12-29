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
	
	RaceQnaDaoImpl raceQnaDaoImpl= RaceQnaDaoImpl.getInstance();
	String url = "/qnaListForm.do";
			
	HttpSession session = request.getSession();
	RaceMemberVo raceVo = new RaceMemberVo();
	raceVo = (RaceMemberVo) session.getAttribute("loginUser");
	if(raceVo==null){
		out.println("<script>alert('로그인을 해주세요.');</script>");
		return url;
	}
	String loginId = raceVo.getMem_id(); //로그인한 아이디 가져옴
	
    String qseq = request.getParameter("qseq").trim();
    String qnaId = request.getParameter("id").trim();//질문한 아이디 가져옴.
     
    RaceQnaVo raceQnaVo=null;
    if(loginId.equals(qnaId)){
	try {
		
		raceQnaVo = raceQnaDaoImpl.selectVo(Integer.parseInt(qseq));
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
    request.setAttribute("QnaVo", raceQnaVo);
    url ="/member/QnaDetail.jsp";
    }else{
    	out.println("<script>alert('질문자만 볼 수 있습니다.');</script>");
    }
    
    return url;
  }
}
