package b2512.wuzhangjie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //插入排序
        int[] arr = new int[]{6,1,2,5,6,3,4,2,3};
        for (int i=1;i<arr.length;i++){
            for (int j=i-1;j>=0;j--){
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
