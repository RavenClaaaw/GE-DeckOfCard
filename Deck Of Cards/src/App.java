import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- CARD GAME --");
        DeckOfCards deck = new DeckOfCards();
        
        System.out.print("ENTER PLAYERS:- ");
        int nP = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ENTER CARDS PER PLAYER:- ");
        int nC = scanner.nextInt();
        scanner.nextLine();

        Card[][] allocation = deck.distribute(nP, nC);

        Player[] players = new Player[nP];
        System.out.println("CARDS ALLOCATED:- ");
        for(int i=0; i<allocation.length; i++){
            players[i] = new Player(allocation[i]);
            players[i].display();
        }
    }
}
