package dailycodingproblems;
import java.util.*;
//Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:
//
//set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, 
// then it should also remove the least frequently used item. If there is a tie, then the least recently used key should be removed.
//get(key): gets the value at key. If no such key exists, return null.
//0 <= capacity <= 104
//0 <= key <= 105
//0 <= value <= 109
//At most 2 * 105 calls will be made to get and set
public class LFU_13_06_2022 {
    static HashMap<Integer, Integer> vals;//cache K and V
    static HashMap<Integer, Integer> counts;//K and counters
    static HashMap<Integer, LinkedHashSet<Integer>> lists;//counters and item list with that frequency
    static int cap;//capacity
    static int min = -1;
    public LFU_13_06_2022(int capacity){
        cap = capacity;
        vals = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
        lists.put(1, new LinkedHashSet<>());
    }
    public static int get(int key){
        if (!vals.containsKey(key)){
            return -1;
        }
        int count = counts.get(key);
        counts.put(key, count + 1);
        lists.get(count).remove(key);
        if (count == min && lists.get(count).size() == 0){
            min++;
        }
        if (!lists.containsKey(count + 1)){
            lists.put(count + 1, new LinkedHashSet<>());
        }
        lists.get(count + 1).add(key);
        return vals.get(key);
    }
    public static void set(int key,int value){
        if(cap<=0){
            return;
        }
        if(vals.containsKey(key)){
            vals.put(key,value);
            get(key);
            return;
        }
        if(vals.size()>=cap){
            int evit=lists.get(min).iterator().next();
            lists.get(min).remove(evit);
            vals.remove(evit);
            counts.remove(evit);
        }
        vals.put(key,value);
        counts.put(key,1);
        min=1;
        lists.get(1).add(key);

    }



}
