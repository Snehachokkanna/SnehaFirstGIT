package Streamsjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class Example4distinct {

	public static void main(String[] args)
	{
		List<String> names =Arrays.asList("abdul","abdul","kalam","Steve","sisters","Steve");
		List <String> result =names.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(String name : names)
		{
			if(hm.containsKey(name))
			{
				hm.put(name,hm.get(name)+1); //if name exists as key increase by 1
			}
			else
			{
				hm.put(name,1);
			}
		}
		System.out.println(hm.keySet()); //distinct word in array
		System.out.println(hm);
	}

}
