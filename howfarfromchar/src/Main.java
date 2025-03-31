import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        int n = s.length();
        int[] answer = new int[n];
        int p = 1000;

        // 왼쪽에서 오른쪽으로 탐색하며 거리를 계산
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        // 오른쪽에서 왼쪽으로 탐색하며 최소 거리를 갱신
        p = 1000;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = Math.min(answer[i], p);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
