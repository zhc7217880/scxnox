package com.neu.dao;

import java.util.Date;
import java.util.List;

import com.neu.entity.Move;

public interface MoveDao {
	int insert(Move move) throws Exception;
	List<Move> getAll() throws Exception;
	Move getById(int id) throws Exception;
	int update(Move move) throws Exception;
}
