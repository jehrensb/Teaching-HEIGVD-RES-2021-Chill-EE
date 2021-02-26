package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaCorneTest {

  @Test
  void thePriceAndNameForLaCorneShouldBeCorrect() {
    LaCorne beer = new LaCorne();
    assertEquals(beer.getName(), LaCorne.NAME);
    assertEquals(beer.getPrice(), LaCorne.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaFranche() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.wasadigi.LaCorne";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaCorne.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}