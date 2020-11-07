package star;

import java.util.Scanner;

public class Xstar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the numbers of rows needed to print the pattern : ");
		
		int rows = scanner.nextInt();
		
		System.out.print(" printing the pattren \n");
		
		for (int i = 1 ; i <= rows; i++)
		
		{
			for (int j = 1; j < i; j++)
				
			{
				System.out.print(" ");
			}
		
			for(int k = i; k <= rows; k++)
			
			{
				
				if(i == 1 || k == i || k == rows)
					
			
	           System.out.print(" * ");
			
			else
				
				System.out.print("   ");
				
		}
			System.out.println();
		
	}	
		for(int i = rows-1; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
				
		
				
			{
				System.out.print(" ");
			}
		
			for(int k = i; k<= rows; k++)
			
			{
				
				if(i == 1 || k == i || k == rows)
					
			
	           System.out.print(" * ");
			
			else
				
				System.out.print("   ");
				
		} 
			System.out.println();
		}
		
		scanner.close();
		
	
		}

}

