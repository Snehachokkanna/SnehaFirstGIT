package Streamsjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3sorted {

	public static void main(String[] args)
	{
		List<String> names =Arrays.asList("abdul","kalam","Steve","sisters");
		List <String> result =names.stream().sorted().collect(Collectors.toList());
		System.out.println(result);

	}

}
