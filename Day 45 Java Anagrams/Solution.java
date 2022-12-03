import java.util.Scanner;

public class Solution {

   static boolean isAnagram(String a, String b) {
    boolean ana = true;
    StringBuilder s = new StringBuilder(b.toUpperCase());

    if (a.length() != b.length()){
        return false;
    }


    for (int i = 0; i < a.length(); i++){
        String c = a.charAt(i) + "";
        int charIndex = s.indexOf(c.toUpperCase());
        if (charIndex < 0 ){
            ana = false;
            break;
        }
        s.deleteCharAt(charIndex);
    }

    return ana;
}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
