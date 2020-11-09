package star.over_time;

public class Human{
      public void eat()
      
      {
    	  System.out.println("Human is eating");
    	  
      }

}

class boy extends Human {
	public void eat()
	{
		System.out.println("boy is eating");
		
	}

public static void main(String args[]) {
	boy obj = new boy();
	obj.eat();
}
}