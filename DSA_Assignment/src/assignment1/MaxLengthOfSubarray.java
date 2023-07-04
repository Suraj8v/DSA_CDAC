package assignment1;
//3. You are given array consisting of n integers. 
//Your task is to find the maximum length of an increasing sub-array of the given array.

public class MaxLengthOfSubarray {
	
	public static int findMaxLength(int arr[], int n)
	{
		int max=1, len=1;
		
		for(int i=1; i<n; i++)
		{
			if(arr[i] > arr[i-1])
			{
				len++;
			}
			else {
				if(max<len)
				{
					max=len;
					len=1;
				}
			}
		}
		if(max<len)
		{
			max=len;
		}
		return max;
		
	}
	

	public static void main(String[] args) {

		int arr [] = {3,4,2,34,56,99};
		int n = arr.length;
		System.out.println("max length : "+findMaxLength(arr, n)); 
	}

}
