package b2512.huangsai;
//插入排序效率最高 选择  冒泡
public class Main {
    public static void main(String[] args) {
        //冒泡排序
        /*int[] num1 = new int[]{3,1,2,4,6,5};
        for (int i=0;i<num1.length;i++){
            for (int j=0;j<num1.length-1;j++){
                if (num1[i] <num1[j]){
                    int c = num1[i];
                    num1[i] = num1[j];
                    num1[j] = c;
                }
            }
        }
        System.out.print("冒泡排序:");
        for (int i:num1){
            System.out.print(i+"\t");
        }*/
        System.out.println();
        //插入排序
        /*int[] number = new int[]{3,1,4,2,6,5,20,10};
        int a;
        for (int i=1;i<number.length;i++){
            for (int j=i-1;j>=0;j--){
                if (number[i] < number[j]){
                    a = number[i];
                    number[i] = number[j];
                    number[j] = a;
                    i--;
                }
            }
        }
        System.out.print("插入排序:");
        for (int i:number) {
            System.out.print(i+"\t");
        }*/
        System.out.println();
        //选择排序
//        int[] num = new int[]{3,2,4,1,6,5};
//        for (int i=0;i<num.length;i++){
//            int min = i;  //获取i的值 0
//            for (int j=i+1;j<num.length;j++){
//                if (num[j] < num[min]){         //1<0
//                    min = j;  //获取最小值 1
//                }
//            }
//            if (min!=i) {
//                int b = num[i]; //0
//                num[i] = num[min];    // 0=1
//                num[min] = b; //a=1
//            }
//        }
//        System.out.print("选择排序:");
//        for (int i:num){
//            System.out.print(i+"\t");
//        }
    }
}
