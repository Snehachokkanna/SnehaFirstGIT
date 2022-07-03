package Streamsjava;

import java.util.Scanner;
import java.util.regex.Pattern;

import java.util.regex.Matcher;



public class Example10cRETM {

	public static void main(String[] args) 
	{
		// Take a Sentence
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern like 234cars 45buses");
		String x =sc.nextLine();
		sc.close();
		//Seperate digits and chars/strings using Regular Expressions
	
		Pattern r1=Pattern.compile("[0-9]+"); //one or more digits
		Pattern r2=Pattern.compile("[a-zA-Z]+");
		Matcher m1 = r1.matcher(x);
		Matcher m2=r2.matcher(x);
		String output = "";
		while(m1.find()&&m2.find())
		{
			output=output+m1.group();
			output=output+m2.group().length();
			output=output+" ";
		}
		System.out.println(output.trim());
		

	}

}
