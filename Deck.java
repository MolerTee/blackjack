import java.util.*;

public class Deck{

  private ArrayList<Card> cards;

  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public ArrayList getCards() {
    return this.cards;
  }

  public void addCard(Card card){
    cards.add(card);
  }

  public int countCards(){
    return cards.size();
  }

  public void buildDeck(){
    for (CardSuit suit : CardSuit.values()) {
    for (CardNumber number : CardNumber.values()){
      cards.add(new Card(number , suit));
    }
    Collections.shuffle(cards);
    }
  }

}