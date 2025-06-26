import java.util.Random;

public class ds_06{
    public static void main(String[] args) {
        int [] a = new int [10];
        Random r = new Random();

        for(int i=0; i< a.length; i++){
            a[i]= r.nextInt(100);
            System.out.print(a[i] + " ");
        }

        int max = a[0];
        for(int b:a){
            if (b>max){
                max = b;
            }
        }
        System.out.println("\n最大值為：" + max);
    }
}