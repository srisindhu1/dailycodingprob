package dailycodingproblems;
//Suppose you have a multiplication table that is N by N. That is, a 2D array
// where the value at the i-th row and j-th column is (i + 1) * (j + 1) (if 0-indexed) or i * j (if 1-indexed).
//
//Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.
public class Findmultiplication_21_06_2022 {

    public static int integer(int n,int x){
        int[][] arr= new int[n][n];
        int count=0;//counter to count the number of ways.
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=(i+1)*(j+1);
                if(x==arr[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int integer1(int n,int x){
        //approach 2
        int count=0;//counter to count the number of ways.
        for(int i=1;i<=n;i++){
            if(x%i==0 && x/i<=n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n=6;
        int x=12;
        int a= integer(6,12);
        System.out.println(a);
    }
}
