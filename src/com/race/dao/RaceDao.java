package com.race.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.race.dto.RaceProdVo;

public interface RaceDao<T,P> {
	
	List<T> selectAll()throws SQLException;
	T selectVo(P key)throws SQLException;
	void insert(T vo)throws SQLException;
	void update(T vo)throws SQLException;
	void delete(P key)throws SQLException;
}
