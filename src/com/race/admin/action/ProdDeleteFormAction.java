package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;

public class ProdDeleteFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		 String url = "prodDeleteForm.jsp";

		    String prod_id = request.getParameter("prod_id");
		    System.out.println("id : "+prod_id);
		    RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		    
		    
		    RaceProdVo ProdVo = null;
		    try {
		    	ProdVo = raceProdService.selectVo(Integer.parseInt(prod_id));
		    	System.out.println(ProdVo);
		   } catch (SQLException e) {
		      e.printStackTrace();
		   }
		    request.setAttribute("ProdVo", ProdVo);
		    
		    return url;
	}
}