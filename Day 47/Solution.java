import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0 && in.hasNextLine()){
            String pattern = in.nextLine().trim();
              //Write your code
        if(!pattern.isEmpty()){
            try{
            Pattern non = Pattern.compile(pattern);
            System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }  
        }
        in.close();
    }
}
