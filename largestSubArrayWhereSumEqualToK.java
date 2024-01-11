import java.util.Scanner;

public class largestSubArrayWhereSumEqualToK {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int k =scan.nextInt();
		for(int size=a.length;size>=1;size--)
		{
			for(int i=0;i<=a.length-size;i++)
			{
				int sum =0;
				for(int j=i;j<size+i;j++)
				{
					sum = sum+a[j];
				}
				if(sum==k)
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

}

//n=5
//array elements = 3 5 1 7 2
//k=9
//3 5 1
