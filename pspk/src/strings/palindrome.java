package strings;

public class palindrome {
	
	public static void main(String[] args)  {
		
		String r="radar";
		
		String rev="";
		for(int i=r.length()-1; i>=0; i--) 
		{
			rev=rev+r.charAt(i);
			
		}
		if(r.equals(rev))
		{
			System.out.println("palindrom");
			
		}
	else
	{
		System.out.println("not a palindrom");	
	}

	}
}
