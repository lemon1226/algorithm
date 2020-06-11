package com.lemon.algorithm.sorted;

import java.util.List;

/**
 * description: 公共类
 *
 * @author isiah
 * @date 2020-06-10 23:43:06 创建
 */
public class SortedUtil {

    public static boolean less(Integer num1, Integer num2) {
        return num1.compareTo(num2) < 0;
    }

    public static void swap(List<Integer> list, int index1, int index2) {
        Integer temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
