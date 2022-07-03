package crossopenbrowsers;

class ndcx 
{ 
	public static void main (String[] args) throws Exception 
	{ 
		String str1="hello"; 
		String str2="world"; 
		System.out.println("before swapping\nstr1 = "+str1); 
		System.out.println("str2 = "+str2); 
		str1=str2+str1; 
		str2=str1.replace(str2,""); 
		str1=str1.replace(str2,""); 
		System.out.println("after swapping\nstr1 = "+str1); 
		System.out.println("str2 = "+str2); 
	} 
}