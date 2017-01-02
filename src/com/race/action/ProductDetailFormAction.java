package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceLprodVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceLprodServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class ProductDetailFormAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		RaceLprodServiceImpl raceLprodService = RaceLprodServiceImpl.getInstance();
		
		String url = "/member/ProdDetailForm.jsp";
		String prid_id = request.getParameter("prod_id");
		String prid_lgu = request.getParameter("prod_lgu");

		RaceProdVo raceProdVo = null;
		RaceLprodVo raceLprodVo = null;
		try {
			raceProdVo = raceProdService.selectVo(Integer.parseInt(prid_id));
			raceLprodVo = raceLprodService.selectVo(prid_lgu);
			System.out.println("raceLprodVo : "+raceLprodVo);
			raceProdService.getProd(Integer.parseInt(prid_id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("ProdVo", raceProdVo);
//		System.out.println(raceProdVo+"######################");
		request.setAttribute("LprodVo", raceLprodVo);
		
		return url;
	}

}
