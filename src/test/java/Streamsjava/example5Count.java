package Streamsjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class example5Count {

	public static void main(String[] args) {

		List<String> names =Arrays.asList("abdul","kalam","Steve","sisters");
		long l  =names.stream().count();
		System.out.println(l);

	}

}
