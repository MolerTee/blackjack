import java.util.*;

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }  

  public void addCard(Card card){
    this.hand.add(card);
  }

  public int cardCount(){
    return this.hand.size();
  }

  public Card getHand(int index){
    return this.hand.get(index);
  }

  public int handTotal(){
    int total = 0;
    for (Card card : hand) {
      total += card.numberToInteger();
    }
    return total;
  }
}