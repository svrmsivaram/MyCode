package homeWorkDay6;

public class DuplicateinArray {

	public static void main(String[] args) {
		int[] a= {13,15,67,88,65,13,99,67,65,87};
		System.out.print("Duplicatate number are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}



