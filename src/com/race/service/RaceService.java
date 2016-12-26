package com.race.service;

import java.sql.SQLException;
import java.util.List;

public interface RaceService<T,P> {
	
	List<T> selectAll()throws SQLException;
	T selectVo(P key)throws SQLException;
	void insert(T vo)throws SQLException;
	void update(T vo)throws SQLException;
	void delete(P key)throws SQLException;
}
