package assienmentDay1;

public class Primenumberbetween {

	public static void main(String[] args) {
	
		btwnPrime(50,100);
		

	}
	public static void btwnPrime(int fn,int ln)
	{
		for(int i=fn;i<=ln;i++)
		{
		if(i%2 == 0)
		{
			System.out.println(i+" is a prime number");
		}
			
		}
		
	}

}
