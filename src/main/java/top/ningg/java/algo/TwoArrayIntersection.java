package top.ningg.java.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 题目：两个有序数组的交集
 *
 * 分析：
 *
 * 1. 最简单的方案：从数组 A 中(m 个元素)，取出一个元素，在 数组 B 中（n 个元素），逐个比对，存在，则作为交集，时间复杂度 O(m*n)
 * 2. 借助 Set 结构
 * 3. 使用 2 个指针
 *
 * 参考： http://blog.csdn.net/itbuluoge/article/details/20566007
 */
public class TwoArrayIntersection {

    // 使用 2 个指针：升序数组的交集
    public Set<Integer> retrieveIntersection(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        // 异常边界
        if (null == firstArray || null == secondArray || firstArray.isEmpty() || secondArray.isEmpty()) {
            return null;
        }

        // 存储结果
        Set<Integer> intersection = new HashSet<>();

        // 2 个指针
        int indexA = 0;
        int indexB = 0;

        while (indexA < firstArray.size() && indexB < secondArray.size()) {
            int valueA = firstArray.get(indexA);
            int valueB = secondArray.get(indexB);

            // 两个元素取值相等
            if (valueA == valueB) {
                intersection.add(valueA);
            } else if (valueA > valueB) {
                indexB++;
            } else {
                indexA++;
            }
        }

        return intersection;
    }

    // 借助外部存储
    public Set<Integer> retrieveIntersectionWithSet(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        if (null == firstArray || null == secondArray || firstArray.isEmpty() || secondArray.isEmpty()) {
            return null;
        }

        // 存储结果
        Set<Integer> intersection = new HashSet<>();
        // 暂存数据
        Set<Integer> temp = new HashSet<>();

        // 遍历数组
        for (Integer single : firstArray) {
            temp.add(single);
        }

        // 判断交集
        for (Integer single : secondArray) {
            if (temp.contains(single)) {
                intersection.add(single);
            }
        }

        // 返回结果
        return intersection;
    }

}
