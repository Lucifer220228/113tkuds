import java.util.Scanner;

public class ds_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入一個整數");
        int a = input.nextInt();

        System.out.print("請輸入一個整數");
        int b = input.nextInt();

        int sum = a+b;
        System.out.print("總和為："+ sum);


    }
}