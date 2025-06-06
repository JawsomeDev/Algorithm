import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int x : arr){
            if(sum+x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid)<=m){
                answer = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }
        System.out.println(answer);

    }

}