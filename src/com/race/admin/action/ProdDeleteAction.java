package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.service.RaceProdServiceImpl;

public class ProdDeleteAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
	      String url = "ProdStart.do";
	      
	      String prod_id = request.getParameter("id");
	      System.out.println("id : "+prod_id);
	      try {
	    	  raceProdService.delete(Integer.parseInt(prod_id));
//	         System.out.println("list end : "+prodList);
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
		return url;
	}

}
