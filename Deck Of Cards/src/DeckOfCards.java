import java.util.Arrays;

public class DeckOfCards {
    public String[] suits = {"Club", "Diamond", "Heart", "Spade"};
    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public String[] cards = new String[suits.length * ranks.length];

    DeckOfCards(){
        int card = 0;
        for(String suit : suits){
            for(String rank : ranks){
                cards[card] = rank + " - " + suit;
                card += 1;
            }
        }
    }

    public String[][] distribute(int noPlayers, int cardsPerPlayer){
        String[][] playerCards = new String[noPlayers][cardsPerPlayer]; 
        String[] totalCards = Arrays.copyOf(cards, cards.length);
        
        int player = 0;
        int card = 0;
        while(player < noPlayers){
            while(card < cardsPerPlayer){
                int index = (int) Math.floor(Math.random() * totalCards.length);
                if(totalCards[index] != "*"){
                    playerCards[player][card] = totalCards[index];
                    
                    totalCards[index] = "*";
                    card += 1;
                }
            }

            player += 1;
            card = 0;
        }

        return playerCards;
    }
}
