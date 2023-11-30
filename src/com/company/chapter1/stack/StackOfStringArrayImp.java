package com.company.chapter1.stack;

public class StackOfStringArrayImp implements StackOfString {
    private String[] stackArray;
    private int count = 0;

    public StackOfStringArrayImp() {
        this.stackArray = new String[5];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void push(String item) {
        if (stackArray.length == count) {
            resize(2 * stackArray.length);
        }
        stackArray[count] = item;
        count++;
    }

    @Override
    public String pop() {
        count--;
        if (count != 0) {
            if (stackArray.length >5 && count == stackArray.length / 4)
                resize(stackArray.length / 2);
            String lastItem = stackArray[count];
            stackArray[count] = null;
            return lastItem;
        } else return null;
    }

    @Override
    public int size() {
        return count;
    }

    private void resize(int capacity) {
        String[] newArray = new String[capacity];
        for (int i = 0; i < stackArray.length; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }

}
