package com.company;

/**
 * Created by haidangdam on 9/1/16.
 */
public class test {
    public static void main (String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.addToFront("1a");
        System.out.println(list.getTail().getData());
        list.addToBack("3a");
        System.out.println(list.get(1));
        list.addAtIndex(1, "2a");
        list.addToBack("4a");
        list.addToFront("0a"); // 0a 1a 2a 3a 4a

        LinkedListNode<String>  test= list.getHead();
        while (test != null) {
            System.out.println(test.getData());
            test = test.getNext();
        }
        LinkedListNode<String> test1 = list.getTail();
        System.out.println(test1.getData());

        // toArray có vấn đề
    }
}
