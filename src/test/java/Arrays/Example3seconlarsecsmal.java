package Arrays;

import java.util.Scanner;

public class Example3seconlarsecsmal {

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
				//display second largest and second smallest
				for(int i=n-1;i>=0;i--)
				{
					if(x[i]==x[i-1])
					{
						continue;
					}
					else
					{
						
						System.out.println("second largest is "+x[i-1]);
						break ; //terminate from loop
					}
				}
				for(int i=0;i<n;i++) //first to last
				{
					if(x[i]==x[i+1])
					{
						continue;
					}
					else
					{
						
						System.out.println("second smallest is "+x[i+1]);
						break ; //terminate from loop
					}
				}
				
	}

}
