import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter the S: ");
    String S = in.next();
    //System.out.println("Enter start: ");
    int start = in.nextInt();
    //System.out.println("Enter End: ");
    int end = in.nextInt();
    System.out.println(S.substring(start,end));
}
}
