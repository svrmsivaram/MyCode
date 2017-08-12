package homeWorkDay2;

public class Palindrame {

	public static void main(String[] args) {
		
		ispalndrome(8);
	}

	private static void ispalndrome(int i) {
		int cpynu =i,revsnum=0,rem,qu;
		if (i<10)
		{
			System.out.println("Enter the valid number");
		}
		else
		{		
		while(cpynu > 0)
		{
			rem =cpynu%10;
			qu = cpynu/10;
			revsnum=revsnum*10+rem;
			cpynu =qu;
		}
	    
		if (revsnum == i)
			System.out.println("Enter number "+i+" is a palindrome");
		else
			System.out.println("Entered number "+i+" is not a palindrome");
		
	    }
   }
	
	
	
}
