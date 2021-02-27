package ch.heigvd.res.chill.domain.TheSnekySnek;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlastTest {

  @Test
  void thePriceAndNameForBlastShouldBeCorrect() {
    Blast beer = new Blast();
    assertEquals(beer.getName(), Blast.NAME);
    assertEquals(beer.getPrice(), Blast.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBlast() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.TheSnekySnek.Blast";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Blast.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}