package com.race.admin.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.race.dto.RaceProdVo;
import com.race.service.RaceProdServiceImpl;

public class ProdUpdateAction implements Action{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RaceProdServiceImpl raceProdService = RaceProdServiceImpl.getInstance();
		String url = "ProdStart.do";
//		List<RaceProdVo> prodList = null;
		RaceProdVo raceProdVo = new RaceProdVo();
		
		int sizeLimit = 1024 * 1024 * 5; //5MB
		String savePath="d:\\upload";
		HttpSession session=request.getSession();
		ServletContext context=session.getServletContext();
		String uploadFilePath=context.getRealPath(savePath);
		System.out.println("aaaaaaaaaaaaaaaaa");
		MultipartRequest multi=new MultipartRequest(request, // 1. 요청객체
				savePath, // 2. 업로드될 파일이 저장될 물리적 경로
				sizeLimit, //3 업로드될 파일 크기
				"utf-8", // 4. 인코딩 타입 지정 
				new DefaultFileRenamePolicy() // 5. 중복파일 이름 정책
				);

		String a = multi.getParameter("prod_id");
		String b = request.getParameter("prod_id");
		
		System.out.println("a : "+a+" , b : "+b);
		raceProdVo.setProd_id(Integer.parseInt(multi.getParameter("prod_id")));
		raceProdVo.setProd_name(multi.getParameter("prod_name"));
		raceProdVo.setProd_cn(multi.getParameter("prod_cn"));
		raceProdVo.setProd_cost(Integer.parseInt(multi.getParameter("prod_cost")));
		raceProdVo.setProd_price(Integer.parseInt(multi.getParameter("prod_price")));
		raceProdVo.setProd_qty(Integer.parseInt(multi.getParameter("prod_qty")));
		raceProdVo.setProd_image1(multi.getFilesystemName("imgName"));
		raceProdVo.setProd_lgu(multi.getParameter("prod_lgu"));
		System.out.println(raceProdVo);
		try {
			raceProdService.update(raceProdVo);
			url = "ProdStart.do";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return url;
	}

}
