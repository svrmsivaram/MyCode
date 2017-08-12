package assienmentDay1;

public class PrimeNumber {

	public static void main(String[] args) {
	 
     isprime(7);
          
	}
	
	public static void isprime(int n){
		int flag = 0;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
			 System.out.println("Given number is prime");
			 flag =1;
			 break;
			}			
		}
		
		if (flag == 0)
		{
			System.out.println("Given is not a prime");
		}
	}
			
}

