package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceLprodVo;
import com.race.service.RaceLprodServiceImpl;

public class ProdInsertFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RaceLprodServiceImpl raceLprodService = RaceLprodServiceImpl.getInstance();
		
		String url = "prodInsertForm.jsp";
		
		List<RaceLprodVo> lprodList = null;
		try {
			lprodList = raceLprodService.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("LprodList", lprodList);
		return url;
	}

}
