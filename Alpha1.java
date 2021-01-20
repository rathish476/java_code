package com.brainuse;

public class Alpha1 {
public static void main(String[]args) {
	int num=6;
	for (int i=1;i<=num;i++)
	{
	for(int j=1;j<=num;j++)
	{
		if(i==1||i==(num/2)+1||j==1||j==num)
			
			System.out.print("*");
		else
			
		System.out.print(" ");
	}
	System.out.println();
}
}
}