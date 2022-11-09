class sports { 
public void game() { 
System.out.println("Generic Sports");
 }
public void player(){
System.out.println("Each team has n players in Generic Sports");
 }
  }
class soccer extends sports {
 public void soc() { 
    System.out.println("Soccer Class");
     }
      @Override public void player() {
     System.out.println("Each team has 11 players in Soccer Class"); }
     }
public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    soccer sc= new soccer();
    sports s=new sports();
    s.game();
    s.player();
    sc.soc();
    sc.player();
}
}
