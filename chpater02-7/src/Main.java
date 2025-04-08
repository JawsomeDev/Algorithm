import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        int total = 0;
        int streak = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] == 1) {
                streak++;
                total += streak;
            } else {
                streak = 0;
            }
        }

        System.out.println(total);
    }
}