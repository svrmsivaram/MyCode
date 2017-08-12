package week6Day1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LearnRemoveSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String Value: ");
		String str = sc.next();
		char[] c = str.toCharArray();
		Set<Character> s = new TreeSet<Character>();
		
		for (Character character : c) {
			s.add(character);
		}
		
		System.out.println(s);
		sc.close();
	}

}
