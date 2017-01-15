public class Player{

  private String player;
  private Hand hand;

  public Player(String player) {
    this.player = player;
    this.hand = new Hand();
  }

  public String getName(){
    return this.player;
  }

  public Hand getHand(){
    return this.hand;
  }
}