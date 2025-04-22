import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                if(stack.isEmpty()){
                    answer = "NO";
                }
                else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            answer = "NO";
        }
        System.out.println(answer);
    }
}