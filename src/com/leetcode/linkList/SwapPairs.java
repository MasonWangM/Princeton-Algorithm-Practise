package com.leetcode.linkList;

public class SwapPairs {
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

        ListNode current = swapPairsByRecursion(listNode1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        swapPairs(new ListNode(1));
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(-1, head);
        ListNode point = newHead;

        while (point.next != null && point.next.next != null) {
            ListNode first = point.next;
            ListNode second = first.next;
            ListNode nextGroup = second.next;

            point.next = second;
            second.next = first;
            first.next = nextGroup;

            point = first;
        }
        return newHead.next;
    }

    public static ListNode swapPairsByRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode newNode = swapPairsByRecursion(next.next);
        next.next = head;
        head.next = newNode;
        return next;
    }


}
