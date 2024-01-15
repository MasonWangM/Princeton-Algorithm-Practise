package com.leetcode.linkList;

public class IntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);

        if (sizeA > sizeB){
            int count = sizeA - sizeB;
            headA = moveHead(headA, count);
        }else {
            int count = sizeB - sizeA;
            headB = moveHead(headB, count);
        }

        ListNode currentA = headA;
        ListNode currentB = headB;
        ListNode targetNode = null;
        while (currentA != null && currentB != null){
            if (currentA == currentB){
                targetNode = currentA;
                return targetNode;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return targetNode;
    }

    private static ListNode moveHead(ListNode headA, int count) {
        int start = 0;
        ListNode current = headA;
        while (start < count){
           current = current.next;
           start++;
        }
        return current;
    }

    private static int getSize(ListNode head){
        int size = 0;
        ListNode current = head;
        while (current != null){
            current = current.next;
            size++;
        }
        return size;
    }
}
