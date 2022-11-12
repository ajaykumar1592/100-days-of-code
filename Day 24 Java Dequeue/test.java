import java.util.*; 
public class test { 
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<Integer>(m);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            deque.addLast(in.nextInt());
            if (deque.size() == m) {
                Set<Integer> set = new HashSet<>(deque);
                int size = set.size();
                if(size > max){
                    max = size;
                } 
                deque.removeFirst();
            }
        }
        System.out.println(max);
    }
}
