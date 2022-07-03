package javaStringPrograms;

public class Stringex7 {

	public static void main(String[] args)
	{
		String x ="ABDUL KALAM";
		char c1 =x.charAt(0) ;
		System.out.println(c1);
		char c2 =x.charAt(8) ;
		System.out.println(c2);
		char c3 =x.charAt(100) ; //"StringIndexOutofBounds" will come
		System.out.println(c3);
	}

}
