import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String answer = "";
//
//        // 숫자만 추출
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isDigit(s.charAt(i))) {
//                answer += s.charAt(i);
//            }
//        }
//
//        // 선행 0 제거 (단, 숫자가 하나 이상 남도록)
//        while (answer.length() > 1 && answer.charAt(0) == '0') {
//            answer = answer.substring(1);
//        }
//
//        System.out.println(answer);
        // -------------------------------------------------------------------------------------------
        int answer = 0;
        for(char x : s.toCharArray()) {
            if( x>=48 && x<=57) {
                answer = answer*10+(x-48);
            }
        }
        System.out.println(answer);

//        String answer ="";
//        for(char x : s.toCharArray()) {
//            if(Character.isDigit(x)) {
//                answer += x;
//            }
//        }
//        System.out.println(Integer.parseInt(answer));
    }
}
