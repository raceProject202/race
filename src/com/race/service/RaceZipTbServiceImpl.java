package com.race.service;

import java.sql.SQLException;
import java.util.List;

import com.race.dao.RaceQnaDaoImpl;
import com.race.dao.RaceZipTbDaoImpl;
import com.race.dto.RaceQnaVo;
import com.race.dto.RaceZipTbVo;

public class RaceZipTbServiceImpl implements RaceService<RaceZipTbVo, String>{
	private static RaceZipTbServiceImpl instance=new RaceZipTbServiceImpl();
	private RaceZipTbDaoImpl raceZipTbDaoImpl;
	
	private RaceZipTbServiceImpl(){
		this.raceZipTbDaoImpl = RaceZipTbDaoImpl.getInstance();
	}
	
	public static RaceZipTbServiceImpl getInstance(){
		return instance;
	}

	@Override
	public List<RaceZipTbVo> selectAll() throws SQLException {
		return raceZipTbDaoImpl.selectAll();
	}
	
	public List<RaceZipTbVo> selectNameAll(String key) throws SQLException {
		return raceZipTbDaoImpl.selectNameAll(key);
	}

	@Override
	public RaceZipTbVo selectVo(String key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(RaceZipTbVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(RaceZipTbVo vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
