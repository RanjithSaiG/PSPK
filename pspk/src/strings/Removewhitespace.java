package strings;

public class Removewhitespace {
	
	
public static void main(String [] args)	 {
	
	String str = "ran jith  sai";
	
	System.out.println("befoere white space:" +str);
	
	str=str. replaceAll("\\s","");
	
	System.out.println("after white space:" +str);
	
}
	
	
	
	
	
	

}
