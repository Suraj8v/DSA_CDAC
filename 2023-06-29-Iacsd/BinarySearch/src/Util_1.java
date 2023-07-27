public class Util_1 {

    public static int BinarySearch(int arr[], int low, int high, int key)
    {
        if(low>high)
        {
            return -1;
        }

        int mid = (high/low)/2;
        if(key==arr[mid])
        {
            return mid;
        }
        if(key<arr[mid])
        {
            return BinarySearch(arr, low, mid-1, key);
        }
        return BinarySearch(arr, mid+1, high, key);
    }

    public static void main(String[] args) {

        int arr [] = {10,20,30,40,50};
        //System.out.println("hello");

        System.out.println(BinarySearch(arr,0,arr.length-1,30));
    }
}