package assignment1;

import java.util.Scanner;

public class FindThirdLargest {
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		
		System.out.println("Enter the array elements : ");
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//display
		System.out.println("array : "); 
		for(int i = 0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		

		int count=0;
		for(int i = 0; i<arr.length; i++)
		{
			int temp;
			for(int j=i+1; j<arr.length; j++ )
			{
				if(arr[i]<arr[j])
				{
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("sorted array : ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//for the thrid largest no. in array
		if(arr.length>=3)
		{
			System.out.println("third largest element in array : "+arr[2]);
		}
		else {
			System.out.println("array size is too small!!!");
		}

	}

}
