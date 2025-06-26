import java.util.Scanner;

public class ds_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個圓的半徑");
        double r = input.nextInt();

        double area = Math.PI*r*r;
        System.out.print("面積為："+ area);
    }
}