package b2512.huangsai;

public class Sort {

    public void bubbling(int number[]){ //冒泡排序
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number.length-1;j++){
                if (number[i] < number[j]){
                    int ont = number[i];
                    number[i] = number[j];
                    number[j] = ont;
                }
            }
        }
        for (int printing:number){
            System.out.print(printing+"\t");
        }
        System.out.println();
    }
    public void insert(int number[]){
        for (int i=1;i<number.length;i++){
            for (int j=i-1;j>=0;j--){
                if (number[i] < number[j]) {
                    int two = number[i];
                    number[i] = number[j];
                    number[j] = two;
                    i--;
                }
            }
        }
        for (int i:number){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public void Choice(int number[]){
        for (int i=0;i<number.length;i++){
            int min = i;  //获取i的值 0
            for (int j=i+1;j<number.length;j++){
                if (number[j] < number[min]){         //1<0
                    min = j;  //获取最小值 1
                }
            }
            if (min!=i) {
                int b = number[i]; //0
                number[i] = number[min];    // 0=1
                number[min] = b; //a=1
            }
        }
        for (int i:number){
            System.out.print(i+"\t");
        }
        System.out.println();
  }
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] number = new int[]{3,1,2,4,6,5};
        System.out.print("冒泡排序:");
        sort.bubbling(number);
        System.out.print("插入排序:");
        sort.insert(number);
        System.out.print("选择排序:");
        sort.Choice(number);
    }
}
