package com.bridgelabz.linkedlist;

public class LinkedList {
    public static void main(String[] args) {

        LinkedListOperations operations = new LinkedListOperations();
        INode head;

        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        head = operations.addNode(firstNode);
        operations.displayNode(head);
        head = operations.addNode(secondNode);
        operations.displayNode(head);
        head = operations.addNode(thirdNode);
        operations.displayNode(head);
    }
}
