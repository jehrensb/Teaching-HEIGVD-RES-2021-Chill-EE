package ch.heigvd.res.chill.domain.moromir;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KozelTest {

  @Test
  void thePriceAndNameForKozelShouldBeCorrect() {
    Kozel beer = new Kozel();
    assertEquals(beer.getName(), Kozel.NAME);
    assertEquals(beer.getPrice(), Kozel.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKozel() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.moromir.Kozel";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kozel.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}