package dailycodingproblems;
//mplement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
//
//Do this faster than the naive method of repeated multiplication.
//
//For example, pow(2, 10) should return 1024.
public class Powerproblem_08_06_2022 {
    public static long power(int a,int b){
        if(b==0){

            return 1;
        }
        long mul= power(a,b/2);
        if(b%2==0){
            return mul * mul;
        }
        else{
            return a*mul*mul;
        }
    }
}
