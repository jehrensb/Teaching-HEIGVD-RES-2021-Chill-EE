package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.zoubaidas.Barbour;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarbourTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    Barbour beer = new Barbour();
    assertEquals(beer.getName(), Barbour.NAME);
    assertEquals(beer.getPrice(), Barbour.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.zoubaidas.Barbour";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Barbour.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}