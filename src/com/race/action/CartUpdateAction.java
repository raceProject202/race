package com.race.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceCartVo;
import com.race.service.RaceCartServiceImpl;

public class CartUpdateAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "goCartListAction.do";
		
		String cart_no = request.getParameter("cart_no");
		System.out.println("cart_no : "+cart_no);
		String cart_qty = request.getParameter("cart_qty");
		System.out.println("cart_qty : "+cart_qty);
		RaceCartVo raceVo = new RaceCartVo();
		raceVo.setCart_no(Integer.parseInt(cart_no));
		raceVo.setCart_qty(Integer.parseInt(cart_qty));
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		try {
			raceCartService.update(raceVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return url;		
	}

}
