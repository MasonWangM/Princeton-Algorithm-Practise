package com.leetcode.string;

public class Main {
    public static void main(String[] args) {
        Obj obj1 = new Obj("name1", 123);
        Obj obj2 = new Obj("name2", 456);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println("========================================");
        modifyField(obj1);
        System.out.println(obj1);
        replaceObj(obj2);
        System.out.println(obj2);
    }
    public static void modifyField(Obj obj){
        obj.setName("new name");
        obj.setAge(100);
    }
    public static void replaceObj(Obj obj){
        Obj obj3 = new Obj("obj3", 789);
        obj = obj3;
        obj.setName("new name");
    }
}

