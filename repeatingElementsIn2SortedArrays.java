import java.util.Scanner;

public class repeatingElementsIn2SortedArrays {

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
		int j =0;
		while(i<a.length&& j<b.length) 
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				i++;
				j++;
				
			}
			else if(a[i]<b[j])
			{
				i++;
			}
			else
			{
				j++;
			}
			
		}

	}

}
//When finding the common elements in two sorted arrays, we need to compare the elements from both arrays to determine if they are equal or not. 
//The condition a[i] <b[j] is used to decide whether to increment the index i for the first array or the index for the second array.
//
//If a[i] <b[j].it means that the element in the first array is smaller than the element in the second array. 
//In this case, we increment the index i to move to the next element in the first array since the smaller element cannot be a common element.
//
//If a[i]>b[j], it means that the element in the first array is larger than the element in the second array.
//In this case, we increment the index j to move to the next element in the second array since the smaller element cannot be a common element.
//
//If a[i]== b[j], it means that we have found a common element in both arrays. We can add this element to our result and increment both indices 1 and 1 to move to the next elements in both arrays.
