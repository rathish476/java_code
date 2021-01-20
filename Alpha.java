package com.brainuse;

public class Alpha {
public static void main(String[]args) {
	int num=6;
	for (int i=1;i<=num;i++)
	{
	for(int j=1;j<=num;j++)
	{
		if(i+j==num||i==((num/2)*3)-2||j==1||i==(num-1)*2||i==j+2)
			
			System.out.print("*");
		else
		System.out.print(" ");
	}
	System.out.println();
}
}
}