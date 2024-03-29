package com.bridgelabz.jdbc.service;

import java.sql.SQLException;


import com.bridgelabz.jdbc.model.Student;

public interface ICrudStmtUtil {
	public int createTable() throws SQLException;

	public void showRecords() throws SQLException;

	public int insertValues(Student student) throws SQLException;

	int updateValues(int id,Student student) throws SQLException;
	
	int deleteValue(int id) throws SQLException;


}
