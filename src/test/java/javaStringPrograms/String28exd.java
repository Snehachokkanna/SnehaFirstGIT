package javaStringPrograms;

import java.util.Scanner;

public class String28exd {

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
		
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			
			if(Character.isLowerCase(y))
			{
				clc++;
			}
			else if(Character.isUpperCase(y))
			{
				cuc++;
			}
			else if(Character.isDigit(y))
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


