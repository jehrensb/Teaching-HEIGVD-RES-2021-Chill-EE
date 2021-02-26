package ch.heigvd.res.chill.domain.Klab93;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.Klab93.AlexLeRouge;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlexLeRougeTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    AlexLeRouge beer = new AlexLeRouge();
    assertEquals(beer.getName(), AlexLeRouge.NAME);
    assertEquals(beer.getPrice(), AlexLeRouge.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.Klab93.AlexLeRouge";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = AlexLeRouge.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}