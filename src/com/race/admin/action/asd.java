package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class asd implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String url = "memberListForm.jsp";
    
    RaceMemberServiceImpl raceMemberService = RaceMemberServiceImpl.getInstance();
    
    
    List<RaceMemberVo> list = null;
    try {
      list = raceMemberService.selectAll();
      System.out.println("2 : "+list);
   } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }
    request.setAttribute("memberList", list);
    
    
    return url;
  }
}