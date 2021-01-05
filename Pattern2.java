package star.com.why;

public class Pattern2 {

	public static void main(String args[])
	{
		int noofLines = 5;
		int space = noofLines/2;
		
		for(int i=0;i<noofLines;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=noofLines-space; k>0;k--) {
				System.out.print(k);
			}
			space++;
			System.out.println();
			}
	}
}

