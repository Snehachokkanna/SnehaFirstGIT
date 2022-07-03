package javaStringPrograms;

import java.util.Scanner;

public class Stringex1 {

	public static void main(String[] args) 
	{

		//only for "String"value
		String x = new String("abdul kalam");
		System.out.println(x); //x is behaving like a variable
		
		x.length();//x is behaving like an object to call method
		
		System.out.println(x.length());
		
		//for any class except "String"
		Scanner sc = new Scanner(System.in);
		System.out.println(sc); //sc is behaving like an object only,cannot behave like variable
		sc.close();
		

	}

}
