import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner Sc = new Scanner(System.in);
        int t=Sc.nextInt();
        for(int i=0;i<t;i++){
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int n = Sc.nextInt();
            int result = a + (int) Math.pow(2, 0) * b;
            System.out.print(result + " ");
            for(int j=1; j<n; j++){
                result += (int) Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        
    }
}
