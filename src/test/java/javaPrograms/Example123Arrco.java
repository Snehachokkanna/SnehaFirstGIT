package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Example123Arrco {

	public static void main(String[] args) 
	{
		//Creating arrayList list dynamically
		List <String> l = new ArrayList<String>();
		//Adding elements to the list
		l.add("Sachin");
		l.add("Abdul kalam");
		l.add("Mother Teresa");
		l.add("Nelson Mandela");
		l.add("CVRaman");
		l.add("Abdul ghaffer khan");
		//converting list to an array
		String [] str = l.toArray(new String[0]);
		//Print converted elements in array
		System.out.println("Array input : " +Arrays.toString(str));

	}

}
