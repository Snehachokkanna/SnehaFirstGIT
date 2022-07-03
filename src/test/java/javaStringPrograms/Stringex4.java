package javaStringPrograms;

public class Stringex4 {

	public static void main(String[] args)
	{
		//"string" as primitive datatype
		long st1 = System.currentTimeMillis();
		String x ="a";
		for(int i=1;i<=10000;i++)
		{
			x=x+"a"; //concatenation
		}
		long et1=System.currentTimeMillis();
		System.out.println(et1-st1);	
		//String as a class
		long st2 = System.currentTimeMillis();
		String y = new String("a"); //object
		for(int i=1;i<=10000;i++)
		{
			y=y+"a"; //concatenation
		}
		long et2 = System.currentTimeMillis();
		System.out.println(et2-st2); //object
		//"StringBuffer" class(came in JDK(1.2))
		long st3 = System.currentTimeMillis();
		StringBuffer z= new StringBuffer("a"); //object
		for(int i=1;i<=10000;i++)
		{
			z=z.append("a");//concatenation
		}
		long et3 = System.currentTimeMillis();
		System.out.println(et3-st3);
		//"StringBuilder" class(came in JDK(1.5))
		long st4 = System.currentTimeMillis();
		StringBuffer w= new StringBuffer("a"); //object
		for(int i=1;i<=10000;i++)
		{
			w=w.append("a");//concatenation
		}
		long et4 = System.currentTimeMillis();
		System.out.println(et4-st4);
		

	}

}
