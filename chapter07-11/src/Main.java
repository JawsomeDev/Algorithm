import java.util.Scanner;

public class Main {
    public static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        DFS(n);
    }
}