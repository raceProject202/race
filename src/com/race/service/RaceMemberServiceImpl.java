package com.race.service;

import java.sql.SQLException;
import java.util.List;

import com.race.dao.RaceMemberDaoImpl;
import com.race.dto.RaceMemberVo;

public class RaceMemberServiceImpl implements RaceService<RaceMemberVo, String> {

	private static RaceMemberServiceImpl instance = new RaceMemberServiceImpl();
	private RaceMemberDaoImpl raceMemberDaoImpl;

	private RaceMemberServiceImpl() {
		this.raceMemberDaoImpl = RaceMemberDaoImpl.getInstance();
	}

	public static RaceMemberServiceImpl getInstance() {
		return instance;
	}

	@Override
	public List<RaceMemberVo> selectAll() throws SQLException {

		return raceMemberDaoImpl.selectAll();
	}

	// 페이지
	public List<RaceMemberVo> selectAllPage(int page, String mem_name)
			throws SQLException {

		return raceMemberDaoImpl.selectAllPage(page, mem_name);
	}

	// 페이지
	public String pageNumber(int page, String key) throws SQLException {
		String paging;
		paging = raceMemberDaoImpl.pageNumber(page, key);
		return paging;

	}

	public List<RaceMemberVo> selectNume(String mem_name) throws SQLException {

		return raceMemberDaoImpl.selectNameAll(mem_name);
	}

	@Override
	public RaceMemberVo selectVo(String key) throws SQLException {
		return raceMemberDaoImpl.selectVo(key);
	}

	@Override
	public void insert(RaceMemberVo vo) throws SQLException {
		raceMemberDaoImpl.insert(vo);
	}

	@Override
	public void update(RaceMemberVo vo) throws SQLException {
		raceMemberDaoImpl.update(vo);
	}

	@Override
	public void delete(String key) throws SQLException {
		raceMemberDaoImpl.delete(key);
	}

	public int confirmID(String userid) throws SQLException {
		return raceMemberDaoImpl.confirmID(userid);
	}

}
