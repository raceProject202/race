package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceQnaVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceQnaDaoImpl implements RaceDao<RaceQnaVo, Integer>{
	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceQnaDaoImpl instance = new RaceQnaDaoImpl();

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
	
	public RaceQnaVo selectId(String key) throws SQLException {
		RaceQnaVo raceQnaVo = (RaceQnaVo)client.queryForObject("selectId", key);
		return raceQnaVo;
	} 

}
