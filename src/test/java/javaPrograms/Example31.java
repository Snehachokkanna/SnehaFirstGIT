package javaPrograms;

import java.util.Formatter;

public class Example31 {

	public static void main(String[] args)
	{
		//about flags 
		Formatter f = new Formatter();
		//1.use space as flags with format specifier for alignment
		f.format("%d",-111);
		System.out.println(f);
		f=new Formatter();
		
		f.format("%d",111);
		System.out.println(f);
		f=new Formatter();
		
		f.format("% d",-222);
		System.out.println(f);
		f=new Formatter();
		f.format("% d", 222);
		System.out.println(f);
		
		//2.+Sign specifier
		f=new Formatter();
		f.format("%+d",111);
		System.out.println(f);
		//+sign specifier on -sign ,it will have no effect
		f=new Formatter();
		f.format("%+d",-111);
		System.out.println(f);
		
		//3.( specifier to enclose negativity values only
		f = new Formatter();
		f.format("%(+d",-111);
		System.out.println(f);
		f = new Formatter();
		f.format("%(+d",111);
		System.out.println(f);
		
		//4.comma specifier in denominations
		f = new Formatter();
		f.format("%, d",1000000);
		System.out.println(f);
		f = new Formatter();
		f.format("%, f", 32659526566.4521);
		System.out.println(f);
				

	}

}
