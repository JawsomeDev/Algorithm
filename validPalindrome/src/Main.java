
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuffer(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        System.out.println(answer);
    }
}