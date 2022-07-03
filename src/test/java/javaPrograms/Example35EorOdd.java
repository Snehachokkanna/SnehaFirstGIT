package javaPrograms;

import java.util.Scanner;

public class Example35EorOdd {

	public static void main(String[] args) 
	{
		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x =sc.nextInt();
		sc.close();
		//check for even or odd
		if (x%2==0)
		{
			System.out.printf("%d is an even number ",x);
			
		}
		else
		{
			System.out.printf("%d is an odd number ",x);
			
		}
		

	}

}
