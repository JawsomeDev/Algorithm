import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> stack = new Stack<Character>();
        String answer = "";
        for (char x : str.toCharArray()) {
            if(x == ')'){
                while(stack.pop()!= '(');
            }
            else stack.push(x);
        }
        for(int i = 0; i<stack.size(); i++) answer += stack.get(i);

        System.out.println(answer);
    }
}