package javaStringPrograms;

import java.util.Scanner;

public class String28vowels {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		//count vowels
		int vc=0;
		int remaining=0;
		for(int i=0;i<x.length();i++) 
		{;
			char y=x.charAt(i);
			switch(y)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vc++;
				break;
				default:
					remaining++; //remaining count
					break;
					
			}//switch case
		}
		System.out.println("no of vowels"+vc);
		System.out.println("other remaining letters"+remaining);

	}

}
