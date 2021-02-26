package ch.heigvd.res.chill.domain.Cantondy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BrooklynTest {

  @Test
  void thePriceAndNameForBrooklynShouldBeCorrect() {
    Brooklyn beer = new Brooklyn();
    assertEquals(beer.getName(), Brooklyn.NAME);
    assertEquals(beer.getPrice(), Brooklyn.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBrooklyn() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Cantondy.Brooklyn";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Brooklyn.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}