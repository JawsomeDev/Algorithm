import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            int score = 1;
            for(int j = 0; j < n; j++){
                if(arr[i] < arr[j]){
                    score += 1;
                }
            }
            answer[i] = score;
        }

        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}