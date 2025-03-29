import java.util.Scanner;

public class Main {

    /*
        소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";
        for(int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i)+ " " + i + " " + s.indexOf(s.charAt(i)));
            if(s.indexOf(s.charAt(i)) == i){
                answer += s.charAt(i);
            }
        }
        System.out.println(answer);
    }
}

