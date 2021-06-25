package com.bridgelabz.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);

        //Node Linking
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        //If Nodes are linked successfully then return successful
    }
}
