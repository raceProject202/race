package com.race.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.race.dto.RaceCartVo;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceCartServiceImpl;

/**
 * 카트 담기 액션
 * @author 최인송
 *
 */
public class CartInsertAction implements RaceAction
{
	/**
	 * 카트 담기 액션
	 * 
	 * 카트에 상품을 담은 후 장바구니 페이지로 이동 처리
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url = "";
		
		// 세션 확인
		HttpSession session = request.getSession();
		
		if (session.getAttribute("loginUser") == null) {
			url = "loginForm.do";
			return url;
		} 
		
		RaceMemberVo loginUser = (RaceMemberVo) session.getAttribute("loginUser");
		
		
		// 상품 정보 취득
//		CART_NO
//		CART_PROD
//		CART_MEMBER
//		CART_QTY
		url = "CartListAction.do";
		System.out.println("request 값 확인 1");
		Enumeration<String> parameterNames = request.getParameterNames();
		
		while(parameterNames.hasMoreElements())
		{
			String key = parameterNames.nextElement();
			
			System.out.println("KEY : " + key + ", VAL : " + request.getParameter(key));
		}
		

		System.out.println("request 값 확인 2");
		
		int		cartProd		= Integer.parseInt(request.getParameter("CART_PROD"));
		String	cartMember	= loginUser.getMem_id(); // TODO 세션에서 맴버정보 조회할 것
		int		cartQty			= Integer.parseInt(request.getParameter("CART_QTY"));
		
		RaceCartVo vo = new RaceCartVo();

		vo.setCart_prod(cartProd);
		vo.setCart_member(cartMember);
		vo.setCart_qty(cartQty);
		
		System.out.println("카트 추가 전 값 확인 : " + vo.toString());
		
		
		// 상품 정보 카트에 추가
		RaceCartServiceImpl cartService = RaceCartServiceImpl.getInstance();
		
		try 
		{
			cartService.insert(vo);
			//request.setAttribute("cartList", cartList);
		} 
		catch (SQLException e) 
		{
			System.out.println("카트 담기중 에러 발생1 : " + e.getCause());
			System.out.println("카트 담기중 에러 발생2 : " + e.getMessage());
		}
		
		// 카트 페이지로 이동
		return url;
	}

}
