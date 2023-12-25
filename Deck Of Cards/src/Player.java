import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    static int PLAYER_ID = 0;
    ArrayList<Card> cards = new ArrayList<>();

    Player(Card[] cards){
        PLAYER_ID += 1;
        Arrays.sort(cards);

        this.cards = new ArrayList<>(Arrays.asList(cards));
    }

    Card pop(){
        Card front = cards.get(0);
        cards.remove(0);
        return front;
    }

    Card peep(){
        return cards.get(0);
    }

    void display(){
        System.out.println("\nCARDS (PLAYER " + PLAYER_ID + ") :- ");
        for(int i=0; i<cards.size(); i++){
            System.out.println(cards.get(i).rank + " " + cards.get(i).suit);
        }
    }
}
