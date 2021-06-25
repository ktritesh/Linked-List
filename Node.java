package com.bridgelabz.linkedlist;

public class Node<K> {
    K key;
    Node next;

    public Node() {
    }

    public Node(K key, Node next) {
        this.key = key;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
