package top.ningg.java.algo;

import java.util.Random;

/**
 * 题目：链表反转
 *
 * 分析：
 * 1. 遍历一遍，调整指针
 */
public class ReverseList {

    public static void main(String[] args) {
        // 1. 构造列表
        Node node = constructNodeList(10);
        printList(node);
        // 2. 排序
        Node result = reverseList(node);
        // 3. 输出
        printList(result);
    }

    public static void printList(Node head) {
        // 边界判断
        if (null == head) {
            return;
        }
        // 输出
        System.out.println();
        for (Node currNode = head; currNode != null; currNode = currNode.next) {
            System.out.print(String.format("%d-", currNode.value));
        }
    }

    // 反转链表
    private static Node reverseList(Node head) {
        // 边界判断
        if (null == head || null == head.next) {
            return head;
        }

        Node pre = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    private static Node constructNodeList(int num) {
        Node node = null;
        Node currNode = null;
        Random random = new Random();
        for (int index = 0; index < num; index++) {
            int value = random.nextInt(100);
            Node newNode = new Node(value);
            if (node == null) {
                node = newNode;
                currNode = node;
            } else {
                currNode.next = newNode;
                currNode = currNode.next;
            }
        }
        return node;
    }

    static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
