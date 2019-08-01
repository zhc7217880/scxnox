package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Move;

public class MoveDaoImpl implements MoveDao{
	private DBUtils db = new DBUtils();
	@Override
	public int insert(Move move) throws Exception {
		String sql = "insert into move_booking(area, cartype, movedate, contact, phone, status) values(?,?,?,?,?,?)";
		Object[] params= {
				move.getArea(),
				move.getCartype(),
				move.getMovedate(),
				move.getContact(),
				move.getPhone(),
				move.getStatus()
		};
		int n = db.executeUpdate(sql, params);
		return n;
	}

	@Override
	public List<Move> getAll() throws Exception {
		String sql = "select * from move_booking";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql);
		List<Move> list = new ArrayList<>();
		int id;
		String area;
		String cartype;
		Date movedate;
		String contact;
		String phone;
		int status;
		Move move = null;
		while(rs.next()) {
			id = rs.getInt("id");
			area = rs.getString("area");
			cartype = rs.getString("cartype");
			movedate = rs.getDate("movedate");
			contact = rs.getString("contact");
			phone = rs.getString("phone");
			status = rs.getInt("status");
			move = new Move(id, area, cartype, movedate, contact, phone, status);
			list.add(move);
		}
		db.closeConnection(connection);
		return list;
	}

	@Override
	public Move getById(int id) throws Exception {
		String sql = "select * from move_booking where id = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql ,id);
		String area;
		String cartype;
		Date movedate;
		String contact;
		String phone;
		int status;
		Move move = null;
		if(rs.next()) {
			area = rs.getString("area");
			cartype = rs.getString("cartype");
			movedate = rs.getDate("movedate");
			contact = rs.getString("contact");
			phone = rs.getString("phone");
			status = rs.getInt("status");
			move = new Move(id, area, cartype, movedate, contact, phone, status);
		}
		db.closeConnection(connection);
		return move;
	}

	@Override
	public int update(Move move) throws Exception {
		String sql = "update move_booking set status = ? where id = ?";
		int n = db.executeUpdate(sql, move.getStatus(),move.getId());
		return n;
	}

}
