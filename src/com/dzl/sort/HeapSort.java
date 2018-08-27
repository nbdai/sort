package com.dzl.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DZL
 * @DESC 最大根堆排序。原理：完全二叉树。
 */
public class HeapSort {
    public  static void main(String[] args){
       Heap heap = new Heap();
       List<Integer> list = new ArrayList<>();
       list.add(2);
       list.add(9);
       list.add(3);
       list.add(6);
       list.add(1);
       list.add(4);
       list.add(8);
       list.add(7);
       heap.setList(list);
       heap.setHeapSize(list.size());
      List list1 =  getList(heap);
      for(int i = 0; i<list1.size();i++){
          System.out.println(list1.get(i));
      }
    }
    //保持堆性质。
    private static void  MaxHeapIfy(int i,Heap heap){
        //得到左右孩子的下标
        int left = heap.left(i);
        int right = heap.right(i);
        int max = i;
        if(left<heap.getHeapSize()&&(Integer)heap.getList().get(left)>(Integer) heap.getList().get(i)){
            max = left;
        }
        if(right<heap.getHeapSize()&&(Integer)heap.getList().get(right)>(Integer)heap.getList().get(max)){
            max = right;
        }
        if(max!=i){
            Integer temp =(Integer) heap.getList().get(i);
            heap.getList().set(i,heap.getList().get(max));
            heap.getList().set(max,temp);
        }else
            return;
        //递归改变交换后的子树。
        MaxHeapIfy(max,heap);
    }
    public static Heap buildMaxHeap(Heap heap){
        //构建最大堆
        //从最后一个叶子节点的父亲节点开始即可 ，叶子节点不需要MaxHeapIfy操作.
        //只是将最大的放在首节点位置，左右子树并没排序。
        //       9
        //    7      8
        //  6   1   4  3
        // 2
        for (int i = (heap.getHeapSize()-1)/2;i>=0;i--){
            //这一步保持了 左边 和  右边的有序性。
            MaxHeapIfy(i,heap);
        }
        return heap;
    }
    //堆排序
    public static List<Integer> getList(Heap heap){
        buildMaxHeap(heap);
        int length = heap.getList().size();
        int heapSize = heap.getHeapSize();
        for(int i = length-1;i>=0;i--){
            int temp = (Integer) heap.getList().get(0);
            heap.getList().set(0,heap.getList().get(i));
            heap.getList().set(i,temp);
            heap.setHeapSize(--heapSize);
            MaxHeapIfy(0,heap);
        }
        return heap.getList();
    }

}
