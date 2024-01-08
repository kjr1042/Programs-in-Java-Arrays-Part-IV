import java.util.Scanner;

public class countSmallestRepeatingElement {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		int count =0;
		for(int i=a.length-1;i>=1;i--)
		{
			if(a[i]==a[i-1])
			{
				
				count++;
				
			}
			else
			{
				System.out.println(count);
			}
			
		}
		
	}

}
