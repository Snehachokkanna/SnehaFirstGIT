package javaPrograms;

public class Example23 {

	public static void main(String[] args) 
	{
		int x =10; //typeconversion 
		float y =x; //converting int  value to float value
		System.out.println(y); // destination datatype is bigger than source datatype so we need typecasting 
		// because sometimes we may loose data
		System.out.printf("type conversion : %n  y=%f is an float and x = %d is integer",y,x);

	}

}
