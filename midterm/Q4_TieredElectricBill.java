import java.util.*;

public class Q4_TieredElectricBill {

    public static int calc(int kWh) {
        double bill = 0;

        if (kWh > 1000) {
            bill += (kWh - 1000) * 8.46;
            kWh = 1000;
        }
        if (kWh > 700) {
            bill += (kWh - 700) * 6.24;
            kWh = 700;
        }
        if (kWh > 500) {
            bill += (kWh - 500) * 5.04;
            kWh = 500;
        }
        if (kWh > 330) {
            bill += (kWh - 330) * 3.70;
            kWh = 330;
        }
        if (kWh > 120) {
            bill += (kWh - 120) * 2.45;
            kWh = 120;
        }
        bill += kWh * 1.68;

        return (int) Math.round(bill);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取用戶數
        int n = Integer.parseInt(scanner.nextLine().trim());

        int total = 0;
        int[] bills = new int[n];

        // 逐筆計算
        for (int i = 0; i < n; i++) {
            int kWh = Integer.parseInt(scanner.nextLine().trim());
            int amount = calc(kWh);
            bills[i] = amount;
            total += amount;
        }

        // 輸出帳單
        for (int b : bills) {
            System.out.println("Bill: $" + b);
        }

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);

        scanner.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 每筆資料呼叫 calc(int kWh)，此函數最多執行 6 次 if → O(1)
 * - 共處理 n 筆資料 → O(n)
 * - 輸出也為 O(n)，所以總體為 O(n)
 */
