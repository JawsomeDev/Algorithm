import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 수열 길이
        int m = sc.nextInt();  // 목표 합
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        int start = 0;

        for(int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > m) {
                sum -= arr[start++];
            }

            if (sum == m) {
                count++;
            }
        }

        System.out.println(count);
    }
}