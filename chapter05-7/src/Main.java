import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        String answer = "YES";
        Queue<Character> Q = new LinkedList<Character>();
        for(char x : a.toCharArray()) Q.offer(x);
        for(char x : b.toCharArray()) {
            if(Q.contains(x)){
                if(x!=Q.poll()) answer = "NO";
            }
        }
        if(!Q.isEmpty()) answer = "NO";

        System.out.println(answer);
    }
}