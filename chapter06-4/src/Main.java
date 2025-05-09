import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt(); // 캐시 크기
        int n = input.nextInt(); // 작업 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] cache = new int[s]; // 캐시는 크기 s
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i; // hit 위치 기억
                    break;
                }
            }

            if (pos == -1) { // cache miss
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else { // cache hit
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }

            cache[0] = x;
        }

        for (int i = 0; i < s; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}
