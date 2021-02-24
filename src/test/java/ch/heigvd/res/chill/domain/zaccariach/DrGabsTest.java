package ch.heigvd.res.chill.domain.zaccariach;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrGabsTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    DrGabs beer = new DrGabs();
    assertEquals(beer.getName(), DrGabs.NAME);
    assertEquals(beer.getPrice(), DrGabs.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.zaccariach.DrGabs";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = DrGabs.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}