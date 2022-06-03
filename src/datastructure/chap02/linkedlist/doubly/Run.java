package datastructure.chap02.linkedlist.doubly;

public class Run {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);

        list.remove(1);

        System.out.println(list.printList());
    }
}
