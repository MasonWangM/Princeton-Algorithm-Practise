package com.company.chapter1;


/**
 如果每次大树附在小树上，那么就会导致树的深度越来越长
 因此在root回溯时会导致速度变慢
 在这里引入一个新的数组记录树的size，是的每次小树附大树上
 **/
public class QuickFindUFWeighted {
    private int[] indexArray;
    private int[] treeSize;

    public QuickFindUFWeighted(int length) {
        int[] ints = new int[length];
        int[] treeSize = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = i;
            treeSize[i] = 1;
        }
        this.indexArray = ints;
        this.treeSize =treeSize;
    }

    public int[] getIndexArray() {
        return indexArray;
    }


    private int root(int i){
        while (i != indexArray[i]) i = indexArray[i];
        return i;
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot == qRoot) return;
        if (treeSize[pRoot] > treeSize[qRoot]){
            indexArray[qRoot] = pRoot;
            treeSize[pRoot] = treeSize[pRoot] + treeSize[qRoot];
        }else {
            indexArray[pRoot] = qRoot;
            treeSize[qRoot] = treeSize[qRoot] + treeSize[pRoot];
        }
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }
}
