package javaStringPrograms;

import java.util.Scanner;

import org.apache.hc.core5.http.nio.entity.DigestingEntityConsumer;

public class StringExample35
{
	

	public static void main(String[] args) 
	{
		//1.take sentence from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		//Reverse the sentence
		String y =""; //empty string
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c;
		}
		//3.remove Spaces in reversed sentence
		y=y.replace(" ", " ");
		//4.add spaces to reversed sentence as per spaces in original sentence
		String z ="";
		int j=0;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)==' ')
			{
				z=z+' ';
			}
			else
			{
				z=z+y.charAt(j);
				j++;
			}
		}
		
		System.out.println(z);
	

}
}
