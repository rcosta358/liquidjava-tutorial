package com.tutorial.part3.exercise;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.unlock(); // should be an error
    }
}
