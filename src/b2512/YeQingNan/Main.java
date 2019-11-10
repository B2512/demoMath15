package b2512.YeQingNan;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numberArray = new int[5000];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (1 + Math.random() * 4999);
        }
        /*for (int i = numberArray.length; i>0; i--){
            numberArray[numberArray.length - i] = i;
        }*/
        /*for (int i = 0;i<numberArray.length;i++){
            numberArray[i] = i;
        }*/
        System.out.println("冒泡排序");
        long startTime = System.currentTimeMillis(); // 获取开始时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序开始执行时间：" + startTime);
        // 冒泡排序
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray.length - 1 - i; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
        long endTime = System.currentTimeMillis(); // 获取结束时间
        System.out.println("程序结束执行时间：" + endTime);
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序总运行时间： " + (endTime - startTime) + "ms");

        System.out.println();

        System.out.println("插入排序");
        long startTime1 = System.currentTimeMillis(); // 获取开始时间
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序开始执行时间：" + startTime1);
        // 插入排序
        for (int i = 1; i < numberArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numberArray[j] < numberArray[j - 1]) {
                    int temp = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberArray));
        long endTime1 = System.currentTimeMillis(); // 获取结束时间
        System.out.println("程序结束执行时间：" + endTime1);
        System.out.println(df1.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序总运行时间： " + (endTime1 - startTime1) + "ms");

        System.out.println();

        System.out.println("选择排序");
        long startTime2 = System.currentTimeMillis(); // 获取开始时间
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df2.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序开始执行时间：" + startTime2);
        // 选择排序
        for (int i = 0; i < numberArray.length; i++) {
            int minIndex = i;
            for (int j = i; j < numberArray.length; j++) {
                if (numberArray[j] < numberArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numberArray[i];
            numberArray[i] = numberArray[minIndex];
            numberArray[minIndex] = temp;
        }
        System.out.println(Arrays.toString(numberArray));
        long endTime2 = System.currentTimeMillis(); // 获取结束时间
        System.out.println("程序结束执行时间：" + endTime2);
        System.out.println(df2.format(new Date()));// new Date()为获取当前系统时间
        System.out.println("程序总运行时间： " + (endTime2 - startTime2) + "ms");
    }
}
