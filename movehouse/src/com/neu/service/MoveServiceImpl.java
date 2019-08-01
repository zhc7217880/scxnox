package com.neu.service;

import java.util.Date;
import java.util.List;

import com.neu.dao.MoveDao;
import com.neu.dao.MoveDaoImpl;
import com.neu.entity.Move;

public class MoveServiceImpl implements MoveService{
	private MoveDao moveDao = new MoveDaoImpl();
	@Override
	public int regist(Move move) throws Exception {
		int n = moveDao.insert(move);
		return n;
	}

	@Override
	public List<Move> showAll() throws Exception {
		List<Move> list = moveDao.getAll();
		return list;
	}

	@Override
	public Move showOne(int id) throws Exception {
		Move move = moveDao.getById(id);
		return move;
	}

	@Override
	public int deal(Move move) throws Exception {
		int n = moveDao.update(move);
		return n;
	}

}
