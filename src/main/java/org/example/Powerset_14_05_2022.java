package dailycodingproblems;

public class Powerset_14_05_2022 {
    public static void printset(char[] set,int size){
        long powsize=(long)Math.pow(2,size);
        int counter,j;
        for(counter=0;counter<powsize;counter++){
            for(j=0;j<size;j++){
                if((counter & (1 << j)) > 0){
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }

}
