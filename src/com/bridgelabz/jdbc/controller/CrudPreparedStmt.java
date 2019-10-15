/******************************************************************************
 *  Purpose: Program is written for performing database CRUD operation using 

       java application with using prepared statement
 * @author :swapna khairnar
 *
 ******************************************************************************/
package com.bridgelabz.jdbc.controller;

import java.sql.SQLException;

import java.util.Scanner;

import com.bridgelabz.jdbc.model.Student;
import com.bridgelabz.jdbc.service.ImplCrudPreparedStmtUtil;

public class CrudPreparedStmt 
{
	public static void main(String[] args) throws SQLException 
	{
		ImplCrudPreparedStmtUtil util = new ImplCrudPreparedStmtUtil();
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int choice;
 
		do
		{
			System.out.println("-----MENU------");
			System.out.println("1.create table\n2.insert record\n3.update record\n4.delete record\n5.display records\n6.exit");
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("--------creating table---------");
				if (util.createTable() == 0)
					System.out.println("table already exists");
				else
					System.out.println("created table successfully..");
				break;
			case 2:
				System.out.println("--------inserting new record---------");
				System.out.println("Enter id: ");
				student.setId(scanner.nextInt());
				System.out.println("Enter name: ");
				student.setName(scanner.next());
				System.out.println("Enter Address: ");
				student.setAddress(scanner.next());

				System.out.println("Row's affected: " + util.insertValues(student));
				break;
			case 3:
				System.out.println("--------update record---------");

				System.out.println("Enter id you want to update: ");
				int id = scanner.nextInt();
				System.out.println("Enter name you want to update: ");
				student.setName(scanner.next());
				System.out.println("Enter address you want to update: ");
				student.setAddress(scanner.next());

				System.out.println("Row's affected: " + util.updateValues(id, student));
				break;
			case 4:
				System.out.println("--------Delete Record---------");
				System.out.println("Enter id you want to delete: ");
				int idToDelete = scanner.nextInt();

				System.out.println("Row's affected: " + util.deleteValue(idToDelete));
				break;
			case 5:
				util.showRecords();
				break;
			case 6:
				System.exit(0);
				break;

			}
		}while(choice!=7);

		scanner.close();

	}

}
