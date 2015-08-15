package ArraysStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

public class NoOfCharacterToReplaceToMakeAnagram {

	public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);	
		int tc=Integer.parseInt(br.readLine());
		
		
		//System.out.println("No of Tcs "+tc);
		
		while(tc>0)
		{
			String checkAnaStr=br.readLine();
			//System.out.println("str "+checkAnaStr);
			
			if((checkAnaStr.length()%2)!=0)
			{ 
				out.println(-1);
			   tc--;
			   continue;
			}
			HashMap<Character, Integer> hm=new HashMap<>();
			String str1=checkAnaStr.substring(0, checkAnaStr.length()/2);
			String str2=checkAnaStr.substring((checkAnaStr.length()/2),checkAnaStr.length());
			int count=0;
			//System.out.println(str1+"   "+str2);
			for(int i=0;i<str1.length();i++)
			{
				if(hm.containsKey(str1.charAt(i)))
				{
					hm.put(str1.charAt(i),hm.get(str1.charAt(i))+1);
				}
				else
					hm.put(str1.charAt(i), 1);
			}
			
			for(int i=0;i<str2.length();i++)
			{
				if(hm.containsKey(str2.charAt(i)))
				{
					if(hm.get(str2.charAt(i))!=1)
					hm.put(str2.charAt(i),hm.get(str2.charAt(i))-1);
					else
						hm.remove(str2.charAt(i));
				}
				
			}
						
			
			for(Character key:hm.keySet())
			{
				count+=hm.get(key);
			}
			out.println(count);
			tc--;
		}
		
		out.close();
	}
}