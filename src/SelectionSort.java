import java.util.*;
public class SelectionSort {
    int[] sort(int[] arr, int[] count)
    {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for(int i=0; i < n; i++){
            // Find the minimum element in unsorted array
            int j;
            for( j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //count swaps
                    int  temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    count[1]++;
                }
                count[0]++;//count comparisons
            }
        }
        return count;
    }

    // Driver code to test above
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[2];
        Random rd = new Random(); // creating Random object
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(); // storing random integers in an array
        }

        SelectionSort ob = new SelectionSort();
        ob.sort(arr,count);
        System.out.println();
        System.out.println("Number of comparisons: " + count[0]);
        System.out.println("Number of exchanges: " + count[1]);
    }
}

