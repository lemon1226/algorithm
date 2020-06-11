package com.lemon.algorithm.utils;

import java.util.List;

public class PrintUtil {

    public static void print(List<? extends Comparable> list) {
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
    }
}
