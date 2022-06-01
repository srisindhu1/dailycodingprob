package dailycodingproblems;
import java.util.*;
//Implement a queue using two stacks. Recall that a queue is a FIFO (first-in, first-out) data structure with the following methods: enqueue,
// which inserts an element into the queue, and dequeue, which removes it.
public class Queueusingstacks_31_05_2022 {
    public Stack<Integer> first;
    public Stack<Integer> second;
    public Queueusingstacks_31_05_2022(){
        first=new Stack<>();
        second=new Stack<>();

    }
    void enqueue(int value){
        first.push(value);

    }
    Integer dequeue(){
        if(second.isEmpty()){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }if(second.isEmpty()){
            return null;
        }
        return second.pop();
    }

}
