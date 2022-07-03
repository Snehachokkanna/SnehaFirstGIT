package javaStringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class String29bcharHshmap
{

	public static void main(String[] args)
	{
	
		//Take a sentence
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		
		//May be duplicate words in different cases, so get sentence into same case
		//x=x.trim(); //And remove leading and trailing spaces
		x=x.toLowerCase();
		
		//split sentence into characters
		char[] chars=x.toCharArray();
		System.out.println("Count of all chars is "+chars.length);
		
		//Create hash map to store "words" and "occurrences of those words" as pairs/entries
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<chars.length;i++) 
		{	
			if(hm.containsKey(chars[i])) //word already inserted into hash map
			{
				hm.put(chars[i],hm.get(chars[i])+1); //increase value by 1
			} 
			else //word is not in hash map
			{
				hm.put(chars[i], 1);//insert word as key and 1 as value
			}
		}
		System.out.println(hm);
		System.out.println("Count of distinct char is "+hm.keySet().size());
		//Display duplicated words with count of occurrences
		int count=0;
		for(char c:hm.keySet()) //for all inserted distinct words in hash map
		{
			if(hm.get(c)>1)
			{
				System.out.println(c+" occured "+hm.get(c));
				count++;
			}
		}
		System.out.println("Count of duplicated chars is "+count);
	}

}
