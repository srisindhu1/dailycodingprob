package dailycodingproblems;
//Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by 
// going left-to-right, or up-to-down.
//For example, given the following matrix:
//[['F', 'A', 'C', 'I'],
// ['O', 'B', 'Q', 'P'],
// ['A', 'N', 'O', 'B'],
// ['M', 'A', 'S', 'S']]
//and the target word 'FOAM', you should return true,
public class Wordsearch_10_06_2022 {
    static int[] x={1,0};
    static int[] y={0,1};
    static int row=4;
    static int col=4;
    public static void search(char[][] arr,String word){
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                boolean a=find(arr,r,c,word);

            }
        }


    }
    public static boolean find(char[][] arr,int r,int c,String word){
        if(arr[r][c] !=word.charAt(0)){
            return false;
        }
        int len=word.length();
        for(int i=0;i<2;i++){
            int k, rd=r+x[i],cd=c+y[i];
            for(k=1;k<len;k++){
                if(rd>=4||rd<0||cd>4||cd<0){
                    break;
                }
                if(arr[rd][cd]!=word.charAt(k)){
                    break;
                }
                rd+=x[i];
                cd+=y[i];
            }
            if(k==len){
                return true;
            }


        }
        return false;

    }
}

/* Aravind's review : 1. It doesn't work when an input of 2D char array with more than 4 rows or columns is given.

                      2. You are not printing or returning the end result and when you called find() method you should check what the result is. So, 
                         I say incomplete code as still there are still some cases to be checked.
                         
                      3. Sould use relevant variable names and write comment lines.
*/
                      
                      
                      
                      
