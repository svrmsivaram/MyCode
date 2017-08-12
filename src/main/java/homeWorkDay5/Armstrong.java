package homeWorkDay5;

public class Armstrong {

	public static void main(String[] args) {
		
		armStrong(100,100000);
		

	}

	private static void armStrong(int st, int en) {
		int qu=0,re,am,ams=0;
	
		for(int i=st;i<=en;i++)
		{
			int du =i;
			while(du>0)
			{
			 re =du%10;
			 qu =du/10;
			 am = (int) Math.pow(re, 3);
			 du=qu;
			 ams+=am;
			}
			if ((i)== ams)
			{
			System.out.println(ams);
			}
		 ams=0;	
		
		}
	
	}

}
