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
import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceMemberServiceImpl;

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
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		
		try {
			cartList = raceCartService.listCart(loginUser.getMem_id());
			
			request.setAttribute("cartList", cartList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return url;		
	}

}
