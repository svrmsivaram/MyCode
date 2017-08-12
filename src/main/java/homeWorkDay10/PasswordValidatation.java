package homeWorkDay10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidatation {

	public static void main(String[] args) {
	
		//Scanner sc = new Scanner(System.in);
		//String psw= sc.nextLine();
		//String pattrn ="(?=..*[0-9])().{10,}"
		/*if(psw.length()>=10 && Pattern.matches("[a-zA-Z0-9]{10}", psw) && Pattern.matches("[A-Z]{2}", psw) &&  )
		{
				if(Pattern.matches("[a-zA-Z0-9]", psw))
				{
					
				}
			
		}*/
				
		/*String pat ="[\\sa-zA-Z0-9]{5,}";
		String pswa ="sivaramf sd A we 45545b 4";
		*/
		String pat1 ="[a-z{1,}A-Z{1,}0-9{2,}]{10,}";		
		String pat ="(?=.*[A-Z])";
		String pswa ="sdfsdfA3s4d@sd";
		String pswaa="Add";
		
		String pat2 ="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9].*[0-9])(?=.*[^a-zA-Z0-9]).{8,}";
		
		
		
		System.out.println(pswa.matches(pat2));
		
			
		}
				

	}

