import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int answer = -1;
        // 내림차순은 reverseOrder()
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        // 3장씩 뽑는 모든 경우의 수
        for (int i = 0; i < n; i++) {
            for( int j = i + 1; j < n; j++ ) {
                for(int l = j + 1; l < n; l++){
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : set){
            cnt++;
            if(cnt == k) answer = x;
        }
        System.out.println(answer);
    }
}