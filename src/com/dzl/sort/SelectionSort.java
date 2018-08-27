package com.dzl.sort;

/**
 * @desc 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {
                49,38,65,97,76,13,27,49,
                78,34,12,64,50,75,26,99,98,54,56,
                17,18,23,34,15,35,25,53,51
        };
        sort(a);
        for (int i : a){
            System.out.println(i+" ");
        }
    }
    public  static void sort(int[] arrays){
        for(int i = 0;i<arrays.length;i++){
            int min = arrays[i];
            int minIndex = i;
            for(int j = i+1;j<arrays.length;j++){
                if(arrays[j]<min){
                    min = arrays[j];
                    minIndex = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[minIndex];
            arrays[minIndex] = temp;
        }

    }
}
