package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceZipTbVo;
import com.race.service.RaceZipTbServiceImpl;

public class RaceZipNumAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "member/raceZipNum.jsp";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String dong = request.getParameter("dong");
		System.out.println("ppp");
		if (dong != null && dong.trim().equals("") == false) {
			//AddressDAO addressDAO = AddressDAO_JDBC.getInstance();
			RaceZipTbServiceImpl raceZimNum = RaceZipTbServiceImpl.getInstance();
			try {
				ArrayList<RaceZipTbVo> raceZip = (ArrayList<RaceZipTbVo>) raceZimNum.selectNameAll(dong);
				request.setAttribute("raceZip", raceZip);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return url;
	}

}
