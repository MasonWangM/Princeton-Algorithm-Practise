package com.company.chapter1.quickfind;

public class QuickFindUFWithRoot {
    private int[] indexArray;

    public QuickFindUFWithRoot(int length) {
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = i;
        }
        this.indexArray = ints;
    }

    public int[] getIndexArray() {
        return indexArray;
    }

    /**
     求根结点，如果当前节点的索引和数值不相同，那么说明不是根结点
     那么就求取当前节点的值，这个值是上一个节点，
     之后验证上一个节点是否为根节点，最终直到找到根结点
     **/
    private int root(int i){
        while (i != indexArray[i]) i = indexArray[i];
        return i;
    }

    public void union(int p, int q){
        int pRoot = root(p);
        int qRoot = root(q);
        indexArray[pRoot] = qRoot;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }
}
