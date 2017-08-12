package week2Day1;

import org.testng.annotations.Test;

public class AttributesOfTest {
	
	@Test(expectedExceptions={ArithmeticException.class})
	public void creatLead() {
		
		System.out.println("Creat Lead");
		int a= 5/0;
		System.out.println(a);
	}
	@Test(dependsOnMethods={"creatLead"})
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test
	public void mergeLead() {
		System.out.println("Mearge Lead");
	}
	@Test
	public void duplicate() {
		System.out.println("Duplicate Leat");
	}

}
