import java.util.Scanner;

public class commonElementsInIfOneAscNDesc {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		
		int n1=scan.nextInt();
		int b[] =new int[n1];
		for(int j=0;j<b.length;j++)
		{
			b[j]=scan.nextInt();		
		}
		int i =0;
		int j =b.length-1;
		while(i<a.length&&j>=0)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;
				j--;
				
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j--;
			}
		}
	}

}
