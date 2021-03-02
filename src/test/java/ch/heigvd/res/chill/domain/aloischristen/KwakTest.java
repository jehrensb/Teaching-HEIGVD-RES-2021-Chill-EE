package ch.heigvd.res.chill.domain.aloischristen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.jehrensb.Guinness;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KwakTest {

  @Test
  void thePriceAndNameForKwakShouldBeCorrect() {
    Kwak beer = new Kwak();
    assertEquals(beer.getName(), Kwak.NAME);
    assertEquals(beer.getPrice(), Kwak.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForKwak() {
    Bartender james = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.aloischristen.Kwak";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = james.order(request);
    BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}