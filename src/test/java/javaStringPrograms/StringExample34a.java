package javaStringPrograms;

import java.util.Scanner;

public class StringExample34a {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		//1.split() given sentence into words
		String[] words =x.split(" "); //Seperator is blank space
		String y = ""; //empty String for output initially
		//2.reverse each word in given sentence
		for(String word:words)
		{
			String reversedword ="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reversedword=reversedword+word.charAt(i);
			}
			//3.add that reversed word output
			y=y+reversedword+" ";
			
			
		}
		//Display output
		System.out.println(y.trim());
	}

}
