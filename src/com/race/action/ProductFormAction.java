package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;

public class ProductFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		
		String url = "/member/prodListForm.jsp";
		
		String lgu = request.getParameter("lgu");
		
		if(lgu == null){
			lgu = (String) request.getAttribute("prod_lgu");
		}
		List<RaceProdVo> list = null;
		
		try {
			list = raceProdService.selectAllLprod(Integer.parseInt(lgu));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("ProdList", list);
		request.setAttribute("prod_lgu", lgu);
		System.out.println(lgu+"1231231231232131");
		System.out.println(list);
		
		return url;
	}
	
	
	
}
