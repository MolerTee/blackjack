import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player;
  Card card;

  @Before 
  public void before(){
    player = new Player("Steven");
  }

  @Test
  public void canGetPlayerName(){
    assertEquals("Steven", player.getName());
  }

  @Test
  public void playerHasEmptyHand(){
    Hand hand = player.getHand();
    assertEquals(0, hand.cardCount());
  }

 @Test
 public void playerHasHand(){
  Card card = new Card(CardNumber.TWO, CardSuit.SPADES);
  Hand hand = 
  assertEquals(1, hand.cardCount());
 }

}