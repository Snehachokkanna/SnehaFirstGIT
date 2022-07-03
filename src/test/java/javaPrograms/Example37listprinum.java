package javaPrograms;

import java.util.Scanner;

public class Example37listprinum {

	public static void main(String[] args)
	{

		//Take a number from keyboard 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit = sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit = sc.nextLong();
		sc.close();
		
		//print all prime numbers under given limits
		int count =0;
		for (Long i=llimit;i<=ulimit;i++)
		{
			//check each "i" value for prime or not in given range of values
			int flag =0;
			for(int j = 2; j<i; j++)
			{
				if (i%j == 0)
				{
					flag = 1;
					break;
				}// Loop will be terminated either at end or at break
				
			}
				
				if (flag == 0)
				{
					System.out.printf("%d is a Primenumber%n", i);
					count++;
				}
		}
	// end of initial Loop
	
	System.out.printf("Count of Primenumber under the given range is %d", count);

	}

}
