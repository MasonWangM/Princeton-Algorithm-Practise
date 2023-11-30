package com.company.chapter1.queue;

public interface Queue {
    void enqueue(String item);
    String dequeue();
    boolean isEmpty();
}
