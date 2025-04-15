import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());
        for(int i = k; i < n; i++){
            int left = arr[i-k];
            map.put(left, map.get(left) - 1);
            if(map.get(left) == 0){
                map.remove(left);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            result.add(map.size());
        }

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}