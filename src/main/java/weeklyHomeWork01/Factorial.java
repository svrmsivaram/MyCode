package weeklyHomeWork01;

public class Factorial {

	public static void main(String[] args) {
		factorial(5);

	}

	private static void factorial(int gn) {
		int n=1;
		for(int i=1;i<=gn;i++)
		{
			n*=i;
		}
		System.out.println("Factorial of "+gn+" is "+n);
		
	}

}
