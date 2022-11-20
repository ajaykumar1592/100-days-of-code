import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            char[] arr = input.toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean isEmpty = true;

            for (char c : arr) {
                switch (c) {
                    case '{', '[', '(' -> { stack.add(c); }
                    case '}', ']', ')' -> {
                        if (stack.empty()) {
                            stack.add('F');
                            break;
                        } // end of if
                        switch (c) {
                            case '}' -> { if(stack.peek() == '{') stack.pop(); }
                            case ']' -> { if(stack.peek() == '[') stack.pop(); }
                            case ')' -> { if(stack.peek() == '(') stack.pop(); }
                        } 
                    }
                } 
                isEmpty = stack.empty() ? true : false;
            } 
            if (isEmpty) { System.out.println("true"); } 
            else { System.out.println(false); } // end of if-else
        } 
    } 
}
