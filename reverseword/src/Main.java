import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while(lt < rt){
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(s);
            answer.add(temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x :  m.solution(n, str)){
            System.out.println(x);
        }
    }

}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//    public ArrayList<String> solution(int n, String[] str){
//        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] str = new String[n];
//        for (int i = 0; i < n; i++) {
//            str[i] = sc.next();
//        }
//        for(String x :  m.solution(n, str)){
//            System.out.println(x);
//        }
//    }
//}