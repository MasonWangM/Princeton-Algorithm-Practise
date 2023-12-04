package com.company.chapter1.queue;

import java.util.Iterator;

public class QueueOfStringsLink implements Queue, Iterator<String> {
    private Node first;
    private Node last;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    private class Node{
        String item;
        Node next;

        public Node(String item) {
            this.item = item;
        }
    }
    @Override
    public void enqueue(String item) {
        Node oldNode = last;
        last = new Node(item);
        last.next = null;
        if (isEmpty()) first = last;
        else oldNode.next = last;
    }

    @Override
    public String dequeue() {
        if (first == null) return null;
        String firstItem = first.item;
        first = first.next;
        return firstItem;
    }

    @Override
    public boolean isEmpty() {
        return first ==null;
    }
}
