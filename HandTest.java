import static org.junit.Assert.*;
import org.junit.*;

public class HandTest {

  Hand hand;

  @Before
  public void before(){
    hand = new Hand();
  }

  @Test
  public void hasEmptyHand(){
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void canAddCards(){
    Card card1 = new Card(CardNumber.TWO, CardSuit.SPADES);
    hand.addCard(card1);
    assertEquals(1, hand.cardCount());
  }

  @Test
  public void canShowHand(){
    Card card1 = new Card(CardNumber.TWO, CardSuit.SPADES);
    Card card2 = new Card(CardNumber.THREE, CardSuit.SPADES);
    hand.addCard(card1);
    hand.addCard(card2);
    assertEquals(card1, hand.getHand(0));
  }

  @Test
  public void knowHandTotal(){
    Card card1 = new Card(CardNumber.TWO, CardSuit.SPADES);
    Card card2 = new Card(CardNumber.THREE, CardSuit.SPADES);
    hand.addCard(card1);
    hand.addCard(card2);
    int total = hand.handTotal();
    assertEquals(5, total);
  }

}