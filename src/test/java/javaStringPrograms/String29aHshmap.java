package javaStringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class String29aHshmap
{

	public static void main(String[] args) {
	
		//Take a sentence
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		sc.close();
		
		//May be duplicate words in different cases, so get sentence into same case
		x=x.trim(); //And remove leading and trailing spaces
		x=x.toLowerCase();
		
		//split sentence into words
		String[] words=x.split(" "); //space is a separator
		System.out.println("Count of all words is "+words.length);
		
		//Create hash map to store "words" and "occurrences of those words" as pairs/entries
			HashMap<String, Integer> hm=new HashMap<String, Integer>();
			
			for(int i=0;i<words.length;i++) 
			{	
			if(hm.containsKey(words[i])) //word already inserted into hash map
			{
			hm.put(words[i],hm.get(words[i])+1); //increase value by 1
			} 
			else //word is not in hash map
			{
			hm.put(words[i], 1);//insert word as key and 1 as value
			}
	
			}
			System.out.println(hm);
			System.out.println("Count of distinct words is "+hm.keySet().size());
			//Display duplicated words with count of occurrences
			int count=0;
			for(String word:hm.keySet()) //for all inserted distinct words in hash map
			{
			if(hm.get(word)>1)
			{
			System.out.println(word+" occured "+hm.get(word));
			count++;
			}
			}
		System.out.println("Count of duplicated words is "+count);
		

	}

}
