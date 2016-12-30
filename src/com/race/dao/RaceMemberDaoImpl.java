package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceMemberDaoImpl implements RaceDao<RaceMemberVo,String>{

	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceMemberDaoImpl instance = new RaceMemberDaoImpl();
	static int view_rows = 5; 	// 페이지의 개수
	static int counts = 10; 		// 한 페이지에 나타낼 상품의 개수
	
	private RaceMemberDaoImpl() {
	}

	public static RaceMemberDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<RaceMemberVo> selectAll() throws SQLException {
		List<RaceMemberVo> list=null;
		list = (ArrayList<RaceMemberVo>)client.queryForList("selectAllMember");
		return list;
	}
	
	public List<RaceMemberVo> selectNameAll(String mem_name) throws SQLException {
		List<RaceMemberVo> list=null;
		list = (ArrayList<RaceMemberVo>)client.queryForList("selectNameMember", mem_name);
		return list;
	}

	@Override
	public RaceMemberVo selectVo(String key) throws SQLException {
		RaceMemberVo raceMemberVo = (RaceMemberVo)client.queryForObject("selectMember", key);
		return raceMemberVo;
	}

	@Override
	public void insert(RaceMemberVo vo) throws SQLException {
		client.update("insertMember", vo);
	}

	@Override
	public void update(RaceMemberVo vo) throws SQLException {
		client.update("updateMember", vo);
	}

	@Override
	public void delete(String key) throws SQLException {
		client.delete("deleteMember", key);
	}
	public int confirmID(String userid) throws SQLException {
		int result = -1;
		RaceMemberVo raceMember = (RaceMemberVo) client.queryForObject("confirmID", userid);
		if (raceMember != null) {
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}
	//페이지 전체 뽑아오기
	public List<RaceMemberVo> selectAllPage(int page, String mem_name)
			throws SQLException {
		List<RaceMemberVo> list = null;
		int startRow = -1;
		int endRow = -1;

		if (mem_name.equals("")) {
			mem_name = "%";
		}

		int totalRecord = totalRecord(mem_name);

		startRow = (page - 1) * counts ;
		endRow = startRow + counts - 1;
		if (endRow > totalRecord)
			endRow = totalRecord;
		
		list = (ArrayList<RaceMemberVo>)client.queryForList("selectAllMemberPage",mem_name,startRow,counts);
		return list;
	}
	
	//페이지 입력받기
		public String pageNumber(int tpage, String name) throws SQLException {
			String str = "";

			int total_pages = totalRecord(name);
			int page_count = total_pages / counts + 1;

			if (total_pages % counts == 0) {
				page_count--;
			}
			if (tpage < 1) {
				tpage = 1;
			}

			int start_page = tpage - (tpage % view_rows) + 1;
			int end_page = start_page + (counts - 1);

			if (end_page > page_count) {
				end_page = page_count;
			}
			if (start_page > view_rows) {
				str += "<a href='MemberAll.do?tpage=1&key="
						+ name + "'>&lt;&lt;</a>&nbsp;&nbsp;";
				str += "<a href='MemberAll.do?tpage="
						+ (start_page - 1);
				str += "&key=<%=mem_name%>'>&lt;</a>&nbsp;&nbsp;";
			}

			for (int i = start_page; i <= end_page; i++) {
				if (i == tpage) {
					str += "<font color=red>[" + i + "]&nbsp;&nbsp;</font>";
				} else {
					str += "<a href='MemberAll.do?tpage="
							+ i + "&key=" + name + "'>[" + i + "]</a>&nbsp;&nbsp;";
				}
			}

			if (page_count > end_page) {
				str += "<a href='MemberAll.do?tpage="
						+ (end_page + 1) + "&key=" + name
						+ "'> &gt; </a>&nbsp;&nbsp;";
				str += "<a href='MemberAll.do?tpage="
						+ page_count + "&key=" + name
						+ "'> &gt; &gt; </a>&nbsp;&nbsp;";
			}
			return str;
		}
		
	public int totalRecord(String mem_name) throws SQLException {
		int total_pages = 0;
		if (mem_name.equals("")) {
			mem_name = "%";
		}
		total_pages = (Integer) client.queryForObject("totalMemberCount",mem_name);
		return total_pages;
	}
}
