package dailycodingproblems;

public class Wordsearch_10_06_2022 {
    static int[] x={1,0};
    static int[] y={0,1};
    public static void search(char[][] arr,String word){
        for(int r=0;r<4;r++){
            for(int c=0;c<4;c++){
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
