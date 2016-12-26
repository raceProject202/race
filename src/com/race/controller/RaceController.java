package com.race.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.admin.action.Action;


public class RaceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private Map commandMap = new HashMap(); // 명령어와 명령어 처리 클래스를 쌍으로 저장
	
  	@Override
	public void init() throws ServletException {
  		loadProperties("com/race/properties/Command");
  	}
  	
  	private void loadProperties(String path) {
		ResourceBundle rbHome = ResourceBundle.getBundle(path);// 누구를 실행할지를 rb에 저장.
		Enumeration<String> actionEnumHome = rbHome.getKeys();
		while (actionEnumHome.hasMoreElements())
		{
			String command = actionEnumHome.nextElement();
			String className = rbHome.getString(command);
			try {
				Class commandClass = Class.forName(className); // 해당 문자열을 클래스로 만든다
				Object commandInstance = commandClass.newInstance(); // 해당 클래스의 객체를 생성
				commandMap.put(command, commandInstance); // Map 객체인 commandMap에 객체 저장
			} catch (ClassNotFoundException e) {
				continue; // error
				// throw new ServletException(e);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		System.out.println(commandMap);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	private void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String view = null;
		Action com = null;
		try {
			String command = request.getRequestURI();
			if (command.indexOf(request.getContextPath()) == 0) {
				command = command.substring(request.getContextPath().length());
			}
			com = (Action) commandMap.get(command);
			System.out.println("command : "+command);
			if (com == null) {
				System.out.println("not found : " + command);
				return;
			}

			view = com.execute(request, response);
			if (view == null) {
				return;
			}

		} catch (Throwable e) {
			throw new ServletException(e);

		}

		if (view == null)
			return;
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);

	}

	
}
