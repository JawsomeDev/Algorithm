import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int count(int[] arr, int capacity){
        int cnt = 1;
        int ep= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-ep >= capacity) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt){
            int mid = (lt + rt)/2;
            if(count(arr, mid) >= c){
                answer = mid;
                lt = mid + 1;
            }
            else{
                rt = mid - 1;
            }
        }
        System.out.println(answer);
    }
}