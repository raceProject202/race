package com.race.service;

import java.sql.SQLException;
import java.util.List;

import com.race.dao.RaceCartDaoImpl;
import com.race.dao.RaceLprodDaoImpl;
import com.race.dto.RaceLprodVo;

public class RaceLprodServiceImpl implements RaceService<RaceLprodVo, String>{

	private static RaceLprodServiceImpl instance=new RaceLprodServiceImpl();
	private RaceLprodDaoImpl raceLprodDaoImpl;
	
	private RaceLprodServiceImpl(){
		this.raceLprodDaoImpl = RaceLprodDaoImpl.getInstance();
	}
	
	public static RaceLprodServiceImpl getInstance(){
		return instance;
	}

	@Override
	public List<RaceLprodVo> selectAll() throws SQLException {
		return raceLprodDaoImpl.selectAll();
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
