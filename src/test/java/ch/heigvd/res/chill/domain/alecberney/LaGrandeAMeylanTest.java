package ch.heigvd.res.chill.domain.alecberney;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaGrandeAMeylanTest {

  @Test
  void thePriceAndNameForLaGrandeAMeylanShouldBeCorrect() {
    LaGrandeAMeylan beer = new LaGrandeAMeylan();
    assertEquals(beer.getName(), LaGrandeAMeylan.NAME);
    assertEquals(beer.getPrice(), LaGrandeAMeylan.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaGrandeAMeylan() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.alecberney.LaGrandeAMeylan";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaGrandeAMeylan.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}