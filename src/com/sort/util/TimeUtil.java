package com.sort.util;

public class TimeUtil {
    public static void measureTime(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        System.out.println("Runnable class: " + runnable.getClass().getName());
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("执行时间: " + duration + "毫秒");
    }
}