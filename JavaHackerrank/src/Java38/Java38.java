package Java38;
//JAVA COMPARATOR
import java.util.*;
class Player{
    String name;
    int score;
    Player(String name, int score){
        this.name = name;
        this.score = score;

    }

}
//DESCENDING ORDER SORT
class Checker{
    ArrayList<Player> arr;
    public ArrayList<Player> check(ArrayList<Player> arr) {
        Comparator<Player> com = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {


                if (o1.score == o2.score){
                    return o1.name.compareTo(o2.name);
                }
                else if (o1.score < o2.score)
                    return 1;
                else
                    return -1;
            }
        };

    Collections.sort(arr,com);
    return arr;

    }


}


public class Java38 {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0;i<n;i++){

            Player player = new Player(scanner.next(), scanner.nextInt());
            players.add(player);
        }
        Checker check = new Checker();
        for (Player e: check.check(players)){
            System.out.println(e.name+" "+e.score);
        }
    }
}
