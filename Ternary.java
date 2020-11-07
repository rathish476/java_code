package star;

public class Ternary {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		int z = 300;
		int result = (x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println("largest number :" + result);
		
		

	}

}
