import java.util.Scanner;

public class printWithoutRepeatingElements {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();		
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				
				
			}
			else
			{
				System.out.print(a[i] +" ");
			}
			
		}
		System.out.println(a[a.length-1]);

	}

}
