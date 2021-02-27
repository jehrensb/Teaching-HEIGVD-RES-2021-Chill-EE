package ch.heigvd.res.chill.domain.Cantondy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PietraTest {

  @Test
  void thePriceAndNameForPietraShouldBeCorrect() {
    Pietra beer = new Pietra();
    assertEquals(beer.getName(), Pietra.NAME);
    assertEquals(beer.getPrice(), Pietra.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPietra() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Cantondy.Pietra";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pietra.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}