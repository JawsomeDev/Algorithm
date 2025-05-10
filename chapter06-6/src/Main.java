import java.util.ArrayList;
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
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp =arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) {
                answer.add(i+1);
            }
        }
        System.out.println(answer.get(0) + " " + answer.get(1));
    }
}