package com.leetcode.linkList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;


        ListNode current = reverseListByRecursion(listNode1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }


    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode current = head;
        ListNode next;
        while (current!= null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static ListNode reverseListByRecursion(ListNode head) {
       return reverseNode(null, head);
    }

    private static ListNode reverseNode(ListNode pre, ListNode next) {
        if (next == null) return pre;
        ListNode temp = next.next;
        next.next = pre;
        return reverseNode(next, temp);
    }
}
