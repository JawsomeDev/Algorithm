import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        ArrayList<Integer> answer = new ArrayList<>();
//        for(int i = 0; i < n-k+1; i++){
//            int sum = 0;
//            for(int j = 0; j < k; j++){
//                sum += arr[i+j];
//            }
//            answer.add(sum);
//        }
//        int max = Collections.max(answer);
//        System.out.println(max);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 날짜 수
        int k = sc.nextInt();  // 연속 날짜 수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 처음 K일의 합 계산
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        // 슬라이딩 윈도우로 나머지 합 계산
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}