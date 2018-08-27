package com.dzl.sort;

/**
 * 归并排序。
 * 先递归划分到只剩一个元素再合并。
 */
public class MergeSort {
    //
    public static int[] sort(int[] arrays,int low,int heigh){
        int mid = (low+heigh)/2;
       if (low<heigh){
          sort(arrays,low,mid);
          sort(arrays,mid+1,heigh);
          merge(arrays,low,heigh,mid);
       }
       return arrays;
    }
    private static  void merge(int[] a,int low,int heigh,int mid){
      int tempLow = low;
      int tempHeigh = mid+1;
      int[] tempArray = new int[heigh-low+1];
      int count = 0;
      while (tempHeigh<=heigh&&tempLow<=mid){
         if(a[tempLow]<a[tempHeigh]){
             tempArray[count++] = a[tempLow++];
         }else {
             tempArray[count++] = a[tempHeigh++];
         }
      }
      while (tempHeigh<=heigh){
          tempArray[count++] = a[tempHeigh++];
      }
      while (tempLow<=mid){
          tempArray[count++] = a[tempLow++];
      }

      for(int i =0;i<tempArray.length;i++){
          a[low+i] = tempArray[i];
      }
    }

    public static void main(String[] args) {
        int[] a = {
                49,38,65,97,76,13,27,49,
                78,34,12,64,50,75,26,99,98,54,56,
                17,18,23,34,15,35,25,53,51
        };
        int[] as =sort(a,0,a.length-1);
        for (int i : as){
            System.out.println(i+" ");
        }
    }
}
