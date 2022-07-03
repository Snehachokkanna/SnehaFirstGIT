package javaPrograms;

import java.util.Scanner;

public class Example47 {

	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit = sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit = sc.nextLong();
		sc.close();
		int count =0;
		//goto each number in between lower limit and upperlimit
		for(long i=llimit;i<=ulimit;i++)
		{
			long temp1=i;
			int nod =0;
			while(temp1!=0)
			{	//Calculate no of digits in given number
				temp1=temp1/10; //cut digits
				nod++;
			}
			//Calculate sum of ArmStrong equation
			long temp2=i;
			int value =0;
			while(temp2!=0)
			{
				int d=(int)(temp2%10); //get last digit
				value =(int) (value+Math.pow(d,nod));
				temp2=(long)temp2/10; //cut last digit
		}
			//compare output value with orginal number for Armstrong
			if(value==i)
			{
				System.out.printf("%d is ArmStrong Number%n",i);
				count++;
			}
		}
		System.out.printf("count of arm strong number in given range is %d",count);
		

	}

}
