package homeWorkDay4;


public class PalindromeInString {

	public static void main(String[] args) {
    
		String str = "MadaM";
		String rvs = new StringBuilder(str).reverse().toString();
	if(str.compareTo(rvs) == 0)
	{
		System.out.println("It's Palindrome");
	}
	else
	{
		System.out.println("It's not a Palindrome");
	}
	
  }
}

