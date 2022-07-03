package Streamsjava;

import java.util.Arrays;
import java.util.List;

public class Example11doublecolon 
{
	
	//constructor method 
	public Example11doublecolon() //without arguments
	{
		System.out.println("Object has been created ,this is default constructor");
	}
	public Example11doublecolon(int x) //with arguments
	{
		System.out.println(x);
	}
	//operational methods
	public void method1(int x) //non static method
	{
		System.out.println(x);
	}
	
	public  static void method2(int x) //static method
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		//call non static method using "." operator
		Example11doublecolon obj1= new Example11doublecolon();
		obj1.method1(105);
		
		//call non static method using "::" operator
		List<Integer> l1= Arrays.asList(2,3,7,9);
		l1.forEach(obj1::method1);
		
		//call static method using "." operator
		Example11doublecolon.method2(105);
		
		//call static method using "::" operator
		l1.forEach(Example11doublecolon::method2);
		
		//call constructor method
		Example11doublecolon obj2= new Example11doublecolon(1995);
		

		//call constructor method using "::" operator
		
		l1.forEach(Example11doublecolon::new);
		
		
				
		
		

	}

}
