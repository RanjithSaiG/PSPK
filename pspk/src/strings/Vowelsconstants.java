package strings;
import java.util.Scanner;
public class Vowelsconstants {
	
	public static void main(String[] args)  {
		
		
	Scanner	sc = new Scanner(System.in);
		
		System.out.println("enter alphabet:");
		
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		
		case  'a':
		case  'e':
		case  'i':
		case  'o':
		case  'u':
			System.out.println(c +":is vowel");
			break;
			default:
		
		System.out.println(c +":is a constanmt");
	}

}}

