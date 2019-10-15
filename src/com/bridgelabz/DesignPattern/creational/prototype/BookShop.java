package com.bridgelabz.DesignPattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
	private String ShopName;
	List<Book> books=new ArrayList<>();
	public String getShopName() {
		return ShopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public void setBooks(List<Book> books) 
	{
		this.books = books;
	}
	public void loadData()
	{
		for(int i=0;i<=10;i++)
		{
			Book b=new Book();
			b.setBookid(i);
			b.setBname("book"+i);
			getBooks().add(b);
		}
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", books=" + books + ", getShopName()=" + getShopName()
				+ ", getBooks()=" + getBooks() + "]";
	}
	
}
