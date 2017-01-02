package com.race.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/popup.do")
public class PopupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		if(request.getParameter("one_day")!=null && request.getParameter("one_day").equals("check")){
			CookieBox cookieBox = new CookieBox(request);		
			if(!cookieBox.exists("POPUP1"))
				response.addCookie(CookieBox.createCookie("POPUP1", "one_day", "/",10));					
		}
		
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
