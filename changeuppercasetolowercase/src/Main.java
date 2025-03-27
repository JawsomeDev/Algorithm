import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";
//        for( char c : str.toCharArray()){
//            if(Character.isLowerCase(c)){
//                answer += Character.toUpperCase(c);
//            }
//            else{
//                answer += Character.toLowerCase(c);
//            }
//        }

        // 대문자일경우
        for(char c : str.toCharArray()){
            if( c >= 65 && c <= 90){
                answer += (char)(c + 32);
            }
            else {
                answer += (char)(c - 32);
            }
        }

        System.out.println(answer);
    }
}