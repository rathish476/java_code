package com.brainuse;

public class Alpha3 {
	public static void main(String[]args) {
		int num=6;
		for (int i=1;i<=num;i++)
		{
		for(int j=1;j<=num;j++)
		{
			if(i+j==i+1||i==num)
				
				System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
	}
}
