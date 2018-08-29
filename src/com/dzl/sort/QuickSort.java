package com.dzl.sort;

/**
 * @desc
 *  快排.
 */
public class QuickSort {
    /**
     * @desc 快排。
     * 随机选择一个标志，这里选择第一个，用于记录最大值
     */
    public static void main(String[] args) {
        int[] a = {
                49,38,65,97,76,13,27,49,
                78,34,12,64,50,75,26,99,98,54,56,
                17,18,23,34,15,35,25,53,51
        };
        sort(a,0,a.length-1);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static  void  sort(int []  arrays,int left,int right){
        if(left<right){
            int middlen = quick(left,right,arrays);
            sort(arrays,left,middlen);
            sort(arrays,middlen+1,right);
        }
    }

    private static  int quick(int left ,int right,int[] arrays){
        int flag = arrays[left];
        while(left<right){
            while (left<right){
                //一直与右边比较，直到找到比标志小的就break;
                if(flag>arrays[right]){
                    int temp = arrays[right];
                    arrays[right] = flag;
                    arrays[left++] = temp;
                    break;
                }else {
                    right--;
                }
            }

            while (left<right){
                //
                if(flag<arrays[left]){
                    int temp = arrays[left];
                    arrays[left] = flag;
                    arrays[right--] = temp;
                    break;
                }else {
                    left++;
                }
            }

        }
        return left;
    }
}
