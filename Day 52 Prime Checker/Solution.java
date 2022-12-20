import java.io.*;
import java.util.*;

class Prime{
    public void checkPrime(int ... n){
        for(int e : n){
            java.math.BigInteger i = java.math.BigInteger.valueOf(e);
            if(i.isProbablePrime(1)){
                System.out.printf("%s ",i);
            }
        }
        System.out.println();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n1 = Integer.parseInt(br.readLine());
       int n2 = Integer.parseInt(br.readLine());
       int n3 = Integer.parseInt(br.readLine());
       int n4 = Integer.parseInt(br.readLine());
       int n5 = Integer.parseInt(br.readLine());
       Prime p = new Prime();
       p.checkPrime(n1);
       p.checkPrime(n1, n2);
       p.checkPrime(n1, n2, n3);
       p.checkPrime(n1, n2, n3, n4, n5);
    }
}
