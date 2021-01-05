package star.com.why;

public class pattern1 {
	public static void main(String args[])
	{
		int noofLines = 7;
		int space = noofLines-1;
		for(int i=0;i<noofLines;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int k=noofLines-space; k>0;k--) {
				System.out.print(k);
			}
			space--;
			System.out.println();
			}
	}
}


