package dailycodingproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bishopattack_14_06_2022test {
    @Test
    public void test2(){
        int m=10;
        int[][] bishop={{ 1, 1 }, { 1, 5 }, { 3, 3 }, { 5, 1 }, { 5, 5 }};
        assertEquals(6,Bishopattack_14_06_2022.findattack(m,bishop));
    }

}
