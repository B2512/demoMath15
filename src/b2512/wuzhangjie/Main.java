package b2512.wuzhangjie;

import java.util.Arrays;

public class Main {
    public void str(int[] arr){
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

    public void strs(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = new int[]{6,1,2,5,3};
        //插入排序
        Main main = new Main();
        main.str(arr);

        main.strs(arr);
    }
}
