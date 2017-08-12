package week6Day1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class RemoveSpace {
	
	@Test
	public static void reverseString() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String:");
		String a= sc.nextLine();
		char re[] = a.toCharArray();
		for(int i=0;i<re.length;i++){
			if((int)re[i] != 32 )
			System.out.print(re[i]);	
		}
		System.out.println("");
		sc.close();
	}

}
