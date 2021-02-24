package ch.heigvd.res.chill.domain.lindwing;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PilsnerTest {

  @Test
  void thePriceAndNameForPilsnerShouldBeCorrect() {
    Pilsner beer = new Pilsner();
    assertEquals(beer.getName(), Pilsner.NAME);
    assertEquals(beer.getPrice(), Pilsner.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPilsner() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.lindwing.Pilsner";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pilsner.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}