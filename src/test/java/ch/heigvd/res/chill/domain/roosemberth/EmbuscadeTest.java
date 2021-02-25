package ch.heigvd.res.chill.domain.roosemberth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

class EmbuscadeTest {

  @Test
  void thePriceAndNameForEmbuscadeShouldBeCorrect() {
    Embuscade beer = new Embuscade();
    assertEquals(beer.getName(), Embuscade.NAME);
    assertEquals(beer.getPrice(), Embuscade.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForEmbuscade() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.roosemberth.Embuscade";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Embuscade.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
