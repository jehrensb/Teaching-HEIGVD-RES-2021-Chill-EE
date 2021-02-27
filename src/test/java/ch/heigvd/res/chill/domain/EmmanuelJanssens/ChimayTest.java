package ch.heigvd.res.chill.domain.EmmanuelJanssens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.EmmanuelJanssens.Chimay;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChimayTest {

  @Test
  void thePriceAndNameForChimayShouldBeCorrect() {
    Chimay beer = new Chimay();
    assertEquals(beer.getName(), Chimay.NAME);
    assertEquals(beer.getPrice(), Chimay.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForChimay() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.EmmanuelJanssens.Chimay";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Chimay.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}