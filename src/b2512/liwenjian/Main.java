package b2512.liwenjian;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[] cool=new int[]{3,5,7,4,2,1,8};
        for (int i=1;i<cool.length;i++){
            for (int j=i;j>0;j--){
                if (cool[j-1]>cool[j]){
                    int tmp=cool[j-1];
                    cool[j-1]=cool[j];
                    cool[j]=tmp;
                }
            }
        }
        for (int i=0;i<cool.length;i++){
            System.out.print(cool[i]+" ");
        }
    }
}
