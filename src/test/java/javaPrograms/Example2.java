package javaPrograms;



public class Example2 
{

	public static void main(String[] args) 
	{
	
		int x=10; //Global variable
		{
			int y = 20 ; // local variable
			System.out.println(x);
			System.out.println(y);	
		} // y lifetime go to end (here within block)
		System.out.println(x);	
	} // x lifetime go to end (in this block)
}
