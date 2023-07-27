import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {20,40,50,10,30};
        System.out.println("array : ");
        System.out.println(Arrays.toString(arr));


        System.out.println("Sorted array using bubble sort : ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
