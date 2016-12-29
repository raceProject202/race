package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceCartProdDto;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class goCartListAction implements RaceAction{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "/member/goCartMain.jsp";
		
		HttpSession session = request.getSession();
		
		if (session.getAttribute("loginUser") == null) {
			url = "loginForm.do";
			return url;
		} 
		
		RaceMemberVo loginUser = (RaceMemberVo) session.getAttribute("loginUser");
//		System.out.println("로그인 아이디 : "+loginUser);
		List<RaceCartVo> cartList = null;
		List<RaceCartProdDto> cartDtoList = new ArrayList<>();
		
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
//		System.out.println("아이디 : "+loginUser.getMem_id());
		try {
			cartList = raceCartService.listCart(loginUser.getMem_id());
//			System.out.println("카트 : "+cartList);
			for(RaceCartVo x : cartList){
				RaceProdVo prodVo = raceProdService.selectVo(x.getCart_prod());
				System.out.println("출력문들 : "+x+prodVo);
				RaceCartProdDto cartProdDto = new RaceCartProdDto(x, prodVo);
				System.out.println("출력분2 : "+cartProdDto);
				cartDtoList.add(cartProdDto);
				System.out.println("ok : "+cartProdDto.getCart_ok());
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("cartProdList", cartDtoList);
		
		return url;		
	}

}
