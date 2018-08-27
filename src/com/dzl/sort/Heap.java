package com.dzl.sort;
import java.util.List;

public class Heap {
    private List<Integer> list;
    private int heapSize;

    public List getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getHeapSize() {
        return heapSize;
    }

    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    // 左节点下标
    public int left(int i) {
        //i为当前节点的坐标。
        return i * 2 + 1;
    }

    // 右节点下标
    public int right(int i) {
        return i * 2 + 2;
    }

    // 父节点下标
    public int parent(int i) {
        return (i - 1) / 2;
    }

}
