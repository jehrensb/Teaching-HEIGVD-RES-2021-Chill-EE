package ch.heigvd.res.chill.domain.balsigergil;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.balsigergil.GuldenDraak;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuldenDraakTest {

  @Test
  void thePriceAndNameForGuldenDraakShouldBeCorrect() {
    GuldenDraak beer = new GuldenDraak();
    assertEquals(beer.getName(), GuldenDraak.NAME);
    assertEquals(beer.getPrice(), GuldenDraak.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuldenDraak() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.balsigergil.GuldenDraak";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = GuldenDraak.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}