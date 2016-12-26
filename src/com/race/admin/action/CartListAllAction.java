package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceCartDto;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceMemberServiceImpl;
import com.race.service.RaceProdServiceImpl;

public class CartListAllAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		String url = "cartListForm.jsp";
		
		List<RaceCartVo> cartList = null;
		List<RaceCartDto> cartMemberList = new ArrayList<RaceCartDto>();
		RaceMemberVo membarVo = null;
		try {
			cartList = raceCartService.selectAll();
//			System.out.println("cartList : "+cartList);
			for(RaceCartVo cartVo : cartList){
				membarVo = raceMemberService.selectVo(cartVo.getCart_member());
//				System.out.println("membarVo : "+membarVo);
				RaceCartDto cartDto = new RaceCartDto(cartVo, membarVo);
//				System.out.println("cartDto : "+cartDto);
				cartMemberList.add(cartDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("raceCartList", cartMemberList);
		
		return url;
	}
	

}
