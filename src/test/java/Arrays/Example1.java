package Arrays;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		int x[] = new int[n]; //declare static array/fixed size array with given size
		
		//fill array with numbers
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		sc.close();
		//find largest and smallest value in the array
		int largest =x[0];
		int smallest =x[0];
		//Search from 2nd value (index=1)
		for(int i=1;i<n;i++)
		{
			//for largest
			if(largest <x[i])
			{
				largest=x[i];
			}
			//for smallest
			if(smallest>x[i])
			{
				smallest =x[i];
			}

		}
		System.out.println("Largest value is "+largest);
		System.out.println("Smallest value is "+smallest);
		
		

	}

}
