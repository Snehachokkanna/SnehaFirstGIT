package javaPrograms;

import java.util.Scanner;

public class Example46Armstrong {

	public static void main(String[] args) 
	{
		//Take a new number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x  = sc.nextInt();
		sc.close();
		long temp1 =x;
		int nod =0;
		while(temp1!=0)
		{
			temp1 = temp1/10;
			nod++;
		}
		System.out.printf("No of digits in %d is %d%n",x,nod);
		//calculate sum of arm strong equation
		long temp2=x;
		int value=0;
		while(temp2!=0)
		{
			int d =(int)(temp2%10);
			value=(int)(value+Math.pow(d, nod));
			temp2=(long)temp2/10;
		}
		//compare equation output value with orginal number for Armstrong
		if(value==x)
		{
			System.out.printf("%d is an ArmStronng Number",x);
			
		}
		else
		{
			System.out.printf("%d is not an ArmStronng Number",x);

		}

	}

}
