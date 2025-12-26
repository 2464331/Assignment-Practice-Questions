package EmailSpamFilter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Read the number of emails
        System.out.println("Enter the number of emails");
        int n = sc.nextInt();

        // 2) Read the spam scores
        System.out.println("Enter the spam scores");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // 3) Validate: if any score is negative, print error and stop
        for (int s : scores) {
            if (s < 0) {
                System.out.println("Negative scores are not allowed");
                return;
            }
        }

        // 4) Modify each score:
        //    - If >= 50, add 10
        //    - If < 50, subtract 5 but not below 0
        int[] modified = new int[n];
        for (int i = 0; i < n; i++) {
            int s = scores[i];
            if (s >= 50) {
                modified[i] = s + 10;
            } else {
                modified[i] = Math.max(0, s - 5);
            }
        }

        // 5) Count occurrences of each modified score
        Map<Integer, Integer> freq = new HashMap<>();
        for (int m : modified) {
            freq.put(m, freq.getOrDefault(m, 0) + 1);
        }

        // 6) Sum scores that appear exactly once
        int sumUnique = 0;
        for (int m : modified) {
            if (freq.get(m) == 1) {
                sumUnique += m;
            }
        }

        // 7) Output result
        if (sumUnique == 0) {
            // Check if truly no unique values (not just sum zero)
            boolean hasUnique = false;
            for (int count : freq.values()) {
                if (count == 1) {
                    hasUnique = true;
                    break;
                }
            }
            if (!hasUnique) {
                System.out.println("No unique scores found after modification");
                return;
            }
        }
        System.out.println(sumUnique);
    }
}
