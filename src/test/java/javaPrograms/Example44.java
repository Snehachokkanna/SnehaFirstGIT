package javaPrograms;

import java.util.Scanner;

public class Example44 
{

	public static void main(String[] args) 
	{
		//Take a new number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long x  = sc.nextLong();
		sc.close();
		long temp = x;
		
		while(temp >9)
		{
			int sum =0;
			while(temp!=0)
			{
				int r =(int)(temp%10); //get last digit 
				sum = sum +r; //add that last diigit to sum
				temp = (long)temp/10; //cut that last digit
				 //take out as input 33for new iteration if required
			}
			temp = sum;
		}
		
			System.out.printf("%d is single digit sum of %d",temp,x);
		}

}


