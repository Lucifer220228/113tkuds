import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        String[] station = new String[n];
        int[][] price = new int[n][2]; // price[i][0]=Std, price[i][1]=Business

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().trim().split(" ");
            station[i] = parts[0];
            price[i][0] = Integer.parseInt(parts[1]); // Standard
            price[i][1] = Integer.parseInt(parts[2]); // Business
        }

        // 輸出標題
        System.out.printf("%-8s|%-9s|%-9s%n", "Station", "Standard", "Business");

        // 輸出每一筆
        for (int i = 0; i < n; i++) {
            System.out.printf("%-8s|%-9d|%-9d%n", station[i], price[i][0], price[i][1]);
        }

        scanner.close();
    }
}
