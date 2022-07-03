package javaStringPrograms;

import java.util.Scanner;

public class String27exb {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		//get count of words in given sentence
		x=x.trim(); //remove leading and trailing spaces
		String y[]=x.split(" ");
		System.out.println("no of words is "+y.length);
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}

	}

}
