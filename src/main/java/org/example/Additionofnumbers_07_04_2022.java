package dailycodingproblems;
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

import java.util.HashMap;

//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
public class Additionofnumbers_07_04_2022 {
    public static boolean checksum(int[] arr, int sum){
        if(arr==null || arr.length==0){
            return false;

        }
        HashMap<Integer,Integer> list= new HashMap<>();
        for(int i :arr){
            if(!list.containsKey(i))
            {
                list.put(i,0);
            }
            list.put(i,list.get(i)+1);
        }
        for(int i:arr){
            int n=sum-i;
            if(n==i){
                return list.get(i) > 1;
            }
            else{
                return list.containsKey(n);
            }
        }

        return false;

    }


}
//End of code
