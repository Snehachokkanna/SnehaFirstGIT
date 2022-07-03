package javaPrograms;

import java.util.Scanner;

public class Example36PrimeNumber {

	public static void main(String[] args)
	{
		
		
		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x =sc.nextInt();
		sc.close();
		//check for prime or not
		int flag =0;
		
		for(int i =2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		} //loop will be terminated either "at end" or because of "break"
		if(flag==0)
		{
			System.out.printf("%d is a prime number",x);
		}
		else 
		{
			System.out.printf("%d is a not prime number",x);
		}
	}

}
