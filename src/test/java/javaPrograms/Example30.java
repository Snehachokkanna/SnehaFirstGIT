package javaPrograms;

import java.util.Formatter;

public class Example30 {

	public static void main(String[] args) 
	{
		//about "argument_index$"
		Formatter f = new Formatter();
		f.format("%2$s %1$s %3$s", "fear","Strengths","weakness");
		System.out.println(f);

	}

}
