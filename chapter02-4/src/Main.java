import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int k=0; k<n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}