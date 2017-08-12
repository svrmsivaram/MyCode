package weeklyHomeWork01;

public class PrintEvenNumberBtwn {

	public static void main(String[] args) {
		
		printEvenNum(200,100);

	}
	
	public static void printEvenNum(int sn,int en) {
		
		for(int i=sn;i>=en;i--)
		{
			if(i%2 == 0)
				System.out.print(i+" ");
						
		}
		
		
	}

}
