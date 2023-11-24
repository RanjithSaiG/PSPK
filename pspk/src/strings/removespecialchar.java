package strings;

public class removespecialchar {
	
	public static void main(String[] args)  {
		
		String str ="ram!#@#!^&*";
		
		str = str.replaceAll("[^a-zA-Z]", "");
				
		   System.out.println(str);
	}

}
