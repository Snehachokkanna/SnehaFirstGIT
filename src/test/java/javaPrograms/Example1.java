package javaPrograms;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
	//Define a constant and a variable using primitive data type
		final int c =10;
		System.out.println(c); //used as constant only
		
		int x=10;
		System.out.println(x); //used as variable only
		
	//Define a new object using class/user defined data type
		Scanner sc = new Scanner(System.in);
		sc.nextLine(); //used as object only to call a method
		
	//Define an object using derived data-type(String,array[])
		String y = "abdul kalam"; //used as variable
		System.out.println(y.length()); //used as object to call a method
		
		int[] t = {23,56,78,98}; // used as variables array
		System.out.println(t.length); //used as object
		
	}

}
