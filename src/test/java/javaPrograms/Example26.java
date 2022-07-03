package javaPrograms;

public class Example26 {

	public static void main(String[] args)
	{
		float x =(float)(1000*600000000000000000000000000000000000000.56789); //wrong output due to correct output size is more than 8 bytes
		float y =        1000*60000000000000000000.56789F ; //correct output because of memory expansion
		System.out.println(y);
		System.out.println(x);
	}

}
