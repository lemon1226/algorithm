package com.lemon.algorithm.sorted;

import java.util.List;

import com.lemon.algorithm.utils.NumberUtil;
import com.lemon.algorithm.utils.PrintUtil;

/**
 * description: 希尔排序
 *
 * @author isiah
 * @date 2020-07-05 19:54:06 创建
 */
public class ShellSorted {

    public static void sorted(List<Integer> list) {
        int h = 1;
        int size = list.size();

        while (h < size / 2) {
            h = h * 2 + 1;
        }

        while (h >= 1) {
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (SortedUtil.less(list.get(j), list.get(j - h))) {
                        SortedUtil.swap(list, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h /= 2;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = NumberUtil.getRandomIntInRange(1, 100, 10);
        PrintUtil.print(list);
        sorted(list);
        PrintUtil.print(list);
    }
}
