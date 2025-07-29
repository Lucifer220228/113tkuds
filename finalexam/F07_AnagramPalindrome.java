package finalexam;

import java.util.Scanner;

public class F07_AnagramPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] freq = new int[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                freq[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 == 1) oddCount++;
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}

