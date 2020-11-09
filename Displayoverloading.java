package star.over_time.overloading;


public class Displayoverloading {
	
	public void disp(char c)
	{
		System.out.println(c);
	}
	public void disp(char c,int num)
	{
		System.out.println(c + " "+num);
	}
	
}
class sample
{
	public static void main(String args[])
	{
		Displayoverloading obj = new Displayoverloading();
		obj.disp('a');
		obj.disp('a',10);
	}
}