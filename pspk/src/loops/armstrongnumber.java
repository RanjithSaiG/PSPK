package loops;

public class armstrongnumber {
	public static void main(String[] args)
	{
		int num = 371;
		int rem;
		int result=0;
		int intnum=num;
		
		
		while(intnum!=0)
		{
			rem=intnum%10;
			result+=pow(rem,3);  
			intnum =10;
		
		}
		
		if(result==num)
		{
			System.out.println(num+"is an armstrong number.");
		}
			else
			{
			
				System.out.println(num+"is not inarmstrong number.");
			}
		}
	

	private static int pow(int rem, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
 
}
