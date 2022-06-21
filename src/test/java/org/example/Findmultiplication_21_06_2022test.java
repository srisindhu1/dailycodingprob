package dailycodingproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Findmultiplication_21_06_2022test {
    @Test
    public void test1(){
        int x=4;
        int n=5;
        int a=Findmultiplication_21_06_2022.integer(x,n);
        assertEquals(0,a);
    }
    @Test
    public void test2(){
        int x=4;
        int n=-3;
        int a=Findmultiplication_21_06_2022.integer(x,n);
        assertEquals(0,a);
    }

}
