package javaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.glass.ui.Size;

public class Example35 {

	public static void main(String[] args) 
	{
		List<Integer> l = Arrays.asList(12,56,78,90,-8);
		
		//way-1 using "for"  loop
		for (int i = 0;i<l.size();i++)
		{
			System.out.print(l.get(i)*l.get(i)+" ");
		}
		System.out.println();
		
		//way-2 using "for each " loop
		for (int x:l)
			
		{
			System.out.print(x*x+" ");
		}
		System.out.println();
		//way-3 using "while" loop
		int i =0;
		while(i<l.size())
		{
			System.out.print(l.get(i)*l.get(i)+" ");
			i++;
		}
		System.out.println();
		
		//way 4  using do-while loop
		int j=0;
		do
		{
			System.out.print(l.get(j)*l.get(j)+" ");
			j++;
		}while(j<l.size());
		System.out.println();
		//way-5 using Streams
		System.out.println(l.stream().map(x->x*x).collect(Collectors.toList()));
		
		
		
	}
	
}
