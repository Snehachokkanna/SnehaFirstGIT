package javaStringPrograms;

import java.util.Scanner;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;

public class String31choccurelogic2 {

	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x =sc.nextLine();
		System.out.println("Enter a character");
		char y = sc.nextLine().charAt(0);
		
		sc.close();
		
		//count of Occurences
		String temp = x; //copy sentence
		int l1=temp.length(); //get count of chars in that sentence
		System.out.println(l1);
		temp=temp.replace(""+y,"");
		int l2=temp.length();
		System.out.println(l2);
		System.out.println(y + "occured" +(l1-l2)+"times");
		

	}

}
