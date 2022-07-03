package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7remodup {

	public static void main(String[] args)
	{
		//Declare dynamic array
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
		//renove duplicates in an array
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
					//Swap Numbers 
					int temp1=x.get(i); //get exisiting value
					int temp2=x.get(j);
					if(temp1==temp2)
					{
						x.remove(j);
						n--;
				}
			}
		}
		
		System.out.println(x);
	}

}
