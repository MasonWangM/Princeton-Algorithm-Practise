package com.company.chapter1.quickfind;

public class Main {

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        System.out.println(quickFindUF.getIndexArray());
        for (int index : quickFindUF.getIndexArray()) {
            System.out.println(index);
        }
        quickFindUF.union(3,5);
        System.out.println(quickFindUF.isConnected(3,5));
        System.out.println(quickFindUF.isConnected(4,5));
        quickFindUF.union(3,4);
        System.out.println(quickFindUF.isConnected(4,5));

        System.out.println("===============================");
        QuickFindUFWithRoot quickFindUFWithRoot = new QuickFindUFWithRoot(10);
        quickFindUFWithRoot.union(3,5);
        System.out.println(quickFindUFWithRoot.isConnected(3,5));
        System.out.println(quickFindUFWithRoot.isConnected(4,5));
        quickFindUFWithRoot.union(3,4);
        System.out.println(quickFindUFWithRoot.isConnected(4,5));

        System.out.println("===============================");
        QuickFindUFWeighted quickFindUFWeighted = new QuickFindUFWeighted(10);
        quickFindUFWeighted.union(3,5);
        System.out.println(quickFindUFWeighted.isConnected(3,5));
        System.out.println(quickFindUFWeighted.isConnected(4,5));
        quickFindUFWeighted.union(3,4);
        System.out.println(quickFindUFWeighted.isConnected(4,5));
    }
}

