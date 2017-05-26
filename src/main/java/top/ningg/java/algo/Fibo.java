package top.ningg.java.algo;

/**
 * 题目：输出斐波那契数列。
 *
 * 分析：2种思路
 * 1. 迭代
 * 2. 循环
 *
 * Created by guoning on 17/4/18.
 */
public class Fibo {

    public static void main(String[] args) {
        for (int index = 1; index < 40; index++) {
            System.out.println(Fibo(index) == FiboLoop(index));
        }
    }

    // 递归方式
    private static int Fibo(int n) {
        // 边界情况判断
        if (n <= 0) {
            return -1;
        }

        // 终止条件
        if (1 == n || 2 == n) {
            return 1;
        }

        // 递归
        return Fibo(n - 1) + Fibo(n - 2);
    }

    // 循环方式
    private static int FiboLoop(int n) {
        // 边界判断
        if (n <= 0) {
            return -1;
        }

        // 终止条件
        if (1 == n || 2 == n) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int c = 0;
        for (int index = 3; index <= n; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}
