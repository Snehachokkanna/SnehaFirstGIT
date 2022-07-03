package javaStringPrograms;

import java.util.Scanner;

public class String28c {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		int clc =0; // lower case
		int cuc =0; //upper case
		int cd=0;
		int csc =0;
	for (int i=0;i<x.length();i++)
	{
		char y=x.charAt(i);
		if(y>= 97&&y<=122)
		{
			clc++;
		}
		else if(y>=65&&y<=90)
		{
			cuc++;
		}
		else if(y>=48&&y<=57)
		{
			cd++;
		}
		else
		{
			csc++;
		}
			
	}
	System.out.println("lower cases "+clc);
	System.out.println("upper cases "+cuc);
	System.out.println("digits "+cd);
	System.out.println("special characters "+csc);
	}


	}


