import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                int l1= s1.length();
                int exspc = 16-l1;
                String spc =  "";
                for(int j = 0;j<exspc-1;j++){
                    spc+= " ";
                }
              
               
                System.out.printf("%s%s%03d",s1,spc,x);
                System.out.println();
            }
            System.out.println("================================");

    }
}



