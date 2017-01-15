public class Card {
  
  private CardNumber number;
  private CardSuit suit;

  public Card(CardNumber number, CardSuit suit) {
    this.number = number;
    this.suit = suit;
  }

  public CardNumber getNumber(){
    return this.number;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public int numberToInteger(){
    int value = this.number.ordinal();
    return value = value + 1;
  }

}