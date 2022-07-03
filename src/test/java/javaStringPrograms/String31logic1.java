package javaStringPrograms;

import java.util.Scanner;

public class String31logic1 {

	public static void main(String[] args) 
	{
		//Take a sentence and character from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x =sc.nextLine();
		System.out.println("Enter a character");
		char y = sc.nextLine().charAt(0);
		sc.close();
		
		//count of occurences
		int count=0;
		for(int i=0;i<x.length();i++)
		{
			if(y==x.charAt(i))
			{
				count++;
			}
		}
		System.out.println(y+ " ooccured "+count+"times");
	}

}
