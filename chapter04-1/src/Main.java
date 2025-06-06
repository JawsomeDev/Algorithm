import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key) > max ){
                max = map.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }
}