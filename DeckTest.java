import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest{

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test
  public void deckIsEmpty(){
    assertEquals(0, deck.countCards());
  }

  @Test
  public void canAddCardsToDeck(){
    card = new Card(CardNumber.ACE, CardSuit.SPADES);
    deck.addCard(card);
    assertEquals(1, deck.countCards());
  }

  @Test
  public void canBuildDeck() {
    deck.buildDeck();
    assertEquals(52, deck.countCards());
  }



}