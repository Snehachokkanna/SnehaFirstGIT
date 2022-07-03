package javaPrograms;

import java.util.Scanner;

public class example41febnoci {

	public static void main(String[] args) 
	{
		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit ");
		int l =sc.nextInt();
		sc.close();
		
		//form the series 
		int x =0;
		int y =1 ;
		System.out.printf("%d\t%d\t",x,y);
		do
		{
			int z = x+y;
			System.out.printf("%d\t",z);
			x=y;
			y=z;
		}while((x+y)<=l);
		

	}

}
