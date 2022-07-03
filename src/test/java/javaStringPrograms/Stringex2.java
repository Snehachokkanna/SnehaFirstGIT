package javaStringPrograms;

import java.util.Scanner;

public class Stringex2 {

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

		//Different memory for both y1 and y2 due to different values

		System.out.println(y1.hashCode());

		System.out.println(y2.hashCode());

		//Different memory for both sc1 and sc2(for any class's objects)

		Scanner sc1=new Scanner(System.in);

		Scanner sc2=new Scanner(System.in);

		System.out.println(sc1.hashCode());

		System.out.println(sc2.hashCode());


	}

}
