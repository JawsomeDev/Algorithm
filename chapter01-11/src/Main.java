import java.util.Scanner;

public class Main {

    // 11. 문자열 압축

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + " ";
        String answer = "";
        int cnt = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            }
            else {
                answer = answer + s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(answer);
    }
}