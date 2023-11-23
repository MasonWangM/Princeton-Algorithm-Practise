package com.company.chapter1.quickfind;

public class QuickFindUF {
    private int[] indexArray;

    public QuickFindUF(int length) {
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = i;
        }
        this.indexArray = ints;
    }

    public int[] getIndexArray() {
        return indexArray;
    }

    public void union(int p, int q){
        int pid = indexArray[p];
        int qid = indexArray[q];
        for (int i = 0; i < indexArray.length; i++) {
            if ((indexArray[i] == qid)) {
                indexArray[i] = pid;
            }
        }
    }

    public boolean isConnected(int p, int q){
        return indexArray[p] == indexArray[q];
    }
}
