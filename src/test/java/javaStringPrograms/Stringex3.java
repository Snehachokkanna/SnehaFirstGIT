package javaStringPrograms;

public class Stringex3 {

	public static void main(String[] args) 
	{
		

		//Only for "String" class
		String x1=new String("abdul kalam");
		String x2=new String("abdul kalam");
		//Common memory for both x1 and x2 due to value is same because "String" is immutable
		System.out.println(x1.hashCode());
		System.out.println(x2.hashCode());
		String y1=new String("Sleepers");
		String y2=new String("steve jobs");
		//Different memory for both y1 and y2 due to different value
		System.out.println(y1.hashCode());
		System.out.println(y2.hashCode());
		//Different memory for both sc1 and sc2(for any class's objects)
		StringBuilder s1 = new StringBuilder("kalam");
		StringBuilder s2 = new StringBuilder("kalam");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
