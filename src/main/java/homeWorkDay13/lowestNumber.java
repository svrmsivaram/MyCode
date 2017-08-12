package homeWorkDay13;

import java.util.Scanner;

public class lowestNumber {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("Please Enter the digit: ");
		int d = sc.nextInt();
		int dup =num,re;
		
		while(dup>0)
		{
			re =dup%10;		
			dup = dup/10;
			if()
			
			*/
		int number=139,r;
	    int digit=1;
	  {
		for(int i=number;i>0;i--) {
			int n=i;
			int temp=0;
		   while(n>0) {				
			r=n%10;
			n=n/10;	
			if (r==digit) {
			    temp++;
			}
		   } 
		   if(temp==0){			
		      System.out.println("Largest number ->" + i);
		      break;
		   }
		}	
	      }

		
		
		
	}

}
