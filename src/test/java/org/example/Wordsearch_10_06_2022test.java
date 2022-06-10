package dailycodingproblems;

import org.junit.Test;

public class Wordsearch_10_06_2022test {
    @Test
    public  void test1(){
        char[][] arr={{'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}} ;
        String word="FOAM";
        Wordsearch_10_06_2022.search(arr,word);
    }

}
