package com.amzn.fruits;

import com.amzn.fruits.interfaces.IFruit;

public class Mango implements IFruit{
	public String name;
	private  String color;
	private String size;
	private String type;
	private int price;
	
	public int z=10;

	@Override
	public final void cut() {
		System.out.println("Cutting mango..");
	};
	
	public void testMe() {
		System.out.println("I am in testMe of Mango");
	};

	public void makeJuice() {
		System.out.println("Making mango juice...");
	}

	public void types() {
		System.out.println("Types of mangos are ...");
		System.out.println("1. Hapus");
		System.out.println("2. Payri");
		System.out.println("3. totapuri");
	}
	
	public String toString(){
		return "color="+color; 
	}

}