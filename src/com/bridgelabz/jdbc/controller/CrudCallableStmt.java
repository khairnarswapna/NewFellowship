/******************************************************************************
 *  Purpose: Program is written for performing database CRUD operation using 

       java application with using callable statement
 * @author :swapna khairnar
 *
 ******************************************************************************/

package com.bridgelabz.jdbc.controller;

import java.sql.SQLException;


import java.util.*;

import com.bridgelabz.jdbc.model.Student;
import com.bridgelabz.jdbc.service.ImplCrudCallableStmtUtil;

public class CrudCallableStmt 
{
	

	public static void main(String[] args) throws SQLException 
	{
		ImplCrudCallableStmtUtil util = new ImplCrudCallableStmtUtil();
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int choice;
		
		do
		{
			System.out.println("-------Menu-------");
			System.out.println("1.create table\n2.insert record\n3.update record\n4.Delete record\n5.display records\n6.exit");
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			switch (choice) 
			{
			case 1:
				// create table
				System.out.println("--------creating table---------");
				if (util.createTable() == 0)
					System.out.println("table already exists");
				else
					System.out.println("created table successfully..");

				break;
			case 2:
				// insert value
				System.out.println("--------inserting Record---------");

				System.out.println("Enter id: ");
				student.setId(scanner.nextInt());
				System.out.println("Enter name: ");
				student.setName(scanner.next());
				System.out.println("Enter Address: ");
				student.setAddress(scanner.next());
				System.out.println("Row's affected: " + util.insertValues(student));
				break;
			case 3:
				// update record into table
				System.out.println("--------updating new record into table---------");
				System.out.println("Enter id you want to update: ");
				int id = scanner.nextInt();
				System.out.println("Enter name to change: ");
				student.setName(scanner.next());
				System.out.println("Enter address to change: ");
				student.setAddress(scanner.next());
				System.out.println("Row's affected: " + util.updateValues(id, student));
				break;
			case 4:
				// delete record
				System.out.println("--------deleting record from table---------");
				System.out.println("Enter id you want to delete: ");
                System.out.println("Row's affected: " + util.deleteValue(scanner.nextInt()));
				break;
			case 5:
				// show records
				util.showRecords();
				break;
			case 6:
			 
				System.exit(0);
			 
				break;
			default:
				System.out.println("Select valid option");
				break;

			}
		}while(choice!=7);
		scanner.close();
	}

}
