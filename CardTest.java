import static org.junit.Assert.*;
import org.junit.*;


public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(CardNumber.TWO, CardSuit.SPADES);
  }

  @Test
  public void canGetCardNumber(){
    assertEquals(CardNumber.TWO,card.getNumber());
  }

  @Test
  public void canGetCardSuit(){
    assertEquals(CardSuit.SPADES, card.getSuit());
  }

  @Test
  public void canBeAce(){
    card = new Card(CardNumber.ACE, CardSuit.SPADES);
    assertEquals(CardNumber.ACE, card.getNumber());
  }

  @Test
  public void canBeHearts(){
    card = new Card(CardNumber.THREE, CardSuit.HEARTS);
    assertEquals(CardSuit.HEARTS, card.getSuit());
  }


}