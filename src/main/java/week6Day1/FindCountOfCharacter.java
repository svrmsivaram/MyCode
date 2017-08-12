package week6Day1;

import java.util.Scanner;

public class FindCountOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String values:");
		String str =sc.next();
		System.out.println("Please enter the char to find the count");
		String n =sc.next();
		int count =0;
		
		char ar[] =str.toCharArray();
		char na[] = n.toCharArray();
		
		for (char c : ar) {
			if(c == na[0]){
				count+=1;
			}
		}
		System.out.println("Total count is: "+count);
      sc.close();
	}

}
