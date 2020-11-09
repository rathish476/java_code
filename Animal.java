package star.over_time;

public class Animal {
	public void move() {
		System.out.println("animals can move");
		
	}

}
class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk and run");
		
	}
}
class TestDog {
	public static void main(String args[]) {
		
	    Animal a = new Dog();
  
	    a.move();
	}
}


