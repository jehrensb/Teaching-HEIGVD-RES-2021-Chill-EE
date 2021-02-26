package ch.heigvd.res.chill.domain.MelvynHerzig;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirraMorettiTest
{

  @Test
  void thePriceAndNameForBoxerShouldBeCorrect() {
    BirraMoretti beer = new BirraMoretti();
    assertEquals(beer.getName(), BirraMoretti.NAME);
    assertEquals(beer.getPrice(), BirraMoretti.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.MelvynHerzig.BirraMoretti";
    OrderRequest request = new OrderRequest(11, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BirraMoretti.PRICE.multiply(new BigDecimal(11));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}