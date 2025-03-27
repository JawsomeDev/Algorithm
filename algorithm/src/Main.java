import java.util.Scanner;

public class Main {

    public int solution(String str, char a){
        int answer = 0;
        str = str.toUpperCase();
        a = Character.toUpperCase(a);

        for(char x : str.toCharArray()){
            if(x == a){
                answer++;
            }
        }

//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == a){
//                answer++;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        System.out.println(new Main().solution(str, a));
    }
}