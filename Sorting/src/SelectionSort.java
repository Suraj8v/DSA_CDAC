
public class SelectionSort {
	
		public static void sort(int arr[])
		{
			for(int i = 0; i<arr.length-1; i++)
			{
				int min=i;
				for(int j=i+1; j<arr.length;j++)
				{
					if(arr[min]>arr[j])
					{
						min=j;
					}	
				}
				if(min!=i)
				{
					int temp;
					temp= arr[i];
					arr[i] = arr[min];
					arr[min]=temp;
				}
				
			}
		}
	
	
	
	public static void main(String[] args) {
	
		int arr[] = {3,2,5,6,1};
		sort(arr);
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
