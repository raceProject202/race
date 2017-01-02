package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;

public class ProductHybridFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		
		String url = "/member/hybrid.jsp";
		
		String lgu = request.getParameter("lgu");
		List<RaceProdVo> list = null;
		
		String prod_lgu = "1";
		try {
			list = raceProdService.selectAllLprod(Integer.parseInt(lgu));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("ProdList", list);
		request.setAttribute("prod_lgu", lgu);
		System.out.println(list);
		
		return url;
	}
	
}
