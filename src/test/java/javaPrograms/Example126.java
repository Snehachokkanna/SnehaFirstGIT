package javaPrograms;

import java.util.Calendar;

public class Example126 {

	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		System.out.println("The Current date and time is :"+c.getTime());
		System.out.println("At present calendar's year : "+c.get(Calendar.YEAR));
		System.out.println("At present calendar's month : "+c.get(Calendar.MONTH));
		System.out.println("At present Calendars's Day : "+c.get(Calendar.DATE));
		
		

	}

}
