import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 큰 수 출력하기
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<n;i++) {
            if(arr[i]>arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}