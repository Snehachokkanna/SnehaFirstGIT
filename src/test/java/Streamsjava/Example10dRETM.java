package Streamsjava;

import java.util.Scanner;

public class Example10dRETM {

	public static void main(String[] args) 
	{
		// Take a Sentence
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern like 234cars 45buses");
		String x =sc.nextLine();
		sc.close();
		//Split into pieces 
		String words[] =x.split(" ");
		String output = "";
		//Visit each word 
		for(String word:words)
		{
			int count =0;
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)>=48 && word.charAt(i)<=57) //ASCII EQUIVALENTS for 0 to 9
				{
					output = output+word.charAt(i);
				}
				else //if alphabet
				{
					count++;
				}
					
			}
			output=output+count+" ";
		}
		System.out.println(output.trim());

	}

}
