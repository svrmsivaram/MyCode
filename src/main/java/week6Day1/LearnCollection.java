package week6Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollection {


		public void sortList(List<String> cl ){
		Collections.sort(cl);
		System.out.println("Sorting Collection Value: ");
		for (String string : cl) {
			System.out.println(string);
		}
		}
		
		public void reverseList(List<String> c2){
		
			int siz =c2.size();
			System.out.println("\nReverse Collection Value: ");
			for(int i=siz-1; i>=0 ;i--){
				
				System.out.println(c2.get(i));
			}
			
		}
		
		public static void main(String[] args) {
			List <String> comlist= new ArrayList<String>();
			comlist.add("KLA");
			comlist.add("Amazon");
			comlist.add("Paypal");
			comlist.add("Microsoft");
			LearnCollection lc = new LearnCollection();
			lc.sortList(comlist);
			lc.reverseList(comlist);
			
			
		}
		
		

}
