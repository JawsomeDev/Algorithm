import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        int L = str2.length()-1;
        for (int i = 0; i < L; i++){
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }
        int answer = 0;
        int lt = 0;
        for(int rt = L; rt<str1.length(); rt++){
            map.put(str1.charAt(rt), map.getOrDefault(str1.charAt(rt), 0) + 1);
            if(map.equals(map2))
                answer++;
            map.put(str1.charAt(lt), map.getOrDefault(str1.charAt(lt), 0) - 1);
            if(map.get(str1.charAt(lt)) == 0) map.remove(str1.charAt(lt));
            lt++;
        }

        System.out.println(answer);


    }
}