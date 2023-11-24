package loops;

public class palindrome {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int orgnum= num;
		
		while (num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		
		}	
		
		if(orgnum==rev)
			
		{
			
			System.out.println("number is palindrome:" +rev);
		}

		else
		{
			System.out.println("number is not a palindrom");
		}
	}


}
