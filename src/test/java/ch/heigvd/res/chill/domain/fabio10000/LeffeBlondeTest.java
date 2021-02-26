package ch.heigvd.res.chill.domain.fabio10000;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeffeBlondeTest {

  @Test
  void thePriceAndNameForLeffeBlondeShouldBeCorrect() {
    LeffeBlonde beer = new LeffeBlonde();
    assertEquals(beer.getName(), LeffeBlonde.NAME);
    assertEquals(beer.getPrice(), LeffeBlonde.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLeffeBlonde() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.fabio10000.LeffeBlonde";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LeffeBlonde.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}