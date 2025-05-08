import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for(j = i-1 ; j >= 0 ; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}