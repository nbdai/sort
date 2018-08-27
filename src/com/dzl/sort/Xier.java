package com.dzl.sort;

public class Xier {
    /**
     * @desc 希尔排序。
     *
     */


      public static void sort(int[] array){
          if (array==null)
              return;
          int d = array.length/2;
        //分成d组,对每一组进行插入排序，
          while (d>0){
              for(int i = 0;i<d;i++){
                  for(int j =i;j<array.length;j=j+d){
                      //假设前j-d个数都是排好序的.
                      for(int k=i;k<=j-d;k=k+d){
                          if(array[j]<array[k]){
                              int temp = array[j];
                              for(int m=j-d;m>=k;m=m-d){
                                  array[m+d] = array[m];
                              }
                              array[k] = temp;
                              break;
                          }
                      }
                  }
              }
              d = d/2;
          }
      }

    public static void main(String[] args) {
        int a[]={49,38,65,97,76,13,27,49,
                78,34,12,64,50,75,26,99,98,54,56,
                17,18,23,34,15,35,25,53,51};
        sort(a);
        for(int i:a){
            System.out.println(i+" ");
        }
    }
}
