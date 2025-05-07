import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] danger = new int[n];
        for(int i = 0; i< n; i++){
            danger[i] = sc.nextInt();
        }
        int answer = 0;
        int num = 0;
        Queue<Person> Q = new LinkedList<Person>();
        for(int i=0; i<n; i++){
            Q.add(new Person(i, danger[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person p : Q){
                if(p.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.id ==m) num = answer;
            }
        }
        System.out.println(num);

    }
}

class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}