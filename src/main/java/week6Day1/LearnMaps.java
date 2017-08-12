package week6Day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LearnMaps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String Value: ");
		String str = sc.next();
		char[] c = str.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (char d : c) {
			if (m.containsKey(d)) {
				int v = m.get(d);
				v += 1;
				m.put(d, v);
			} else {
				m.put(d, 1);
			}
		}
		
		for (Entry<Character, Integer> e : m.entrySet()) {
			System.out.println("Charater :" + e.getKey() + " Occures: " + e.getValue());
		}
		sc.close();
	}
}
