package javaPrograms;

import java.util.Scanner;

public class Example130_1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.close();
		if(age<18)
		{
			//throw Arithmetic exception if not  eligible to vote & stops execution
			ArithmeticException e  = new ArithmeticException("Person is not eligible to vote");
			throw e;
			//System.out.exit(0);
		}
		else
		{
			System.out.println("person is eligible to vote !!");
		}
		//further code
		System.out.println("Testing is done");
	}

}
