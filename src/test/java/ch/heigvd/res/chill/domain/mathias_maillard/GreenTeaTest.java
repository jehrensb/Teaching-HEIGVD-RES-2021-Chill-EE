package ch.heigvd.res.chill.domain.mathias_maillard;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Duvel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreenTeaTest {

  @Test
  void thePriceAndNameForGreenTeaShouldBeCorrect() {
    GreenTea beer = new GreenTea();
    assertEquals(beer.getName(), GreenTea.NAME);
    assertEquals(beer.getPrice(), GreenTea.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGreenTea() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.mathias_maillard.GreenTea";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GreenTea.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}