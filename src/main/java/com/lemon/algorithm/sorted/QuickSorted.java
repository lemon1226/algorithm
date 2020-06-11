package com.lemon.algorithm.sorted;

import java.util.List;

import com.lemon.algorithm.utils.NumberUtil;
import com.lemon.algorithm.utils.PrintUtil;

/**
 * description: 快速排序
 *
 * @author isiah
 * @date 2020-06-10 23:42:06 创建
 */
public class QuickSorted {

    public static void sorted(List<Integer> list, int begin, int end) {
        if(begin >= end) return;
        int index = partition(list, begin, end);
        sorted(list, begin, index-1);
        sorted(list, index+1, end);
    }

    public static int partition(List<Integer> list, int begin, int end) {
        int i = begin;
        int j = end + 1;
        Integer value = list.get(begin);

        while(true) {
            while(SortedUtil.less(list.get(++i), value)) {
                if(i == end) break;
            }
            while(SortedUtil.less(value, list.get(--j))) {
                if(j == begin) break;
            }
            if(i >= j) break;
            SortedUtil.swap(list, i, j);
        }
        SortedUtil.swap(list, begin, j);
        return j;
    }

    public static void main(String[] args) {
        List<Integer> list = NumberUtil.getRandomIntInRange(1, 100, 10);
        PrintUtil.print(list);
        sorted(list, 0, list.size() - 1);
        PrintUtil.print(list);
    }
}
