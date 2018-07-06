package test.com;

import aaa.bbb.Test02Student;
//import java.lang.*;//모든 클래스를 사용하기위함.

public class Test03Notebook {

	
	String productNumber;// HP201800001
	int price;// 1440000
	String cpu;// intel core i7
	// int[] sus;
	// double[][] dss;
	Test02Student st;
	// boolean bool; //false
	Test01object obj;

	public Test03Notebook() {
		productNumber = "HP201800001";
		price = 1440000;
		cpu = "intel core i7";
	}
	
	
	public Test03Notebook(int price) {
		productNumber = "HP201800001";
		this.price = price; //자신이 속한 클래스의 인스턴스(멤버변수)
		cpu = "intel core i7";
	}
	
	public static void main(String[] args) {
		Test03Notebook nb= new Test03Notebook(3000000);
		System.out.println(nb.price);
	}
	
	
	
	
	
	
}
