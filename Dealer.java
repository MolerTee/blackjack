import java.util.*;


public class Dealer{

  private String dealer;
  private Deck deck;

  public Dealer(String dealer){
    this.dealer = dealer;
    this.deck = new Deck();
  } 

  public String getDealerName(){
    return this.dealer;
  }

  public Deck getDeck(){
    return this.deck;
  }

  
}