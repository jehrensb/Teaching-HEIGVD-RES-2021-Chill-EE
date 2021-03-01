package ch.heigvd.res.chill.domain.jehrensb;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KilkennyTest {

  @Test
  void thePriceAndNameForKilkennyShouldBeCorrect() {
    Kilkenny beer = new Kilkenny();
    assertEquals(beer.getName(), Kilkenny.NAME);
    assertEquals(beer.getPrice(), Kilkenny.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKilkenny() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jehrensb.Kilkenny";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Kilkenny.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}