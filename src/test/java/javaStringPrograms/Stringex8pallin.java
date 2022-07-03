package javaStringPrograms;

import java.util.Scanner;

public class Stringex8pallin {

	public static void main(String[] args) 
	{
		//Get a String from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		sc.close();
		
		//Reverse the given word
		String reverse = "";  //empty string
		int l =word.length();
		for(int i=l-1;i>=0;i--)// i is initialized to 1 and it should be assigned to length of the word... makhi copy mistakes
		{
			char c =word.charAt(i);
			reverse=reverse+c;
		}
		System.out.printf("%s is reversed word of %s%n",reverse,word);
		//check for pallindrome
		if(word.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
				

	}

}
