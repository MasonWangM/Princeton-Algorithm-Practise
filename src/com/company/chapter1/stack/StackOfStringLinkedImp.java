package com.company.chapter1.stack;

public class StackOfStringLinkedImp implements StackOfString{
    private Node firstNode;
    private int count;
    private class Node{
        private String item;
        private Node next;
    }
    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void push(String item) {
        Node node = new Node();
        node.item = item;
        Node oldNode = firstNode;
        firstNode = node;
        firstNode.next = oldNode;
        count++;
    }

    @Override
    public String pop() {
        String item = firstNode.item;
        firstNode = firstNode.next;
        count--;
        return item;
    }

    @Override
    public int size() {
        return count;
    }
}
