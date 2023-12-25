import java.util.Arrays;

public class DeckOfCards {
    public String[] suits = {"Club", "Diamond", "Heart", "Spade"};
    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public Card[] cards = new Card[suits.length * ranks.length];

    DeckOfCards(){
        int i = 0;
        for(String suit : suits){
            for(String rank : ranks){
                cards[i] = new Card(rank, suit);
                i += 1;
            }
        }
    }

    public Card[][] distribute(int noPlayers, int cardsPerPlayer){
        Card[][] playerCards = new Card[noPlayers][cardsPerPlayer]; 
        Card[] totalCards = Arrays.copyOf(cards, cards.length);
        
        int player = 0;
        int card = 0;
        while(player < noPlayers){
            while(card < cardsPerPlayer){
                int index = (int) Math.floor(Math.random() * totalCards.length);
                if(totalCards[index] != null){
                    playerCards[player][card] = totalCards[index];
                    
                    totalCards[index] = null;
                    card += 1;
                }
            }

            player += 1;
            card = 0;
        }

        return playerCards;
    }
}


