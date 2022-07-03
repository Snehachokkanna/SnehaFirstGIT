package Arrays;

import java.util.Scanner;

import com.sun.javafx.image.impl.IntArgb;

public class Example42ddimensional {

	public static void main(String[] args)
	{

		//Get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int x[][] = new int[r][c]; //declare static array
		System.out.println("Enter "+(r*c)+" values");
		for(int i=0;i<r;i++) //for rows
		{
			for(int j=0;j<c;j++) //for columns
			{
				x[i][j]=sc.nextInt();
			}
		}
		sc.close();
		//Display 2-dimensional array
		for(int i=0;i<r;i++) //for rows
		{
			for(int j=0;j<c;j++) //for columns
			{
				System.out.print(x[i][j]+" ");
			}
		System.out.println();
	}
				
	}
}
