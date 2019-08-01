package com.neu.service;

import java.util.Date;
import java.util.List;

import com.neu.entity.Move;

public interface MoveService {
	int regist(Move move) throws Exception;
	List<Move> showAll() throws Exception;
	Move showOne(int id) throws Exception;
	int deal(Move move) throws Exception;
}
