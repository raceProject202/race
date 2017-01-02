package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceCartDto;
import com.race.dto.RaceCartProdDto;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class CartListAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "/cart/cartMain.jsp";
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("loginUser") == null) {
			url = "loginForm.do";
			return url;
		} 
		
		RaceMemberVo loginUser = (RaceMemberVo) session.getAttribute("loginUser");
		List<RaceCartVo> cartList = null;
		List<RaceCartProdDto> cartDtoList = new ArrayList<>();
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		try {
			cartList = raceCartService.listCart(loginUser.getMem_id());
			for(RaceCartVo x : cartList){
				RaceProdVo prodVo = raceProdService.selectVo(x.getCart_prod());
				RaceCartProdDto cartProdDto = new RaceCartProdDto(x, prodVo);
				cartDtoList.add(cartProdDto);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("cartProdList", cartDtoList);
		
		return url;		
	}

}
