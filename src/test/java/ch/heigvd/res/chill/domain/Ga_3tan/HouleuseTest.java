package ch.heigvd.res.chill.domain.Ga_3tan;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouleuseTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Houleuse beer = new Houleuse();
    assertEquals(beer.getName(), Houleuse.NAME);
    assertEquals(beer.getPrice(), Houleuse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Ga_3tan.Houleuse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Houleuse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
