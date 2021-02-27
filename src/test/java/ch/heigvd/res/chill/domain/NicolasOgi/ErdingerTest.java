package ch.heigvd.res.chill.domain.NicolasOgi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ErdingerTest {

  @Test
  void thePriceAndNameForErdingerShouldBeCorrect() {
    Erdinger beer = new Erdinger();
    assertEquals(beer.getName(), Erdinger.NAME);
    assertEquals(beer.getPrice(), Erdinger.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForErdinger() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.NicolasOgi.Erdinger";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Erdinger.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}