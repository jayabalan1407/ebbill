
public class descendingorder {
	public static void main(String args[])
	{
		int a[]={54,54,86,56,95,75,83};
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i] < a[j]){
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}
