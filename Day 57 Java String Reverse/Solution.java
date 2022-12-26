import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        StringBuilder input1 = new StringBuilder();
        input1.append(A);
  
        
        if ((input1.reverse().toString()).equals(A)){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }
        
    }
}
