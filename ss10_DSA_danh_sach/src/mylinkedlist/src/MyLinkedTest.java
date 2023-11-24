package mylinkedlist.src;

import mylinkedlist.src.MyLinkedList;
public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<Integer>(0);
        myLinkedList.addFirst(1);
        myLinkedList.addLast(2);
        myLinkedList.add(2, 3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(7);
        myLinkedList.addLast(4);
        myLinkedList.printList();
        myLinkedList.remove(3);
        myLinkedList.removeByID(1);
        myLinkedList.printList();
        System.out.println("Size:  " + myLinkedList.size());
        System.out.println(myLinkedList.contains(5));
        System.out.println("element 2: " + myLinkedList.get(2));
        System.out.println("element first: " + myLinkedList.getFirst());
        System.out.println("element last: " + myLinkedList.getLast());
        System.out.println("index of element 7: " + myLinkedList.indexOf(7));
        System.out.println(myLinkedList.clone());

        myLinkedList.clear();
        System.out.println("HAS BEEN CLEARED");
        myLinkedList.printList();

    }
}
