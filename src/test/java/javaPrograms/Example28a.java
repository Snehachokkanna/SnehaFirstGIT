package javaPrograms;

import java.util.Formatter;

public class Example28a {

	public static void main(String[] args) 
	{
		//way -1 (only to display formatted output in eclipse console)
		//Via system.out.println() method
		
		System.out.printf("My name is %s and age is %d\n","abdul kalam",83);
		
		
		//way --2 (get output into String Variable)
		// via format() method "Formatter" class
		Formatter f = new Formatter();
		f.format("My name is %s and age is %d\n","abdul kalam",83);
		String x =  f.toString();
		System.out.println(x);
		
		//way -3 (get output into string variable)
		// via "format()" method in "String"class
		String y =  String.format("My name is %s and age is %d","abdul kalam",83);
		System.out.println(y);
		
		//way -4 (get output into string variable)
		// via "String Builder " class
		StringBuilder sbuf = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("My name is %s and age is %d","abdul kalam",83);
		String z = sbuf.toString();
		System.out.println(z);
		
		
				

	}

}
