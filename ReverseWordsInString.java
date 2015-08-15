package ArraysStrings;

public class ReverseWordsInString {
	
	public static void main (String args[])
	{  //char empty=' ';
		String inp="My name is vineeta";
		String out;
		int init=0;
		int i=0;
		for( i =0;i<inp.length();i++){
			if(inp.charAt(i)==' ')
			{
				System.out.println(inp.substring(init, i));
				init =i+1;
			}

		}
		System.out.println(inp.substring(init, i));

	}

}
