package com.inheritance;

public class x {
	public void methodx()
	{
		System.out.println("class X method");
		
	}
}
class y extends x
{
	public void method()
	{
		System.out.println("class y method");
	
	}
}
class z extends y
{
	public void methodz()
	{
		System.out.println("class  z method");
	
	}
	public static void main(String args[]) {
	 z obj = new z();
	 obj.methodx();
	 obj.method();
	 obj.methodz();
	}
}	
