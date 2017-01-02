package com.race.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.race.dao.RaceCartDaoImpl;
import com.race.dto.RaceCartVo;

public class RaceCartServiceImpl implements RaceService<RaceCartVo, Integer>{
	private static RaceCartServiceImpl instance=new RaceCartServiceImpl();
	private RaceCartDaoImpl raceCartDaoImpl;
	
	private RaceCartServiceImpl(){
		this.raceCartDaoImpl = RaceCartDaoImpl.getInstance();
	}
	
	public static RaceCartServiceImpl getInstance(){
		return instance;
	}

	@Override
	public List<RaceCartVo> selectAll() throws SQLException {
		return raceCartDaoImpl.selectAll();
	}

	@Override
	public RaceCartVo selectVo(Integer key) throws SQLException {
		return raceCartDaoImpl.selectVo(key);
	}
	
	public ArrayList<RaceCartVo>listCart(String userId) throws SQLException {
		return raceCartDaoImpl.listCart(userId);
	}

	@Override
	public void insert(RaceCartVo vo) throws SQLException {
		raceCartDaoImpl.insert(vo);
	}

	@Override
	public void update(RaceCartVo vo) throws SQLException {
		raceCartDaoImpl.update(vo);
	}
	//상품 주문
	public void updateOk(int key) throws SQLException {
		raceCartDaoImpl.updateOk(key);
	}
	//배송퍼리
	public void updateGo1(int key) throws SQLException {
		raceCartDaoImpl.updateGo1(key);
	}
	//반품처리
	public void updateGo2(int key) throws SQLException {
		raceCartDaoImpl.updateGo2(key);
	}
	//상품 끝
	public void updateLast(int key) throws SQLException {
		raceCartDaoImpl.updateLast(key);
	}

	@Override
	public void delete(Integer key) throws SQLException {
		raceCartDaoImpl.delete(key);
	}
}
