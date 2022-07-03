package javaStringPrograms;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Stringex5 {

	public static void main(String[] args) 
	
	{
		String x1="abdul kalam";
		String x2 = new String("abdul kalam");
		//values comparision
		if(x1.equals(x2)) //here "equals()"method is belongs to "String" class
		{
			System.out.println("same");
		}
		else
		{
			System.out.println(" not same");
		}
		//2. Objects comparision (Object details comparision)
		if(x1==x2) // "==" in between object(object details) and "equals()"in "object" class both are same
		{
			
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
			
		
	
		
		
	}
	

}
