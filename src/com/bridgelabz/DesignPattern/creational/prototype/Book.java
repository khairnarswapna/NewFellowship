package com.bridgelabz.DesignPattern.creational.prototype;

public class Book {

	 private int Bookid;
	 private String Bname;
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", Bname=" + Bname + ", getBookid()=" + getBookid() + ", getBname()="
				+ getBname() + "]";
	}
	 
}
