package javaPrograms;

import java.util.Scanner;

public class Example49 
{

	public static void main(String[] args)
	{

		//Take a number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n  = sc.nextInt();
		sc.close();
		//convert decimal to binary
		int temp=n;
		String binary = " ";
		while(temp!=0)
		{
			int r = temp %2;
			binary =r+binary; //concatenate remainder at front of executing binary code
			temp =(int)temp/2;
		}
		System.out.println(n+"binary value is"+binary);
	}

}
