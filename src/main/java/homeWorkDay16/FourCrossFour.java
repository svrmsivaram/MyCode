package homeWorkDay16;

import java.util.Scanner;

public class FourCrossFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Enter the Value of a["+i+"]"+"["+j+"]");
				a[i][j]= sc.nextInt();
			}
		}
		
		for (int[] is : a) {
			
		for (int i : is) {
			System.out.print(i+ " ");
		}
		System.out.println(" ");
		}
		sc.close();
	}

}
