package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceCartServiceImpl;

public class cartStartAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceCartVo cartVo = new RaceCartVo();
		
		HttpSession session = request.getSession();
		String url = "prodDetail.do";
		if (session.getAttribute("loginUser") == null) {
			url = "loginForm.do";
			return url;
		} 
		
		RaceMemberVo loginUser = (RaceMemberVo) session.getAttribute("loginUser");
		
		String cart_prod = request.getParameter("prod_id");
		String cart_qty = request.getParameter("cart_qty");
//		cart_prod.equals(anObject)
//		System.out.println("cart_prod : "+cart_prod);
//		System.out.println("cart_qty : "+cart_qty);
		cartVo.setCart_prod(Integer.parseInt(cart_prod));
		cartVo.setCart_qty(Integer.parseInt(cart_qty));
		cartVo.setCart_member(loginUser.getMem_id());
		
//		System.out.println("cartVo : "+cartVo);
		
		try {
			raceCartService.insert(cartVo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return url;
	}

}
