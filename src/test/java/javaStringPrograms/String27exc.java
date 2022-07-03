package javaStringPrograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String27exc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		//get count of words in given sentence
		StringTokenizer st = new StringTokenizer(x," ");
		System.out.print("no of words is "+st.countTokens());
		while(st.hasMoreTokens())
			{
			System.out.print(st.nextToken());
			}

	}

}
