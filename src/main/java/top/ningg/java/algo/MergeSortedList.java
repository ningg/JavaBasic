package top.ningg.java.algo;

import java.util.Random;

/**
 * 题目：合并 2 个有序列表.（升序）
 *
 * 分析：
 * 方案 A. 递归：只要调整指针即可，递归下去；
 * 方案 B. 循环：
 *
 * Created by guoning on 17/4/19.
 */
public class MergeSortedList {

    public static void main(String[] args) {
        // 1. 构造列表
        Node node1 = constructSortedNodeList(5);
        Node node2 = constructSortedNodeList(5);

        printList(node1);
        printList(node2);

        // 2. 排序
        // Node result = mergeSortedList(node1, node2);
        Node result = mergeSortedListWithLoop(node1, node2);
        // 3. 输出
        printList(result);
    }

    // 输出链表
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

    // 构造链表
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

    // 构造链表(升序的有序链表)
    private static Node constructSortedNodeList(int num) {
        Node node = null;
        Node currNode = null;
        Random random = new Random();
        for (int index = 0; index < num; index++) {
            int value = random.nextInt(100);
            // 构造升序链表
            if (null != currNode){
                while (value < currNode.value){
                    value = random.nextInt(100);
                }
            }
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

    // 递归：合并 2 个有序列表
    // 思路：
    // 1. 分析 2 个头指针，比较大小
    // 2. 递归处理
    private static Node mergeSortedList(Node firstHead, Node secondHead) {
        // 边界条件判断
        if (null == firstHead) {
            return secondHead;
        }
        if (null == secondHead) {
            return firstHead;
        }

        // 判断取值，并递归下去（升序）
        if (firstHead.value < secondHead.value) {
            firstHead.next = mergeSortedList(firstHead.next, secondHead);
            return firstHead;
        } else {
            secondHead.next = mergeSortedList(firstHead, secondHead.next);
            return secondHead;
        }
    }

    // 循环：合并 2 个有序列表
    private static Node mergeSortedListWithLoop(Node firstHead, Node secondHead) {
        // 边界条件判断
        if (null == firstHead) {
            return secondHead;
        }
        if (null == secondHead) {
            return firstHead;
        }

        // 1. 找出链表头部
        Node targetHead = null;
        if (firstHead.value < secondHead.value){
            targetHead = firstHead;
            firstHead = firstHead.next;
        } else {
            targetHead = secondHead;
            secondHead = secondHead.next;
        }

        // 2. 设置 3 个指针，向后遍历
        Node currNode = targetHead;
        while (firstHead != null && secondHead != null){
            if (firstHead.value < secondHead.value){
                currNode.next = firstHead;
                firstHead = firstHead.next;
            } else{
                currNode.next = secondHead;
                secondHead = secondHead.next;
            }
            // 调整指针
            currNode = currNode.next;
        }

        // 3. 链表多余节点，向后追加
        if (null != firstHead){
            currNode.next = firstHead;
        } else {
            currNode.next = secondHead;
        }

        return targetHead;
    }
}
