package javaStringPrograms;

import java.util.Scanner;

public class String26exa {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		//define count variables
		int nos=0; //spaces
		int noc=0; //non spaces
		int now;//words
		if(x.charAt(0)==' ')
		{
			now=0;
		}
		else
		{
			now=1;
		}
		//Looping for count of spaces and non spaces & words
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			//for blank space &non-space character
			if(y==' ')
			{
				nos++;
			}
			else
			{
				noc++;
			}
			try
			{
				if(y==' '&&x.charAt(i+1)!=' ')
				{
					now++;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Search completed");
			}
		}
		System.out.println("No of spaces is"+nos);
		System.out.println("No of non_spaces characters is"+noc);
		System.out.println("no of words is"+now);
		

	}

}
