package homeWorkDay3;

public class Calculator {

	public static void main(String[] args) {
		
		calculatoropt(10, 10, "divide");

	}
	public static void calculatoropt(int a,int b,String str)
	{
		double c;
		switch (str.toUpperCase()) {
		case "ADD":
			c=a=b;
		    System.out.println("Addition Value is: "+c);	
			break;
		case "SUBTRACT":
			c=a-b;
			System.out.println("Subtraction Value is:"+c);
            break;
		case "MULTIPLY":
			c=a*b;
			System.out.println("Multiplication value is :"+c);
			break;
		case "DIVIDE":
			c=a/b;
			System.out.println("Divition value is:"+c);
			break;
		} 
	}

}
