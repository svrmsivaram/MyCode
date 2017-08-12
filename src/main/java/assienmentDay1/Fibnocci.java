package assienmentDay1;

public class Fibnocci {

	public static void main(String[] args){
	int n=100,fn=0,sn=1,t;
	for(int i=1; i<100;i++)
	{
	 System.out.print(fn+" ");
	 t=fn;
	 fn=sn;
	 sn+=t;
	 if(sn >=n)
	 {
		 break;
	 }
	}
	
		
	}

}
