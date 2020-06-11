package com.lemon.algorithm.utils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberUtil {

    private static Random random = new Random();

    public static List<Integer> getRandomIntInRange(int min, int max, int num) {
        return random.ints(min, (max + 1)).limit(num).boxed().collect(Collectors.toList());
    }
}
