package com.example.thread.interruption.demo;

/**
 *
 * @Description: 验证interrupt()不会中断线程
 */
public class InterruptTest {
    public static void main(String[] args) {
        // 线程是否被中断
        System.out.println("1: " + Thread.interrupted());
        // 设置线程中断
        Thread.currentThread().interrupt();
        // 线程是否被中断
        System.out.println("2: " + Thread.interrupted());
        // 线程是否被中断
        System.out.println("3: " + Thread.interrupted());
    }
}
