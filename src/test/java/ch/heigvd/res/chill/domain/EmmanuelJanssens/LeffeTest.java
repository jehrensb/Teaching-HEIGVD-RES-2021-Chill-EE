package ch.heigvd.res.chill.domain.EmmanuelJanssens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.EmmanuelJanssens.Leffe;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeffeTest {

  @Test
  void thePriceAndNameForLeffeShouldBeCorrect() {
    Leffe beer = new Leffe();
    assertEquals(beer.getName(), Leffe.NAME);
    assertEquals(beer.getPrice(), Leffe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLeffe() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.EmmanuelJanssens.Leffe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Leffe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}