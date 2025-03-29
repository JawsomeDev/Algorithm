import java.util.Scanner;

public class Main {
    /*
        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        특수 분자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int lt = 0;
        int rt = s.length() - 1;
        String answer = "";
        while (lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(chars[rt])) {
                rt--;
            }
            else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
            answer = String.valueOf(chars);
        }
        System.out.println(answer);
    }
}