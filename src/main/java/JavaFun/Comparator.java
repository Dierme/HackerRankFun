package JavaFun;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Comparator {
    static class Checker implements java.util.Comparator<Player>{

        @Override
        public int compare(Player p1, Player p2){
            int compScore = p2.score - p1.score;
            if(compScore == 0){
                return p1.name.compareTo(p2.name);
            }
            return compScore;
        }
    }
    static class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        //Java 7
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

        //Java 8
        LinkedList<Player> list = new LinkedList<>();
        list.add(new Player("Olsson", 7));
        list.add(new Player("Magnus", 11));
        list.add(new Player("Johan", 9));

        java.util.Comparator<Player> comp = (p1, p2) -> {
            if(p2.score - p1.score == 0){
                return p1.name.compareTo(p2.name);
            }
            else {
                return p2.score - p1.score;
            }
        };
        list.sort(comp);

        for(Player p: list)
            System.out.println(p.name + " : " + p.score);
    }
}
