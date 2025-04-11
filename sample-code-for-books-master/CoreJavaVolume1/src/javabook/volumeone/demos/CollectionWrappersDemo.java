package javabook.volumeone.demos;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionWrappersDemo {
    public static void main(String[] args)
    {
        Card[] cardDeck = new Card[52];
        List<Card> cardList = Arrays.asList(cardDeck); // The returned object is not an ArrayList.
        //List<Card> unml = Collections.unmodifiableList(cardList);
        cardList.add(new Card(1, 3));  // java.lang.UnsupportedOperationException will be thrown
    }
    
}


class Card {
    private int value; 
    private int suit;
    
    public Card(int aValue, int aSuit) 
    {
        this.value = aValue;
        this.suit = aSuit;
    } 
    
    public int getValue() 
    { 
        return value; 
    }
    public int getSuit() 
    {
        return suit;
    }
}