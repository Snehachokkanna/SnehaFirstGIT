package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6Stringsortda {

	public static void main(String[] args)
	{
			//Declare dynamic array
			ArrayList<String> x = new ArrayList<String>();
			//Get data from keyboard
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int n =Integer.parseInt(sc.nextLine());
			//fill array with numbers
			System.out.println("Enter "+n+" values");
			for(int i=0;i<n;i++)
			{
				x.add(sc.nextLine()); //add new value
			}
			sc.close();
			
			//bubble sort  in ascending order
			for(int i=0;i<n;i++) //n times
			{
				for(int j=0;j<n-1;j++) //n-1 times
				{
					if(x.get(j).compareTo(x.get(j+1))>0)//for descending order,use "<"only
					{
						//Swap Numbers 
						String temp=x.get(j); //get exisiting value
						x.set(j, x.get(j+1));
						x.set(j+1,temp);
					}
				}
			}
			System.out.println(x);

	}

}
