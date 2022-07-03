package javaPrograms;

import java.util.Formatter;

public class Example32 {

	public static void main(String[] args)
	{
		
		//about minimum width
		Formatter f=new Formatter();
		//1. right justify by default (including spaces at left side)
		f.format("%15s%n%15s%n%15s", "fear", "strengthen", "weakness"); 
		System.out.println(f);

		//2. right justify by default (including spaces at left side)
		f=new Formatter();
		f.format("%15f",1234.1234);
		System.out.println(f);

		//3. left justify(including spaces at right side)
		f = new Formatter();
		f.format("%-15f",1234.1234);
		System.out.println(f);
		
		//4 Format into 10 digit number with 0's in the place of spaces
		f= new Formatter();
		f.format("%010d",88); //make 88 as 10 digit number with 0 as prefix
		System.out.println("value in 10  digits:"+f);

	}

}
