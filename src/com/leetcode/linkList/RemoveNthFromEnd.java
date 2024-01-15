package com.leetcode.linkList;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;


        ListNode current = removeNthFromEndByTwoCycle(listNode1,2);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
    public static ListNode removeNthFromEndByTwoCycle(ListNode head, int n) {
        ListNode newHead = new ListNode(-1, head);
        int size = 0;
        ListNode current = newHead;
        while (current != null && current.next != null){
            size++;
            current = current.next;
        }
        if (size <= 1) return null;
        int target = size - n;
        int start = 0;
        ListNode point = newHead;
        while (start < target){
            start++;
            point = point.next;
        }
        point.next = point.next.next;
        return newHead.next;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(-1, head);
        int start = 0;
        ListNode fast = newHead;
        ListNode slow = newHead;

        while (fast != null){
            fast = fast.next;
            start++;
            if (start > n + 1){
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return newHead.next;
    }
}
