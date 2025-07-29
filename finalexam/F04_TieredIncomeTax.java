package finalexam;

import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        int totalTax = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = Integer.parseInt(sc.nextLine());
            taxes[i] = calculateTax(incomes[i]);
            totalTax += taxes[i];
        }

        for (int tax : taxes) {
            System.out.println("Tax: $" + tax);
        }

        int avg = totalTax / n;
        System.out.println("Average: $" + avg);
    }

    // 根據 2025 綜所稅級距試算
    static int calculateTax(int income) {
        int tax = 0;
        if (income <= 560000) {
            tax = (int) (income * 0.05);
        } else if (income <= 1260000) {
            tax = (int) (560000 * 0.05 + (income - 560000) * 0.12);
        } else if (income <= 2520000) {
            tax = (int) (560000 * 0.05 + (1260000 - 560000) * 0.12 + (income - 1260000) * 0.20);
        } else if (income <= 4720000) {
            tax = (int) (560000 * 0.05 + (1260000 - 560000) * 0.12 +
                        (2520000 - 1260000) * 0.20 + (income - 2520000) * 0.30);
        } else {
            tax = (int) (560000 * 0.05 + (1260000 - 560000) * 0.12 +
                        (2520000 - 1260000) * 0.20 + (4720000 - 2520000) * 0.30 +
                        (income - 4720000) * 0.40);
        }
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 主程式對 n 筆收入進行一次讀入與稅額計算，每筆收入經由固定級距稅率計算（最多 5 個條件判斷與加總），為 O(1)。
 * - 輸出每筆稅額與平均稅額各需 O(n) 與 O(1)。
 * - 整體時間複雜度為 O(n)。
 */

