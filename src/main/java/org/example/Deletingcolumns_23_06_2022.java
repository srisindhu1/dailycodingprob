package dailycodingproblems;

//asked by Microsoft.
//
//Given an array of numbers, find the length of the longest increasing subsequence in the array.
// The subsequence does not necessarily have to be contiguous.
//
//For example, given the array [0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15],
// the longest increasing subsequence has length 6: it is 0, 2, 6, 9, 11, 15.
//Constraints:
//
//1 <= nums.length <= 2500
//-104 <= nums[i] <= 104
 // dry run link :https://docs.google.com/document/d/1oHQfZ_wbod2jBN05svAXfvoRffZvSieIHGesohH15OU/edit

import java.util.Arrays;

public class Longestsequence_22_06_2022 {
    static int max;
    public static int solution(int[] nums,int n){
        // Recursive approach
        // Time Complexity is exponential
        // Space Complexity is O(1)
        if (n == 1){
            return 1;
        }

        int res, max_ending_at_ith = 1;
        for(int i = 1;i < n;i++){
            res = solution(nums,i);
            if ( nums[i - 1] < nums[ n - 1] && res + 1 > max_ending_at_ith){
                max_ending_at_ith = res + 1;
            }
        }

        if ( max < max_ending_at_ith){
            max = max_ending_at_ith;
        }
        return max_ending_at_ith;
    }

    public static int solution2(int[] nums,int n){
        // DP apprach
        // Time Complexity is O(n^2)
        // Space Complexity is O(n)
        int[] lis = new int[n];
        Arrays.fill(lis,1);
        for(int i = 1;i < n;i++){
            for(int j = 0;j < i;j++){
                if ( nums[i] > nums[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        for(int i = 0; i < n;i++){
            if(max < lis[i]){
                max = lis[i];
            }
        }
        return max;
    }
}

