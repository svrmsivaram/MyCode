package homeWorkDay8;

public class ArrayAscending {

	public static void main(String[] args) {
		int[] a={20,340,21,879,92,21,474,83647,-200};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j])
				{
					int n=a[i];
					a[i]=a[j];
					a[j]=n;
				}
			}
			
	}
		System.out.println("The Scond highest Value is "+a[1]);

  }
}
