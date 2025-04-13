import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = i+1;
        }
        int sum = 0;
        int answer = 0;
        int lt = 0;
        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];

            if(sum==n)  answer++;
            while(sum>=n){
                sum -= arr[lt++];
                if(sum==n)  answer++;
            }
        }

        System.out.println(answer);
    }
}