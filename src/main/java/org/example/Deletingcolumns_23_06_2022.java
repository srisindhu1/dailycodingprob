package dailycodingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//Asked by Snapchat.
//
//Given a list of possibly overlapping intervals, return a new list of intervals
// where all overlapping intervals have been merged.
//
//The input list is not necessarily ordered in any way.
//
//For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].
//Constraints:
//
//1 <= intervals.length <= 104
//intervals[i].length == 2
//0 <= starti <= endi <= 104
//dry run:https://docs.google.com/document/d/1kP0e8I-wR3yoSnpYKK8E28W_GE3sHHmNyrjzPMJd9ag/edit
public class mergearray_24_06_2022 {
    public static void solution(Intervals[] arr){
        if(arr.length == 1){
            System.out.println(arr);
        }

       int index=0;
        Arrays.sort(arr, new Comparator<Intervals>() {
            public int compare(Intervals i1, Intervals i2) {
                return i1.start - i2.start;
            }
        });
        for (int i=1; i<arr.length; i++)
        {
            // If this is not first Interval and overlaps
            // with the previous one
            if (arr[index].end >=  arr[i].start)
            {
                // Merge previous and current Intervals
                arr[index].end = Math.max(arr[index].end, arr[i].end);
            }
            else {
                index++;
                arr[index] = arr[i];
            }
        }

        // Now arr[0..index-1] stores the merged Intervals
        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++)
        {
            System.out.print("[" + arr[i].start + ","
                    + arr[i].end + "]");
        }



        }

        }



class Intervals{
    int start,end;
    Intervals(int start,int end){
        this.start = start;
        this.end = end;
    }
}
