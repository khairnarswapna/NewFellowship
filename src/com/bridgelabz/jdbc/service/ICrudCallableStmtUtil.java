package com.bridgelabz.jdbc.service;

import java.sql.SQLException;


import com.bridgelabz.jdbc.model.Student;

public interface ICrudCallableStmtUtil {

	public int createTable() throws SQLException;

	public int insertValues(Student student) throws SQLException;

	public int updateValues(int id, Student student) throws SQLException;

	public int deleteValue(int id) throws SQLException;
	
	public void showRecords() throws SQLException;
}
