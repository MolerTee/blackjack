import static org.junit.Assert.*;
import org.junit.*;

public class DealerTest{

  Dealer dealer;
  Deck deck;

  @Before
  public void before(){
    dealer = new Dealer("Steve");
    deck = new Deck();
  }

  @Test
  public void dealerHasName(){
    assertEquals("Steve" , dealer.getDealerName());
  }

  @Test
  public void dealerHasDeck(){
    assertEquals(0, deck.countCards());
  }

  // @Test
  // public void 
}