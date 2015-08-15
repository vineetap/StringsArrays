package ArraysStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PanagramsOfString {

	public static void main(String[] args)  {
		
		PanagramsOfString pos=new PanagramsOfString();
		String str="abcd";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(0, i)+str.substring(i+1, str.length()));
		}
		
		pos.permute(str,str.length(),"",str);
	}
	
	
	public  void permute(String str,int len,String result,String string)
	{    
        int alLength=string.length();
		if(result.length()==len)
        {
        	System.out.println("panagram : "+result);
        	return;
        }  
        
		for(int i=0;i<alLength;i++)
          {   
			
           permute(str,len,result+string.charAt(i),string.substring(0, i)+string.substring(i+1, alLength));
           
          }		
	}

}
