package javaPrograms;

import java.util.Scanner;

public class Example45palindrome {

	public static void main(String[] args) 
	{
		//Take a new number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x  = sc.nextInt();
		sc.close();
		int y =0; //initially reverse number is 0;
		int temp =x; //copy original value into temporary variable
		while(temp!=0)
		{
			int r = temp%10;
			 y= y*10+r;
			temp  = temp/10;
		}
		System.out.println(y);
		//compare reverse number with orginal number
		if(x==y)
		{
			System.out.println(x+" is a palindrome");
		}
		else 
		{
			System.out.println(x+" is not palindrome");
		}
		
	}

}
