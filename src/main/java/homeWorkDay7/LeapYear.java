package homeWorkDay7;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year:");
	int ye =sc.nextInt();
	if(ye%4 == 0)
	{
		if(ye%100== 0)
		{
			if(ye%400 == 0)
			{
            	System.out.println("Given Year "+ye+" is a leap year");
			}else
			{
				System.out.println("Given Year "+ye+" is not a leap year");
			}
		}else
		{
			System.out.println("Given Year "+ye+" is a leap year");
		}	
	}else
	{
		System.out.println("Given Year "+ye+" is not a leap year");
	}
	}
}
