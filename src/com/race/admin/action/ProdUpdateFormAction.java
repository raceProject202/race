package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceLprodVo;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceLprodServiceImpl;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class ProdUpdateFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		 String url = "prodUpdateForm.jsp";

		 String prod_id = request.getParameter("prod_id");
//		    System.out.println("id : "+prod_id);
		    RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		    RaceLprodServiceImpl raceLprodService = RaceLprodServiceImpl.getInstance();
		    
		    
		    RaceProdVo ProdVo = null;
		    List<RaceLprodVo> lprodList = null;
		    try {
		    	ProdVo = raceProdService.selectVo(Integer.parseInt(prod_id));
		    	lprodList = raceLprodService.selectAll();
//		    	System.out.println(ProdVo);
		   } catch (SQLException e) {
		      e.printStackTrace();
		   }
		    System.out.println(" 이미지 : "+ProdVo.getProd_image1());
		    request.setAttribute("ProdVo", ProdVo);
		    request.setAttribute("LprodList", lprodList);

		    
		    
		    return url;
	}
}