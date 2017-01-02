package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.service.RaceCartServiceImpl;

public class CartGoM1OrderAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		String url = "cartGoM1ListAll.do";
		
		String[] order = request.getParameterValues("result");
		
		for(String x:order){
//	        System.out.println(x);
	        try {
				raceCartService.updateLast(Integer.parseInt(x));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
		return url;
	}

}
