package com.inheritance;

public class Animal {
	void eat()
	{
		System.out.println("eating...");
		
	}

}
class dog extends Animal{
	void bark()
	{
		System.out.println("barking...");
		
	}
}
class cat extends Animal{
	void meow()
	{
		System.out.println("meowing...");
		
	}
}
class hierarchicalinheritance{
	public static void main(String args[]) {
		dog c=new dog();
		cat a=new cat();
		a.meow();
		a.eat();
		c.bark();
		c.eat();
	
	}
}