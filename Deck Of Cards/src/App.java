import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CARD GAME:-");
        DeckOfCards deck = new DeckOfCards();
        
        String[][] allocation = deck.distribute(4, 9);

        System.out.println("CARDS ALLOCATED:- ");
        System.out.println(Arrays.deepToString(allocation));;
    }
}
