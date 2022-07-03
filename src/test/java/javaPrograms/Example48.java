package javaPrograms;

import java.util.Scanner;

public class Example48 {

	public static void main(String[] args) 
	{
		//Take a number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n  = sc.nextInt();
		sc.close();
		//Binary to decimal(way-1)
		String s =n+"";
		int d =Integer.parseInt(s,2);
	    System.out.println(n+"decimal value in Way 1 is "+d);
		//(way-2) Binary to decimal
		int decvalue =0;
		int p=0;
		int temp=n; //copy original number in temp variable
		while(temp!=0)
		{
				int lastdigit = temp % 10; //get last digit from binary number
				temp=temp/10;
				decvalue=(int)(decvalue+lastdigit*Math.pow(2,p));
				p++;
		}
		
		System.out.println(n+"decimal value in Way 2 is "+decvalue);

	}
	public static long power(int base,int exp)
	{
		long output=1;
		for(int i =1;i<=exp;i++)
			
		{
			output=output*base;
		}
		return(output);
	}

}
