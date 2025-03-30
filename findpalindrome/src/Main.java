import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "YES";
        s = s.toUpperCase();
        int lt = 0;
        int rt = s.length() - 1;

        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        System.out.println(answer);
    }
}
