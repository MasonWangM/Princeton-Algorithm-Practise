package com.company.chapter1.stack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StackOfString stackOfString = new StackOfStringLinkedImp();
        List<String> operationList = List.of("A", "B", "-","KK", "C", "g", "vv", "-", "mm");
        System.out.println(stackOfString.size());
        System.out.println(stackOfString.isEmpty());

        operationList.forEach(item -> operateStack(item, stackOfString));

        System.out.println(stackOfString.size());
        System.out.println(stackOfString.isEmpty());

    }
    private static void operateStack(String item, StackOfString stackOfString){
        if (item.equals("-")){
            stackOfString.pop();
        }else stackOfString.push(item);
    }
}
