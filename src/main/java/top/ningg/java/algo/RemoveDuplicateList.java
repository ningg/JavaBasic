package top.ningg.java.algo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 题目：删除链表中，重复节点
 *
 * 分析：
 * 1. 借助 Map
 * 2. 遍历一遍，如果节点存在，则，删除
 */
public class RemoveDuplicateList {

    public static void main(String[] args) {
        // 1. 构造列表
        Node node = constructNodeList(10);
        printList(node);
        // 2. 去重
        Node result = removeDupNode(node);
        // 3. 输出
        printList(result);
    }

    // 去掉重复节点
    private static Node removeDupNode(Node node) {
        // 边界判断
        if (null == node || null == node.next) {
            return node;
        }

        Node head = node;
        Node preNode = node;
        Node currNode = node;
        Set<Integer> valueSet = new HashSet<>();
        while (null != currNode) {
            if (valueSet.contains(currNode.value)) {
                // 跳过当前节点
                preNode.next = currNode.next;
                currNode = currNode.next;
            } else {
                valueSet.add(currNode.value);
                preNode = currNode;
                currNode = currNode.next;
            }
        }
        return head;
    }

    // 构造链表
    private static Node constructNodeList(int num) {
        Node node = null;
        Node currNode = null;
        Random random = new Random();
        for (int index = 0; index < num; index++) {
            int value = random.nextInt(5);
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

    private static void printList(Node head) {
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

    static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

    }
}
