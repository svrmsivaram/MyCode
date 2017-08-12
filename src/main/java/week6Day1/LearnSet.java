package week6Day1;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {


		public void sortList(Set<String> cl ){
		System.out.println("Tree set Values:");
		for (String string : cl) {
			System.out.println(string);
		}
		}
		
/*		public void reverseList(Set<String> c2){
		
			
			System.out.println("\nReverse Collection Value: ");
			for(int i=siz-1; i>=0 ;i--){
				
				System.out.println(c2.get(i));
			}
			*/
		
		public static void main(String[] args) {
			Set <String> comlist= new TreeSet<String>();
			comlist.add("KLA");
			comlist.add("Amazon");
			comlist.add("Paypal");
			comlist.add("Microsoft");
			LearnSet lc = new LearnSet();
			lc.sortList(comlist);
			//lc.reverseList(comlist);
			
			
		}
		
}
		
