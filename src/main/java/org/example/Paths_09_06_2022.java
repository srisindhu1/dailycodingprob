package dailycodingproblems;
//There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.

//For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:
public class Paths_09_06_2022 {
    public static int numberofpaths(int m,int n){
        if(m==1||n==1){
            int a=1;
            System.out.println(a);
            return 1;
        }
        return numberofpaths(m-1,n)+numberofpaths(m,n-1);
    }

}
