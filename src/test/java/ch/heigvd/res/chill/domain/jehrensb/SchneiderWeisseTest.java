package ch.heigvd.res.chill.domain.jehrensb;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchneiderWeisseTest {

  @Test
  void thePriceAndNameForSchneiderWeisseShouldBeCorrect() {
    SchneiderWeisse beer = new SchneiderWeisse();
    assertEquals(beer.getName(), SchneiderWeisse.NAME);
    assertEquals(beer.getPrice(), SchneiderWeisse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSchneiderWeisse() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jehrensb.SchneiderWeisse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SchneiderWeisse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}