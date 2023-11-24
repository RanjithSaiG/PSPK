package strings;

public class Countwords {
	
	public static void main(String[] args)  {
		
		String str = "My god is pavan kalyan";
		
		int count=1;
		
		for(int i=0; i<str.length()-1;i++)
		{
			
			if( (str.charAt(i)==' ')    &&(str.charAt(i++)!=' ')  )
			{
				
				count++;
				
			}
					
		}
		
		System.out.println("number of words in string: "+count);
	}
	 

}
