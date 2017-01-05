package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceQnaVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceQnaDaoImpl implements RaceDao<RaceQnaVo, Integer>{
	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceQnaDaoImpl instance = new RaceQnaDaoImpl();
	static int view_rows = 5; 	// 페이지의 개수
	static int counts = 10; 		// 한 페이지에 나타낼 상품의 개수
	
	private RaceQnaDaoImpl() {
	}

	public static RaceQnaDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<RaceQnaVo> selectAll() throws SQLException {
		ArrayList<RaceQnaVo> list = (ArrayList<RaceQnaVo>)client.queryForList("selectAllQna");
		return list;
	}

	@Override
	public RaceQnaVo selectVo(Integer key) throws SQLException {
		RaceQnaVo raceQnaVo = (RaceQnaVo)client.queryForObject("selectQna", key);
		return raceQnaVo;
	}

	@Override
	public void insert(RaceQnaVo vo) throws SQLException {
		client.update("insertQna", vo);
	}

	@Override
	public  void update(RaceQnaVo vo) throws SQLException {
		client.update("updateQna", vo);
	}
	
	public void updateRe(RaceQnaVo vo) throws SQLException {
		client.update("updateQnaRe", vo);
	}

	@Override
	public void delete(Integer key) throws SQLException {
		client.delete("deleteQna", key);
	}
	public List<RaceQnaVo> search(String title) throws SQLException {
		ArrayList<RaceQnaVo> raceQnaVo = (ArrayList<RaceQnaVo>) client.queryForList("title",title);
		return raceQnaVo;
	}

	//페이지 전체 뽑아오기
		public List<RaceQnaVo> selectAllPage(int page, String qna_title)
				throws SQLException {
			List<RaceQnaVo> list = null;
			int startRow = -1;
			int endRow = -1;

			if (qna_title.equals("")) {
				qna_title = "%";
			}

			int totalRecord = totalRecord(qna_title);

			startRow = (page - 1) * counts ;
			endRow = startRow + counts - 1;
			if (endRow > totalRecord)
				endRow = totalRecord;
			
			list = (ArrayList<RaceQnaVo>)client.queryForList("selectAllQnaPage",qna_title,startRow,counts);
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
					str += "<a href='QnaStart.do?tpage=1&key="
							+ name + "'>&lt;&lt;</a>&nbsp;&nbsp;";
					str += "<a href='QnaStart.do?tpage="
							+ (start_page - 1);
					str += "&key=<%=title%>'>&lt;</a>&nbsp;&nbsp;";
				}

				for (int i = start_page; i <= end_page; i++) {
					if (i == tpage) {
						str += "<font color=red>[" + i + "]&nbsp;&nbsp;</font>";
					} else {
						str += "<a href='QnaStart.do?tpage="
								+ i + "&key=" + name + "'>[" + i + "]</a>&nbsp;&nbsp;";
					}
				}

				if (page_count > end_page) {
					str += "<a href='QnaStart.do?tpage="
							+ (end_page + 1) + "&key=" + name
							+ "'> &gt; </a>&nbsp;&nbsp;";
					str += "<a href='QnaStart.do?tpage="
							+ page_count + "&key=" + name
							+ "'> &gt; &gt; </a>&nbsp;&nbsp;";
				}
				return str;
			}
			
			//페이지 입력받기
			public String pageNumber2(int tpage, String name) throws SQLException {
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
					str += "<a href='qnaListForm.do?tpage=1&key="
							+ name + "'>&lt;&lt;</a>&nbsp;&nbsp;";
					str += "<a href='qnaListForm.do?tpage="
							+ (start_page - 1);
					str += "&key=<%=title%>'>&lt;</a>&nbsp;&nbsp;";
				}

				for (int i = start_page; i <= end_page; i++) {
					if (i == tpage) {
						str += "<font color=red>[" + i + "]&nbsp;&nbsp;</font>";
					} else {
						str += "<a href='qnaListForm.do?tpage="
								+ i + "&key=" + name + "'>[" + i + "]</a>&nbsp;&nbsp;";
					}
				}

				if (page_count > end_page) {
					str += "<a href='qnaListForm.do?tpage="
							+ (end_page + 1) + "&key=" + name
							+ "'> &gt; </a>&nbsp;&nbsp;";
					str += "<a href='qnaListForm.do?tpage="
							+ page_count + "&key=" + name
							+ "'> &gt; &gt; </a>&nbsp;&nbsp;";
				}
				return str;
			}
			
		public int totalRecord(String title) throws SQLException {
			int total_pages = 0;
			if (title.equals("")) {
				title = "%";
			}
			total_pages = (Integer) client.queryForObject("totalQnaCount",title);
			return total_pages;
		}
}
