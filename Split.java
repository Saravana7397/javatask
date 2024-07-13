public class Split
{  
	public static void main(String args[])
	{  
		String S1="He said,\"That's not a good idea.\""; 
		String S2="";
		for(int i=0;i<S1.length();i++)
		{
		if(Character.isLetter(S1.charAt(i)))
		{
			S2 +=S1.charAt(i);
		}
		else
		{
			System.out.println(S2);
			S2="";
		}
		
		}
		
	}
}  

