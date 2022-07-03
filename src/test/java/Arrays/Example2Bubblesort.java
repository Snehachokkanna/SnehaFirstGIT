package Arrays;

import java.util.Scanner;

public class Example2Bubblesort {

	public static void main(String[] args)
	{

		//Get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();
		int x[] = new int[n]; //declare static array
		//fill array with numbers
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		sc.close();
		//sorting in ascending order
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(x[j]>x[j+1]) //for descending order,use "<"only
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1] = temp;
				}
			}
		}
		//display sorted array
		for(int i=0;i<n;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("Smallest is" +x[0]);
		System.out.println("largest is "+x[n-1]);
	}

}
