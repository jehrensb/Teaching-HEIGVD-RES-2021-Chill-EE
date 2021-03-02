package ch.heigvd.res.chill.domain.aloischristen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.aloischristen.Perrier;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerrierTest {

  @Test
  void thePriceAndNameForPerrierShouldBeCorrect() {
    Perrier beer = new Perrier();
    assertEquals(beer.getName(), Perrier.NAME);
    assertEquals(beer.getPrice(), Perrier.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPerrier() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.aloischristen.Perrier";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Perrier.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}