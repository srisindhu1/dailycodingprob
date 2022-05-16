package dailycodingproblems;
//You have an N by N board. Write a function that, given N, returns the number of
// possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e.
// no two queens share the same row, column, or diagonal.
public class Possiblearrangements_15_05_2022 {
    private static int count;
    public static void nsolution(int noofqueen){
        boolean[][] board=new boolean[noofqueen][noofqueen];
        solvenqueen(board,0,noofqueen);
        System.out.println(count);

    }
    private static void solvenqueen(boolean[][] board,int column,int numberofqueen){
        if(column>=numberofqueen){
            count++;
        }
        for(int row=0;row<numberofqueen;row++){
            if(isvalid(board,row,column)){
                board[row][column]=true;
                solvenqueen(board,column+1,numberofqueen);
                board[row][column]=false;
            }


        }


    }
    private static boolean isvalid(boolean[][] board,int row,int col){
        int i,j;
        for(int c=0;c<col;c++){
            if(board[row][c]){
                return false;
            }

        }
        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        for(i=row,j=col;i<board.length && j>=0;i++,j--){
            if(board[i][j]){
                return false;
            }
        }
        return true;

    }


}
