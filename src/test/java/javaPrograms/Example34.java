package javaPrograms;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

import sun.util.resources.cldr.nl.CalendarData_nl_SX;

public class Example34 {

	public static void main(String[] args) 
	
	{
		//about special character
		//1.newline format specifier 
		Formatter f = new Formatter();
		f.format("abdul%nkalam");
		System.out.println(f);
		
		//2.%% format specifier to get % in output
		f = new Formatter();
		f.format("10%%4=2");
		System.out.println(f);
		
		//3.Regionalize output
		f = new Formatter();
		f.format(Locale.FRANCE,"%.5f",-1325.789);
		System.out.println(f);
		
		f = new Formatter();
		f.format(Locale.CANADA,"%.5f",-1325.789);
		System.out.println(f);
		
		//4.Regionalize Date
		f = new Formatter();
		f.format(Locale.FRENCH,"%1$td %1$tB, %1$tY",Calendar.getInstance());
		System.out.println(f);
		
		f = new Formatter();
		f.format(Locale.ENGLISH,"%1$td %1$tB, %1$tY",Calendar.getInstance());
		System.out.println(f);

	}

}
