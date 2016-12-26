package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceProdVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceProdDaoImpl implements RaceDao<RaceProdVo, Integer> {

   private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
   private static RaceProdDaoImpl instance = new RaceProdDaoImpl();
	static int view_rows = 5; 	// 페이지의 개수
	static int counts = 5; 		// 한 페이지에 나타낼 상품의 개수
	
   private RaceProdDaoImpl(){
   }
   
   public static RaceProdDaoImpl getInstance(){
      return instance;
   }
   
   public void setClient(SqlMapClient client) {
      this.client = client;
   }
   
   @Override
   public List<RaceProdVo> selectAll()
			throws SQLException {
		List<RaceProdVo> list = null;
		list = (ArrayList<RaceProdVo>)client.queryForList("selectAllProd");
		return list;
	}

   public List<RaceProdVo> selectAllPage(int page, String prod_name)
			throws SQLException {
		List<RaceProdVo> list = null;
		int startRow = -1;
		int endRow = -1;

		if (prod_name.equals("")) {
			prod_name = "%";
		}

		int totalRecord = totalRecord(prod_name);

		startRow = (page - 1) * counts ;
		endRow = startRow + counts - 1;
		if (endRow > totalRecord)
			endRow = totalRecord;
		
		list = (ArrayList<RaceProdVo>)client.queryForList("selectAllProdPage",prod_name,startRow,counts);
		return list;
	}
   
   public List<RaceProdVo> selectNameAll(String prod_name) throws SQLException {
      List<RaceProdVo> list=null;
      list = (ArrayList<RaceProdVo>)client.queryForList("selectNameProd", prod_name);
      return list;
   }
   
   public List<RaceProdVo> selectNameAllPage(int page,String prod_name) throws SQLException {
	      List<RaceProdVo> list=null;
	      
	      int startRow = -1;
			int endRow = -1;

			if (prod_name.equals("")) {
				prod_name = "%";
			}

			int totalRecord = totalRecord(prod_name);

			startRow = (page - 1) * counts ;
			endRow = startRow + counts - 1;
			if (endRow > totalRecord)
				endRow = totalRecord;
	      list = (ArrayList<RaceProdVo>)client.queryForList("selectNameProd", prod_name,startRow,counts);
	      return list;
	   }

   public List<RaceProdVo> selectLprodAll( int prod_lgu) throws SQLException {
	      List<RaceProdVo> list=null;
	      list = (ArrayList<RaceProdVo>)client.queryForList("selectprodProd", prod_lgu);
	      return list;
	   }
	   
   @Override
   public RaceProdVo selectVo(Integer key) throws SQLException {
	   RaceProdVo raceProdVo = (RaceProdVo) client.queryForObject("selectProd", key);
      return raceProdVo;
   }

   @Override
   public void insert(RaceProdVo vo) throws SQLException {
      client.update("insertProd", vo);
      
   }

   @Override
   public void update(RaceProdVo vo) throws SQLException {
	   client.update("updateProd", vo);
   }

   @Override
   public void delete(Integer key) throws SQLException {
	   client.delete("deleteProd",key);
   }

	public int totalRecord(String prod_name) throws SQLException {
		int total_pages = 0;
		if (prod_name.equals("")) {
			prod_name = "%";
		}
		total_pages = (Integer) client.queryForObject("totalProdCount",prod_name);
		return total_pages;
	}


	
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
			str += "<a href='ProdStart.do?tpage=1&key="
					+ name + "'>&lt;&lt;</a>&nbsp;&nbsp;";
			str += "<a href='ProdStart.do?tpage="
					+ (start_page - 1);
			str += "&key=<%=product_name%>'>&lt;</a>&nbsp;&nbsp;";
		}

		for (int i = start_page; i <= end_page; i++) {
			if (i == tpage) {
				str += "<font color=red>[" + i + "]&nbsp;&nbsp;</font>";
			} else {
				str += "<a href='ProdStart.do?tpage="
						+ i + "&key=" + name + "'>[" + i + "]</a>&nbsp;&nbsp;";
			}
		}

		if (page_count > end_page) {
			str += "<a href='ProdStart.do?tpage="
					+ (end_page + 1) + "&key=" + name
					+ "'> &gt; </a>&nbsp;&nbsp;";
			str += "<a href='ProdStart.do?tpage="
					+ page_count + "&key=" + name
					+ "'> &gt; &gt; </a>&nbsp;&nbsp;";
		}
		return str;
	}
	


}