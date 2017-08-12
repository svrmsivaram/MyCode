package homeWorkDay9;

import java.util.Scanner;

public class PatternPrintingNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the No.Of Rows");
		int rc=sc.nextInt();
		int op=1;
		for(int i=1;i<=rc;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(op +" ");
				op++;
			}
			System.out.println(" ");
		}

	}

}
