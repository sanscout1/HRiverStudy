package JAVA.Java_Lecture.About_Collection.ListExample.LinkedlistEx;

public class LinkedListUseNodeMain {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);

        node1.next=node2;
        Node<Integer> head = node1;

        SingleLinkedList<Integer> list3 = new SingleLinkedList<>();
        list3.addNode(1);
        list3.addNode(2);
        list3.addNode(3);
        list3.addNode(4);
        list3.addNode(5);

        list3.printAll();
    }
}
