package top.ningg.java.algo;

/**
 * 题目：判断一个数字，是否存在斐波那契数列中。
 *
 * 分析：
 * 从头遍历 斐波那契数列，
 * 1. 如果出现等于设定的数字，则，存在；
 * 2. 如果出现数字大于设定的数字，则，不存在；
 */
public class FiboContainValue {

    public static void main(String[] args) {
        System.out.println(checkValueInFiboList(8));
    }

    private static boolean checkValueInFiboList(int n) {
        // 边界条件
        if (n <= 0) {
            return false;
        }

        int currIndex = 1;
        while (true) {

            if (Fibo(currIndex) == n) {
                return true;
            } else if (Fibo(currIndex) > n) {
                return false;
            }

            currIndex++;
        }
    }

    // 递归输出斐波那契数列
    private static int Fibo(int n) {
        // 边界条件
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

}
