package com.dzl.sort;

/**
 * @desc 基数排序，
 * 对 数 的个，十 ，百。。。。。。。。。。。。。每一个位置进行排序，到最后排序后的结果都相同。
 * 采用排序桶。把余数相同的放在一个桶中。并要记录桶中数据的个数。否则不知道该哪里放了，并且还得区分是哪个桶不然不知道每个桶的个数。
 */
public class jishu {
    public static void main(String[] args) {
        int[] arrays={23,345,78,3,57,90,2324,5,76,89,80,44,37,78};
        int[] newArrays=sort(arrays);
        for(int temp:newArrays){
            System.out.println(temp);
        }

    }
    public static int[] sort(int[] arrays){
        int count = 0;//记录每轮排序后新数组的下标。
        int n = 1;//记录每轮排序的位
        int max = arrays[0];//记录数组的最大值，用于判断多少位。
        for(int i = 1;i<arrays.length;i++){
            if(arrays[i]>max){
                max = arrays[i];
            }
        }
        int[] order = new int[arrays.length];
        int[][] newArray = new int[10][arrays.length];
        while (max/n>=1){
            for (int i = 0;i<arrays.length;i++){
                 int k = (arrays[i]/n)%10;//记录每个数当前位的值
                 newArray[k][order[k]++]=arrays[i];
            }
            //装到桶之后，应该及时对原数组的值进行更换。对10个桶按顺序赋值。
            for(int i = 0;i<10;i++){
                for(int k=0;k<order[i];k++){
                    arrays[count++] = newArray[i][k];
                }
                //清空用于计算下一位。
                  order[i] = 0;
            }
            count=0;
            n = n*10;
        }
        return arrays;
    }
}
