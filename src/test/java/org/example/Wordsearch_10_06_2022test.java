package dailycodingproblems;

import org.junit.jupiter.api.Test;

public class Wordsearch_10_06_2022test {
    @Test
    public  void test1(){
        char[][] arr={{'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}} ;
        int val= arr.length;
        String word="MASS";
        boolean a=Wordsearch_10_06_2022.checkMatch(arr,word,val,val);
        System.out.println(a);
    }
    @Test
    public  void test2(){
        char[][] arr={{'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}} ;
        int val=arr.length;
        String word="NOSS";
        boolean a=Wordsearch_10_06_2022.checkMatch(arr,word,val,val);
        System.out.println(a);
    }


}
