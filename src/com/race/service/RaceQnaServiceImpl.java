package com.race.service;

import java.sql.SQLException;
import java.util.List;

import com.race.dao.RaceMemberDaoImpl;
import com.race.dao.RaceQnaDaoImpl;
import com.race.dto.RaceMemberVo;
import com.race.dto.RaceQnaVo;

public class RaceQnaServiceImpl implements RaceService<RaceQnaVo, Integer>{
	private static RaceQnaServiceImpl instance=new RaceQnaServiceImpl();
	private RaceQnaDaoImpl raceQnaDaoImpl;
	
	private RaceQnaServiceImpl(){
		this.raceQnaDaoImpl = RaceQnaDaoImpl.getInstance();
	}
	
	public static RaceQnaServiceImpl getInstance(){
		return instance;
	}

	@Override
	public List<RaceQnaVo> selectAll() throws SQLException {
		return raceQnaDaoImpl.selectAll();
	}
	
	// 페이지
	public List<RaceQnaVo> selectAllPage(int page, String qna_title)
		throws SQLException {
		return raceQnaDaoImpl.selectAllPage(page, qna_title);
	}

	// 페이지
	public String pageNumber(int page, String key) throws SQLException {
		String paging;
		paging = raceQnaDaoImpl.pageNumber(page, key);
		return paging;
	}
		
		// 페이지
	public String pageNumber2(int page, String key) throws SQLException {
		String paging;
		paging = raceQnaDaoImpl.pageNumber2(page, key);
		return paging;

	}

	@Override
	public RaceQnaVo selectVo(Integer key) throws SQLException {
		return raceQnaDaoImpl.selectVo(key);
	}

	@Override
	public void insert(RaceQnaVo vo) throws SQLException {
		raceQnaDaoImpl.insert(vo);
	}

	@Override
	public void update(RaceQnaVo vo) throws SQLException {
		raceQnaDaoImpl.update(vo);
	}

	public void updateRe(RaceQnaVo vo) throws SQLException {
		raceQnaDaoImpl.updateRe(vo);
	}
	@Override
	public void delete(Integer key) throws SQLException {
		raceQnaDaoImpl.delete(key);
	}
	public List<RaceQnaVo> search(String title) throws SQLException {
		return raceQnaDaoImpl.search(title); 
	}
}
