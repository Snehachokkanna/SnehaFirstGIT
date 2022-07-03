package javaPrograms;

import java.util.Scanner;

public class Example42 {

	public static void main(String[] args) 
	{

		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long n =sc.nextLong();
		sc.close();
		
		//find count of digits in given number 
		int count =0;
		long temp =n;
		while(temp!=0)
		{
			temp =temp/10;
			count++;
		}
		
		System.out.printf("%d has %d digits",n,count);
	}

}
