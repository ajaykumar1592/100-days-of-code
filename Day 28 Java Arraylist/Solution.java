import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        int n = scanner.nextInt();
        int m = 0;
        for (int i = 0; i < n; i++) {
            m = scanner.nextInt();
            for (int j = 0; j < m; j++) {
                temp.add(scanner.nextInt());
            }
            arrayList.add((ArrayList<Integer>) temp.clone());
            temp.clear();
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            try {
                System.out.println(arrayList.get(scanner.nextInt() - 1).get(scanner.nextInt() - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }


    }

}
