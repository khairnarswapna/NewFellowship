package com.bridgelabz.DesignPattern.creational.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
		BookShop bs=new BookShop();
		bs.setShopName("Noyalty");
		bs.loadData(); 
		System.out.println(bs);
		
		//BookShop bs1=new BookShop(); //don't want to access the data from the database
		BookShop bs1=(BookShop)bs.clone();
		bs1.setShopName("A1");
		//bs1.loadData(); 
		System.out.println(bs1);

		
	}

}
