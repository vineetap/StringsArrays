package ArraysStrings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharInString {
	public static void main(String args[])
	{
	
		String str="GeeksforGeeks";
		
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>(); //Stores only character that are occurring once
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>(); //Stores count of character
		
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
				lhm.remove(str.charAt(i));
			}
			else
				{ hm.put(str.charAt(i), 1);
				 lhm.put(str.charAt(i), 1);
				}
		}
		
		for(char c:lhm.keySet())
		{
			System.out.println(c);
			break;
		}
	}

}
