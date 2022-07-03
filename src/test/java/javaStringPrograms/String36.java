package javaStringPrograms;

import java.util.Scanner;

public class String36 {

	public static void main(String[] args)
	{
		//1.take sentence from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		//Split sentence into words
		String[] words =x.split(" ");
		String y ="";
		//2.reverse order of words in given sentence
		for(int i=words.length-1;i>=0;i--)
		{
			y=y+words[i]+" ";
		}
		//3.Display output
		System.out.println(y.trim());

	}

}
