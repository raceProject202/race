package com.race.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements RaceAction {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = "/index.jsp";

		HttpSession session = request.getSession(false);

		if (session != null) {
			session.invalidate();
		}

		return url;

	}

}
