package javaPrograms;

import java.util.Scanner;

public class Example43 {

	public static void main(String[] args) 
	{
		//Take a new number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number"); //original number
		long x  = sc.nextLong();
		sc.close();
		int sum=0;
		long temp =x ; //Copy orginal number into temporary variable
		while(temp!=0)
		{
			int r =(int)(temp%10); //get last digit 
			sum = sum +r;
			temp = (long)temp/10;
			
		} //loop will be terminated when temp equals to  0
		System.out.printf("%d is sum of digits in %d",sum,x);
		
		
	}

}
