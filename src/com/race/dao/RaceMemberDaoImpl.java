package com.race.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.race.dto.RaceMemberVo;
import com.race.sqlconfig.IBatisDBConnector;

public class RaceMemberDaoImpl implements RaceDao<RaceMemberVo,String>{

	private SqlMapClient client = IBatisDBConnector.getSqlMapInstance();
	private static RaceMemberDaoImpl instance = new RaceMemberDaoImpl();

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
}
