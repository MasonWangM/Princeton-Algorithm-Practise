package com.leetcode.linkList;

public class RemoveLinkListElement {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(6);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode current = removeElements(listNode1, 6);;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    /**
     对于删除节点来说删除头节点和非头节点是不一样的
     因此两种处理方法：
     1.对于头节点作特殊处理
     2.添加一个虚拟头节点，把真实的头节点转换为虚拟节点
     **/

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
        return head;
    }

    public static ListNode removeElementsByVirtualNode(ListNode head, int val) {
        ListNode newHead = new ListNode(0, head);
        ListNode current = newHead;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }
        return newHead.next;

    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

