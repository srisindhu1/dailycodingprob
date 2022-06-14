package dailycodingproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LFU_13_06_2022test {
    @Test
    public void test1(){
        int cap=3;
        LFU_13_06_2022 lfu=new LFU_13_06_2022(cap);
        LFU_13_06_2022.set(3,4);
        assertEquals(4,LFU_13_06_2022.get(3));

    }

}
