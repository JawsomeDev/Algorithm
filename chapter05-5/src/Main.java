import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int answer = 0 ;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')') {
                if(str.charAt(i-1) == '('){
                    stack.pop();
                    answer += stack.size();
                }
                else{
                    stack.pop();
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}