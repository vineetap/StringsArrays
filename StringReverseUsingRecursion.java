package ArraysStrings;

public class StringReverseUsingRecursion {
	
	public static void main(String args[])
	{
		String str="vineeta";
		 char c=' ';
		  
		 Long l=6L;
		 Integer i=6;
		 if(l.intValue()==i)
		 {
			System.out.println(""); 
		 }
		 System.out.println("Reverse :"+reverse(str,0,str.length()));
	}

	
	public static String reverse(String str,int i,int len)
	{   String temp;
		if(i==len)
		{  System.out.println("i : "+i);
			return "";
		}	
		else{
			temp=reverse(str,i+1,len);
			System.out.println("temp : "+temp);
			return temp+str.charAt(i);
			
		}
		
	}
}
