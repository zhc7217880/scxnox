package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.neu.entity.User;

public class UserDaoImpl implements UserDao{
	private DBUtils db = new DBUtils();
	@Override
	public User getById(String name, String password) throws Exception {
		String sql = "select * from users where name = ? and password = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql, name,password);
		int id;
		User user = null;
		if(rs.next()) {
			id = rs.getInt("id");
			user = new User(id, name, password);
		}
		db.closeConnection(connection);
		return user;
	}

}
