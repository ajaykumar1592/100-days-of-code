import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    
    
    @Override
    public int compare(Player p1, Player p2){
        if(Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score))==0){
            return p1.name.compareTo(p2.name);
        }
        else{
            return Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score));
        }
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}