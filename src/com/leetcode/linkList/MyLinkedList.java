package com.leetcode.linkList;


class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(0);
    }

    int size;

    ListNode head;


    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }


    public int get(int index) {
        if (index< 0|| index >=size) return -1;
        return getNode(index).val;
    }


    public void addAtHead(int val) {
        addAtIndex(0, val);
    }


    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0){
            ListNode node = getNode(0);
            ListNode newNode = new ListNode(val);
            head.next = newNode;
            newNode.next = node;
            size++;
            return;
        }

        if (index > size || index < 0) return;

        ListNode preNode = getNode(index - 1);
        ListNode secondNode = getNode(index);
        ListNode newNode = new ListNode(val);
        preNode.next = newNode;
        newNode.next = secondNode;
        size++;
    }


    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;
        size--;

        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode node = getNode(index - 1);
        ListNode deletedNode = getNode(index);
        node.next = deletedNode.next;

    }
    private ListNode getNode(int index){
        int count = 0;
        ListNode currentNode = this.head;
        while (count <= index){
            count++;
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val=val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */