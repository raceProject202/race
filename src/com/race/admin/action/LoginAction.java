package com.race.admin.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String url = "loginForm.jsp";
    String msg = "ggg";
    String workerId = request.getParameter("id").trim();
    String workerPwd = request.getParameter("pwd").trim();


    
    if (!workerId.equals("admin")) {
      msg = "아이디를 확인하세요.";
      System.out.println("아이디를 확인하세요.");
    } else if (!workerPwd.equals("admin")) {
      msg = "비밀번호를 확인하세요.";
      System.out.println("비밀번호를 확인하세요.");
    }else{
    	HttpSession session = request.getSession();
    	session.setAttribute("workerId", workerId);
    	url = "cartListAll.do";    	
    }
    request.setAttribute("message", msg);
    return url;
  }
}
