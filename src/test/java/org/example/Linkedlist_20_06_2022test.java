package dailycodingproblems;

import org.junit.jupiter.api.Test;

public class Linkedlist_20_06_2022test {
    @Test
    public void test1() {
        Linkedlist_20_06_2022 list = new Linkedlist_20_06_2022();
        list.head = new Linkedlist_20_06_2022.Node(8);
        list.head.next = new Linkedlist_20_06_2022.Node(15);
        list.head.next.next = new Linkedlist_20_06_2022.Node(4);
        list.head.next.next.next = new Linkedlist_20_06_2022.Node(20);
        Linkedlist_20_06_2022.Node s=Linkedlist_20_06_2022.reverse(list.head);
        Linkedlist_20_06_2022.display(s);
    }
    @Test
    public void test2() {
        Linkedlist_20_06_2022 list = new Linkedlist_20_06_2022();
        list.head = new Linkedlist_20_06_2022.Node(9);
        list.head.next = new Linkedlist_20_06_2022.Node(1);
        list.head.next.next = new Linkedlist_20_06_2022.Node(4);
        list.head.next.next.next = new Linkedlist_20_06_2022.Node(6);
        Linkedlist_20_06_2022.Node s=Linkedlist_20_06_2022.reverse(list.head);
        Linkedlist_20_06_2022.display(s);
    }


}
