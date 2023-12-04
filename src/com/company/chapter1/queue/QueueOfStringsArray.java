package com.company.chapter1.queue;

public class QueueOfStringsArray implements Queue {
    private String[] array = new String[10];
    private int start = 0;
    private int tail = -1;
    private int count = 0;

    @Override
    public void enqueue(String item) {
        tail++;
        count++;
        array[tail] = item;
    }

    @Override
    public String dequeue() {
        String item = array[start];
        start++;
        count--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
