package ch.heigvd.res.chill.domain.sarsurgithub;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Blonde25Test {

  @Test
  void thePriceAndNameForBlonde25ShouldBeCorrect() {
    Blonde25 beer = new Blonde25();
    assertEquals(beer.getName(), Blonde25.NAME);
    assertEquals(beer.getPrice(), Blonde25.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBlonde25() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.sarsurgithub.Blonde25";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Blonde25.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}