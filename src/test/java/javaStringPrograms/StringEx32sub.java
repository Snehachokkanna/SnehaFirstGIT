package javaStringPrograms;

import java.util.Scanner;

public class StringEx32sub {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a main string");
		String ms =sc.nextLine();
		System.out.println("Enter a  sub string");
		String ss =sc.nextLine();
		int count =0;
		System.out.print("positions are ");
	for(int i=0;i<ms.length();i++)
	{
		if(ms.charAt(i)==ss.charAt(0))
		{
			int flag=0;
			for(int j=1,k=i+1;j<ss.length();j++,k++)
			{
				if(ms.charAt(k)!=ss.charAt(j))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.printf(i +" ");
				count++;
			}
		}
	}
	System.out.println();
	System.out.println("number of occurences"+count);

	}

}
