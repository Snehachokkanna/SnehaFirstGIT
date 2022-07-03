package Streamsjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class example1map {

	public static void main(String[] args) 
	{
		List<Integer>x =Arrays.asList(2,3,4,5);
		List<Integer>y =x.stream().map(a->(int)Math.pow(a, a)).collect(Collectors.toList());
		System.out.println(y);

	}

}
