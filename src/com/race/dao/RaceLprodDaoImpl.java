package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceCartVo;
import com.race.dto.RaceLprodVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceLprodDaoImpl implements RaceDao<RaceLprodVo, String>{

	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceLprodDaoImpl instance = new RaceLprodDaoImpl();

	private RaceLprodDaoImpl() {
	}

	public static RaceLprodDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<RaceLprodVo> selectAll() throws SQLException {
		ArrayList<RaceLprodVo> list = (ArrayList<RaceLprodVo>)client.queryForList("selectAllLprod");
		return list;
	}

	@Override
	public RaceLprodVo selectVo(String key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(RaceLprodVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RaceLprodVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
