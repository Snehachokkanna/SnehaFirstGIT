package Streamsjava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example6collect {

	public static void main(String[] args) 
	{
		List<Integer>numbers =Arrays.asList(2,3,4,5);
		Set <Integer> s = numbers.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(s); //Sequential access		
		List<Integer>l =numbers.stream().map(a->(int)Math.pow(a, a)).collect(Collectors.toList());
		System.out.println(l);


	}

}
