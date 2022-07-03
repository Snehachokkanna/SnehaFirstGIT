package Arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class example5ddimensionalsecolargest 
{

	public static void main(String[] args) 
	{	//Declare dynamic array
		ArrayList<Integer> x = new ArrayList<Integer>();
		//Get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n =sc.nextInt();	
		//fill array with numbers
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x.add(sc.nextInt()); //add new value
		}
		sc.close();
		
		//bubble sort  in ascending order
		for(int i=0;i<n;i++) //n times
		{
			for(int j=0;j<n-1;j++) //n-1 times
			{
				if(x.get(j)>x.get(j+1)) //for descending order,use "<"only
				{
					//Swap Numbers 
					int temp=x.get(j); //get exisiting value
					x.set(j, x.get(j+1));
					x.set(j+1,temp);
				}
			}
		}
		System.out.println(x); //display list
		System.out.println("Smallest is "+x.get(0));
		System.out.println("largest is" +x.get(n-1));
		//display second largest and second smallest
		for(int i=0;i<n;i++) //first to last
		{
			if(x.get(i)==x.get(i+1))
			{
				continue;
			}
			else
			{
				System.out.println("second smallest is "+x.get(i+1));
				break ; //terminate from loop
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp1=x.get(i);
			
			int temp2=x.get(i-1);
			if(temp1 == temp2) //comparision of values in variables
			{
				continue;
			}
			else
			{
				System.out.println("second largest is"+x.get(i-1));
				break;
			}
		}						
	}
}
