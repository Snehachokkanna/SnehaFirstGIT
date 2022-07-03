package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;

public class Example128 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> x = new HashMap<Integer,String>();
		Hashtable<Integer,String> y = new Hashtable<Integer,String>();
		TreeMap<Integer, String> z = new TreeMap<Integer,String>();
		
		x.put(10,"abc"); //insert a pair (key,value)
		x.put(null,"pqr"); //accepted (key is NULL)
		x.put(11, null); //accepted value is NULL
		x.put(11, null); //duplicate pairs accepted (over writing)
		
		y.put(10,"abc"); //insert a pair(key,value)
	//	y.put(null,"pqr"); //rejected key is NULL
	//	y.put(11, null); //rejected value is NULL
		y.put(11,"pqr");
		y.put(11, "pqr"); //duplicate pairs accepted
		
		z.put(10,"abc"); //insert a pair (key,value)
		z.put(10,"abc"); //duplicate values are accepted (over writing)
	//	z.put(null,"pqr"); //rejected key is null
		z.put(11, null); //accepted value is null
		
		//"Hash set" is competitor to ArrayList
		HashSet<String> w = new HashSet<String>();
		w.add(null); //accepeted , but cannot allow duplicates
		w.add(null); //rejected (one null only)
		w.add("kalam");
		w.add("kalam");//rejected ,cannot allow duplicates
		

	}

}
