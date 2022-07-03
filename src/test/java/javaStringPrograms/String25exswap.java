package javaStringPrograms;

import java.util.Scanner;

public class String25exswap {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		System.out.println("Enter a String");
		String y = sc.nextLine();
		System.out.println("Before Swap:");
		sc.close();
		System.out.printf("%s %s%n",x,y);
		//swapping
		String temp =" ";
		temp=x;
		x=y;
		y=temp;
		System.out.print("after swap : ");
		System.out.printf("%s %s%n",x,y);

	}

}
