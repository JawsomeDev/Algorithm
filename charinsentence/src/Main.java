import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 문장속의 각 단어는 공백으로 구분됩니다.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String answer = "";
        int m = 0;
        int pos = 0;


        while((pos = str.indexOf(" ")) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len>m){
                m=len;
                answer = temp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m){
            answer = str;
        }
        System.out.println(answer);
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // 한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 문장속의 각 단어는 공백으로 구분됩니다.
//        Scanner sc = new Scanner(System.in);
//
//        String answer = "";
//        int m = 0;
//
//        String str = sc.nextLine();
//        String[] s=str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }
//        System.out.println(answer);
//    }
//}