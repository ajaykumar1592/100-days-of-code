import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        scanner.nextLine();
        HashMap<String,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            String key=scanner.nextLine();
            int val=scanner.nextInt();
            mp.put(key,val);
            scanner.nextLine();
        }
        // System.out.println(mp);
        while(scanner.hasNext()){
            String query=scanner.nextLine();
            if(mp.get(query)!=null){
                System.out.println(query + "=" + mp.get(query));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
