import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = input.nextInt();
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid+1;
                break;
            }
            if(arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }
        System.out.println(answer);
    }
}