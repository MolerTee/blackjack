import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player;

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

  // @Test
  // public void playerHasCardsInHand(){
  //   Card card1 = new Card(CardNumber.ACE, CardSuit.SPADES);
  //   Card card2 = new Card(CardNumber.FOUR, CardSuit.HEARTS);
    
  // }

}