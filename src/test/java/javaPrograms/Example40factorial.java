package javaPrograms;

import java.util.Scanner;

public class Example40factorial {

	public static void main(String[] args)
	{
		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		sc.close();
		
		//calculate factorial(4! is  4*3*2*1)
		long f=1 ;//initial o/p os 0 for sum(additions) and 1 for multiplications
		for(int i =n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.printf("%d factorial value is %d",n,f);
	}

}
