package ch.heigvd.res.chill.domain.MichaelRuckstuhl;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.MichaelRuckstuhl.Guinness;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuinnessTest {

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    Guinness beer = new Guinness();
    assertEquals(beer.getName(), Guinness.NAME);
    assertEquals(beer.getPrice(), Guinness.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuinness() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MichaelRuckstuhl.Guinness";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Guinness.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}