package com.race.service;

import java.sql.SQLException;
import java.util.List;

import com.race.dao.RaceProdDaoImpl;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceProdVo;

public class RaceProdServiceImpl implements RaceService<RaceProdVo, Integer>{

   private static RaceProdServiceImpl instance = new RaceProdServiceImpl();
   private RaceProdDaoImpl raceProdDaoImpl;
   
   private RaceProdServiceImpl(){
      this.raceProdDaoImpl = RaceProdDaoImpl.getInstance();
   }
   public static RaceProdServiceImpl getInstance(){
      return instance;
   }
   
   public void getProd(RaceProdVo RaceProdVo) throws SQLException {
	   raceProdDaoImpl.read_count(RaceProdVo);
	   
	   } 
   
   
   @Override
   public List<RaceProdVo> selectAll() throws SQLException {
   
      return raceProdDaoImpl.selectAll();
   }
   
   public List<RaceProdVo> selectAllLprod(int prod_lgu)throws SQLException {
		List<RaceProdVo> list = null;
		list = raceProdDaoImpl.selectLprodAll(prod_lgu);
		return list;
	}
   
   public List<RaceProdVo> selectAllPage(int page, String prod_name) throws SQLException {
   
      return raceProdDaoImpl.selectAllPage(page, prod_name);
   }
   
   public List<RaceProdVo> selectName(String prod_name) throws SQLException {
      
      return raceProdDaoImpl.selectNameAll(prod_name);
   }
   
   public List<RaceProdVo> selectNamePage(int page, String prod_name) throws SQLException {
	      
	      return raceProdDaoImpl.selectNameAllPage(page, prod_name);
	   }
            
   @Override
   public RaceProdVo selectVo(Integer key) throws SQLException {
      
      return raceProdDaoImpl.selectVo(key);
   }

   @Override
   public void insert(RaceProdVo vo) throws SQLException {
      raceProdDaoImpl.insert(vo);
      
   }

   @Override
   public void update(RaceProdVo vo) throws SQLException {
      raceProdDaoImpl.update(vo);
      
   }

   @Override
   public void delete(Integer key) throws SQLException {
      raceProdDaoImpl.delete(key);
      
   }
   public String pageNumber(int page, String key) throws SQLException {
	   String paging;
	   paging = raceProdDaoImpl.pageNumber(page, key);
	return paging;
	      
	   }

}