package com.company.chapter1.queue;



import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queue queue = new QueueOfStringsLink();
        List<String> operations = List.of("a", "b", "-", "c", "d", "-", "e", "f");
        operations.forEach(operation -> operateQueue(operation, queue));
    }

    private static void operateQueue(String item, Queue queue){
        if (item.equals("-")){
            queue.dequeue();
        }else queue.enqueue(item);
    }

}
