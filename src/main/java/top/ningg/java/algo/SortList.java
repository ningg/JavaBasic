package top.ningg.java.algo;

import java.util.Random;

/**
 * 题目：单链表，排序
 *
 * 分析：
 * 1. 方案A：选择排序，时间复杂度 O(n^2)
 * 2. 方案B：归并排序，时间复杂度 O(nlg(n))
 *
 * 更多细节，参考：http://blog.csdn.net/kerryfish/article/details/24043099
 *
 * Created by guoning on 17/4/18.
 */
public class SortList {

    public static void main(String[] args) {
        // 1. 构造列表
        Node node = constructNodeList(4);
        // 2. 排序
        Node result = sortList(node);
        // 3. 输出
        for (Node currNode = result; currNode != null; currNode = currNode.next) {
            System.out.println(currNode.value);
        }
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

    // 归并排序
    // 1. 中间节点：找到中间节点，将链表拆为 2 部分
    // 2. 递归：对 2 部分分别进行排序
    // 3. 合并：合并 2 部分有序链表
    private static Node sortList(Node head) {
        // 边界判断
        if (null == head || null == head.next) {
            return head;
        }

        // 1. 中间节点
        Node mid = getMiddleNode(head);

        // 破坏链表结构
        Node second = null;
        if (mid == null) {
            second = null;
        } else {
            second = mid.next;
            mid.next = null;
        }

        // 2. 递归：分别对 2 个链表排序
        Node firstHead = sortList(head);
        Node secondHead = sortList(second);

        // 3. 合并：2 个有序列表，合并
        return mergeSortedList(firstHead, secondHead);
    }

    // 获取中间节点
    private static Node getMiddleNode(Node head) {
        // 边界判断
        if (null == head || null == head.next) {
            return head;
        }
        // 2 只有 2 个节点
        if (head.next.next == null){
            return head;
        }
        // 2 个指针：一个每次 2 步，一个每次 1 步
        Node first = head;
        Node second = head;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }

    // 合并 2 个有序列表
    private static Node mergeSortedList(Node firstHead, Node secondHead) {
        // 边界条件
        if (null == firstHead) {
            return secondHead;
        }
        if (null == secondHead) {
            return firstHead;
        }

        // 2 个指针：遍历 2 个链表，调整链表指向关系
        if (firstHead.value < secondHead.value) {
            firstHead.next = mergeSortedList(firstHead.next, secondHead);
            return firstHead;
        } else {
            secondHead.next = mergeSortedList(firstHead, secondHead.next);
            return secondHead;
        }
    }
}
