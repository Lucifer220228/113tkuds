package finalexam;

import java.util.Scanner;

public class F06_ArraySecondLargest {

    static class Pair {
        int max;
        int second;

        Pair(int max, int second) {
            this.max = max;
            this.second = second;
        }
    }

    static Pair findSecondLargest(int[] arr, int left, int right) {
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE);
        }

        int mid = (left + right) / 2;
        Pair leftPair = findSecondLargest(arr, left, mid);
        Pair rightPair = findSecondLargest(arr, mid + 1, right);

        if (leftPair.max > rightPair.max) {
            int second = Math.max(leftPair.second, rightPair.max);
            return new Pair(leftPair.max, second);
        } else if (rightPair.max > leftPair.max) {
            int second = Math.max(rightPair.second, leftPair.max);
            return new Pair(rightPair.max, second);
        } else {
            int second = Math.max(leftPair.second, rightPair.second);
            return new Pair(leftPair.max, second);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pair result = findSecondLargest(arr, 0, n - 1);

        System.out.println("SecondMax: " + result.second);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 遞迴過程將陣列不斷對半切分，形成一棵高度為 O(log n) 的二元樹。
 * - 每個節點做常數時間的合併計算。
 * - 總共訪問所有元素一次，總時間為 O(n)。
 */
