package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;

public class IndexAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest requset,
			HttpServletResponse response) throws ServletException, IOException {

		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		String url = "/index.jsp";
		
		
		List<RaceProdVo> list = null;
		
		try {
			list = raceProdService.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		requset.setAttribute("ProdList", list);
		
		return url;
	}

}
