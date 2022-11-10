import java.io.*;
import java.util.*;

class motor {
     motor()
 { 
System.out.println("Hello I am a motorcycle, I am a cycle with an engine."); 
 } 
} 
class cycle extends motor { cycle() {
     super(); 
System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
   }
  } public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    cycle c=new cycle();
}
}
