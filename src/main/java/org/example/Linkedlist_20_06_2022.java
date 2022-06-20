package dailycodingproblems;
//given the head of a linkedlist reverse it.
public class Linkedlist_20_06_2022 {
    public static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    static Node reverse(Node node){
        Node previous=null;//3 pointers intialised for reversing the list
        Node current=node;
        Node next=null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        node=previous;
        return node;
    }
    public static void display(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }
    public static void main(String[] args)
    {
        Linkedlist_20_06_2022 list = new Linkedlist_20_06_2022();
        list.head = new Node(5);
        list.head.next = new Node(1);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(2);


        head = list.reverse(head);
        list.display(head);
    }
}
