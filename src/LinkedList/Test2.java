package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
       // System.out.println(myLinkedList.get(1));
      //  System.out.println(myLinkedList.get(5));

        myLinkedList.remove(1);
        myLinkedList.remove(0);

        System.out.println(myLinkedList);
    }
}
