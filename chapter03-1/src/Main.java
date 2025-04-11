import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0; int p2 = 0;
        while(p1 < n && p2 < m) {
            if(arr[p1] < arr1[p2]){
                answer.add(arr[p1++]);
            }
            else answer.add(arr1[p2++]);
        }
        while(p1 < n) {
            answer.add(arr[p1++]);
        }
        while(p2 < m) {
            answer.add(arr1[p2++]);
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}