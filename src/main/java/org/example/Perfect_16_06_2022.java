package dailycodingproblems;
//A number is considered perfect if its digits sum up to exactly 10.
//
//Given a positive integer n, return the n-th perfect number.
public class Perfect_16_06_2022 {
    public static int check(int n) {
        int count = 0;
        int cur = 1;
        for(cur=1;;cur++) {
            // Find sum of digits in current no.
            int sum = 0;
            for (int x = cur; x > 0; x = x / 10)
                sum = sum + x % 10;

            // If sum is 10, we increment count
            if (sum == 10)
                count++;

            // If count becomes n, we return current
            // number.
            if (count == n){
                return cur;
            }


        }


        }



    }

