package com.inheritance;

public class Employee {
	float salary=25000;
}
class programmer extends Employee{
	
	int bonus=10000;
	public static void main(String args[]){
		programmer p=new programmer();
		System.out.println("programmer salary is:"+p.salary);
		System.out.println("bonus of programmer is:"+p.bonus);
	}
}