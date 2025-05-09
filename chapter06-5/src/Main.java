import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        String answer = "U";
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                answer = "D";
            }
        }
        System.out.println(answer);
    }
}