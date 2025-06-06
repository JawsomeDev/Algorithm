import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res))
                list.add(res);
        }
        for (int x : list){
            System.out.print(x + " ");
        }
    }

    public static boolean isPrime(int res) {
        if (res == 1) return false;
        for (int i = 2; i < res; i++) {
            if (res % i == 0) return false;
        }
        return true;
    }
}