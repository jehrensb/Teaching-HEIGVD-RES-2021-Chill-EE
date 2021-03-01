package ch.heigvd.res.chill.domain.jehrensb;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaiselsWeissbierTest {

  @Test
  void thePriceAndNameForMaiselsWeissbierShouldBeCorrect() {
    MaiselsWeissbier beer = new MaiselsWeissbier();
    assertEquals(beer.getName(), MaiselsWeissbier.NAME);
    assertEquals(beer.getPrice(), MaiselsWeissbier.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForMaiselsWeissbier() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.jehrensb.MaiselsWeissbier";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = MaiselsWeissbier.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}