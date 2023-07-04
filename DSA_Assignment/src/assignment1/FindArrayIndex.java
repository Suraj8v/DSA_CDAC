package assignment1;
//1. Write a Java program to find the index of an array element.

public class FindArrayIndex {
	
	public boolean findIndex(int arr[], int val)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==val)
			{
				System.out.println("index of array : "+i);
				return true;
			}
		
			}
		System.out.println("invalid value");
		return false;
		}
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9};
		FindArrayIndex f = new FindArrayIndex();
		f.findIndex(arr, 99);

	}

}
