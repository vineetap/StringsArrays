package ArraysStrings;

import java.util.HashMap;

//‘Eleven plus two'    ‘Twelve plus one’
//salvador dali
//avida dollars

public class TwoStringsAreAnagrams {
	
	public static void main(String args[])
	{
		String str1="salvador dali";
		String str2="avida dollars";
		
		checkAnagrams(str1,str2);
		
	}
	
	public static boolean checkAnagrams(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		return false;
		
		boolean flag=true;
		
        HashMap<Character,Integer> hm1=new HashMap<>();
       // HashMap<Character, Integer> hm2=new HashMap<>();
        
        for(int i=0;i<str1.length();i++)
        {
        	if(hm1.containsKey(str1.charAt(i)))
        		hm1.put(str1.charAt(i),hm1.get(str1.charAt(i))+1);
        	else
        		hm1.put(str1.charAt(i),1);
        }
        
        
        for(int i=0;i<str2.length();i++)
        {
        	if(hm1.containsKey(str2.charAt(i)))
        	{
        		if(hm1.get(str2.charAt(i))!=1)
        			hm1.put(str2.charAt(i),hm1.get(str2.charAt(i))-1);
        		else
        			hm1.remove(str2.charAt(i));
        	}
        	else
        	{
        		flag=false;
        		break;
        	}
        }
        
        System.out.println("Size of hashmap "+hm1.size());
		
		return flag;
	}

}
