package javaPrograms;

public class Example15 {

	public static void main(String[] args) 
	{
		int x =10;
		int y =20;
		
		//way-3 (without using third variable and using mul and div operator)
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("x is " +x);
		System.out.println("y is " +y);

	}

}
