package test;

import java.sql.SQLException;

import com.race.dao.RaceMemberDaoImpl;
import com.race.dao.RaceProdDaoImpl;
import com.race.dto.RaceMemberVo;
import com.race.service.RaceMemberServiceImpl;

public class memberTest {

	
	public static void main(String[] args) {
		
		System.out.println("eeee");
		RaceMemberServiceImpl dao = RaceMemberServiceImpl.getInstance();
		RaceMemberVo vo = new RaceMemberVo();
		
		vo.setMem_id("b");
		vo.setMem_pass("a");
		vo.setMem_name("a");
		vo.setMem_zip("a");
		vo.setMem_add1("a");
		vo.setMem_add2("a");
		vo.setMem_hp("a");
		vo.setMem_email("a");
		
		try {
			dao.insert(vo);
			System.out.println(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
