package ch.heigvd.res.chill.domain.alecberney;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaSoeurBerneyTest {

  @Test
  void thePriceAndNameForLaSoeurBerneyShouldBeCorrect() {
    LaSoeurBerney beer = new LaSoeurBerney();
    assertEquals(beer.getName(), LaSoeurBerney.NAME);
    assertEquals(beer.getPrice(), LaSoeurBerney.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLaSoeurBerney() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.alecberney.LaSoeurBerney";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = LaSoeurBerney.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}