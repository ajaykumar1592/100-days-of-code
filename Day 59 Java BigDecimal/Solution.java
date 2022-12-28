import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s,Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                if (a== null || b==null) return 0;
                Float numberA = Float.valueOf(a);
                Float numberB = Float.valueOf(b);
                return numberA.compareTo(numberB); 
            }
           
            
        }));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
