import java.util.Scanner;

public class smallestSubArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		
		for(int size=1;size<=a.length;size++)
		{
			
			for(int i=0;i<=a.length-size;i++)
			{
				for(int j=i;j<size+i;j++)
				{
					System.out.print(a[j]+" ");
				}
				System.out.println();
				return;
			}	
		}
		
	}

}
