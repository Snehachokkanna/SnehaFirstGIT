package javaPrograms;

public class Example22 {

	public static void main(String[] args) 
	{
		float x =(float)10.89; //typecasting 
		int y =(int)x; //converting float  value to integer value
		System.out.println(y); // destination datatype is bigger than source datatype so we need typecasting 
		// because sometimes we may loose data
		System.out.printf("type casting : %n  y=%d is an Integer and x = %f is float",y,x);
	}

}
