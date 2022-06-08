package dailycodingproblems;
//Given a multiset of integers, return whether it can be partitioned into two subsets whose sums are the same.

//Given the multiset {15, 5, 20, 10, 35}, it would return false, since we can't split it up into two subsets that add up to the same sum.
public class halfsum_07_06_2022 {
    public static boolean find(int[] arr){
        if(arr==null||arr.length==0){
            System.out.println(false);
            return false;

        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            System.out.println(false);
            return false;
        }
        int half=sum/2;
        boolean[][] dp=new boolean[arr.length+1][half+1];
        for(int i=1;i<half;i++){
            dp[0][i]=false;
        }
        for(int i=1;i< arr.length;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<= arr.length;i++){
            for(int s=1;s<=half;s++){
                dp[i][s]=dp[i-1][s];
                if(!dp[i][s]&&s>=arr[i-1]){
                    dp[i][s]=dp[i][s] || dp[i-1][s-arr[i-1]];
                }
            }
        }
        System.out.println(dp[arr.length][half]);
        return dp[arr.length][half];

    }

}
