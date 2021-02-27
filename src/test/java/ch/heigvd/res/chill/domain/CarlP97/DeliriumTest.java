package ch.heigvd.res.chill.domain.CarlP97;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.CarlP97.Delirium;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliriumTest {

  @Test
  void thePriceAndNameForDeliriumShouldBeCorrect() {
    Delirium beer = new Delirium();
    assertEquals(beer.getName(), Delirium.NAME);
    assertEquals(beer.getPrice(), Delirium.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForDelirium() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.CarlP97.Delirium";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Delirium.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}