
//Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
public class Spiralloop_12_06_2022 {
    public static void spiralprint(int m,int n,int[][] arr){
        int i,k=0,l=0;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        while(k<m && l<n){
            for(i=l;i<n;++i){
                System.out.println(arr[k][i] + " ");
            }
            k++;
            for(i=k;i<m;++i){
                System.out.println(arr[i][n-1] + " ");
            }
            n--;
            if(k<m){
                for(i=n-1;i>=l;--i){
                    System.out.println(arr[m-1][i] + " ");

                }
                m--;
            }
            if (l < n) {
                for(i=m-1;i>=k;--i){
                    System.out.println(arr[i][l] + " ");

                }
                l++;

            }
        }

    }
}
