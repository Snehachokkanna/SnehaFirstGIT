package javaStringPrograms;

import java.util.Scanner;

public class String28avowels {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		int vc=0;
		int remaining =0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u'||y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
			{
				vc++;
			}
			else
			{
				remaining++;
			}
		}
		System.out.println("vowel count is "+vc);
		System.out.println("remaining chars count is "+remaining);
	}

}
