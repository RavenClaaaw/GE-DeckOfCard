import java.util.ArrayList;
import java.util.Arrays;

public class Card implements Comparable<Card>{
    public String rank;
    public String suit;

    Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card otherCard) {
        ArrayList<String> ranks = new ArrayList<>(Arrays.asList("Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"));
        return ranks.indexOf(this.rank) - ranks.indexOf(otherCard.rank);
    }
}
