package dailycodingproblems;
import org.junit.*;


public class Additionofnumbers_07_04_2022test {
    @Test
    public  void test1() {
        int[] arr = {10, 15, 3, 7};
        Assert.assertTrue(Additionofnumbers_07_04_2022.checksum(arr, 17));



    }
    @Test
    public void test2(){
        int[] arr={};
        Assert.assertTrue(Additionofnumbers_07_04_2022.checksum(arr, 9));


    }
}
