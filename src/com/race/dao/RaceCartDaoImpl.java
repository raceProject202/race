package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceCartVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceCartDaoImpl implements RaceDao<RaceCartVo, Integer>{

	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceCartDaoImpl instance = new RaceCartDaoImpl();

	private RaceCartDaoImpl() {
	}

	public static RaceCartDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public List<RaceCartVo> selectAll() throws SQLException {
		ArrayList<RaceCartVo> list = (ArrayList<RaceCartVo>)client.queryForList("selectAllCart");
		return list;
	}

	@Override
	public RaceCartVo selectVo(Integer key) throws SQLException {
		RaceCartVo raceCartVo = (RaceCartVo)client.queryForObject("selectCart", key);
		return raceCartVo;
	}

	public ArrayList<RaceCartVo> listCart(String userId) throws SQLException {
		ArrayList<RaceCartVo> cartList = new ArrayList<RaceCartVo>();
		System.out.println("2 : "+userId);
		cartList = (ArrayList<RaceCartVo>) client.queryForList("listCart", userId);
		return cartList;
	}
	
	@Override
	public void insert(RaceCartVo vo) throws SQLException {
		client.update("insertCart", vo);
	}

	@Override
	public void update(RaceCartVo vo) throws SQLException {
		client.update("updateCart", vo);
	}
	//상품 주문
	public void updateOk(int key) throws SQLException {
		client.update("updateCartOk", key);
	}
	//상품 배송처리
	public void updateGo1(int key) throws SQLException {
		client.update("updateCartGo1", key);
	}
	//상품 반품처리
	public void updateGo2(int key) throws SQLException {
		client.update("updateCartGo2", key);
	}
	//상품 끝
	public void updateLast(int key) throws SQLException {
		client.update("updateCartLast", key);
	}

	@Override
	public void delete(Integer key) throws SQLException {
		client.delete("deleteCart", key);
	}

}
