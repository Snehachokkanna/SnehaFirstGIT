package Streamsjava;

import java.util.Arrays;
import java.util.List;

public class Example8areduce {

	public static void main(String[] args) 
	{
		List<Integer> numbers =Arrays.asList(2,3,4,5,6,7,8,9);
		int sum =numbers.stream().reduce(0,(ans,i)->ans+i);
		System.out.println(sum);
		
		int evensum=numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(evensum);
		
		int oddsum=numbers.stream().filter(x->x%2!=0).reduce(0,(ans,i)->ans+i);
		System.out.println(oddsum);
		
		

	}

}
