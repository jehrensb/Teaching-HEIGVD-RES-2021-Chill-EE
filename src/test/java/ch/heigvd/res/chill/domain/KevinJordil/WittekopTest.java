package ch.heigvd.res.chill.domain.KevinJordil;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WittekopTest {

  @Test
  void thePriceAndNameForWittekopShouldBeCorrect() {
    Wittekop beer = new Wittekop();
    assertEquals(beer.getName(), Wittekop.NAME);
    assertEquals(beer.getPrice(), Wittekop.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForWittekop() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.KevinJordil.Wittekop";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Wittekop.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}