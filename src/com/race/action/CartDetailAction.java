package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceCartProdDto;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class CartDetailAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/member/goCartDetail.jsp";
		
		String cart_no = request.getParameter("cart_no");
		System.out.println("cart_no : "+cart_no);
		RaceCartVo cartVo = null;
		RaceCartProdDto cartProdDto = null;
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		
		try {
			cartVo = raceCartService.selectVo(Integer.parseInt(cart_no));
			RaceProdVo prodVo = raceProdService.selectVo(cartVo.getCart_prod());
			cartProdDto = new RaceCartProdDto(cartVo, prodVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("cartProdDto", cartProdDto);
		
		return url;		
	}

}
