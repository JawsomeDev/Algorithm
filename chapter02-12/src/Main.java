import java.util.Scanner;

public class Main {

    // n이 4, m이3이면 4명의 학생이 3번의 테스트
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int cnt = 0;
                for(int k = 0; k < m; k++){
                    int pi=0; int pj=0;
                    for(int s = 0; s < n; s ++){
                        if(arr[k][s] == i) pi= s;
                        if(arr[k][s] == j) pj= s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}