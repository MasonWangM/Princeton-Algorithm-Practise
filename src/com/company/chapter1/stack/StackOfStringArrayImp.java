package com.company.chapter1.stack;

public class StackOfStringArrayImp implements StackOfString {
    private String[] stackArray;
    private int count = 0;

    public StackOfStringArrayImp(int capacity) {
        this.stackArray = new String[capacity];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void push(String item) {
        stackArray[count] = item;
        count++;
    }

    @Override
    public String pop() {
        if (count != 0){
            int index = count;
            stackArray[count] = null;
            count--;
            return stackArray[index];
        }else return null;
    }

    @Override
    public int size() {
        return count;
    }

}
