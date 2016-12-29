package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceCartMemberDto;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceCartServiceImpl;
import com.race.service.RaceMemberServiceImpl;

public class CartGoM1ListAllAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RaceCartServiceImpl raceCartService = RaceCartServiceImpl.getInstance();
		RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
		String url = "cartGoM1ListForm.jsp";
		
		List<RaceCartVo> cartList = null;
		List<RaceCartMemberDto> cartMemberList = new ArrayList<RaceCartMemberDto>();
		RaceMemberVo membarVo = null;
		try {
			cartList = raceCartService.selectAll();
//			System.out.println("cartList : "+cartList);
			for(RaceCartVo cartVo : cartList){
				membarVo = raceMemberService.selectVo(cartVo.getCart_member());
//				System.out.println("membarVo : "+membarVo);
				RaceCartMemberDto cartmemberDto = new RaceCartMemberDto(cartVo, membarVo);
//				System.out.println("cartDto : "+cartDto);
				cartMemberList.add(cartmemberDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("raceCartList", cartMemberList);
		
		return url;
	}
	

}
