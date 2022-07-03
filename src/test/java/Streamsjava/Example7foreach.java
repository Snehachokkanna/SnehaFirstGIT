package Streamsjava;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example7foreach {

	public static void main(String[] args) 
	{

		List<Integer>numbers =Arrays.asList(2,3,4,5);
	 numbers.stream().map(x->x*x).forEach(y->System.out.println(y));
	 System.out.println(numbers);

	}

}
