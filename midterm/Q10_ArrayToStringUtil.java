import java.util.Scanner;

public class Q10_ArrayToStringUtil {

    public static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取陣列長度
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[] arr = new int[n];

        // 讀取陣列元素
        if (n > 0) {
            String[] parts = scanner.nextLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
        }

        // 測試 arrayToString
        System.out.println(arrayToString(arr));

        scanner.close();
    }
}
