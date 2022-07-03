package javaPrograms;

import java.util.Scanner;

public class Example38MutTab {

	public static void main(String[] args) 
	{
		//Take Limit from Keyboard
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit = sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit = sc.nextLong();
		sc.close();
		
		//Print Multiplication Table and given limit
		
		for(long i = llimit; i<=ulimit;i++)
		{
			// take each "i" to create multiplication table
			System.out.println("Multiplication for"+i);
			System.out.println("----------------------");
			
			for(int j = 1; j<= 10; j++)
			{
				System.out.printf("%d x %d\t = %d\n", i, j, i*j);
			}
			
			System.out.println("----------------------");
		}
		

	}

}
