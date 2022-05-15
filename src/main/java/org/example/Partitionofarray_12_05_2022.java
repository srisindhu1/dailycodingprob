package dailycodingproblems;
//Given an array of strictly the characters 'R', 'G', and 'B',
// segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

import org.jetbrains.annotations.NotNull;

public class Partitionofarray_12_05_2022 {
    public static char[] partition(@NotNull char [] arr) {

        int low=0;
        int mid =0;
        int high = arr.length-1;

        while(mid<=high) {
            if(arr[mid] == 'R') {
                char temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 'G') {
                mid++;
            }
            else {
                char temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        return arr;

    }
}
