package com.dzl.sort;

/**
 * 冒泡排序
 */
public class maopao {
    public static void main(String[] args) {
        int a[]={49,38,65,97,76,13,27,49,
                78,34,12,64,50,75,26,99,98,54,56,
                17,18,23,34,15,35,25,53,51};
        sort(a);
        for(int i:a){
            System.out.println(i+" ");
        }
    }
    public static  void sort(int[] arrays){
        for(int i = 0 ;i<arrays.length-1;i++){
            for(int j = 0 ;j<arrays.length-i-1;j++){
               if(arrays[j]>arrays[j+1]){
                   int temp = arrays[j];
                   arrays[j] = arrays[j+1];
                   arrays[j+1] = temp;
               }
            }
        }
    }
}
